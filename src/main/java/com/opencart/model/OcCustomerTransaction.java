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
@Table(name="oc_customer_transaction")
public class OcCustomerTransaction  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private Float amount;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"customer_transaction_id\"" , length=10)
  @NotNull
  private Integer customerTransactionId;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  public OcCustomerTransaction() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAmount( Float value) {
    this.amount = value;
  }
  public Float getAmount() {
    return this.amount;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setCustomerTransactionId( Integer value) {
    this.customerTransactionId = value;
  }
  public Integer getCustomerTransactionId() {
    return this.customerTransactionId;
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.customerTransactionId)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}