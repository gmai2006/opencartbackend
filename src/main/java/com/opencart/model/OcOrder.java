package com.opencart.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_order")
public class OcOrder  {
  @Basic
  @Column(name="\"payment_zone_id\"" , length=10)
  @NotNull
  private Integer paymentZoneId;

  @Basic
  @Column(name="\"shipping_code\"" , length=128)
  @NotNull
  private String shippingCode;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="\"shipping_city\"" , length=128)
  @NotNull
  private String shippingCity;

  @Basic
  @Column(name="\"shipping_address_1\"" , length=128)
  @NotNull
  private String shippingAddress1;

  @Basic
  @Column(name="\"order_status_id\"" , length=10)
  @NotNull
  private Integer orderStatusId;

  @Basic
  @Column(name="\"shipping_address_2\"" , length=128)
  @NotNull
  private String shippingAddress2;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"tracking\"" , length=64)
  @NotNull
  private String tracking;

  @Basic
  @Column(name="\"shipping_address_format\"" , length=65535)
  @NotNull
  private String shippingAddressFormat;

  @Basic
  @Column(name="\"payment_lastname\"" , length=32)
  @NotNull
  private String paymentLastname;

  @Basic
  @Column(name="\"forwarded_ip\"" , length=40)
  @NotNull
  private String forwardedIp;

  @Basic
  @Column(name="\"shipping_method\"" , length=128)
  @NotNull
  private String shippingMethod;

  @Basic
  @Column(name="\"accept_language\"" , length=255)
  @NotNull
  private String acceptLanguage;

  @Basic
  @Column(name="\"payment_postcode\"" , length=10)
  @NotNull
  private String paymentPostcode;

  @Basic
  @Column(name="\"fax\"" , length=32)
  @NotNull
  private String fax;

  @Basic
  @Column(name="\"payment_method\"" , length=128)
  @NotNull
  private String paymentMethod;

  @Basic
  @Column(name="\"shipping_lastname\"" , length=32)
  @NotNull
  private String shippingLastname;

  @Basic
  @Column(name="\"payment_custom_field\"" , length=65535)
  @NotNull
  private String paymentCustomField;

  @Basic
  @Column(name="\"shipping_company\"" , length=60)
  @NotNull
  private String shippingCompany;

  @Basic
  @Column(name="\"invoice_prefix\"" , length=26)
  @NotNull
  private String invoicePrefix;

  @Basic
  @Column(name="\"payment_zone\"" , length=128)
  @NotNull
  private String paymentZone;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"payment_country_id\"" , length=10)
  @NotNull
  private Integer paymentCountryId;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"shipping_country\"" , length=128)
  @NotNull
  private String shippingCountry;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"payment_address_format\"" , length=65535)
  @NotNull
  private String paymentAddressFormat;

  @Basic
  @Column(name="\"currency_code\"" , length=3)
  @NotNull
  private String currencyCode;

  @Basic
  @Column(name="\"store_url\"" , length=255)
  @NotNull
  private String storeUrl;

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private Float total = 0.0000F;

  @Basic
  @Column(name="\"shipping_country_id\"" , length=10)
  @NotNull
  private Integer shippingCountryId;

  @Basic
  @Column(name="\"payment_country\"" , length=128)
  @NotNull
  private String paymentCountry;

  @Basic
  @Column(name="\"store_name\"" , length=64)
  @NotNull
  private String storeName;

  @Basic
  @Column(name="\"commission\"" , length=15)
  @NotNull
  private Float commission;

  @Basic
  @Column(name="\"shipping_firstname\"" , length=32)
  @NotNull
  private String shippingFirstname;

  @Basic
  @Column(name="\"payment_city\"" , length=128)
  @NotNull
  private String paymentCity;

  @Basic
  @Column(name="\"shipping_postcode\"" , length=10)
  @NotNull
  private String shippingPostcode;

  @Basic
  @Column(name="\"shipping_custom_field\"" , length=65535)
  @NotNull
  private String shippingCustomField;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="\"payment_firstname\"" , length=32)
  @NotNull
  private String paymentFirstname;

  @Basic
  @Column(name="\"user_agent\"" , length=255)
  @NotNull
  private String userAgent;

  @Basic
  @Column(name="\"payment_company\"" , length=60)
  @NotNull
  private String paymentCompany;

  @Basic
  @Column(name="\"payment_code\"" , length=128)
  @NotNull
  private String paymentCode;

  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="\"custom_field\"" , length=65535)
  @NotNull
  private String customField;

  @Basic
  @Column(name="\"invoice_no\"" , length=10)
  @NotNull
  private Integer invoiceNo;

  @Basic
  @Column(name="\"currency_value\"" , length=15)
  @NotNull
  private Float currencyValue = 1.00000000F;

  @Basic
  @Column(name="\"payment_address_2\"" , length=128)
  @NotNull
  private String paymentAddress2;

  @Basic
  @Column(name="\"payment_address_1\"" , length=128)
  @NotNull
  private String paymentAddress1;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="\"marketing_id\"" , length=10)
  @NotNull
  private Integer marketingId;

  @Basic
  @Column(name="\"shipping_zone\"" , length=128)
  @NotNull
  private String shippingZone;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="\"shipping_zone_id\"" , length=10)
  @NotNull
  private Integer shippingZoneId;

  @Basic
  @Column(name="\"currency_id\"" , length=10)
  @NotNull
  private Integer currencyId;

  public OcOrder() {
  }

  public void setPaymentZoneId( Integer value) {
    this.paymentZoneId = value;
  }
  public Integer getPaymentZoneId() {
    return this.paymentZoneId;
  }
  public void setShippingCode( String value) {
    this.shippingCode = value;
  }
  public String getShippingCode() {
    return this.shippingCode;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setShippingCity( String value) {
    this.shippingCity = value;
  }
  public String getShippingCity() {
    return this.shippingCity;
  }
  public void setShippingAddress1( String value) {
    this.shippingAddress1 = value;
  }
  public String getShippingAddress1() {
    return this.shippingAddress1;
  }
  public void setOrderStatusId( Integer value) {
    this.orderStatusId = value;
  }
  public Integer getOrderStatusId() {
    return this.orderStatusId;
  }
  public void setShippingAddress2( String value) {
    this.shippingAddress2 = value;
  }
  public String getShippingAddress2() {
    return this.shippingAddress2;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setTracking( String value) {
    this.tracking = value;
  }
  public String getTracking() {
    return this.tracking;
  }
  public void setShippingAddressFormat( String value) {
    this.shippingAddressFormat = value;
  }
  public String getShippingAddressFormat() {
    return this.shippingAddressFormat;
  }
  public void setPaymentLastname( String value) {
    this.paymentLastname = value;
  }
  public String getPaymentLastname() {
    return this.paymentLastname;
  }
  public void setForwardedIp( String value) {
    this.forwardedIp = value;
  }
  public String getForwardedIp() {
    return this.forwardedIp;
  }
  public void setShippingMethod( String value) {
    this.shippingMethod = value;
  }
  public String getShippingMethod() {
    return this.shippingMethod;
  }
  public void setAcceptLanguage( String value) {
    this.acceptLanguage = value;
  }
  public String getAcceptLanguage() {
    return this.acceptLanguage;
  }
  public void setPaymentPostcode( String value) {
    this.paymentPostcode = value;
  }
  public String getPaymentPostcode() {
    return this.paymentPostcode;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setPaymentMethod( String value) {
    this.paymentMethod = value;
  }
  public String getPaymentMethod() {
    return this.paymentMethod;
  }
  public void setShippingLastname( String value) {
    this.shippingLastname = value;
  }
  public String getShippingLastname() {
    return this.shippingLastname;
  }
  public void setPaymentCustomField( String value) {
    this.paymentCustomField = value;
  }
  public String getPaymentCustomField() {
    return this.paymentCustomField;
  }
  public void setShippingCompany( String value) {
    this.shippingCompany = value;
  }
  public String getShippingCompany() {
    return this.shippingCompany;
  }
  public void setInvoicePrefix( String value) {
    this.invoicePrefix = value;
  }
  public String getInvoicePrefix() {
    return this.invoicePrefix;
  }
  public void setPaymentZone( String value) {
    this.paymentZone = value;
  }
  public String getPaymentZone() {
    return this.paymentZone;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setPaymentCountryId( Integer value) {
    this.paymentCountryId = value;
  }
  public Integer getPaymentCountryId() {
    return this.paymentCountryId;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setShippingCountry( String value) {
    this.shippingCountry = value;
  }
  public String getShippingCountry() {
    return this.shippingCountry;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setPaymentAddressFormat( String value) {
    this.paymentAddressFormat = value;
  }
  public String getPaymentAddressFormat() {
    return this.paymentAddressFormat;
  }
  public void setCurrencyCode( String value) {
    this.currencyCode = value;
  }
  public String getCurrencyCode() {
    return this.currencyCode;
  }
  public void setStoreUrl( String value) {
    this.storeUrl = value;
  }
  public String getStoreUrl() {
    return this.storeUrl;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setShippingCountryId( Integer value) {
    this.shippingCountryId = value;
  }
  public Integer getShippingCountryId() {
    return this.shippingCountryId;
  }
  public void setPaymentCountry( String value) {
    this.paymentCountry = value;
  }
  public String getPaymentCountry() {
    return this.paymentCountry;
  }
  public void setStoreName( String value) {
    this.storeName = value;
  }
  public String getStoreName() {
    return this.storeName;
  }
  public void setCommission( Float value) {
    this.commission = value;
  }
  public Float getCommission() {
    return this.commission;
  }
  public void setShippingFirstname( String value) {
    this.shippingFirstname = value;
  }
  public String getShippingFirstname() {
    return this.shippingFirstname;
  }
  public void setPaymentCity( String value) {
    this.paymentCity = value;
  }
  public String getPaymentCity() {
    return this.paymentCity;
  }
  public void setShippingPostcode( String value) {
    this.shippingPostcode = value;
  }
  public String getShippingPostcode() {
    return this.shippingPostcode;
  }
  public void setShippingCustomField( String value) {
    this.shippingCustomField = value;
  }
  public String getShippingCustomField() {
    return this.shippingCustomField;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setPaymentFirstname( String value) {
    this.paymentFirstname = value;
  }
  public String getPaymentFirstname() {
    return this.paymentFirstname;
  }
  public void setUserAgent( String value) {
    this.userAgent = value;
  }
  public String getUserAgent() {
    return this.userAgent;
  }
  public void setPaymentCompany( String value) {
    this.paymentCompany = value;
  }
  public String getPaymentCompany() {
    return this.paymentCompany;
  }
  public void setPaymentCode( String value) {
    this.paymentCode = value;
  }
  public String getPaymentCode() {
    return this.paymentCode;
  }
  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setCustomField( String value) {
    this.customField = value;
  }
  public String getCustomField() {
    return this.customField;
  }
  public void setInvoiceNo( Integer value) {
    this.invoiceNo = value;
  }
  public Integer getInvoiceNo() {
    return this.invoiceNo;
  }
  public void setCurrencyValue( Float value) {
    this.currencyValue = value;
  }
  public Float getCurrencyValue() {
    return this.currencyValue;
  }
  public void setPaymentAddress2( String value) {
    this.paymentAddress2 = value;
  }
  public String getPaymentAddress2() {
    return this.paymentAddress2;
  }
  public void setPaymentAddress1( String value) {
    this.paymentAddress1 = value;
  }
  public String getPaymentAddress1() {
    return this.paymentAddress1;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setMarketingId( Integer value) {
    this.marketingId = value;
  }
  public Integer getMarketingId() {
    return this.marketingId;
  }
  public void setShippingZone( String value) {
    this.shippingZone = value;
  }
  public String getShippingZone() {
    return this.shippingZone;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setShippingZoneId( Integer value) {
    this.shippingZoneId = value;
  }
  public Integer getShippingZoneId() {
    return this.shippingZoneId;
  }
  public void setCurrencyId( Integer value) {
    this.currencyId = value;
  }
  public Integer getCurrencyId() {
    return this.currencyId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.paymentZoneId)); 
     builder.append(String.valueOf(this.shippingCode)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.shippingCity)); 
     builder.append(String.valueOf(this.shippingAddress1)); 
     builder.append(String.valueOf(this.orderStatusId)); 
     builder.append(String.valueOf(this.shippingAddress2)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.tracking)); 
     builder.append(String.valueOf(this.shippingAddressFormat)); 
     builder.append(String.valueOf(this.paymentLastname)); 
     builder.append(String.valueOf(this.forwardedIp)); 
     builder.append(String.valueOf(this.shippingMethod)); 
     builder.append(String.valueOf(this.acceptLanguage)); 
     builder.append(String.valueOf(this.paymentPostcode)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.paymentMethod)); 
     builder.append(String.valueOf(this.shippingLastname)); 
     builder.append(String.valueOf(this.paymentCustomField)); 
     builder.append(String.valueOf(this.shippingCompany)); 
     builder.append(String.valueOf(this.invoicePrefix)); 
     builder.append(String.valueOf(this.paymentZone)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.paymentCountryId)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.shippingCountry)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.paymentAddressFormat)); 
     builder.append(String.valueOf(this.currencyCode)); 
     builder.append(String.valueOf(this.storeUrl)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.shippingCountryId)); 
     builder.append(String.valueOf(this.paymentCountry)); 
     builder.append(String.valueOf(this.storeName)); 
     builder.append(String.valueOf(this.commission)); 
     builder.append(String.valueOf(this.shippingFirstname)); 
     builder.append(String.valueOf(this.paymentCity)); 
     builder.append(String.valueOf(this.shippingPostcode)); 
     builder.append(String.valueOf(this.shippingCustomField)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.paymentFirstname)); 
     builder.append(String.valueOf(this.userAgent)); 
     builder.append(String.valueOf(this.paymentCompany)); 
     builder.append(String.valueOf(this.paymentCode)); 
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.customField)); 
     builder.append(String.valueOf(this.invoiceNo)); 
     builder.append(String.valueOf(this.currencyValue)); 
     builder.append(String.valueOf(this.paymentAddress2)); 
     builder.append(String.valueOf(this.paymentAddress1)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.marketingId)); 
     builder.append(String.valueOf(this.shippingZone)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.shippingZoneId)); 
     builder.append(String.valueOf(this.currencyId)); ;
    return builder.toString();
  }
}