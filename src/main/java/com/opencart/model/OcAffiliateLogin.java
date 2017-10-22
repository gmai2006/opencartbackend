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
@Table(name="oc_affiliate_login")
public class OcAffiliateLogin  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"affiliate_login_id\"" , length=10)
  @NotNull
  private Integer affiliateLoginId;

  @Basic
  @Column(name="\"total\"" , length=10)
  @NotNull
  private Integer total;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  public OcAffiliateLogin() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setAffiliateLoginId( Integer value) {
    this.affiliateLoginId = value;
  }
  public Integer getAffiliateLoginId() {
    return this.affiliateLoginId;
  }
  public void setTotal( Integer value) {
    this.total = value;
  }
  public Integer getTotal() {
    return this.total;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.affiliateLoginId)); 
     builder.append(String.valueOf(this.total)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.email)); ;
    return builder.toString();
  }
}