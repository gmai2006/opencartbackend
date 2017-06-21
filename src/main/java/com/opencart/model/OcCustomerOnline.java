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
@Table(name="oc_customer_online")
public class OcCustomerOnline  {
  @Basic
  @Column(name="\"referer\"" , length=65535)
  @NotNull
  private String referer;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"url\"" , length=65535)
  @NotNull
  private String url;

  public OcCustomerOnline() {
  }

  public void setReferer( String value) {
    this.referer = value;
  }
  public String getReferer() {
    return this.referer;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
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
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.referer)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.url)); ;
    return builder.toString();
  }
}