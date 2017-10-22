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
@Table(name="oc_country")
public class OcCountry  {
  @Basic
  @Column(name="\"iso_code_2\"" , length=2)
  @NotNull
  private String isoCode2;

  @Basic
  @Column(name="\"address_format\"" , length=65535)
  @NotNull
  private String addressFormat;

  @Basic
  @Column(name="\"iso_code_3\"" , length=3)
  @NotNull
  private String isoCode3;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"postcode_required\"" )
  @NotNull
  private Boolean postcodeRequired;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer countryId;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status = true;

  public OcCountry() {
  }

  public void setIsoCode2( String value) {
    this.isoCode2 = value;
  }
  public String getIsoCode2() {
    return this.isoCode2;
  }
  public void setAddressFormat( String value) {
    this.addressFormat = value;
  }
  public String getAddressFormat() {
    return this.addressFormat;
  }
  public void setIsoCode3( String value) {
    this.isoCode3 = value;
  }
  public String getIsoCode3() {
    return this.isoCode3;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setPostcodeRequired( Boolean value) {
    this.postcodeRequired = value;
  }
  public Boolean getPostcodeRequired() {
    return this.postcodeRequired;
  }
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.isoCode2)); 
     builder.append(String.valueOf(this.addressFormat)); 
     builder.append(String.valueOf(this.isoCode3)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.postcodeRequired)); 
     builder.append(String.valueOf(this.countryId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}