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
@Table(name="oc_language")
public class OcLanguage  {
  @Basic
  @Column(name="\"image\"" , length=64)
  @NotNull
  private String image;

  @Basic
  @Column(name="\"code\"" , length=5)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"locale\"" , length=255)
  @NotNull
  private String locale;

  @Basic
  @Column(name="\"directory\"" , length=32)
  @NotNull
  private String directory;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcLanguage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
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
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setLocale( String value) {
    this.locale = value;
  }
  public String getLocale() {
    return this.locale;
  }
  public void setDirectory( String value) {
    this.directory = value;
  }
  public String getDirectory() {
    return this.directory;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.locale)); 
     builder.append(String.valueOf(this.directory)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}