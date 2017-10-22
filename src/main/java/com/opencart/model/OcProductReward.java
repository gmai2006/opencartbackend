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
@Table(name="oc_product_reward")
public class OcProductReward  {
  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"product_reward_id\"" , length=10)
  @NotNull
  private Integer productRewardId;

  @Basic
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customerGroupId;

  @Basic
  @Column(name="\"points\"" , length=10)
  @NotNull
  private Integer points;

  public OcProductReward() {
  }

  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setProductRewardId( Integer value) {
    this.productRewardId = value;
  }
  public Integer getProductRewardId() {
    return this.productRewardId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }
  public void setPoints( Integer value) {
    this.points = value;
  }
  public Integer getPoints() {
    return this.points;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.productRewardId)); 
     builder.append(String.valueOf(this.customerGroupId)); 
     builder.append(String.valueOf(this.points)); ;
    return builder.toString();
  }
}