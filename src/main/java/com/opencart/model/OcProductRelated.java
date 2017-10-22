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
@Table(name="oc_product_related")
@IdClass(value=OcProductRelatedId.class)
public class OcProductRelated  {
  @Id
  @Column(name="\"related_id\"" , length=10)
  @NotNull
  private Integer relatedId;

  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  public OcProductRelated() {
  }

  public void setRelatedId( Integer value) {
    this.relatedId = value;
  }
  public Integer getRelatedId() {
    return this.relatedId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.relatedId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}