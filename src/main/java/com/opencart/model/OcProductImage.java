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
@Table(name="oc_product_image")
public class OcProductImage  {
  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_image_id\"" , length=10)
  @NotNull
  private Integer productImageId;

  public OcProductImage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setProductImageId( Integer value) {
    this.productImageId = value;
  }
  public Integer getProductImageId() {
    return this.productImageId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.productImageId)); ;
    return builder.toString();
  }
}