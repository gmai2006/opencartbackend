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
@Table(name="oc_weight_class_description")
@IdClass(value=OcWeightClassDescriptionId.class)
public class OcWeightClassDescription  {
  @Basic
  @Column(name="\"unit\"" , length=4)
  @NotNull
  private String unit;

  @Id
  @Column(name="\"weight_class_id\"" , length=10)
  @NotNull
  private Integer weightClassId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"title\"" , length=32)
  @NotNull
  private String title;

  public OcWeightClassDescription() {
  }

  public void setUnit( String value) {
    this.unit = value;
  }
  public String getUnit() {
    return this.unit;
  }
  public void setWeightClassId( Integer value) {
    this.weightClassId = value;
  }
  public Integer getWeightClassId() {
    return this.weightClassId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.unit)); 
     builder.append(String.valueOf(this.weightClassId)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); ;
    return builder.toString();
  }
}