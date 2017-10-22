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
@Table(name="oc_cart")
public class OcCart  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"cart_id\"" , length=10)
  @NotNull
  private Integer cartId;

  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer apiId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"quantity\"" , length=10)
  @NotNull
  private Integer quantity;

  @Basic
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"session_id\"" , length=32)
  @NotNull
  private String sessionId;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"option\"" , length=65535)
  @NotNull
  private String option;

  public OcCart() {
  }

  public void setCartId( Integer value) {
    this.cartId = value;
  }
  public Integer getCartId() {
    return this.cartId;
  }
  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setQuantity( Integer value) {
    this.quantity = value;
  }
  public Integer getQuantity() {
    return this.quantity;
  }
  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setSessionId( String value) {
    this.sessionId = value;
  }
  public String getSessionId() {
    return this.sessionId;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setOption( String value) {
    this.option = value;
  }
  public String getOption() {
    return this.option;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.cartId)); 
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.quantity)); 
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.sessionId)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.option)); ;
    return builder.toString();
  }
}