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
@Table(name="oc_download")
public class OcDownload  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"filename\"" , length=160)
  @NotNull
  private String filename;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"download_id\"" , length=10)
  @NotNull
  private Integer downloadId;

  @Basic
  @Column(name="\"mask\"" , length=128)
  @NotNull
  private String mask;

  public OcDownload() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setFilename( String value) {
    this.filename = value;
  }
  public String getFilename() {
    return this.filename;
  }
  public void setDownloadId( Integer value) {
    this.downloadId = value;
  }
  public Integer getDownloadId() {
    return this.downloadId;
  }
  public void setMask( String value) {
    this.mask = value;
  }
  public String getMask() {
    return this.mask;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.filename)); 
     builder.append(String.valueOf(this.downloadId)); 
     builder.append(String.valueOf(this.mask)); ;
    return builder.toString();
  }
}