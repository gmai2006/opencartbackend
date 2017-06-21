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
@Table(name="oc_geo_zone")
public class OcGeoZone  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"geo_zone_id\"" , length=10)
  @NotNull
  private Integer geoZoneId;

  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=255)
  @NotNull
  private String description;

  public OcGeoZone() {
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
  public void setGeoZoneId( Integer value) {
    this.geoZoneId = value;
  }
  public Integer getGeoZoneId() {
    return this.geoZoneId;
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

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.geoZoneId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); ;
    return builder.toString();
  }
}