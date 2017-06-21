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
@Table(name="oc_product_to_layout")
@IdClass(value=OcProductToLayoutId.class)
public class OcProductToLayout  {
  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layoutId;

  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  public OcProductToLayout() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.productId)); ;
    return builder.toString();
  }
}