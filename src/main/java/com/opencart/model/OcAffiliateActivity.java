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
@Table(name="oc_affiliate_activity")
public class OcAffiliateActivity  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"affiliate_activity_id\"" , length=10)
  @NotNull
  private Integer affiliateActivityId;

  @Basic
  @Column(name="\"data\"" , length=65535)
  @NotNull
  private String data;

  @Basic
  @Column(name="\"affiliate_id\"" , length=10)
  @NotNull
  private Integer affiliateId;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"key\"" , length=64)
  @NotNull
  private String key;

  public OcAffiliateActivity() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateActivityId( Integer value) {
    this.affiliateActivityId = value;
  }
  public Integer getAffiliateActivityId() {
    return this.affiliateActivityId;
  }
  public void setData( String value) {
    this.data = value;
  }
  public String getData() {
    return this.data;
  }
  public void setAffiliateId( Integer value) {
    this.affiliateId = value;
  }
  public Integer getAffiliateId() {
    return this.affiliateId;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.affiliateActivityId)); 
     builder.append(String.valueOf(this.data)); 
     builder.append(String.valueOf(this.affiliateId)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.key)); ;
    return builder.toString();
  }
}