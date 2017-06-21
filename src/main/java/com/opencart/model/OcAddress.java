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
@Table(name="oc_address")
public class OcAddress  {
  @Basic
  @Column(name="\"zone_id\"" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="\"custom_field\"" , length=65535)
  @NotNull
  private String customField;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"city\"" , length=128)
  @NotNull
  private String city;

  @Basic
  @Column(name="\"address_1\"" , length=128)
  @NotNull
  private String address1;

  @Basic
  @Column(name="\"address_2\"" , length=128)
  @NotNull
  private String address2;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"address_id\"" , length=10)
  @NotNull
  private Integer addressId;

  @Basic
  @Column(name="\"postcode\"" , length=10)
  @NotNull
  private String postcode;

  @Basic
  @Column(name="\"company\"" , length=40)
  @NotNull
  private String company;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  public OcAddress() {
  }

  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
  }
  public void setCustomField( String value) {
    this.customField = value;
  }
  public String getCustomField() {
    return this.customField;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setCity( String value) {
    this.city = value;
  }
  public String getCity() {
    return this.city;
  }
  public void setAddress1( String value) {
    this.address1 = value;
  }
  public String getAddress1() {
    return this.address1;
  }
  public void setAddress2( String value) {
    this.address2 = value;
  }
  public String getAddress2() {
    return this.address2;
  }
  public void setAddressId( Integer value) {
    this.addressId = value;
  }
  public Integer getAddressId() {
    return this.addressId;
  }
  public void setPostcode( String value) {
    this.postcode = value;
  }
  public String getPostcode() {
    return this.postcode;
  }
  public void setCompany( String value) {
    this.company = value;
  }
  public String getCompany() {
    return this.company;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.customField)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.city)); 
     builder.append(String.valueOf(this.address1)); 
     builder.append(String.valueOf(this.address2)); 
     builder.append(String.valueOf(this.addressId)); 
     builder.append(String.valueOf(this.postcode)); 
     builder.append(String.valueOf(this.company)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.lastname)); ;
    return builder.toString();
  }
}