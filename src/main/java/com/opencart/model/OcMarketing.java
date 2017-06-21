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
@Table(name="oc_marketing")
public class OcMarketing  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Basic
  @Column(name="\"clicks\"" , length=10)
  @NotNull
  private Integer clicks;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"marketing_id\"" , length=10)
  @NotNull
  private Integer marketingId;

  public OcMarketing() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setClicks( Integer value) {
    this.clicks = value;
  }
  public Integer getClicks() {
    return this.clicks;
  }
  public void setMarketingId( Integer value) {
    this.marketingId = value;
  }
  public Integer getMarketingId() {
    return this.marketingId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.clicks)); 
     builder.append(String.valueOf(this.marketingId)); ;
    return builder.toString();
  }
}