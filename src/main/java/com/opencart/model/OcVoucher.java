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
@Table(name="oc_voucher")
public class OcVoucher  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"to_email\"" , length=96)
  @NotNull
  private String toEmail;

  @Basic
  @Column(name="\"voucher_theme_id\"" , length=10)
  @NotNull
  private Integer voucherThemeId;

  @Basic
  @Column(name="\"amount\"" , length=15)
  @NotNull
  private Float amount;

  @Basic
  @Column(name="\"code\"" , length=10)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"from_email\"" , length=96)
  @NotNull
  private String fromEmail;

  @Basic
  @Column(name="\"to_name\"" , length=64)
  @NotNull
  private String toName;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"voucher_id\"" , length=10)
  @NotNull
  private Integer voucherId;

  @Basic
  @Column(name="\"from_name\"" , length=64)
  @NotNull
  private String fromName;

  @Basic
  @Column(name="\"message\"" , length=65535)
  @NotNull
  private String message;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcVoucher() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setToEmail( String value) {
    this.toEmail = value;
  }
  public String getToEmail() {
    return this.toEmail;
  }
  public void setVoucherThemeId( Integer value) {
    this.voucherThemeId = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucherThemeId;
  }
  public void setAmount( Float value) {
    this.amount = value;
  }
  public Float getAmount() {
    return this.amount;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setFromEmail( String value) {
    this.fromEmail = value;
  }
  public String getFromEmail() {
    return this.fromEmail;
  }
  public void setToName( String value) {
    this.toName = value;
  }
  public String getToName() {
    return this.toName;
  }
  public void setVoucherId( Integer value) {
    this.voucherId = value;
  }
  public Integer getVoucherId() {
    return this.voucherId;
  }
  public void setFromName( String value) {
    this.fromName = value;
  }
  public String getFromName() {
    return this.fromName;
  }
  public void setMessage( String value) {
    this.message = value;
  }
  public String getMessage() {
    return this.message;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.toEmail)); 
     builder.append(String.valueOf(this.voucherThemeId)); 
     builder.append(String.valueOf(this.amount)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.fromEmail)); 
     builder.append(String.valueOf(this.toName)); 
     builder.append(String.valueOf(this.voucherId)); 
     builder.append(String.valueOf(this.fromName)); 
     builder.append(String.valueOf(this.message)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}