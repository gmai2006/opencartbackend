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
@Table(name="oc_customer")
public class OcCustomer  {
  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="\"newsletter\"" )
  @NotNull
  private Boolean newsletter;

  @Basic
  @Column(name="\"custom_field\"" , length=65535)
  @NotNull
  private String customField;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"salt\"" , length=9)
  @NotNull
  private String salt;

  @Basic
  @Column(name="\"code\"" , length=40)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"wishlist\"" , length=65535)
  private String wishlist;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"address_id\"" , length=10)
  @NotNull
  private Integer addressId;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"cart\"" , length=65535)
  private String cart;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"token\"" , length=65535)
  @NotNull
  private String token;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"password\"" , length=40)
  @NotNull
  private String password;

  @Basic
  @Column(name="\"approved\"" )
  @NotNull
  private Boolean approved;

  @Basic
  @Column(name="\"safe\"" )
  @NotNull
  private Boolean safe;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"fax\"" , length=32)
  @NotNull
  private String fax;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcCustomer() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setNewsletter( Boolean value) {
    this.newsletter = value;
  }
  public Boolean getNewsletter() {
    return this.newsletter;
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
  public void setSalt( String value) {
    this.salt = value;
  }
  public String getSalt() {
    return this.salt;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setWishlist( String value) {
    this.wishlist = value;
  }
  public String getWishlist() {
    return this.wishlist;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setAddressId( Integer value) {
    this.addressId = value;
  }
  public Integer getAddressId() {
    return this.addressId;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setCart( String value) {
    this.cart = value;
  }
  public String getCart() {
    return this.cart;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setToken( String value) {
    this.token = value;
  }
  public String getToken() {
    return this.token;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setPassword( String value) {
    this.password = value;
  }
  public String getPassword() {
    return this.password;
  }
  public void setApproved( Boolean value) {
    this.approved = value;
  }
  public Boolean getApproved() {
    return this.approved;
  }
  public void setSafe( Boolean value) {
    this.safe = value;
  }
  public Boolean getSafe() {
    return this.safe;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setFax( String value) {
    this.fax = value;
  }
  public String getFax() {
    return this.fax;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.newsletter)); 
     builder.append(String.valueOf(this.customField)); 
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.salt)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.wishlist)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.addressId)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.cart)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.token)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.password)); 
     builder.append(String.valueOf(this.approved)); 
     builder.append(String.valueOf(this.safe)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.fax)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}