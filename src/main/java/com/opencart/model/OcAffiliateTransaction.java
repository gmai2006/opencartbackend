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
@Table(name="oc_affiliate_transaction")
public class OcAffiliateTransaction  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"affiliate_transaction_id\"" , length=10)
  @NotNull
  private Integer affiliateTransactionId;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private Float amount;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  public OcAffiliateTransaction() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateTransactionId( Integer value) {
    this.affiliateTransactionId = value;
  }
  public Integer getAffiliateTransactionId() {
    return this.affiliateTransactionId;
  }
  public void setAmount( Float value) {
    this.amount = value;
  }
  public Float getAmount() {
    return this.amount;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
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
     builder.append(String.valueOf(this.affiliateTransactionId)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}