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
@Table(name="oc_download_description")
@IdClass(value=OcDownloadDescriptionId.class)
public class OcDownloadDescription  {
  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Id
  @Column(name="\"download_id\"" , length=10)
  @NotNull
  private Integer downloadId;

  public OcDownloadDescription() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setDownloadId( Integer value) {
    this.downloadId = value;
  }
  public Integer getDownloadId() {
    return this.downloadId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.downloadId)); ;
    return builder.toString();
  }
}