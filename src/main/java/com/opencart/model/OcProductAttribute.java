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
@Table(name="oc_product_attribute")
@IdClass(value=OcProductAttributeId.class)
public class OcProductAttribute  {
  @Id
  @Column(name="\"attribute_id\"" , length=10)
  @NotNull
  private Integer attributeId;

  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"text\"" , length=65535)
  @NotNull
  private String text;

  public OcProductAttribute() {
  }

  public void setAttributeId( Integer value) {
    this.attributeId = value;
  }
  public Integer getAttributeId() {
    return this.attributeId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.text)); ;
    return builder.toString();
  }
}