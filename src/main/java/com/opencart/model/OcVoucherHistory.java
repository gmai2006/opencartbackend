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
@Table(name="oc_voucher_history")
public class OcVoucherHistory  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private Float amount;

  @Basic
  @Column(name="\"voucher_id\"" , length=10)
  @NotNull
  private Integer voucherId;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"voucher_history_id\"" , length=10)
  @NotNull
  private Integer voucherHistoryId;

  public OcVoucherHistory() {
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
  public void setVoucherId( Integer value) {
    this.voucherId = value;
  }
  public Integer getVoucherId() {
    return this.voucherId;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setVoucherHistoryId( Integer value) {
    this.voucherHistoryId = value;
  }
  public Integer getVoucherHistoryId() {
    return this.voucherHistoryId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.voucherId)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.voucherHistoryId)); ;
    return builder.toString();
  }
}