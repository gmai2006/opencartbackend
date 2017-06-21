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
@Table(name="oc_order_history")
public class OcOrderHistory  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"order_status_id\"" , length=10)
  @NotNull
  private Integer orderStatusId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_history_id\"" , length=10)
  @NotNull
  private Integer orderHistoryId;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"notify\"" )
  @NotNull
  private Boolean notify;

  public OcOrderHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setOrderStatusId( Integer value) {
    this.orderStatusId = value;
  }
  public Integer getOrderStatusId() {
    return this.orderStatusId;
  }
  public void setOrderHistoryId( Integer value) {
    this.orderHistoryId = value;
  }
  public Integer getOrderHistoryId() {
    return this.orderHistoryId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setNotify( Boolean value) {
    this.notify = value;
  }
  public Boolean getNotify() {
    return this.notify;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.orderStatusId)); 
     builder.append(String.valueOf(this.orderHistoryId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.notify)); ;
    return builder.toString();
  }
}