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
@Table(name="oc_customer_ip")
public class OcCustomerIp  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"customer_ip_id\"" , length=10)
  @NotNull
  private Integer customerIpId;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  public OcCustomerIp() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCustomerIpId( Integer value) {
    this.customerIpId = value;
  }
  public Integer getCustomerIpId() {
    return this.customerIpId;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
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
     builder.append(String.valueOf(this.customerIpId)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.customerId)); ;
    return builder.toString();
  }
}