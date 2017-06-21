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
@Table(name="oc_length_class")
public class OcLengthClass  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"length_class_id\"" , length=10)
  @NotNull
  private Integer lengthClassId;

  @Basic
  @Column(name="\"value\"" , length=15)
  @NotNull
  private Float value;

  public OcLengthClass() {
  }

  public void setLengthClassId( Integer value) {
    this.lengthClassId = value;
  }
  public Integer getLengthClassId() {
    return this.lengthClassId;
  }
  public void setValue( Float value) {
    this.value = value;
  }
  public Float getValue() {
    return this.value;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.lengthClassId)); 
     builder.append(String.valueOf(this.value)); ;
    return builder.toString();
  }
}