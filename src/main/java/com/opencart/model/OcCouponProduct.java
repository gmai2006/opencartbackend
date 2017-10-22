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
@Table(name="oc_coupon_product")
public class OcCouponProduct  {
  @Basic
  @Column(name="\"coupon_id\"" , length=10)
  @NotNull
  private Integer couponId;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"coupon_product_id\"" , length=10)
  @NotNull
  private Integer couponProductId;

  public OcCouponProduct() {
  }

  public void setCouponId( Integer value) {
    this.couponId = value;
  }
  public Integer getCouponId() {
    return this.couponId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setCouponProductId( Integer value) {
    this.couponProductId = value;
  }
  public Integer getCouponProductId() {
    return this.couponProductId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.couponId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.couponProductId)); ;
    return builder.toString();
  }
}