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
@Table(name="oc_product_special")
public class OcProductSpecial  {
  @Basic
  @Column(name="\"date_start\"" , length=10)
  @NotNull
  @Temporal(TemporalType.DATE)
  private java.util.Date dateStart = new java.util.Date();

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private Float price = 0.0000F;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_special_id\"" , length=10)
  @NotNull
  private Integer productSpecialId;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

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

  public OcProductSpecial() {
  }

  public void setDateStart( java.util.Date value) {
    this.dateStart = value;
  }
  public java.util.Date getDateStart() {
    return this.dateStart;
  }
  public void setPrice( Float value) {
    this.price = value;
  }
  public Float getPrice() {
    return this.price;
  }
  public void setProductSpecialId( Integer value) {
    this.productSpecialId = value;
  }
  public Integer getProductSpecialId() {
    return this.productSpecialId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
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
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productSpecialId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.dateEnd)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}