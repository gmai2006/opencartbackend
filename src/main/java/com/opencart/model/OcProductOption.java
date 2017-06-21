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
@Table(name="oc_product_option")
public class OcProductOption  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_option_id\"" , length=10)
  @NotNull
  private Integer productOptionId;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer optionId;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"required\"" )
  @NotNull
  private Boolean required;

  public OcProductOption() {
  }

  public void setProductOptionId( Integer value) {
    this.productOptionId = value;
  }
  public Integer getProductOptionId() {
    return this.productOptionId;
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
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setRequired( Boolean value) {
    this.required = value;
  }
  public Boolean getRequired() {
    return this.required;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.productOptionId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.required)); ;
    return builder.toString();
  }
}