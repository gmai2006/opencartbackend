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
@Table(name="oc_product_option_value")
public class OcProductOptionValue  {
  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"option_value_id\"" , length=10)
  @NotNull
  private Integer optionValueId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_option_value_id\"" , length=10)
  @NotNull
  private Integer productOptionValueId;

  @Basic
  @Column(name="\"subtract\"" )
  @NotNull
  private Boolean subtract;

  @Basic
  @Column(name="\"price_prefix\"" , length=1)
  @NotNull
  private String pricePrefix;

  @Basic
  @Column(name="\"weight\"" , length=15)
  @NotNull
  private Float weight;

  @Basic
  @Column(name="\"weight_prefix\"" , length=1)
  @NotNull
  private String weightPrefix;

  @Basic
  @Column(name="\"points_prefix\"" , length=1)
  @NotNull
  private String pointsPrefix;

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  @Basic
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer productOptionId;

  @Basic
  @Column(name="\"price\"" , length=15)
  @NotNull
  private Float price;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer optionId;

  public OcProductOptionValue() {
  }

  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setOptionValueId( Integer value) {
    this.optionValueId = value;
  }
  public Integer getOptionValueId() {
    return this.optionValueId;
  }
  public void setProductOptionValueId( Integer value) {
    this.productOptionValueId = value;
  }
  public Integer getProductOptionValueId() {
    return this.productOptionValueId;
  }
  public void setSubtract( Boolean value) {
    this.subtract = value;
  }
  public Boolean getSubtract() {
    return this.subtract;
  }
  public void setPricePrefix( String value) {
    this.pricePrefix = value;
  }
  public String getPricePrefix() {
    return this.pricePrefix;
  }
  public void setWeight( Float value) {
    this.weight = value;
  }
  public Float getWeight() {
    return this.weight;
  }
  public void setWeightPrefix( String value) {
    this.weightPrefix = value;
  }
  public String getWeightPrefix() {
    return this.weightPrefix;
  }
  public void setPointsPrefix( String value) {
    this.pointsPrefix = value;
  }
  public String getPointsPrefix() {
    return this.pointsPrefix;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }
  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
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
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.optionValueId)); 
     builder.append(String.valueOf(this.productOptionValueId)); 
     builder.append(String.valueOf(this.subtract)); 
     builder.append(String.valueOf(this.pricePrefix)); 
     builder.append(String.valueOf(this.weight)); 
     builder.append(String.valueOf(this.weightPrefix)); 
     builder.append(String.valueOf(this.pointsPrefix)); 
     builder.append(String.valueOf(this.points)); 
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.optionId)); ;
    return builder.toString();
  }
}