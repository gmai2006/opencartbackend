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
@Table(name="oc_upload")
public class OcUpload  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"upload_id\"" , length=10)
  @NotNull
  private Integer uploadId;

  @Basic
  @Column(name="\"filename\"" , length=255)
  @NotNull
  private String filename;

  @Basic
  @Column(name="\"code\"" , length=255)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  public OcUpload() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setUploadId( Integer value) {
    this.uploadId = value;
  }
  public Integer getUploadId() {
    return this.uploadId;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.uploadId)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}