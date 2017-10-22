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
@Table(name="oc_manufacturer")
public class OcManufacturer  {
  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"manufacturer_id\"" , length=10)
  @NotNull
  private Integer manufacturerId;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcManufacturer() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturerId = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturerId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.manufacturerId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}