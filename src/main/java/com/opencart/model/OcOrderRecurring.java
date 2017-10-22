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
@Table(name="oc_order_recurring")
public class OcOrderRecurring  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_recurring_id\"" , length=10)
  @NotNull
  private Integer orderRecurringId;

  @Basic
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="\"recurring_duration\"" , length=5)
  @NotNull
  private Integer recurringDuration;

  @Basic
  @Column(name="\"recurring_price\"" , length=10)
  @NotNull
  private Float recurringPrice;

  @Basic
  @Column(name="\"product_name\"" , length=255)
  @NotNull
  private String productName;

  @Basic
  @Column(name="\"product_quantity\"" , length=10)
  @NotNull
  private Integer productQuantity;

  @Basic
  @Column(name="\"trial\"" )
  @NotNull
  private Boolean trial;

  @Basic
  @Column(name="\"reference\"" , length=255)
  @NotNull
  private String reference;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"trial_price\"" , length=10)
  @NotNull
  private Float trialPrice;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"recurring_frequency\"" , length=25)
  @NotNull
  private String recurringFrequency;

  @Basic
  @Column(name="\"recurring_name\"" , length=255)
  @NotNull
  private String recurringName;

  @Basic
  @Column(name="\"trial_cycle\"" , length=5)
  @NotNull
  private Integer trialCycle;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"recurring_cycle\"" , length=5)
  @NotNull
  private Integer recurringCycle;

  @Basic
  @Column(name="\"trial_frequency\"" , length=25)
  @NotNull
  private String trialFrequency;

  @Basic
  @Column(name="\"recurring_description\"" , length=255)
  @NotNull
  private String recurringDescription;

  @Basic
  @Column(name="\"trial_duration\"" , length=5)
  @NotNull
  private Integer trialDuration;

  @Basic
  @Column(name="\"status\"" , length=3)
  @NotNull
  private Integer status;

  public OcOrderRecurring() {
  }

  public void setOrderRecurringId( Integer value) {
    this.orderRecurringId = value;
  }
  public Integer getOrderRecurringId() {
    return this.orderRecurringId;
  }
  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setRecurringDuration( Integer value) {
    this.recurringDuration = value;
  }
  public Integer getRecurringDuration() {
    return this.recurringDuration;
  }
  public void setRecurringPrice( Float value) {
    this.recurringPrice = value;
  }
  public Float getRecurringPrice() {
    return this.recurringPrice;
  }
  public void setProductName( String value) {
    this.productName = value;
  }
  public String getProductName() {
    return this.productName;
  }
  public void setProductQuantity( Integer value) {
    this.productQuantity = value;
  }
  public Integer getProductQuantity() {
    return this.productQuantity;
  }
  public void setTrial( Boolean value) {
    this.trial = value;
  }
  public Boolean getTrial() {
    return this.trial;
  }
  public void setReference( String value) {
    this.reference = value;
  }
  public String getReference() {
    return this.reference;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setTrialPrice( Float value) {
    this.trialPrice = value;
  }
  public Float getTrialPrice() {
    return this.trialPrice;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setRecurringFrequency( String value) {
    this.recurringFrequency = value;
  }
  public String getRecurringFrequency() {
    return this.recurringFrequency;
  }
  public void setRecurringName( String value) {
    this.recurringName = value;
  }
  public String getRecurringName() {
    return this.recurringName;
  }
  public void setTrialCycle( Integer value) {
    this.trialCycle = value;
  }
  public Integer getTrialCycle() {
    return this.trialCycle;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setRecurringCycle( Integer value) {
    this.recurringCycle = value;
  }
  public Integer getRecurringCycle() {
    return this.recurringCycle;
  }
  public void setTrialFrequency( String value) {
    this.trialFrequency = value;
  }
  public String getTrialFrequency() {
    return this.trialFrequency;
  }
  public void setRecurringDescription( String value) {
    this.recurringDescription = value;
  }
  public String getRecurringDescription() {
    return this.recurringDescription;
  }
  public void setTrialDuration( Integer value) {
    this.trialDuration = value;
  }
  public Integer getTrialDuration() {
    return this.trialDuration;
  }
  public void setStatus( Integer value) {
    this.status = value;
  }
  public Integer getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderRecurringId)); 
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.recurringDuration)); 
     builder.append(String.valueOf(this.recurringPrice)); 
     builder.append(String.valueOf(this.productName)); 
     builder.append(String.valueOf(this.productQuantity)); 
     builder.append(String.valueOf(this.trial)); 
     builder.append(String.valueOf(this.reference)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.trialPrice)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.recurringFrequency)); 
     builder.append(String.valueOf(this.recurringName)); 
     builder.append(String.valueOf(this.trialCycle)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.recurringCycle)); 
     builder.append(String.valueOf(this.trialFrequency)); 
     builder.append(String.valueOf(this.recurringDescription)); 
     builder.append(String.valueOf(this.trialDuration)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}