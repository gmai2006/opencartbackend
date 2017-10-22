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
@Table(name="oc_order_total")
public class OcOrderTotal  {
  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_total_id\"" , length=10)
  @NotNull
  private Integer orderTotalId;

  @Basic
  @Column(name="\"title\"" , length=255)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private Float value = 0.0000F;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcOrderTotal() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setOrderTotalId( Integer value) {
    this.orderTotalId = value;
  }
  public Integer getOrderTotalId() {
    return this.orderTotalId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( Float value) {
    this.value = value;
  }
  public Float getValue() {
    return this.value;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.orderTotalId)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}