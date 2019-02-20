
package org.iata.oo.schema.ServiceDeliveryRQ;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iata.oo.schema.ServiceDeliveryRQ package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PaymentAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentAddress");
    private final static QName _SimpleAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SimpleAddress");
    private final static QName _StructuredAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StructuredAddress");
    private final static QName _CityName_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CityName");
    private final static QName _AddressContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressContact");
    private final static QName _EmailContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EmailContact");
    private final static QName _PhoneContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PhoneContact");
    private final static QName _OtherContactMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherContactMethod");
    private final static QName _DirectBill_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectBill");
    private final static QName _PaymentCard_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCard");
    private final static QName _PercentageValue_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PercentageValue");
    private final static QName _AirlineID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirlineID");
    private final static QName _PartnerID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PartnerID");
    private final static QName _Arrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Arrival");
    private final static QName _GroupReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "GroupReference");
    private final static QName _PassengerReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReference");
    private final static QName _PassengerReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReferences");
    private final static QName _ServiceReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceReferences");
    private final static QName _Itinerary_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Itinerary");
    private final static QName _RFIC_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RFIC");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iata.oo.schema.ServiceDeliveryRQ
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoyaltyRedemption }
     * 
     */
    public LoyaltyRedemption createLoyaltyRedemption() {
        return new LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link FlightDepartureType }
     * 
     */
    public FlightDepartureType createFlightDepartureType() {
        return new FlightDepartureType();
    }

    /**
     * Create an instance of {@link SeatItem }
     * 
     */
    public SeatItem createSeatItem() {
        return new SeatItem();
    }

    /**
     * Create an instance of {@link IATAServiceDeliveryRQ }
     * 
     */
    public IATAServiceDeliveryRQ createIATAServiceDeliveryRQ() {
        return new IATAServiceDeliveryRQ();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link ServiceEncodingType }
     * 
     */
    public ServiceEncodingType createServiceEncodingType() {
        return new ServiceEncodingType();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType }
     * 
     */
    public OrderPaymentFormType createOrderPaymentFormType() {
        return new OrderPaymentFormType();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer }
     * 
     */
    public OrderPaymentFormType.Payer createOrderPaymentFormTypePayer() {
        return new OrderPaymentFormType.Payer();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name }
     * 
     */
    public OrderPaymentFormType.Payer.Name createOrderPaymentFormTypePayerName() {
        return new OrderPaymentFormType.Payer.Name();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations }
     * 
     */
    public OrderPaymentFormType.Associations createOrderPaymentFormTypeAssociations() {
        return new OrderPaymentFormType.Associations();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link TravelerSummaryType }
     * 
     */
    public TravelerSummaryType createTravelerSummaryType() {
        return new TravelerSummaryType();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Age }
     * 
     */
    public TravelerSummaryType.Age createTravelerSummaryTypeAge() {
        return new TravelerSummaryType.Age();
    }

    /**
     * Create an instance of {@link IATAServiceDeliveryRQ.Segment }
     * 
     */
    public IATAServiceDeliveryRQ.Segment createIATAServiceDeliveryRQSegment() {
        return new IATAServiceDeliveryRQ.Segment();
    }

    /**
     * Create an instance of {@link FlightArrivalType }
     * 
     */
    public FlightArrivalType createFlightArrivalType() {
        return new FlightArrivalType();
    }

    /**
     * Create an instance of {@link Voucher.Name }
     * 
     */
    public Voucher.Name createVoucherName() {
        return new Voucher.Name();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Contact.Name }
     * 
     */
    public Contact.Name createContactName() {
        return new Contact.Name();
    }

    /**
     * Create an instance of {@link PaymentAddrType }
     * 
     */
    public PaymentAddrType createPaymentAddrType() {
        return new PaymentAddrType();
    }

    /**
     * Create an instance of {@link SimpleAddrType }
     * 
     */
    public SimpleAddrType createSimpleAddrType() {
        return new SimpleAddrType();
    }

    /**
     * Create an instance of {@link StructuredAddrType }
     * 
     */
    public StructuredAddrType createStructuredAddrType() {
        return new StructuredAddrType();
    }

    /**
     * Create an instance of {@link AddressContactType }
     * 
     */
    public AddressContactType createAddressContactType() {
        return new AddressContactType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link PhoneContactType }
     * 
     */
    public PhoneContactType createPhoneContactType() {
        return new PhoneContactType();
    }

    /**
     * Create an instance of {@link OtherContactMethodType }
     * 
     */
    public OtherContactMethodType createOtherContactMethodType() {
        return new OtherContactMethodType();
    }

    /**
     * Create an instance of {@link CountryCode }
     * 
     */
    public CountryCode createCountryCode() {
        return new CountryCode();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link Cash }
     * 
     */
    public Cash createCash() {
        return new Cash();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.MemberNumber }
     * 
     */
    public LoyaltyRedemption.MemberNumber createLoyaltyRedemptionMemberNumber() {
        return new LoyaltyRedemption.MemberNumber();
    }

    /**
     * Create an instance of {@link Voucher.EffectiveExpireDate }
     * 
     */
    public Voucher.EffectiveExpireDate createVoucherEffectiveExpireDate() {
        return new Voucher.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link PartnerCompanyIDType }
     * 
     */
    public PartnerCompanyIDType createPartnerCompanyIDType() {
        return new PartnerCompanyIDType();
    }

    /**
     * Create an instance of {@link FlightNumber }
     * 
     */
    public FlightNumber createFlightNumber() {
        return new FlightNumber();
    }

    /**
     * Create an instance of {@link ArrivalCode }
     * 
     */
    public ArrivalCode createArrivalCode() {
        return new ArrivalCode();
    }

    /**
     * Create an instance of {@link Departure }
     * 
     */
    public Departure createDeparture() {
        return new Departure();
    }

    /**
     * Create an instance of {@link FlightDepartureType.AirportCode }
     * 
     */
    public FlightDepartureType.AirportCode createFlightDepartureTypeAirportCode() {
        return new FlightDepartureType.AirportCode();
    }

    /**
     * Create an instance of {@link DepartureCode }
     * 
     */
    public DepartureCode createDepartureCode() {
        return new DepartureCode();
    }

    /**
     * Create an instance of {@link AircraftCode }
     * 
     */
    public AircraftCode createAircraftCode() {
        return new AircraftCode();
    }

    /**
     * Create an instance of {@link AircraftCodeType }
     * 
     */
    public AircraftCodeType createAircraftCodeType() {
        return new AircraftCodeType();
    }

    /**
     * Create an instance of {@link FlightItemType }
     * 
     */
    public FlightItemType createFlightItemType() {
        return new FlightItemType();
    }

    /**
     * Create an instance of {@link SeatItem.Row }
     * 
     */
    public SeatItem.Row createSeatItemRow() {
        return new SeatItem.Row();
    }

    /**
     * Create an instance of {@link RFICType }
     * 
     */
    public RFICType createRFICType() {
        return new RFICType();
    }

    /**
     * Create an instance of {@link IATAServiceDeliveryRQ.Passengers }
     * 
     */
    public IATAServiceDeliveryRQ.Passengers createIATAServiceDeliveryRQPassengers() {
        return new IATAServiceDeliveryRQ.Passengers();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link OrderCoreType }
     * 
     */
    public OrderCoreType createOrderCoreType() {
        return new OrderCoreType();
    }

    /**
     * Create an instance of {@link KeyWithMetaObjectBaseType }
     * 
     */
    public KeyWithMetaObjectBaseType createKeyWithMetaObjectBaseType() {
        return new KeyWithMetaObjectBaseType();
    }

    /**
     * Create an instance of {@link CodesetType }
     * 
     */
    public CodesetType createCodesetType() {
        return new CodesetType();
    }

    /**
     * Create an instance of {@link ContactCoreType }
     * 
     */
    public ContactCoreType createContactCoreType() {
        return new ContactCoreType();
    }

    /**
     * Create an instance of {@link CurrencyAmountOptType }
     * 
     */
    public CurrencyAmountOptType createCurrencyAmountOptType() {
        return new CurrencyAmountOptType();
    }

    /**
     * Create an instance of {@link SimpleCurrencyPriceType }
     * 
     */
    public SimpleCurrencyPriceType createSimpleCurrencyPriceType() {
        return new SimpleCurrencyPriceType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link MarketingCarrierFlightType }
     * 
     */
    public MarketingCarrierFlightType createMarketingCarrierFlightType() {
        return new MarketingCarrierFlightType();
    }

    /**
     * Create an instance of {@link OperatingCarrierFlightType }
     * 
     */
    public OperatingCarrierFlightType createOperatingCarrierFlightType() {
        return new OperatingCarrierFlightType();
    }

    /**
     * Create an instance of {@link SeatMapRowNbrType }
     * 
     */
    public SeatMapRowNbrType createSeatMapRowNbrType() {
        return new SeatMapRowNbrType();
    }

    /**
     * Create an instance of {@link ServiceCoreType }
     * 
     */
    public ServiceCoreType createServiceCoreType() {
        return new ServiceCoreType();
    }

    /**
     * Create an instance of {@link AirlineTypeAIDM }
     * 
     */
    public AirlineTypeAIDM createAirlineTypeAIDM() {
        return new AirlineTypeAIDM();
    }

    /**
     * Create an instance of {@link AllianceType }
     * 
     */
    public AllianceType createAllianceType() {
        return new AllianceType();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link FOID }
     * 
     */
    public FOID createFOID() {
        return new FOID();
    }

    /**
     * Create an instance of {@link IdentityDocumentType }
     * 
     */
    public IdentityDocumentType createIdentityDocumentType() {
        return new IdentityDocumentType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link LanguageUsageType }
     * 
     */
    public LanguageUsageType createLanguageUsageType() {
        return new LanguageUsageType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramAccountType }
     * 
     */
    public LoyaltyProgramAccountType createLoyaltyProgramAccountType() {
        return new LoyaltyProgramAccountType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link PhoneTypeAIDM }
     * 
     */
    public PhoneTypeAIDM createPhoneTypeAIDM() {
        return new PhoneTypeAIDM();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     * 
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link RemarkTypeAIDM }
     * 
     */
    public RemarkTypeAIDM createRemarkTypeAIDM() {
        return new RemarkTypeAIDM();
    }

    /**
     * Create an instance of {@link VisaType }
     * 
     */
    public VisaType createVisaType() {
        return new VisaType();
    }

    /**
     * Create an instance of {@link PassengerType.Remark }
     * 
     */
    public PassengerType.Remark createPassengerTypeRemark() {
        return new PassengerType.Remark();
    }

    /**
     * Create an instance of {@link ContactInformationType.ContactProvided }
     * 
     */
    public ContactInformationType.ContactProvided createContactInformationTypeContactProvided() {
        return new ContactInformationType.ContactProvided();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.Code }
     * 
     */
    public ServiceEncodingType.Code createServiceEncodingTypeCode() {
        return new ServiceEncodingType.Code();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.SubCode }
     * 
     */
    public ServiceEncodingType.SubCode createServiceEncodingTypeSubCode() {
        return new ServiceEncodingType.SubCode();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Method }
     * 
     */
    public OrderPaymentFormType.Method createOrderPaymentFormTypeMethod() {
        return new OrderPaymentFormType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Surname }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Surname createOrderPaymentFormTypePayerNameSurname() {
        return new OrderPaymentFormType.Payer.Name.Surname();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Given }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Given createOrderPaymentFormTypePayerNameGiven() {
        return new OrderPaymentFormType.Payer.Name.Given();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Middle }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Middle createOrderPaymentFormTypePayerNameMiddle() {
        return new OrderPaymentFormType.Payer.Name.Middle();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations.Passengers }
     * 
     */
    public OrderPaymentFormType.Associations.Passengers createOrderPaymentFormTypeAssociationsPassengers() {
        return new OrderPaymentFormType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link FlightType.SegmentList }
     * 
     */
    public FlightType.SegmentList createFlightTypeSegmentList() {
        return new FlightType.SegmentList();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Name }
     * 
     */
    public TravelerSummaryType.Name createTravelerSummaryTypeName() {
        return new TravelerSummaryType.Name();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.ResidenceCode }
     * 
     */
    public TravelerSummaryType.ResidenceCode createTravelerSummaryTypeResidenceCode() {
        return new TravelerSummaryType.ResidenceCode();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.CitizenshipCountryCode }
     * 
     */
    public TravelerSummaryType.CitizenshipCountryCode createTravelerSummaryTypeCitizenshipCountryCode() {
        return new TravelerSummaryType.CitizenshipCountryCode();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Age.Value }
     * 
     */
    public TravelerSummaryType.Age.Value createTravelerSummaryTypeAgeValue() {
        return new TravelerSummaryType.Age.Value();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Age.BirthDate }
     * 
     */
    public TravelerSummaryType.Age.BirthDate createTravelerSummaryTypeAgeBirthDate() {
        return new TravelerSummaryType.Age.BirthDate();
    }

    /**
     * Create an instance of {@link IATAServiceDeliveryRQ.Segment.OperatingCarrier }
     * 
     */
    public IATAServiceDeliveryRQ.Segment.OperatingCarrier createIATAServiceDeliveryRQSegmentOperatingCarrier() {
        return new IATAServiceDeliveryRQ.Segment.OperatingCarrier();
    }

    /**
     * Create an instance of {@link IATAServiceDeliveryRQ.Segment.Equipment }
     * 
     */
    public IATAServiceDeliveryRQ.Segment.Equipment createIATAServiceDeliveryRQSegmentEquipment() {
        return new IATAServiceDeliveryRQ.Segment.Equipment();
    }

    /**
     * Create an instance of {@link FlightArrivalType.AirportCode }
     * 
     */
    public FlightArrivalType.AirportCode createFlightArrivalTypeAirportCode() {
        return new FlightArrivalType.AirportCode();
    }

    /**
     * Create an instance of {@link Voucher.Name.Surname }
     * 
     */
    public Voucher.Name.Surname createVoucherNameSurname() {
        return new Voucher.Name.Surname();
    }

    /**
     * Create an instance of {@link Voucher.Name.Given }
     * 
     */
    public Voucher.Name.Given createVoucherNameGiven() {
        return new Voucher.Name.Given();
    }

    /**
     * Create an instance of {@link Voucher.Name.Middle }
     * 
     */
    public Voucher.Name.Middle createVoucherNameMiddle() {
        return new Voucher.Name.Middle();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardNumber }
     * 
     */
    public PaymentCardType.CardNumber createPaymentCardTypeCardNumber() {
        return new PaymentCardType.CardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.SeriesCode }
     * 
     */
    public PaymentCardType.SeriesCode createPaymentCardTypeSeriesCode() {
        return new PaymentCardType.SeriesCode();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderName }
     * 
     */
    public PaymentCardType.CardHolderName createPaymentCardTypeCardHolderName() {
        return new PaymentCardType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderBillingAddress }
     * 
     */
    public PaymentCardType.CardHolderBillingAddress createPaymentCardTypeCardHolderBillingAddress() {
        return new PaymentCardType.CardHolderBillingAddress();
    }

    /**
     * Create an instance of {@link PaymentCardType.MaskedCardNumber }
     * 
     */
    public PaymentCardType.MaskedCardNumber createPaymentCardTypeMaskedCardNumber() {
        return new PaymentCardType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.Surcharge }
     * 
     */
    public PaymentCardType.Surcharge createPaymentCardTypeSurcharge() {
        return new PaymentCardType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardType.EffectiveExpireDate }
     * 
     */
    public PaymentCardType.EffectiveExpireDate createPaymentCardTypeEffectiveExpireDate() {
        return new PaymentCardType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.CertificateNumber }
     * 
     */
    public LoyaltyRedemption.CertificateNumber createLoyaltyRedemptionCertificateNumber() {
        return new LoyaltyRedemption.CertificateNumber();
    }

    /**
     * Create an instance of {@link DirectBillType.Address }
     * 
     */
    public DirectBillType.Address createDirectBillTypeAddress() {
        return new DirectBillType.Address();
    }

    /**
     * Create an instance of {@link Contact.Name.Surname }
     * 
     */
    public Contact.Name.Surname createContactNameSurname() {
        return new Contact.Name.Surname();
    }

    /**
     * Create an instance of {@link Contact.Name.Given }
     * 
     */
    public Contact.Name.Given createContactNameGiven() {
        return new Contact.Name.Given();
    }

    /**
     * Create an instance of {@link PaymentAddrType.City }
     * 
     */
    public PaymentAddrType.City createPaymentAddrTypeCity() {
        return new PaymentAddrType.City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentAddress")
    public JAXBElement<PaymentAddrType> createPaymentAddress(PaymentAddrType value) {
        return new JAXBElement<PaymentAddrType>(_PaymentAddress_QNAME, PaymentAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SimpleAddress")
    public JAXBElement<SimpleAddrType> createSimpleAddress(SimpleAddrType value) {
        return new JAXBElement<SimpleAddrType>(_SimpleAddress_QNAME, SimpleAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StructuredAddress")
    public JAXBElement<StructuredAddrType> createStructuredAddress(StructuredAddrType value) {
        return new JAXBElement<StructuredAddrType>(_StructuredAddress_QNAME, StructuredAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CityName")
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressContact")
    public JAXBElement<AddressContactType> createAddressContact(AddressContactType value) {
        return new JAXBElement<AddressContactType>(_AddressContact_QNAME, AddressContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EmailContact")
    public JAXBElement<EmailType> createEmailContact(EmailType value) {
        return new JAXBElement<EmailType>(_EmailContact_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PhoneContact")
    public JAXBElement<PhoneContactType> createPhoneContact(PhoneContactType value) {
        return new JAXBElement<PhoneContactType>(_PhoneContact_QNAME, PhoneContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherContactMethod")
    public JAXBElement<OtherContactMethodType> createOtherContactMethod(OtherContactMethodType value) {
        return new JAXBElement<OtherContactMethodType>(_OtherContactMethod_QNAME, OtherContactMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectBillType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DirectBill")
    public JAXBElement<DirectBillType> createDirectBill(DirectBillType value) {
        return new JAXBElement<DirectBillType>(_DirectBill_QNAME, DirectBillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentCardType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCard")
    public JAXBElement<PaymentCardType> createPaymentCard(PaymentCardType value) {
        return new JAXBElement<PaymentCardType>(_PaymentCard_QNAME, PaymentCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PercentageValue")
    public JAXBElement<BigDecimal> createPercentageValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentageValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirlineIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirlineID")
    public JAXBElement<AirlineIDType> createAirlineID(AirlineIDType value) {
        return new JAXBElement<AirlineIDType>(_AirlineID_QNAME, AirlineIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PartnerID")
    public JAXBElement<PartnerCompanyIDType> createPartnerID(PartnerCompanyIDType value) {
        return new JAXBElement<PartnerCompanyIDType>(_PartnerID_QNAME, PartnerCompanyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Arrival")
    public JAXBElement<FlightArrivalType> createArrival(FlightArrivalType value) {
        return new JAXBElement<FlightArrivalType>(_Arrival_QNAME, FlightArrivalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "GroupReference")
    @XmlIDREF
    public JAXBElement<Object> createGroupReference(Object value) {
        return new JAXBElement<Object>(_GroupReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PassengerReference")
    @XmlIDREF
    public JAXBElement<List<Object>> createPassengerReference(List<Object> value) {
        return new JAXBElement<List<Object>>(_PassengerReference_QNAME, ((Class) List.class), null, ((List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PassengerReferences")
    @XmlIDREF
    public JAXBElement<List<Object>> createPassengerReferences(List<Object> value) {
        return new JAXBElement<List<Object>>(_PassengerReferences_QNAME, ((Class) List.class), null, ((List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceReferences")
    @XmlIDREF
    public JAXBElement<List<Object>> createServiceReferences(List<Object> value) {
        return new JAXBElement<List<Object>>(_ServiceReferences_QNAME, ((Class) List.class), null, ((List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Itinerary")
    public JAXBElement<FlightItemType> createItinerary(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_Itinerary_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RFICType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RFICType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "RFIC")
    public JAXBElement<RFICType> createRFIC(RFICType value) {
        return new JAXBElement<RFICType>(_RFIC_QNAME, RFICType.class, null, value);
    }

}
