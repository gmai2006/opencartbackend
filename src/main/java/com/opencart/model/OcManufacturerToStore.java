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
@Table(name="oc_manufacturer_to_store")
@IdClass(value=OcManufacturerToStoreId.class)
public class OcManufacturerToStore  {
  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Id
  @Column(name="\"manufacturer_id\"" , length=10)
  @NotNull
  private Integer manufacturerId;

  public OcManufacturerToStore() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setManufacturerId( Integer value) {
    this.manufacturerId = value;
  }
  public Integer getManufacturerId() {
    return this.manufacturerId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.manufacturerId)); ;
    return builder.toString();
  }
}