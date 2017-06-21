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
@Table(name="oc_information_to_store")
@IdClass(value=OcInformationToStoreId.class)
public class OcInformationToStore  {
  @Id
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer informationId;

  @Id
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  public OcInformationToStore() {
  }

  public void setInformationId( Integer value) {
    this.informationId = value;
  }
  public Integer getInformationId() {
    return this.informationId;
  }
  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.informationId)); 
     builder.append(String.valueOf(this.storeId)); ;
    return builder.toString();
  }
}