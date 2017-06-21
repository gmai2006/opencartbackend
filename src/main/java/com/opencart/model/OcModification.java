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
@Table(name="oc_modification")
public class OcModification  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"modification_id\"" , length=10)
  @NotNull
  private Integer modificationId;

  @Basic
  @Column(name="\"author\"" , length=64)
  @NotNull
  private String author;

  @Basic
  @Column(name="\"xml\"" , length=16777215)
  @NotNull
  private String xml;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"link\"" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="\"version\"" , length=32)
  @NotNull
  private String version;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcModification() {
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
  public void setModificationId( Integer value) {
    this.modificationId = value;
  }
  public Integer getModificationId() {
    return this.modificationId;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setXml( String value) {
    this.xml = value;
  }
  public String getXml() {
    return this.xml;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.modificationId)); 
     builder.append(String.valueOf(this.author)); 
     builder.append(String.valueOf(this.xml)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.version)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}