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
@Table(name="oc_order_recurring_transaction")
public class OcOrderRecurringTransaction  {
  @Basic
  @Column(name="\"reference\"" , length=255)
  @NotNull
  private String reference;

  @Basic
  @Column(name="\"order_recurring_id\"" , length=10)
  @NotNull
  private Integer orderRecurringId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"amount\"" , length=10)
  @NotNull
  private Float amount;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_recurring_transaction_id\"" , length=10)
  @NotNull
  private Integer orderRecurringTransactionId;

  @Basic
  @Column(name="\"type\"" , length=255)
  @NotNull
  private String type;

  public OcOrderRecurringTransaction() {
  }

  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setOrderRecurringId( Integer value) {
    this.orderRecurringId = value;
  }
  public Integer getOrderRecurringId() {
    return this.orderRecurringId;
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
  public void setOrderRecurringTransactionId( Integer value) {
    this.orderRecurringTransactionId = value;
  }
  public Integer getOrderRecurringTransactionId() {
    return this.orderRecurringTransactionId;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reference)); 
     builder.append(String.valueOf(this.orderRecurringId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.orderRecurringTransactionId)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}