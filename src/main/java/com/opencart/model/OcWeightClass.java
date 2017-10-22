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
@Table(name="oc_weight_class")
public class OcWeightClass  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"weight_class_id\"" , length=10)
  @NotNull
  private Integer weightClassId;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private Float value = 0.00000000F;

  public OcWeightClass() {
  }

  public void setWeightClassId( Integer value) {
    this.weightClassId = value;
  }
  public Integer getWeightClassId() {
    return this.weightClassId;
  }
  public void setValue( Float value) {
    this.value = value;
  }
  public Float getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.weightClassId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}