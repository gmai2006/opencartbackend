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
@Table(name="oc_customer_wishlist")
@IdClass(value=OcCustomerWishlistId.class)
public class OcCustomerWishlist  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  public OcCustomerWishlist() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.customerId)); ;
    return builder.toString();
  }
}