'use strict';

var fs = require('fs');
var util = require('util');
var request = require('request');
var easyxml = new(require('easyxml'))({
    filterNulls: true,
    unwrappedArrays: true,
    indent: 2
});
var xml2js = new require('xml2js').Parser({
    explicitArray: false
});
var XMLProlog = '<?xml version="1.0" encoding="utf-8"?>\n';
var version = require('./package.json').version;

/* One Order module */
var OO = function(config) {
    var oo = this;
    oo.config = config;
    oo.version = 'IATA2017.1';

    var makeRequest = function(body, cb, prolog, message) {
        var url = /^http:/.test(oo.config.endpoint) ? oo.config.endpoint : 'http' + (oo.ssl ? 's' : '') +
            '://' + oo.config.endpoint;
        body = (prolog ? XMLProlog : '') + body;

        request({
            uri: url,
            method: 'POST',
            body: body,
            headers: {
                'Authorization-Key': oo.config.APIAuthKey,
                'User-Agent': 'OO Javascript Wrapper / ' + version,
                'X-OO-Method': message,
                'Content-Type': 'application/xml'
            }
        }, function(err, res, body) {
            if (res.statusCode !== 200) {
                err = new Error('Invalid API key "' + oo.config.APIAuthKey + '" or bad request');
            }

            if (err) {
                return cb(err);
            }

            xml2js.parseString(res.body, function(err, data) {
                if (err || !data) {
                    err = err || new Error('Empty Response');
                }

                var responseType = Object.keys(data)[0];
                if (data[responseType].Errors && data[responseType].Errors.Error) {
                    err = data[responseType].Errors.Error;
                    err = err.$ ? err.$.ShortText : err._ || err;
                    err = new Error(((err instanceof Array) ? err[0] : err) || 'Unknown Error');
                }

                if (err) {
                    cb(err);
                } else {
                    cb(null, data);
                }
            });
        }).on('error', function(err) {
            cb(err);
        });
    };

    oo.messages = fs.readdirSync(__dirname + '/lib/messages').reduce(function(messages, file) {
        if (!/\.js$/.test(file)) {
            return messages;
        }

        var name = file.replace(/\.js/, '');
        messages[name] = function(data) {
            var messageHandler = require(__dirname + '/lib/messages/' + file);

            var result = util._extend(messageHandler(data),
                /* XML message attributes */
                {
                    _Version: oo.version,
                    '_xmlns:xsi': 'http://www.w3.org/2001/XMLSchema-instance',
                    _PrimaryLangID: 'EN',
                    _AltLangID: 'EN',
                    _xmlns: 'http://www.iata.org/IATA/EDIST/2017.1',
                });

            var toXML = function toXML(pretty, prolog) {
                easyxml.config.rootElement = name + 'RQ';
                var xml = easyxml.render(result);
                if (!pretty) {
                    xml.replace(/\n\s+/g, '');
                }
                if (prolog) {
                    xml = XMLProlog + xml;
                }
                return xml;
            };
            var wrapBody = function wrapBody(wrap, body) {
                wrap = wrap || {
                    begin: '',
                    end: ''
                };
                return wrap.begin + body + wrap.end;
            };

            return {
                raw: function() {
                    return result;
                },
                toJSON: function(pretty) {
                    return JSON.stringify(result, null, pretty ? '  ' : '');
                },
                toXML: function(pretty, prolog, wrap) {
                    return wrapBody(wrap, toXML(result, pretty, prolog));
                },
                forcedBody: function(body) {
                    this._forcedBody = body;
                },
                request: function(cb, prolog, wrap) {
                    return makeRequest(wrapBody(wrap, this._forcedBody || this.toXML()), cb, prolog, name);
                }
            };
        };
        return messages;
    }, {});

    oo.request = function(message, data, callback, prolog) {
        var msg = oo.messages[message](data);
        msg.request(callback, prolog);
    };

    oo.orderSalesInformationNotificationRQ = function(transactionID, cb) {
        var url = /^http:/.test(oo.config.endpoint) ? oo.config.endpoint + '/OrderInformationRequest/' + transactionID : 'http' +
            (oo.ssl ? 's' : '') + '://' + oo.config.endpoint + '/OrderInformationRequest/' + transactionID;

        request({
                uri: url,
                method: 'GET',
                headers: {
                    'Authorization-Key': oo.config.APIAuthKey,
                    'User-Agent': 'OO Javascript Wrapper / ' + version,
                    'X-OO-Method': 'OrderInformationRequest',
                    'Content-Type': 'application/xml'
                }
            },
            function(err, res, body) {
                if (res.statusCode !== 200) {
                    err = new Error('Invalid API key "' + oo.config.APIAuthKey + '" or bad request');
                }

                if (err) {
                    return cb(err);
                }

                xml2js.parseString(res.body, function(err, data) {
                    if (err || !data) {
                        err = err || new Error('Empty Response');
                    }

                    var responseType = Object.keys(data)[0];
                    if (data[responseType].Errors && data[responseType].Errors.Error) {
                        err = data[responseType].Errors.Error;
                        err = err.$ ? err.$.ShortText : err._ || err;
                        err = new Error(((err instanceof Array) ? err[0] : err) || 'Unknown Error');
                    }

                    if (err) {
                        cb(err);
                    } else {
                        cb(null, data);
                    }
                });
            }).on('error', function(err) {
            cb(err);
        });
    };
};

module.exports = OO;
