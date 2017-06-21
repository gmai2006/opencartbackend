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
@Table(name="oc_zone_to_geo_zone")
public class OcZoneToGeoZone  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"zone_to_geo_zone_id\"" , length=10)
  @NotNull
  private Integer zoneToGeoZoneId;

  @Basic
  @Column(name="\"zone_id\"" , length=10)
  @NotNull
  private Integer zoneId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"geo_zone_id\"" , length=10)
  @NotNull
  private Integer geoZoneId;

  @Basic
  @Column(name="\"country_id\"" , length=10)
  @NotNull
  private Integer countryId;

  public OcZoneToGeoZone() {
  }

  public void setZoneToGeoZoneId( Integer value) {
    this.zoneToGeoZoneId = value;
  }
  public Integer getZoneToGeoZoneId() {
    return this.zoneToGeoZoneId;
  }
  public void setZoneId( Integer value) {
    this.zoneId = value;
  }
  public Integer getZoneId() {
    return this.zoneId;
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
  public void setCountryId( Integer value) {
    this.countryId = value;
  }
  public Integer getCountryId() {
    return this.countryId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.zoneToGeoZoneId)); 
     builder.append(String.valueOf(this.zoneId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.geoZoneId)); 
     builder.append(String.valueOf(this.countryId)); ;
    return builder.toString();
  }
}