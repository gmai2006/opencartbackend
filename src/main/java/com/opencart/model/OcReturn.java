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
@Table(name="oc_return")
public class OcReturn  {
  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"product\"" , length=255)
  @NotNull
  private String product;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"return_reason_id\"" , length=10)
  @NotNull
  private Integer returnReasonId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"return_id\"" , length=10)
  @NotNull
  private Integer returnId;

  @Basic
  @Column(name="\"telephone\"" , length=32)
  @NotNull
  private String telephone;

  @Basic
  @Column(name="\"opened\"" )
  @NotNull
  private Boolean opened;

  @Basic
  @Column(name="\"date_ordered\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateOrdered = new java.util.Date();

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"return_action_id\"" , length=10)
  @NotNull
  private Integer returnActionId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"model\"" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="\"return_status_id\"" , length=10)
  @NotNull
  private Integer returnStatusId;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  private String comment;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  public OcReturn() {
  }

  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setProduct( String value) {
    this.product = value;
  }
  public String getProduct() {
    return this.product;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setReturnReasonId( Integer value) {
    this.returnReasonId = value;
  }
  public Integer getReturnReasonId() {
    return this.returnReasonId;
  }
  public void setReturnId( Integer value) {
    this.returnId = value;
  }
  public Integer getReturnId() {
    return this.returnId;
  }
  public void setTelephone( String value) {
    this.telephone = value;
  }
  public String getTelephone() {
    return this.telephone;
  }
  public void setOpened( Boolean value) {
    this.opened = value;
  }
  public Boolean getOpened() {
    return this.opened;
  }
  public void setDateOrdered( java.util.Date value) {
    this.dateOrdered = value;
  }
  public java.util.Date getDateOrdered() {
    return this.dateOrdered;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setReturnActionId( Integer value) {
    this.returnActionId = value;
  }
  public Integer getReturnActionId() {
    return this.returnActionId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setReturnStatusId( Integer value) {
    this.returnStatusId = value;
  }
  public Integer getReturnStatusId() {
    return this.returnStatusId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.product)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.returnReasonId)); 
     builder.append(String.valueOf(this.returnId)); 
     builder.append(String.valueOf(this.telephone)); 
     builder.append(String.valueOf(this.opened)); 
     builder.append(String.valueOf(this.dateOrdered)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.returnActionId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.returnStatusId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.email)); ;
    return builder.toString();
  }
}