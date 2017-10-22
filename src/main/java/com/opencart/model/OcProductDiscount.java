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
@Table(name="oc_product_discount")
public class OcProductDiscount  {
  @Basic
  @Column(name="\"date_start\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateStart = new java.util.Date();

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private Float price = 0.0000F;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_discount_id\"" , length=10)
  @NotNull
  private Integer productDiscountId;

  @Basic
  @Column(name="\"date_end\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateEnd = new java.util.Date();

  @Basic
  @Column(name="\"priority\"" , length=10)
  @NotNull
  private Integer priority = 1;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcProductDiscount() {
  }

  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setPrice( Float value) {
    this.price = value;
  }
  public Float getPrice() {
    return this.price;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setProductDiscountId( Integer value) {
    this.productDiscountId = value;
  }
  public Integer getProductDiscountId() {
    return this.productDiscountId;
  }
  public void setDateEnd( java.util.Date value) {
    this.dateEnd = value;
  }
  public java.util.Date getDateEnd() {
    return this.dateEnd;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateStart)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.productDiscountId)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}