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
@Table(name="oc_order_option")
public class OcOrderOption  {
  @Basic
  @Column(name="\"order_product_id\"" , length=10)
  @NotNull
  private Integer orderProductId;

  @Basic
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer productOptionId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_option_id\"" , length=10)
  @NotNull
  private Integer orderOptionId;

  @Basic
  @Column(name="\"product_option_value_id\"" , length=10)
  @NotNull
  private Integer productOptionValueId;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  public OcOrderOption() {
  }

  public void setOrderProductId( Integer value) {
    this.orderProductId = value;
  }
  public Integer getOrderProductId() {
    return this.orderProductId;
  }
  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
  }
  public void setOrderOptionId( Integer value) {
    this.orderOptionId = value;
  }
  public Integer getOrderOptionId() {
    return this.orderOptionId;
  }
  public void setProductOptionValueId( Integer value) {
    this.productOptionValueId = value;
  }
  public Integer getProductOptionValueId() {
    return this.productOptionValueId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderProductId)); 
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.orderOptionId)); 
     builder.append(String.valueOf(this.productOptionValueId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}