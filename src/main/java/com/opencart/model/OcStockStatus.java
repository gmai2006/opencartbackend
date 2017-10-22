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
@Table(name="oc_stock_status")
@IdClass(value=OcStockStatusId.class)
public class OcStockStatus  {
  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="\"stock_status_id\"" , length=10)
  @NotNull
  private Integer stockStatusId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcStockStatus() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setStockStatusId( Integer value) {
    this.stockStatusId = value;
  }
  public Integer getStockStatusId() {
    return this.stockStatusId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.stockStatusId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}