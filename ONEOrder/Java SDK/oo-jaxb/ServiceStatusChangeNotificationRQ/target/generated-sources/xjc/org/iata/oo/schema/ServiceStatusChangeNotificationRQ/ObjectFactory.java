
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

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
 * generated in the org.iata.oo.schema.ServiceStatusChangeNotificationRQ package. 
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

    private final static QName _DatePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DatePeriod");
    private final static QName _DateTimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DateTimePeriod");
    private final static QName _DayPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DayPeriod");
    private final static QName _MonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MonthPeriod");
    private final static QName _QuarterPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "QuarterPeriod");
    private final static QName _TimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TimePeriod");
    private final static QName _YearPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "YearPeriod");
    private final static QName _YearMonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "YearMonthPeriod");
    private final static QName _PaymentAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentAddress");
    private final static QName _SimpleAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SimpleAddress");
    private final static QName _StructuredAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StructuredAddress");
    private final static QName _DimensionAllowance_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DimensionAllowance");
    private final static QName _CityName_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CityName");
    private final static QName _AddressContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressContact");
    private final static QName _EmailContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EmailContact");
    private final static QName _PhoneContact_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PhoneContact");
    private final static QName _OtherContactMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherContactMethod");
    private final static QName _CurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CurrencyAmount");
    private final static QName _EncodedCurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EncodedCurrencyAmount");
    private final static QName _DirectBill_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectBill");
    private final static QName _PaymentCard_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCard");
    private final static QName _CurrencyAmountValue_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CurrencyAmountValue");
    private final static QName _PercentageValue_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PercentageValue");
    private final static QName _AgencyID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgencyID");
    private final static QName _AgentUserID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AgentUserID");
    private final static QName _PartnerID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PartnerID");
    private final static QName _FareCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareCode");
    private final static QName _StopLocations_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "StopLocations");
    private final static QName _Arrival_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Arrival");
    private final static QName _FlightDuration_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FlightDuration");
    private final static QName _OfferItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OfferItemID");
    private final static QName _OrderItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OrderItemID");
    private final static QName _OriginDestinationReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OriginDestinationReference");
    private final static QName _OriginDestinationReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OriginDestinationReferences");
    private final static QName _GroupReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "GroupReference");
    private final static QName _PassengerReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReference");
    private final static QName _PassengerReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PassengerReferences");
    private final static QName _BaggageItem_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BaggageItem");
    private final static QName _Itinerary_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Itinerary");
    private final static QName _CashMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CashMethod");
    private final static QName _DirectBillMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DirectBillMethod");
    private final static QName _PaymentCardMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "PaymentCardMethod");
    private final static QName _MethodRedemption_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "MethodRedemption");
    private final static QName _VoucherMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "VoucherMethod");
    private final static QName _ServiceQuantityRules_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceQuantityRules");
    private final static QName _ServiceID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceID");
    private final static QName _AirlineID_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirlineID");
    private final static QName _Equipment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Equipment");
    private final static QName _Commission_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Commission");
    private final static QName _Remarks_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Remarks");
    private final static QName _ClassOfService_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ClassOfService");
    private final static QName _Associations_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Associations");
    private final static QName _FareDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareDetail");
    private final static QName _DetailCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "DetailCurrencyPrice");
    private final static QName _AwardPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AwardPricing");
    private final static QName _CombinationPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "CombinationPricing");
    private final static QName _EncodedCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "EncodedCurrencyPrice");
    private final static QName _SimpleCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "SimpleCurrencyPrice");
    private final static QName _RFIC_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "RFIC");
    private final static QName _FareBasisCode_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareBasisCode");
    private final static QName _TicketDesig_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TicketDesig");
    private final static QName _FareComponent_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareComponent");
    private final static QName _Penalty_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Penalty");
    private final static QName _InstantPurchase_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "InstantPurchase");
    private final static QName _BilateralTimeLimits_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "BilateralTimeLimits");
    private final static QName _ServiceCoupon_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceCoupon");
    private final static QName _ServiceFulfillment_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceFulfillment");
    private final static QName _AirportFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AirportFulfillmentLocation");
    private final static QName _OtherFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "OtherFulfillmentLocation");
    private final static QName _ServiceItemQuantityRules_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceItemQuantityRules");
    private final static QName _ServiceReference_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "ServiceReference");
    private final static QName _AddressCore_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressCore");
    private final static QName _AddressDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AddressDetail");
    private final static QName _Direction_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "Direction");
    private final static QName _AllowanceDescription_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "AllowanceDescription");
    private final static QName _FareBasisCityPair_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareBasisCityPair");
    private final static QName _FareRules_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareRules");
    private final static QName _TaxExemption_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "TaxExemption");
    private final static QName _FareFiledIn_QNAME = new QName("http://www.iata.org/IATA/EDIST/2017.1", "FareFiledIn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iata.oo.schema.ServiceStatusChangeNotificationRQ
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BagAllowancePieceType }
     * 
     */
    public BagAllowancePieceType createBagAllowancePieceType() {
        return new BagAllowancePieceType();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType }
     * 
     */
    public BagAllowanceWeightType createBagAllowanceWeightType() {
        return new BagAllowanceWeightType();
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
     * Create an instance of {@link AgencyCoreRepType }
     * 
     */
    public AgencyCoreRepType createAgencyCoreRepType() {
        return new AgencyCoreRepType();
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
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link ServiceCombinationType }
     * 
     */
    public ServiceCombinationType createServiceCombinationType() {
        return new ServiceCombinationType();
    }

    /**
     * Create an instance of {@link CorporateFare }
     * 
     */
    public CorporateFare createCorporateFare() {
        return new CorporateFare();
    }

    /**
     * Create an instance of {@link AdvanceTicketing }
     * 
     */
    public AdvanceTicketing createAdvanceTicketing() {
        return new AdvanceTicketing();
    }

    /**
     * Create an instance of {@link FileFareType }
     * 
     */
    public FileFareType createFileFareType() {
        return new FileFareType();
    }

    /**
     * Create an instance of {@link IATAServiceStatusChangeNotificationRQ }
     * 
     */
    public IATAServiceStatusChangeNotificationRQ createIATAServiceStatusChangeNotificationRQ() {
        return new IATAServiceStatusChangeNotificationRQ();
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
     * Create an instance of {@link FarePriceBaseType }
     * 
     */
    public FarePriceBaseType createFarePriceBaseType() {
        return new FarePriceBaseType();
    }

    /**
     * Create an instance of {@link CabinCameraPosType }
     * 
     */
    public CabinCameraPosType createCabinCameraPosType() {
        return new CabinCameraPosType();
    }

    /**
     * Create an instance of {@link SeatMapMessageType }
     * 
     */
    public SeatMapMessageType createSeatMapMessageType() {
        return new SeatMapMessageType();
    }

    /**
     * Create an instance of {@link KeyWordType }
     * 
     */
    public KeyWordType createKeyWordType() {
        return new KeyWordType();
    }

    /**
     * Create an instance of {@link SeatDataType }
     * 
     */
    public SeatDataType createSeatDataType() {
        return new SeatDataType();
    }

    /**
     * Create an instance of {@link SeatLocationType }
     * 
     */
    public SeatLocationType createSeatLocationType() {
        return new SeatLocationType();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row }
     * 
     */
    public SeatLocationType.Row createSeatLocationTypeRow() {
        return new SeatLocationType.Row();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType }
     * 
     */
    public FulfillmentPartnerType createFulfillmentPartnerType() {
        return new FulfillmentPartnerType();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment }
     * 
     */
    public FulfillmentPartnerType.Fulfillment createFulfillmentPartnerTypeFulfillment() {
        return new FulfillmentPartnerType.Fulfillment();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates createFulfillmentPartnerTypeFulfillmentOfferValidDates() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType }
     * 
     */
    public ServiceDescriptionType createServiceDescriptionType() {
        return new ServiceDescriptionType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType }
     * 
     */
    public ServiceDefinitionType createServiceDefinitionType() {
        return new ServiceDefinitionType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.BookingInstructions }
     * 
     */
    public ServiceDefinitionType.BookingInstructions createServiceDefinitionTypeBookingInstructions() {
        return new ServiceDefinitionType.BookingInstructions();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.ServiceBundle }
     * 
     */
    public ServiceDefinitionType.ServiceBundle createServiceDefinitionTypeServiceBundle() {
        return new ServiceDefinitionType.ServiceBundle();
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
     * Create an instance of {@link PenaltyType }
     * 
     */
    public PenaltyType createPenaltyType() {
        return new PenaltyType();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail }
     * 
     */
    public PenaltyType.Detail createPenaltyTypeDetail() {
        return new PenaltyType.Detail();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail.Amount }
     * 
     */
    public PenaltyType.Detail.Amount createPenaltyTypeDetailAmount() {
        return new PenaltyType.Detail.Amount();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link PaymentProcessType }
     * 
     */
    public PaymentProcessType createPaymentProcessType() {
        return new PaymentProcessType();
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link PaymentStatusType }
     * 
     */
    public PaymentStatusType createPaymentStatusType() {
        return new PaymentStatusType();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment }
     * 
     */
    public PaymentStatusType.IncompletePayment createPaymentStatusTypeIncompletePayment() {
        return new PaymentStatusType.IncompletePayment();
    }

    /**
     * Create an instance of {@link FlightDetailType }
     * 
     */
    public FlightDetailType createFlightDetailType() {
        return new FlightDetailType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link FlightType.Segment }
     * 
     */
    public FlightType.Segment createFlightTypeSegment() {
        return new FlightType.Segment();
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
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown }
     * 
     */
    public TaxDetailType.Breakdown createTaxDetailTypeBreakdown() {
        return new TaxDetailType.Breakdown();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax }
     * 
     */
    public TaxDetailType.Breakdown.Tax createTaxDetailTypeBreakdownTax() {
        return new TaxDetailType.Breakdown.Tax();
    }

    /**
     * Create an instance of {@link FeeSurchargeType }
     * 
     */
    public FeeSurchargeType createFeeSurchargeType() {
        return new FeeSurchargeType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType }
     * 
     */
    public PriceVarianceRuleType createPriceVarianceRuleType() {
        return new PriceVarianceRuleType();
    }

    /**
     * Create an instance of {@link AwardRedemptionType }
     * 
     */
    public AwardRedemptionType createAwardRedemptionType() {
        return new AwardRedemptionType();
    }

    /**
     * Create an instance of {@link FareFilingType }
     * 
     */
    public FareFilingType createFareFilingType() {
        return new FareFilingType();
    }

    /**
     * Create an instance of {@link TaxExemptionType }
     * 
     */
    public TaxExemptionType createTaxExemptionType() {
        return new TaxExemptionType();
    }

    /**
     * Create an instance of {@link FareRulesType }
     * 
     */
    public FareRulesType createFareRulesType() {
        return new FareRulesType();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing }
     * 
     */
    public FareRulesType.Ticketing createFareRulesTypeTicketing() {
        return new FareRulesType.Ticketing();
    }

    /**
     * Create an instance of {@link DirectionsType }
     * 
     */
    public DirectionsType createDirectionsType() {
        return new DirectionsType();
    }

    /**
     * Create an instance of {@link AddressCoreType }
     * 
     */
    public AddressCoreType createAddressCoreType() {
        return new AddressCoreType();
    }

    /**
     * Create an instance of {@link AddressDetailType }
     * 
     */
    public AddressDetailType createAddressDetailType() {
        return new AddressDetailType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType }
     * 
     */
    public ServiceFulfillmentType createServiceFulfillmentType() {
        return new ServiceFulfillmentType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates createServiceFulfillmentTypeOfferValidDates() {
        return new ServiceFulfillmentType.OfferValidDates();
    }

    /**
     * Create an instance of {@link ServiceCouponType }
     * 
     */
    public ServiceCouponType createServiceCouponType() {
        return new ServiceCouponType();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType }
     * 
     */
    public BilateralTimeLimitsType createBilateralTimeLimitsType() {
        return new BilateralTimeLimitsType();
    }

    /**
     * Create an instance of {@link FareComponentType }
     * 
     */
    public FareComponentType createFareComponentType() {
        return new FareComponentType();
    }

    /**
     * Create an instance of {@link CombinationPriceType }
     * 
     */
    public CombinationPriceType createCombinationPriceType() {
        return new CombinationPriceType();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial }
     * 
     */
    public CombinationPriceType.Partial createCombinationPriceTypePartial() {
        return new CombinationPriceType.Partial();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType }
     * 
     */
    public DetailCurrencyPriceType createDetailCurrencyPriceType() {
        return new DetailCurrencyPriceType();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details }
     * 
     */
    public DetailCurrencyPriceType.Details createDetailCurrencyPriceTypeDetails() {
        return new DetailCurrencyPriceType.Details();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType }
     * 
     */
    public OrderItemAssociationType createOrderItemAssociationType() {
        return new OrderItemAssociationType();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType }
     * 
     */
    public FlightCOSCoreType createFlightCOSCoreType() {
        return new FlightCOSCoreType();
    }

    /**
     * Create an instance of {@link VoucherMethodType }
     * 
     */
    public VoucherMethodType createVoucherMethodType() {
        return new VoucherMethodType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType }
     * 
     */
    public RedemptionMethodType createRedemptionMethodType() {
        return new RedemptionMethodType();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType }
     * 
     */
    public PaymentCardMethodType createPaymentCardMethodType() {
        return new PaymentCardMethodType();
    }

    /**
     * Create an instance of {@link BaggageItemType }
     * 
     */
    public BaggageItemType createBaggageItemType() {
        return new BaggageItemType();
    }

    /**
     * Create an instance of {@link FlightArrivalType }
     * 
     */
    public FlightArrivalType createFlightArrivalType() {
        return new FlightArrivalType();
    }

    /**
     * Create an instance of {@link StopLocationType }
     * 
     */
    public StopLocationType createStopLocationType() {
        return new StopLocationType();
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
     * Create an instance of {@link BagAllowanceDimensionType }
     * 
     */
    public BagAllowanceDimensionType createBagAllowanceDimensionType() {
        return new BagAllowanceDimensionType();
    }

    /**
     * Create an instance of {@link PaymentAddrType }
     * 
     */
    public PaymentAddrType createPaymentAddrType() {
        return new PaymentAddrType();
    }

    /**
     * Create an instance of {@link DatePeriodRepType }
     * 
     */
    public DatePeriodRepType createDatePeriodRepType() {
        return new DatePeriodRepType();
    }

    /**
     * Create an instance of {@link DateTimePeriodRepType }
     * 
     */
    public DateTimePeriodRepType createDateTimePeriodRepType() {
        return new DateTimePeriodRepType();
    }

    /**
     * Create an instance of {@link DayPeriodRepType }
     * 
     */
    public DayPeriodRepType createDayPeriodRepType() {
        return new DayPeriodRepType();
    }

    /**
     * Create an instance of {@link MonthPeriodRepType }
     * 
     */
    public MonthPeriodRepType createMonthPeriodRepType() {
        return new MonthPeriodRepType();
    }

    /**
     * Create an instance of {@link QuarterPeriodRepType }
     * 
     */
    public QuarterPeriodRepType createQuarterPeriodRepType() {
        return new QuarterPeriodRepType();
    }

    /**
     * Create an instance of {@link TimePeriodRepType }
     * 
     */
    public TimePeriodRepType createTimePeriodRepType() {
        return new TimePeriodRepType();
    }

    /**
     * Create an instance of {@link YearPeriodRepType }
     * 
     */
    public YearPeriodRepType createYearPeriodRepType() {
        return new YearPeriodRepType();
    }

    /**
     * Create an instance of {@link YearMonthPeriodRepType }
     * 
     */
    public YearMonthPeriodRepType createYearMonthPeriodRepType() {
        return new YearMonthPeriodRepType();
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
     * Create an instance of {@link org.iata.oo.schema.ServiceStatusChangeNotificationRQ.AirportCode }
     * 
     */
    public org.iata.oo.schema.ServiceStatusChangeNotificationRQ.AirportCode createAirportCode() {
        return new org.iata.oo.schema.ServiceStatusChangeNotificationRQ.AirportCode();
    }

    /**
     * Create an instance of {@link PieceAllowance }
     * 
     */
    public PieceAllowance createPieceAllowance() {
        return new PieceAllowance();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType.PieceMeasurements }
     * 
     */
    public BagAllowancePieceType.PieceMeasurements createBagAllowancePieceTypePieceMeasurements() {
        return new BagAllowancePieceType.PieceMeasurements();
    }

    /**
     * Create an instance of {@link WeightAllowance }
     * 
     */
    public WeightAllowance createWeightAllowance() {
        return new WeightAllowance();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType.MaximumWeight }
     * 
     */
    public BagAllowanceWeightType.MaximumWeight createBagAllowanceWeightTypeMaximumWeight() {
        return new BagAllowanceWeightType.MaximumWeight();
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
     * Create an instance of {@link CurrencyAmountOptType }
     * 
     */
    public CurrencyAmountOptType createCurrencyAmountOptType() {
        return new CurrencyAmountOptType();
    }

    /**
     * Create an instance of {@link CurrCode }
     * 
     */
    public CurrCode createCurrCode() {
        return new CurrCode();
    }

    /**
     * Create an instance of {@link CurrencyAmountEncodedType }
     * 
     */
    public CurrencyAmountEncodedType createCurrencyAmountEncodedType() {
        return new CurrencyAmountEncodedType();
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
     * Create an instance of {@link AgencyIDType }
     * 
     */
    public AgencyIDType createAgencyIDType() {
        return new AgencyIDType();
    }

    /**
     * Create an instance of {@link TravelAgency }
     * 
     */
    public TravelAgency createTravelAgency() {
        return new TravelAgency();
    }

    /**
     * Create an instance of {@link TravelAgencyType }
     * 
     */
    public TravelAgencyType createTravelAgencyType() {
        return new TravelAgencyType();
    }

    /**
     * Create an instance of {@link SellerCoreRepType }
     * 
     */
    public SellerCoreRepType createSellerCoreRepType() {
        return new SellerCoreRepType();
    }

    /**
     * Create an instance of {@link ActorObjectType }
     * 
     */
    public ActorObjectType createActorObjectType() {
        return new ActorObjectType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.PseudoCity }
     * 
     */
    public AgencyCoreRepType.PseudoCity createAgencyCoreRepTypePseudoCity() {
        return new AgencyCoreRepType.PseudoCity();
    }

    /**
     * Create an instance of {@link AgentUserIDType }
     * 
     */
    public AgentUserIDType createAgentUserIDType() {
        return new AgentUserIDType();
    }

    /**
     * Create an instance of {@link PartnerCompanyIDType }
     * 
     */
    public PartnerCompanyIDType createPartnerCompanyIDType() {
        return new PartnerCompanyIDType();
    }

    /**
     * Create an instance of {@link FareCodeType }
     * 
     */
    public FareCodeType createFareCodeType() {
        return new FareCodeType();
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
     * Create an instance of {@link FlightDepartureType.Terminal }
     * 
     */
    public FlightDepartureType.Terminal createFlightDepartureTypeTerminal() {
        return new FlightDepartureType.Terminal();
    }

    /**
     * Create an instance of {@link DepartureCode }
     * 
     */
    public DepartureCode createDepartureCode() {
        return new DepartureCode();
    }

    /**
     * Create an instance of {@link FlightDurationType }
     * 
     */
    public FlightDurationType createFlightDurationType() {
        return new FlightDurationType();
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
     * Create an instance of {@link ItemIDType }
     * 
     */
    public ItemIDType createItemIDType() {
        return new ItemIDType();
    }

    /**
     * Create an instance of {@link SegmentReferences }
     * 
     */
    public SegmentReferences createSegmentReferences() {
        return new SegmentReferences();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimit }
     * 
     */
    public PriceGuaranteeTimeLimit createPriceGuaranteeTimeLimit() {
        return new PriceGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link PriceGuarTimeLimitType }
     * 
     */
    public PriceGuarTimeLimitType createPriceGuarTimeLimitType() {
        return new PriceGuarTimeLimitType();
    }

    /**
     * Create an instance of {@link KeyWithMetaObjectBaseType }
     * 
     */
    public KeyWithMetaObjectBaseType createKeyWithMetaObjectBaseType() {
        return new KeyWithMetaObjectBaseType();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
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
     * Create an instance of {@link CodesetType }
     * 
     */
    public CodesetType createCodesetType() {
        return new CodesetType();
    }

    /**
     * Create an instance of {@link TimeLimit }
     * 
     */
    public TimeLimit createTimeLimit() {
        return new TimeLimit();
    }

    /**
     * Create an instance of {@link CashMethodType }
     * 
     */
    public CashMethodType createCashMethodType() {
        return new CashMethodType();
    }

    /**
     * Create an instance of {@link DirectBillMethodType }
     * 
     */
    public DirectBillMethodType createDirectBillMethodType() {
        return new DirectBillMethodType();
    }

    /**
     * Create an instance of {@link ServiceQuantityType }
     * 
     */
    public ServiceQuantityType createServiceQuantityType() {
        return new ServiceQuantityType();
    }

    /**
     * Create an instance of {@link ServiceIDType }
     * 
     */
    public ServiceIDType createServiceIDType() {
        return new ServiceIDType();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link AircraftSummaryType }
     * 
     */
    public AircraftSummaryType createAircraftSummaryType() {
        return new AircraftSummaryType();
    }

    /**
     * Create an instance of {@link org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Description }
     * 
     */
    public org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Description createDescription() {
        return new org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Description();
    }

    /**
     * Create an instance of {@link DescriptionType.Text }
     * 
     */
    public DescriptionType.Text createDescriptionTypeText() {
        return new DescriptionType.Text();
    }

    /**
     * Create an instance of {@link DescriptionType.Media }
     * 
     */
    public DescriptionType.Media createDescriptionTypeMedia() {
        return new DescriptionType.Media();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
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
     * Create an instance of {@link MediaLink }
     * 
     */
    public MediaLink createMediaLink() {
        return new MediaLink();
    }

    /**
     * Create an instance of {@link FareDetailType }
     * 
     */
    public FareDetailType createFareDetailType() {
        return new FareDetailType();
    }

    /**
     * Create an instance of {@link AwardPriceUnitType }
     * 
     */
    public AwardPriceUnitType createAwardPriceUnitType() {
        return new AwardPriceUnitType();
    }

    /**
     * Create an instance of {@link EncodedPriceType }
     * 
     */
    public EncodedPriceType createEncodedPriceType() {
        return new EncodedPriceType();
    }

    /**
     * Create an instance of {@link SimpleCurrencyPriceType }
     * 
     */
    public SimpleCurrencyPriceType createSimpleCurrencyPriceType() {
        return new SimpleCurrencyPriceType();
    }

    /**
     * Create an instance of {@link RFICType }
     * 
     */
    public RFICType createRFICType() {
        return new RFICType();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link TicketDesignatorType }
     * 
     */
    public TicketDesignatorType createTicketDesignatorType() {
        return new TicketDesignatorType();
    }

    /**
     * Create an instance of {@link MinimumStay.DayQuantity }
     * 
     */
    public MinimumStay.DayQuantity createMinimumStayDayQuantity() {
        return new MinimumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link MaximumStay.DayQuantity }
     * 
     */
    public MaximumStay.DayQuantity createMaximumStayDayQuantity() {
        return new MaximumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link PenaltyDetailType }
     * 
     */
    public PenaltyDetailType createPenaltyDetailType() {
        return new PenaltyDetailType();
    }

    /**
     * Create an instance of {@link InstantPurchaseType }
     * 
     */
    public InstantPurchaseType createInstantPurchaseType() {
        return new InstantPurchaseType();
    }

    /**
     * Create an instance of {@link DepositTimeLimit }
     * 
     */
    public DepositTimeLimit createDepositTimeLimit() {
        return new DepositTimeLimit();
    }

    /**
     * Create an instance of {@link DepositTimeLimitType }
     * 
     */
    public DepositTimeLimitType createDepositTimeLimitType() {
        return new DepositTimeLimitType();
    }

    /**
     * Create an instance of {@link TicketingTimeLimits }
     * 
     */
    public TicketingTimeLimits createTicketingTimeLimits() {
        return new TicketingTimeLimits();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType }
     * 
     */
    public TicketingTimeLimitType createTicketingTimeLimitType() {
        return new TicketingTimeLimitType();
    }

    /**
     * Create an instance of {@link NamingTimeLimit }
     * 
     */
    public NamingTimeLimit createNamingTimeLimit() {
        return new NamingTimeLimit();
    }

    /**
     * Create an instance of {@link NamingTimeLimitType }
     * 
     */
    public NamingTimeLimitType createNamingTimeLimitType() {
        return new NamingTimeLimitType();
    }

    /**
     * Create an instance of {@link ServiceCombinations }
     * 
     */
    public ServiceCombinations createServiceCombinations() {
        return new ServiceCombinations();
    }

    /**
     * Create an instance of {@link ServiceCombinationType.Combination }
     * 
     */
    public ServiceCombinationType.Combination createServiceCombinationTypeCombination() {
        return new ServiceCombinationType.Combination();
    }

    /**
     * Create an instance of {@link SrvcLocationAirportType }
     * 
     */
    public SrvcLocationAirportType createSrvcLocationAirportType() {
        return new SrvcLocationAirportType();
    }

    /**
     * Create an instance of {@link SrvcLocationAddressType }
     * 
     */
    public SrvcLocationAddressType createSrvcLocationAddressType() {
        return new SrvcLocationAddressType();
    }

    /**
     * Create an instance of {@link ServiceItemQuantityType }
     * 
     */
    public ServiceItemQuantityType createServiceItemQuantityType() {
        return new ServiceItemQuantityType();
    }

    /**
     * Create an instance of {@link org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Address }
     * 
     */
    public org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Address createAddress() {
        return new org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Address();
    }

    /**
     * Create an instance of {@link BagAllowanceDescType }
     * 
     */
    public BagAllowanceDescType createBagAllowanceDescType() {
        return new BagAllowanceDescType();
    }

    /**
     * Create an instance of {@link SegmentReference }
     * 
     */
    public SegmentReference createSegmentReference() {
        return new SegmentReference();
    }

    /**
     * Create an instance of {@link FareRulesRemark }
     * 
     */
    public FareRulesRemark createFareRulesRemark() {
        return new FareRulesRemark();
    }

    /**
     * Create an instance of {@link KeyObjectBaseType }
     * 
     */
    public KeyObjectBaseType createKeyObjectBaseType() {
        return new KeyObjectBaseType();
    }

    /**
     * Create an instance of {@link CorporateFare.CompanyIndex }
     * 
     */
    public CorporateFare.CompanyIndex createCorporateFareCompanyIndex() {
        return new CorporateFare.CompanyIndex();
    }

    /**
     * Create an instance of {@link CorporateFare.Contract }
     * 
     */
    public CorporateFare.Contract createCorporateFareContract() {
        return new CorporateFare.Contract();
    }

    /**
     * Create an instance of {@link CorporateFare.Account }
     * 
     */
    public CorporateFare.Account createCorporateFareAccount() {
        return new CorporateFare.Account();
    }

    /**
     * Create an instance of {@link AdvancePurchase }
     * 
     */
    public AdvancePurchase createAdvancePurchase() {
        return new AdvancePurchase();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceReservation }
     * 
     */
    public AdvanceTicketing.AdvanceReservation createAdvanceTicketingAdvanceReservation() {
        return new AdvanceTicketing.AdvanceReservation();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceDeparture }
     * 
     */
    public AdvanceTicketing.AdvanceDeparture createAdvanceTicketingAdvanceDeparture() {
        return new AdvanceTicketing.AdvanceDeparture();
    }

    /**
     * Create an instance of {@link FiledFare }
     * 
     */
    public FiledFare createFiledFare() {
        return new FiledFare();
    }

    /**
     * Create an instance of {@link FileFareType.FareIndicatorCode }
     * 
     */
    public FileFareType.FareIndicatorCode createFileFareTypeFareIndicatorCode() {
        return new FileFareType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link IATAServiceStatusChangeNotificationRQ.Passengers }
     * 
     */
    public IATAServiceStatusChangeNotificationRQ.Passengers createIATAServiceStatusChangeNotificationRQPassengers() {
        return new IATAServiceStatusChangeNotificationRQ.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreType }
     * 
     */
    public OrderCoreType createOrderCoreType() {
        return new OrderCoreType();
    }

    /**
     * Create an instance of {@link CoreDateGrpType }
     * 
     */
    public CoreDateGrpType createCoreDateGrpType() {
        return new CoreDateGrpType();
    }

    /**
     * Create an instance of {@link UniqueIDContextType }
     * 
     */
    public UniqueIDContextType createUniqueIDContextType() {
        return new UniqueIDContextType();
    }

    /**
     * Create an instance of {@link DayRepType }
     * 
     */
    public DayRepType createDayRepType() {
        return new DayRepType();
    }

    /**
     * Create an instance of {@link MonthRepType }
     * 
     */
    public MonthRepType createMonthRepType() {
        return new MonthRepType();
    }

    /**
     * Create an instance of {@link ContactCoreType }
     * 
     */
    public ContactCoreType createContactCoreType() {
        return new ContactCoreType();
    }

    /**
     * Create an instance of {@link MediaIDType }
     * 
     */
    public MediaIDType createMediaIDType() {
        return new MediaIDType();
    }

    /**
     * Create an instance of {@link PriceCoreType }
     * 
     */
    public PriceCoreType createPriceCoreType() {
        return new PriceCoreType();
    }

    /**
     * Create an instance of {@link TaxCoreType }
     * 
     */
    public TaxCoreType createTaxCoreType() {
        return new TaxCoreType();
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
     * Create an instance of {@link PartnerCoreRepType }
     * 
     */
    public PartnerCoreRepType createPartnerCoreRepType() {
        return new PartnerCoreRepType();
    }

    /**
     * Create an instance of {@link AircraftCoreType }
     * 
     */
    public AircraftCoreType createAircraftCoreType() {
        return new AircraftCoreType();
    }

    /**
     * Create an instance of {@link OrderPenaltyType }
     * 
     */
    public OrderPenaltyType createOrderPenaltyType() {
        return new OrderPenaltyType();
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
     * Create an instance of {@link BaggageDeterminingCarrierType }
     * 
     */
    public BaggageDeterminingCarrierType createBaggageDeterminingCarrierType() {
        return new BaggageDeterminingCarrierType();
    }

    /**
     * Create an instance of {@link ListOfSeatType }
     * 
     */
    public ListOfSeatType createListOfSeatType() {
        return new ListOfSeatType();
    }

    /**
     * Create an instance of {@link FarePriceDetailType }
     * 
     */
    public FarePriceDetailType createFarePriceDetailType() {
        return new FarePriceDetailType();
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
     * Create an instance of {@link CabinCameraPosType.Row }
     * 
     */
    public CabinCameraPosType.Row createCabinCameraPosTypeRow() {
        return new CabinCameraPosType.Row();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Column }
     * 
     */
    public CabinCameraPosType.Column createCabinCameraPosTypeColumn() {
        return new CabinCameraPosType.Column();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Images }
     * 
     */
    public SeatMapMessageType.Images createSeatMapMessageTypeImages() {
        return new SeatMapMessageType.Images();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Links }
     * 
     */
    public SeatMapMessageType.Links createSeatMapMessageTypeLinks() {
        return new SeatMapMessageType.Links();
    }

    /**
     * Create an instance of {@link KeyWordType.Word }
     * 
     */
    public KeyWordType.Word createKeyWordTypeWord() {
        return new KeyWordType.Word();
    }

    /**
     * Create an instance of {@link KeyWordType.Value }
     * 
     */
    public KeyWordType.Value createKeyWordTypeValue() {
        return new KeyWordType.Value();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing }
     * 
     */
    public SeatDataType.Marketing createSeatDataTypeMarketing() {
        return new SeatDataType.Marketing();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristic }
     * 
     */
    public SeatLocationType.Characteristic createSeatLocationTypeCharacteristic() {
        return new SeatLocationType.Characteristic();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row.SeatData }
     * 
     */
    public SeatLocationType.Row.SeatData createSeatLocationTypeRowSeatData() {
        return new SeatLocationType.Row.SeatData();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.Location }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.Location createFulfillmentPartnerTypeFulfillmentLocation() {
        return new FulfillmentPartnerType.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.Start }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates.Start createFulfillmentPartnerTypeFulfillmentOfferValidDatesStart() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.End }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates.End createFulfillmentPartnerTypeFulfillmentOfferValidDatesEnd() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType.Description }
     * 
     */
    public ServiceDescriptionType.Description createServiceDescriptionTypeDescription() {
        return new ServiceDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.Name }
     * 
     */
    public ServiceDefinitionType.Name createServiceDefinitionTypeName() {
        return new ServiceDefinitionType.Name();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.BaggageAllowance }
     * 
     */
    public ServiceDefinitionType.BaggageAllowance createServiceDefinitionTypeBaggageAllowance() {
        return new ServiceDefinitionType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.Seat }
     * 
     */
    public ServiceDefinitionType.Seat createServiceDefinitionTypeSeat() {
        return new ServiceDefinitionType.Seat();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.FeeMethod }
     * 
     */
    public ServiceDefinitionType.FeeMethod createServiceDefinitionTypeFeeMethod() {
        return new ServiceDefinitionType.FeeMethod();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.Settlement }
     * 
     */
    public ServiceDefinitionType.Settlement createServiceDefinitionTypeSettlement() {
        return new ServiceDefinitionType.Settlement();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.Detail }
     * 
     */
    public ServiceDefinitionType.Detail createServiceDefinitionTypeDetail() {
        return new ServiceDefinitionType.Detail();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceDefinitionType.BookingInstructions.UpgradeMethod createServiceDefinitionTypeBookingInstructionsUpgradeMethod() {
        return new ServiceDefinitionType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef }
     * 
     */
    public ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef createServiceDefinitionTypeServiceBundleServiceDefinitionRef() {
        return new ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef();
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
     * Create an instance of {@link PenaltyType.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.ApplicableFeeRemarks createPenaltyTypeApplicableFeeRemarks() {
        return new PenaltyType.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail.Amount.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.Detail.Amount.ApplicableFeeRemarks createPenaltyTypeDetailAmountApplicableFeeRemarks() {
        return new PenaltyType.Detail.Amount.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Remark }
     * 
     */
    public org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Remark createRemark() {
        return new org.iata.oo.schema.ServiceStatusChangeNotificationRQ.Remark();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Status }
     * 
     */
    public PaymentProcessType.Status createPaymentProcessTypeStatus() {
        return new PaymentProcessType.Status();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Amount }
     * 
     */
    public PaymentProcessType.Amount createPaymentProcessTypeAmount() {
        return new PaymentProcessType.Amount();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Method }
     * 
     */
    public PaymentProcessType.Method createPaymentProcessTypeMethod() {
        return new PaymentProcessType.Method();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Variance }
     * 
     */
    public PaymentProcessType.Variance createPaymentProcessTypeVariance() {
        return new PaymentProcessType.Variance();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotion }
     * 
     */
    public PaymentProcessType.Promotion createPaymentProcessTypePromotion() {
        return new PaymentProcessType.Promotion();
    }

    /**
     * Create an instance of {@link PromotionType.Code }
     * 
     */
    public PromotionType.Code createPromotionTypeCode() {
        return new PromotionType.Code();
    }

    /**
     * Create an instance of {@link PromotionType.Issuer }
     * 
     */
    public PromotionType.Issuer createPromotionTypeIssuer() {
        return new PromotionType.Issuer();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment.StatusCode }
     * 
     */
    public PaymentStatusType.IncompletePayment.StatusCode createPaymentStatusTypeIncompletePaymentStatusCode() {
        return new PaymentStatusType.IncompletePayment.StatusCode();
    }

    /**
     * Create an instance of {@link OtherAssociation }
     * 
     */
    public OtherAssociation createOtherAssociation() {
        return new OtherAssociation();
    }

    /**
     * Create an instance of {@link FlightDetailType.Stops }
     * 
     */
    public FlightDetailType.Stops createFlightDetailTypeStops() {
        return new FlightDetailType.Stops();
    }

    /**
     * Create an instance of {@link FlightType.Segment.Equipment }
     * 
     */
    public FlightType.Segment.Equipment createFlightTypeSegmentEquipment() {
        return new FlightType.Segment.Equipment();
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
     * Create an instance of {@link TaxDetailType.Total }
     * 
     */
    public TaxDetailType.Total createTaxDetailTypeTotal() {
        return new TaxDetailType.Total();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.CollectionPoint }
     * 
     */
    public TaxDetailType.Breakdown.Tax.CollectionPoint createTaxDetailTypeBreakdownTaxCollectionPoint() {
        return new TaxDetailType.Breakdown.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.Conversion }
     * 
     */
    public TaxDetailType.Breakdown.Tax.Conversion createTaxDetailTypeBreakdownTaxConversion() {
        return new TaxDetailType.Breakdown.Tax.Conversion();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Total }
     * 
     */
    public FeeSurchargeType.Total createFeeSurchargeTypeTotal() {
        return new FeeSurchargeType.Total();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Fee }
     * 
     */
    public FeeSurchargeType.Fee createFeeSurchargeTypeFee() {
        return new FeeSurchargeType.Fee();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleType.AcceptableVariance createPriceVarianceRuleTypeAcceptableVariance() {
        return new PriceVarianceRuleType.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.Name }
     * 
     */
    public PriceVarianceRuleType.Name createPriceVarianceRuleTypeName() {
        return new PriceVarianceRuleType.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.EffectivePeriod }
     * 
     */
    public PriceVarianceRuleType.EffectivePeriod createPriceVarianceRuleTypeEffectivePeriod() {
        return new PriceVarianceRuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Unit }
     * 
     */
    public AwardRedemptionType.Unit createAwardRedemptionTypeUnit() {
        return new AwardRedemptionType.Unit();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Conversion }
     * 
     */
    public AwardRedemptionType.Conversion createAwardRedemptionTypeConversion() {
        return new AwardRedemptionType.Conversion();
    }

    /**
     * Create an instance of {@link FareFilingType.NUCAmount }
     * 
     */
    public FareFilingType.NUCAmount createFareFilingTypeNUCAmount() {
        return new FareFilingType.NUCAmount();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Total }
     * 
     */
    public TaxExemptionType.Total createTaxExemptionTypeTotal() {
        return new TaxExemptionType.Total();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Tax }
     * 
     */
    public TaxExemptionType.Tax createTaxExemptionTypeTax() {
        return new TaxExemptionType.Tax();
    }

    /**
     * Create an instance of {@link FareRulesType.AdvanceStay }
     * 
     */
    public FareRulesType.AdvanceStay createFareRulesTypeAdvanceStay() {
        return new FareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link DirectionsType.Text }
     * 
     */
    public DirectionsType.Text createDirectionsTypeText() {
        return new DirectionsType.Text();
    }

    /**
     * Create an instance of {@link AddressCoreType.Address }
     * 
     */
    public AddressCoreType.Address createAddressCoreTypeAddress() {
        return new AddressCoreType.Address();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.Location }
     * 
     */
    public ServiceFulfillmentType.Location createServiceFulfillmentTypeLocation() {
        return new ServiceFulfillmentType.Location();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.Start }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.Start createServiceFulfillmentTypeOfferValidDatesStart() {
        return new ServiceFulfillmentType.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.End }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.End createServiceFulfillmentTypeOfferValidDatesEnd() {
        return new ServiceFulfillmentType.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link ServiceCouponType.CouponType }
     * 
     */
    public ServiceCouponType.CouponType createServiceCouponTypeCouponType() {
        return new ServiceCouponType.CouponType();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType.BilateralTimeLimit }
     * 
     */
    public BilateralTimeLimitsType.BilateralTimeLimit createBilateralTimeLimitsTypeBilateralTimeLimit() {
        return new BilateralTimeLimitsType.BilateralTimeLimit();
    }

    /**
     * Create an instance of {@link FareComponentType.Parameters }
     * 
     */
    public FareComponentType.Parameters createFareComponentTypeParameters() {
        return new FareComponentType.Parameters();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceBreakdown }
     * 
     */
    public FareComponentType.PriceBreakdown createFareComponentTypePriceBreakdown() {
        return new FareComponentType.PriceBreakdown();
    }

    /**
     * Create an instance of {@link FareComponentType.FareBasis }
     * 
     */
    public FareComponentType.FareBasis createFareComponentTypeFareBasis() {
        return new FareComponentType.FareBasis();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial.Currency }
     * 
     */
    public CombinationPriceType.Partial.Currency createCombinationPriceTypePartialCurrency() {
        return new CombinationPriceType.Partial.Currency();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Taxes }
     * 
     */
    public DetailCurrencyPriceType.Taxes createDetailCurrencyPriceTypeTaxes() {
        return new DetailCurrencyPriceType.Taxes();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Fees }
     * 
     */
    public DetailCurrencyPriceType.Fees createDetailCurrencyPriceTypeFees() {
        return new DetailCurrencyPriceType.Fees();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details.Detail }
     * 
     */
    public DetailCurrencyPriceType.Details.Detail createDetailCurrencyPriceTypeDetail() {
        return new DetailCurrencyPriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Flight }
     * 
     */
    public OrderItemAssociationType.Flight createOrderItemAssociationTypeFlight() {
        return new OrderItemAssociationType.Flight();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.Code }
     * 
     */
    public FlightCOSCoreType.Code createFlightCOSCoreTypeCode() {
        return new FlightCOSCoreType.Code();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.MarketingName }
     * 
     */
    public FlightCOSCoreType.MarketingName createFlightCOSCoreTypeMarketingName() {
        return new FlightCOSCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link VoucherMethodType.EffectiveExpireDate }
     * 
     */
    public VoucherMethodType.EffectiveExpireDate createVoucherMethodTypeEffectiveExpireDate() {
        return new VoucherMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.MemberNumber }
     * 
     */
    public RedemptionMethodType.MemberNumber createRedemptionMethodTypeMemberNumber() {
        return new RedemptionMethodType.MemberNumber();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.CertificateNumber }
     * 
     */
    public RedemptionMethodType.CertificateNumber createRedemptionMethodTypeCertificateNumber() {
        return new RedemptionMethodType.CertificateNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardIssuerName }
     * 
     */
    public PaymentCardMethodType.CardIssuerName createPaymentCardMethodTypeCardIssuerName() {
        return new PaymentCardMethodType.CardIssuerName();
    }

    /**
     * Create an instance of {@link BaggageItemType.BaggageAllowance }
     * 
     */
    public BaggageItemType.BaggageAllowance createBaggageItemTypeBaggageAllowance() {
        return new BaggageItemType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link FlightArrivalType.AirportCode }
     * 
     */
    public FlightArrivalType.AirportCode createFlightArrivalTypeAirportCode() {
        return new FlightArrivalType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightArrivalType.Terminal }
     * 
     */
    public FlightArrivalType.Terminal createFlightArrivalTypeTerminal() {
        return new FlightArrivalType.Terminal();
    }

    /**
     * Create an instance of {@link StopLocationType.StopLocation }
     * 
     */
    public StopLocationType.StopLocation createStopLocationTypeStopLocation() {
        return new StopLocationType.StopLocation();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherID }
     * 
     */
    public AgencyCoreRepType.OtherID createAgencyCoreRepTypeOtherID() {
        return new AgencyCoreRepType.OtherID();
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
     * Create an instance of {@link BagAllowanceDimensionType.MaxLinear }
     * 
     */
    public BagAllowanceDimensionType.MaxLinear createBagAllowanceDimensionTypeMaxLinear() {
        return new BagAllowanceDimensionType.MaxLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MinLinear }
     * 
     */
    public BagAllowanceDimensionType.MinLinear createBagAllowanceDimensionTypeMinLinear() {
        return new BagAllowanceDimensionType.MinLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.Dimensions }
     * 
     */
    public BagAllowanceDimensionType.Dimensions createBagAllowanceDimensionTypeDimensions() {
        return new BagAllowanceDimensionType.Dimensions();
    }

    /**
     * Create an instance of {@link PaymentAddrType.City }
     * 
     */
    public PaymentAddrType.City createPaymentAddrTypeCity() {
        return new PaymentAddrType.City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DatePeriod")
    public JAXBElement<DatePeriodRepType> createDatePeriod(DatePeriodRepType value) {
        return new JAXBElement<DatePeriodRepType>(_DatePeriod_QNAME, DatePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DateTimePeriod")
    public JAXBElement<DateTimePeriodRepType> createDateTimePeriod(DateTimePeriodRepType value) {
        return new JAXBElement<DateTimePeriodRepType>(_DateTimePeriod_QNAME, DateTimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DayPeriod")
    public JAXBElement<DayPeriodRepType> createDayPeriod(DayPeriodRepType value) {
        return new JAXBElement<DayPeriodRepType>(_DayPeriod_QNAME, DayPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MonthPeriod")
    public JAXBElement<MonthPeriodRepType> createMonthPeriod(MonthPeriodRepType value) {
        return new JAXBElement<MonthPeriodRepType>(_MonthPeriod_QNAME, MonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "QuarterPeriod")
    public JAXBElement<QuarterPeriodRepType> createQuarterPeriod(QuarterPeriodRepType value) {
        return new JAXBElement<QuarterPeriodRepType>(_QuarterPeriod_QNAME, QuarterPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TimePeriod")
    public JAXBElement<TimePeriodRepType> createTimePeriod(TimePeriodRepType value) {
        return new JAXBElement<TimePeriodRepType>(_TimePeriod_QNAME, TimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "YearPeriod")
    public JAXBElement<YearPeriodRepType> createYearPeriod(YearPeriodRepType value) {
        return new JAXBElement<YearPeriodRepType>(_YearPeriod_QNAME, YearPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "YearMonthPeriod")
    public JAXBElement<YearMonthPeriodRepType> createYearMonthPeriod(YearMonthPeriodRepType value) {
        return new JAXBElement<YearMonthPeriodRepType>(_YearMonthPeriod_QNAME, YearMonthPeriodRepType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DimensionAllowance")
    public JAXBElement<BagAllowanceDimensionType> createDimensionAllowance(BagAllowanceDimensionType value) {
        return new JAXBElement<BagAllowanceDimensionType>(_DimensionAllowance_QNAME, BagAllowanceDimensionType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CurrencyAmount")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EncodedCurrencyAmount")
    public JAXBElement<CurrencyAmountEncodedType> createEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
        return new JAXBElement<CurrencyAmountEncodedType>(_EncodedCurrencyAmount_QNAME, CurrencyAmountEncodedType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CurrencyAmountValue")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmountValue(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmountValue_QNAME, CurrencyAmountOptType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgencyID")
    public JAXBElement<AgencyIDType> createAgencyID(AgencyIDType value) {
        return new JAXBElement<AgencyIDType>(_AgencyID_QNAME, AgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AgentUserID")
    public JAXBElement<AgentUserIDType> createAgentUserID(AgentUserIDType value) {
        return new JAXBElement<AgentUserIDType>(_AgentUserID_QNAME, AgentUserIDType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FareCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareCode")
    public JAXBElement<FareCodeType> createFareCode(FareCodeType value) {
        return new JAXBElement<FareCodeType>(_FareCode_QNAME, FareCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "StopLocations")
    public JAXBElement<StopLocationType> createStopLocations(StopLocationType value) {
        return new JAXBElement<StopLocationType>(_StopLocations_QNAME, StopLocationType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FlightDuration")
    public JAXBElement<FlightDurationType> createFlightDuration(FlightDurationType value) {
        return new JAXBElement<FlightDurationType>(_FlightDuration_QNAME, FlightDurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OfferItemID")
    public JAXBElement<ItemIDType> createOfferItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OfferItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OrderItemID")
    public JAXBElement<ItemIDType> createOrderItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OrderItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OriginDestinationReference")
    @XmlIDREF
    public JAXBElement<Object> createOriginDestinationReference(Object value) {
        return new JAXBElement<Object>(_OriginDestinationReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OriginDestinationReferences")
    @XmlIDREF
    public JAXBElement<List<Object>> createOriginDestinationReferences(List<Object> value) {
        return new JAXBElement<List<Object>>(_OriginDestinationReferences_QNAME, ((Class) List.class), null, ((List<Object> ) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BaggageItem")
    public JAXBElement<BaggageItemType> createBaggageItem(BaggageItemType value) {
        return new JAXBElement<BaggageItemType>(_BaggageItem_QNAME, BaggageItemType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CashMethod")
    public JAXBElement<CashMethodType> createCashMethod(CashMethodType value) {
        return new JAXBElement<CashMethodType>(_CashMethod_QNAME, CashMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DirectBillMethod")
    public JAXBElement<DirectBillMethodType> createDirectBillMethod(DirectBillMethodType value) {
        return new JAXBElement<DirectBillMethodType>(_DirectBillMethod_QNAME, DirectBillMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "PaymentCardMethod")
    public JAXBElement<PaymentCardMethodType> createPaymentCardMethod(PaymentCardMethodType value) {
        return new JAXBElement<PaymentCardMethodType>(_PaymentCardMethod_QNAME, PaymentCardMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "MethodRedemption")
    public JAXBElement<RedemptionMethodType> createMethodRedemption(RedemptionMethodType value) {
        return new JAXBElement<RedemptionMethodType>(_MethodRedemption_QNAME, RedemptionMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "VoucherMethod")
    public JAXBElement<VoucherMethodType> createVoucherMethod(VoucherMethodType value) {
        return new JAXBElement<VoucherMethodType>(_VoucherMethod_QNAME, VoucherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceQuantityRules")
    public JAXBElement<ServiceQuantityType> createServiceQuantityRules(ServiceQuantityType value) {
        return new JAXBElement<ServiceQuantityType>(_ServiceQuantityRules_QNAME, ServiceQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceID")
    public JAXBElement<ServiceIDType> createServiceID(ServiceIDType value) {
        return new JAXBElement<ServiceIDType>(_ServiceID_QNAME, ServiceIDType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Equipment")
    public JAXBElement<AircraftSummaryType> createEquipment(AircraftSummaryType value) {
        return new JAXBElement<AircraftSummaryType>(_Equipment_QNAME, AircraftSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommissionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Commission")
    public JAXBElement<CommissionType> createCommission(CommissionType value) {
        return new JAXBElement<CommissionType>(_Commission_QNAME, CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarkType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemarkType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Remarks")
    public JAXBElement<RemarkType> createRemarks(RemarkType value) {
        return new JAXBElement<RemarkType>(_Remarks_QNAME, RemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ClassOfService")
    public JAXBElement<FlightCOSCoreType> createClassOfService(FlightCOSCoreType value) {
        return new JAXBElement<FlightCOSCoreType>(_ClassOfService_QNAME, FlightCOSCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Associations")
    public JAXBElement<OrderItemAssociationType> createAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_Associations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareDetail")
    public JAXBElement<FareDetailType> createFareDetail(FareDetailType value) {
        return new JAXBElement<FareDetailType>(_FareDetail_QNAME, FareDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "DetailCurrencyPrice")
    public JAXBElement<DetailCurrencyPriceType> createDetailCurrencyPrice(DetailCurrencyPriceType value) {
        return new JAXBElement<DetailCurrencyPriceType>(_DetailCurrencyPrice_QNAME, DetailCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AwardPricing")
    public JAXBElement<AwardPriceUnitType> createAwardPricing(AwardPriceUnitType value) {
        return new JAXBElement<AwardPriceUnitType>(_AwardPricing_QNAME, AwardPriceUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "CombinationPricing")
    public JAXBElement<CombinationPriceType> createCombinationPricing(CombinationPriceType value) {
        return new JAXBElement<CombinationPriceType>(_CombinationPricing_QNAME, CombinationPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "EncodedCurrencyPrice")
    public JAXBElement<EncodedPriceType> createEncodedCurrencyPrice(EncodedPriceType value) {
        return new JAXBElement<EncodedPriceType>(_EncodedCurrencyPrice_QNAME, EncodedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "SimpleCurrencyPrice")
    public JAXBElement<SimpleCurrencyPriceType> createSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
        return new JAXBElement<SimpleCurrencyPriceType>(_SimpleCurrencyPrice_QNAME, SimpleCurrencyPriceType.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareBasisCode")
    public JAXBElement<FareBasisCodeType> createFareBasisCode(FareBasisCodeType value) {
        return new JAXBElement<FareBasisCodeType>(_FareBasisCode_QNAME, FareBasisCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TicketDesig")
    public JAXBElement<TicketDesignatorType> createTicketDesig(TicketDesignatorType value) {
        return new JAXBElement<TicketDesignatorType>(_TicketDesig_QNAME, TicketDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareComponentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareComponentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareComponent")
    public JAXBElement<FareComponentType> createFareComponent(FareComponentType value) {
        return new JAXBElement<FareComponentType>(_FareComponent_QNAME, FareComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Penalty")
    public JAXBElement<PenaltyDetailType> createPenalty(PenaltyDetailType value) {
        return new JAXBElement<PenaltyDetailType>(_Penalty_QNAME, PenaltyDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstantPurchaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InstantPurchaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "InstantPurchase")
    public JAXBElement<InstantPurchaseType> createInstantPurchase(InstantPurchaseType value) {
        return new JAXBElement<InstantPurchaseType>(_InstantPurchase_QNAME, InstantPurchaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilateralTimeLimitsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BilateralTimeLimitsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "BilateralTimeLimits")
    public JAXBElement<BilateralTimeLimitsType> createBilateralTimeLimits(BilateralTimeLimitsType value) {
        return new JAXBElement<BilateralTimeLimitsType>(_BilateralTimeLimits_QNAME, BilateralTimeLimitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceCoupon")
    public JAXBElement<ServiceCouponType> createServiceCoupon(ServiceCouponType value) {
        return new JAXBElement<ServiceCouponType>(_ServiceCoupon_QNAME, ServiceCouponType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceFulfillment")
    public JAXBElement<ServiceFulfillmentType> createServiceFulfillment(ServiceFulfillmentType value) {
        return new JAXBElement<ServiceFulfillmentType>(_ServiceFulfillment_QNAME, ServiceFulfillmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AirportFulfillmentLocation")
    public JAXBElement<SrvcLocationAirportType> createAirportFulfillmentLocation(SrvcLocationAirportType value) {
        return new JAXBElement<SrvcLocationAirportType>(_AirportFulfillmentLocation_QNAME, SrvcLocationAirportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "OtherFulfillmentLocation")
    public JAXBElement<SrvcLocationAddressType> createOtherFulfillmentLocation(SrvcLocationAddressType value) {
        return new JAXBElement<SrvcLocationAddressType>(_OtherFulfillmentLocation_QNAME, SrvcLocationAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceItemQuantityRules")
    public JAXBElement<ServiceItemQuantityType> createServiceItemQuantityRules(ServiceItemQuantityType value) {
        return new JAXBElement<ServiceItemQuantityType>(_ServiceItemQuantityRules_QNAME, ServiceItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "ServiceReference")
    @XmlIDREF
    public JAXBElement<Object> createServiceReference(Object value) {
        return new JAXBElement<Object>(_ServiceReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressCore")
    public JAXBElement<AddressCoreType> createAddressCore(AddressCoreType value) {
        return new JAXBElement<AddressCoreType>(_AddressCore_QNAME, AddressCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AddressDetail")
    public JAXBElement<AddressDetailType> createAddressDetail(AddressDetailType value) {
        return new JAXBElement<AddressDetailType>(_AddressDetail_QNAME, AddressDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "Direction")
    public JAXBElement<DirectionsType> createDirection(DirectionsType value) {
        return new JAXBElement<DirectionsType>(_Direction_QNAME, DirectionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "AllowanceDescription")
    public JAXBElement<BagAllowanceDescType> createAllowanceDescription(BagAllowanceDescType value) {
        return new JAXBElement<BagAllowanceDescType>(_AllowanceDescription_QNAME, BagAllowanceDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareBasisCityPair")
    public JAXBElement<String> createFareBasisCityPair(String value) {
        return new JAXBElement<String>(_FareBasisCityPair_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareRules")
    public JAXBElement<FareRulesType> createFareRules(FareRulesType value) {
        return new JAXBElement<FareRulesType>(_FareRules_QNAME, FareRulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "TaxExemption")
    public JAXBElement<TaxExemptionType> createTaxExemption(TaxExemptionType value) {
        return new JAXBElement<TaxExemptionType>(_TaxExemption_QNAME, TaxExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST/2017.1", name = "FareFiledIn")
    public JAXBElement<FareFilingType> createFareFiledIn(FareFilingType value) {
        return new JAXBElement<FareFilingType>(_FareFiledIn_QNAME, FareFilingType.class, null, value);
    }

}
