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
@Table(name="oc_coupon")
public class OcCoupon  {
  @Basic
  @Column(name="\"code\"" , length=20)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"discount\"" , length=15)
  @NotNull
  private Float discount;

  @Basic
  @Column(name="\"date_end\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateEnd = new java.util.Date();

  @Basic
  @Column(name="\"type\"" , length=1)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private Float total;

  @Basic
  @Column(name="\"date_start\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateStart = new java.util.Date();

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer couponId;

  @Basic
  @Column(name="\"shipping\"" )
  @NotNull
  private Boolean shipping;

  @Basic
  @Column(name="\"uses_total\"" , length=10)
  @NotNull
  private Integer usesTotal;

  @Basic
  @Column(name="\"logged\"" )
  @NotNull
  private Boolean logged;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"uses_customer\"" , length=11)
  @NotNull
  private String usesCustomer;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcCoupon() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDiscount( Float value) {
    this.discount = value;
  }
  public Float getDiscount() {
    return this.discount;
  }
  public void setDateEnd( java.util.Date value) {
    this.dateEnd = value;
  }
  public java.util.Date getDateEnd() {
    return this.dateEnd;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
  }
  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setShipping( Boolean value) {
    this.shipping = value;
  }
  public Boolean getShipping() {
    return this.shipping;
  }
  public void setUsesTotal( Integer value) {
    this.usesTotal = value;
  }
  public Integer getUsesTotal() {
    return this.usesTotal;
  }
  public void setLogged( Boolean value) {
    this.logged = value;
  }
  public Boolean getLogged() {
    return this.logged;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setUsesCustomer( String value) {
    this.usesCustomer = value;
  }
  public String getUsesCustomer() {
    return this.usesCustomer;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.discount)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.dateStart)); 
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.shipping)); 
     builder.append(String.valueOf(this.usesTotal)); 
     builder.append(String.valueOf(this.logged)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.usesCustomer)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}