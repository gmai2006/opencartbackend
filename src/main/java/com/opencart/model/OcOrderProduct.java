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
@Table(name="oc_order_product")
public class OcOrderProduct  {
  @Basic
  @Column(name="\"reward\"" , length=10)
  @NotNull
  private Integer reward;

  @Basic
  @Column(name="\"total\"" , length=15)
  @NotNull
  private Float total = 0.0000F;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_product_id\"" , length=10)
  @NotNull
  private Integer orderProductId;

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

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"model\"" , length=64)
  @NotNull
  private String model;

  @Basic
  @Column(name="\"tax\"" , length=15)
  @NotNull
  private Float tax = 0.0000F;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  public OcOrderProduct() {
  }

  public void setReward( Integer value) {
    this.reward = value;
  }
  public Integer getReward() {
    return this.reward;
  }
  public void setTotal( Float value) {
    this.total = value;
  }
  public Float getTotal() {
    return this.total;
  }
  public void setOrderProductId( Integer value) {
    this.orderProductId = value;
  }
  public Integer getOrderProductId() {
    return this.orderProductId;
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
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setTax( Float value) {
    this.tax = value;
  }
  public Float getTax() {
    return this.tax;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reward)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.orderProductId)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.model)); 
     builder.append(String.valueOf(this.tax)); 
     builder.append(String.valueOf(this.orderId)); ;
    return builder.toString();
  }
}