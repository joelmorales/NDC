
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A base type for a Keyed Object with Metadata Reference..
 * 
 * <p>Java class for KeyWithMetaObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyWithMetaObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectKeyMetaAttrGroup"/&gt;
 *       &lt;attribute name="DisplayAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllExemptInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ConnectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="E_TicketInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AssociateInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxOnEMD_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="StopOverInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OtherChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PoolingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="SpecialItemsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NetFareInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReissueOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AlertInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AuthenticationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MarketingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MultiPayFormInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NoticeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PartialInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WarningInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FailedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PartialPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InvGuaranteedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BundleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="InvGuarRequestedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExitRowInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PremiumInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UpperDeckInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FeeIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="LeadPricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="MetadataToken" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyWithMetaObjectBaseType")
@XmlSeeAlso({
    PaymentCardType.class,
    FareBasisCodeType.class,
    AddressCoreType.class,
    FareRulesRemark.class
})
public class KeyWithMetaObjectBaseType {

    @XmlAttribute(name = "DisplayAllInd")
    protected Boolean displayAllInd;
    @XmlAttribute(name = "AllExemptInd")
    protected Boolean allExemptInd;
    @XmlAttribute(name = "PricingInd")
    protected Boolean pricingInd;
    @XmlAttribute(name = "ConnectionInd")
    protected Boolean connectionInd;
    @XmlAttribute(name = "E_TicketInd")
    protected Boolean eTicketInd;
    @XmlAttribute(name = "TicketlessInd")
    protected Boolean ticketlessInd;
    @XmlAttribute(name = "AssociateInd")
    protected Boolean associateInd;
    @XmlAttribute(name = "TaxOnEMD_Ind")
    protected Boolean taxOnEMDInd;
    @XmlAttribute(name = "StopOverInd")
    protected Boolean stopOverInd;
    @XmlAttribute(name = "TaxInd")
    protected Boolean taxInd;
    @XmlAttribute(name = "OtherChargeInd")
    protected Boolean otherChargeInd;
    @XmlAttribute(name = "PoolingInd")
    protected Boolean poolingInd;
    @XmlAttribute(name = "SpecialItemsInd")
    protected Boolean specialItemsInd;
    @XmlAttribute(name = "TaxesInd")
    protected Boolean taxesInd;
    @XmlAttribute(name = "NetFareInd")
    protected Boolean netFareInd;
    @XmlAttribute(name = "ReissueOnlyInd")
    protected Boolean reissueOnlyInd;
    @XmlAttribute(name = "AutoExchangeInd")
    protected Boolean autoExchangeInd;
    @XmlAttribute(name = "AlertInd")
    protected Boolean alertInd;
    @XmlAttribute(name = "AuthenticationInd")
    protected Boolean authenticationInd;
    @XmlAttribute(name = "MarketingInd")
    protected Boolean marketingInd;
    @XmlAttribute(name = "MultiPayFormInd")
    protected Boolean multiPayFormInd;
    @XmlAttribute(name = "NoticeInd")
    protected Boolean noticeInd;
    @XmlAttribute(name = "PartialInd")
    protected Boolean partialInd;
    @XmlAttribute(name = "WarningInd")
    protected Boolean warningInd;
    @XmlAttribute(name = "FailedPaymentInd")
    protected Boolean failedPaymentInd;
    @XmlAttribute(name = "PartialPaymentInd")
    protected Boolean partialPaymentInd;
    @XmlAttribute(name = "VerificationInd")
    protected Boolean verificationInd;
    @XmlAttribute(name = "PriceVarianceInd")
    protected Boolean priceVarianceInd;
    @XmlAttribute(name = "InvGuaranteedInd")
    protected Boolean invGuaranteedInd;
    @XmlAttribute(name = "WaitlistInd")
    protected Boolean waitlistInd;
    @XmlAttribute(name = "BundleInd")
    protected Boolean bundleInd;
    @XmlAttribute(name = "InvGuarRequestedInd")
    protected Boolean invGuarRequestedInd;
    @XmlAttribute(name = "ExitRowInd")
    protected Boolean exitRowInd;
    @XmlAttribute(name = "PremiumInd")
    protected Boolean premiumInd;
    @XmlAttribute(name = "UpperDeckInd")
    protected Boolean upperDeckInd;
    @XmlAttribute(name = "TaxIncludedInd")
    protected Boolean taxIncludedInd;
    @XmlAttribute(name = "FeeIncludedInd")
    protected Boolean feeIncludedInd;
    @XmlAttribute(name = "LeadPricingInd")
    protected Boolean leadPricingInd;
    @XmlAttribute(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "MetadataToken")
    protected String metadataToken;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;

    /**
     * Gets the value of the displayAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayAllInd() {
        return displayAllInd;
    }

    /**
     * Sets the value of the displayAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayAllInd(Boolean value) {
        this.displayAllInd = value;
    }

    /**
     * Gets the value of the allExemptInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllExemptInd() {
        return allExemptInd;
    }

    /**
     * Sets the value of the allExemptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllExemptInd(Boolean value) {
        this.allExemptInd = value;
    }

    /**
     * Gets the value of the pricingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingInd() {
        return pricingInd;
    }

    /**
     * Sets the value of the pricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingInd(Boolean value) {
        this.pricingInd = value;
    }

    /**
     * Gets the value of the connectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionInd() {
        return connectionInd;
    }

    /**
     * Sets the value of the connectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionInd(Boolean value) {
        this.connectionInd = value;
    }

    /**
     * Gets the value of the eTicketInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETicketInd() {
        return eTicketInd;
    }

    /**
     * Sets the value of the eTicketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETicketInd(Boolean value) {
        this.eTicketInd = value;
    }

    /**
     * Gets the value of the ticketlessInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketlessInd() {
        return ticketlessInd;
    }

    /**
     * Sets the value of the ticketlessInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketlessInd(Boolean value) {
        this.ticketlessInd = value;
    }

    /**
     * Gets the value of the associateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssociateInd() {
        return associateInd;
    }

    /**
     * Sets the value of the associateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssociateInd(Boolean value) {
        this.associateInd = value;
    }

    /**
     * Gets the value of the taxOnEMDInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnEMDInd() {
        return taxOnEMDInd;
    }

    /**
     * Sets the value of the taxOnEMDInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxOnEMDInd(Boolean value) {
        this.taxOnEMDInd = value;
    }

    /**
     * Gets the value of the stopOverInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopOverInd() {
        return stopOverInd;
    }

    /**
     * Sets the value of the stopOverInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopOverInd(Boolean value) {
        this.stopOverInd = value;
    }

    /**
     * Gets the value of the taxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInd() {
        return taxInd;
    }

    /**
     * Sets the value of the taxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInd(Boolean value) {
        this.taxInd = value;
    }

    /**
     * Gets the value of the otherChargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherChargeInd() {
        return otherChargeInd;
    }

    /**
     * Sets the value of the otherChargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherChargeInd(Boolean value) {
        this.otherChargeInd = value;
    }

    /**
     * Gets the value of the poolingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPoolingInd() {
        return poolingInd;
    }

    /**
     * Sets the value of the poolingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPoolingInd(Boolean value) {
        this.poolingInd = value;
    }

    /**
     * Gets the value of the specialItemsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialItemsInd() {
        return specialItemsInd;
    }

    /**
     * Sets the value of the specialItemsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialItemsInd(Boolean value) {
        this.specialItemsInd = value;
    }

    /**
     * Gets the value of the taxesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxesInd() {
        return taxesInd;
    }

    /**
     * Sets the value of the taxesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxesInd(Boolean value) {
        this.taxesInd = value;
    }

    /**
     * Gets the value of the netFareInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNetFareInd() {
        return netFareInd;
    }

    /**
     * Sets the value of the netFareInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNetFareInd(Boolean value) {
        this.netFareInd = value;
    }

    /**
     * Gets the value of the reissueOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReissueOnlyInd() {
        return reissueOnlyInd;
    }

    /**
     * Sets the value of the reissueOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReissueOnlyInd(Boolean value) {
        this.reissueOnlyInd = value;
    }

    /**
     * Gets the value of the autoExchangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExchangeInd() {
        return autoExchangeInd;
    }

    /**
     * Sets the value of the autoExchangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExchangeInd(Boolean value) {
        this.autoExchangeInd = value;
    }

    /**
     * Gets the value of the alertInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertInd() {
        return alertInd;
    }

    /**
     * Sets the value of the alertInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertInd(Boolean value) {
        this.alertInd = value;
    }

    /**
     * Gets the value of the authenticationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthenticationInd() {
        return authenticationInd;
    }

    /**
     * Sets the value of the authenticationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthenticationInd(Boolean value) {
        this.authenticationInd = value;
    }

    /**
     * Gets the value of the marketingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketingInd() {
        return marketingInd;
    }

    /**
     * Sets the value of the marketingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketingInd(Boolean value) {
        this.marketingInd = value;
    }

    /**
     * Gets the value of the multiPayFormInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiPayFormInd() {
        return multiPayFormInd;
    }

    /**
     * Sets the value of the multiPayFormInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiPayFormInd(Boolean value) {
        this.multiPayFormInd = value;
    }

    /**
     * Gets the value of the noticeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoticeInd() {
        return noticeInd;
    }

    /**
     * Sets the value of the noticeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoticeInd(Boolean value) {
        this.noticeInd = value;
    }

    /**
     * Gets the value of the partialInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialInd() {
        return partialInd;
    }

    /**
     * Sets the value of the partialInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialInd(Boolean value) {
        this.partialInd = value;
    }

    /**
     * Gets the value of the warningInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningInd() {
        return warningInd;
    }

    /**
     * Sets the value of the warningInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningInd(Boolean value) {
        this.warningInd = value;
    }

    /**
     * Gets the value of the failedPaymentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailedPaymentInd() {
        return failedPaymentInd;
    }

    /**
     * Sets the value of the failedPaymentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailedPaymentInd(Boolean value) {
        this.failedPaymentInd = value;
    }

    /**
     * Gets the value of the partialPaymentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialPaymentInd() {
        return partialPaymentInd;
    }

    /**
     * Sets the value of the partialPaymentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialPaymentInd(Boolean value) {
        this.partialPaymentInd = value;
    }

    /**
     * Gets the value of the verificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificationInd(Boolean value) {
        this.verificationInd = value;
    }

    /**
     * Gets the value of the priceVarianceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceVarianceInd() {
        return priceVarianceInd;
    }

    /**
     * Sets the value of the priceVarianceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceVarianceInd(Boolean value) {
        this.priceVarianceInd = value;
    }

    /**
     * Gets the value of the invGuaranteedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvGuaranteedInd() {
        return invGuaranteedInd;
    }

    /**
     * Sets the value of the invGuaranteedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvGuaranteedInd(Boolean value) {
        this.invGuaranteedInd = value;
    }

    /**
     * Gets the value of the waitlistInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistInd() {
        return waitlistInd;
    }

    /**
     * Sets the value of the waitlistInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistInd(Boolean value) {
        this.waitlistInd = value;
    }

    /**
     * Gets the value of the bundleInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundleInd() {
        return bundleInd;
    }

    /**
     * Sets the value of the bundleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundleInd(Boolean value) {
        this.bundleInd = value;
    }

    /**
     * Gets the value of the invGuarRequestedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvGuarRequestedInd() {
        return invGuarRequestedInd;
    }

    /**
     * Sets the value of the invGuarRequestedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvGuarRequestedInd(Boolean value) {
        this.invGuarRequestedInd = value;
    }

    /**
     * Gets the value of the exitRowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExitRowInd() {
        return exitRowInd;
    }

    /**
     * Sets the value of the exitRowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExitRowInd(Boolean value) {
        this.exitRowInd = value;
    }

    /**
     * Gets the value of the premiumInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPremiumInd() {
        return premiumInd;
    }

    /**
     * Sets the value of the premiumInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPremiumInd(Boolean value) {
        this.premiumInd = value;
    }

    /**
     * Gets the value of the upperDeckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpperDeckInd() {
        return upperDeckInd;
    }

    /**
     * Sets the value of the upperDeckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpperDeckInd(Boolean value) {
        this.upperDeckInd = value;
    }

    /**
     * Gets the value of the taxIncludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIncludedInd() {
        return taxIncludedInd;
    }

    /**
     * Sets the value of the taxIncludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIncludedInd(Boolean value) {
        this.taxIncludedInd = value;
    }

    /**
     * Gets the value of the feeIncludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeeIncludedInd() {
        return feeIncludedInd;
    }

    /**
     * Sets the value of the feeIncludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeeIncludedInd(Boolean value) {
        this.feeIncludedInd = value;
    }

    /**
     * Gets the value of the leadPricingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadPricingInd() {
        return leadPricingInd;
    }

    /**
     * Sets the value of the leadPricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadPricingInd(Boolean value) {
        this.leadPricingInd = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the metadataToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataToken() {
        return metadataToken;
    }

    /**
     * Sets the value of the metadataToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataToken(String value) {
        this.metadataToken = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
    }

}
