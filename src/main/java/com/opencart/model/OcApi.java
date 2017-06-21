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
@Table(name="oc_api")
public class OcApi  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer apiId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"key\"" , length=65535)
  @NotNull
  private String key;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcApi() {
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
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setKey( String value) {
    this.key = value;
  }
  public String getKey() {
    return this.key;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.key)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}