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
@Table(name="oc_customer_reward")
public class OcCustomerReward  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"customer_reward_id\"" , length=10)
  @NotNull
  private Integer customerRewardId;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  public OcCustomerReward() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCustomerRewardId( Integer value) {
    this.customerRewardId = value;
  }
  public Integer getCustomerRewardId() {
    return this.customerRewardId;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.customerRewardId)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.points)); ;
    return builder.toString();
  }
}