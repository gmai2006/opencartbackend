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
@Table(name="oc_order_custom_field")
public class OcOrderCustomField  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"order_custom_field_id\"" , length=10)
  @NotNull
  private Integer orderCustomFieldId;

  @Basic
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"location\"" , length=16)
  @NotNull
  private String location;

  @Basic
  @Column(name="\"custom_field_value_id\"" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"order_id\"" , length=10)
  @NotNull
  private Integer orderId;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  public OcOrderCustomField() {
  }

  public void setOrderCustomFieldId( Integer value) {
    this.orderCustomFieldId = value;
  }
  public Integer getOrderCustomFieldId() {
    return this.orderCustomFieldId;
  }
  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setOrderId( Integer value) {
    this.orderId = value;
  }
  public Integer getOrderId() {
    return this.orderId;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.orderCustomFieldId)); 
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.orderId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}