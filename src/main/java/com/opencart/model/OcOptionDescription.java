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
@Table(name="oc_option_description")
@IdClass(value=OcOptionDescriptionId.class)
public class OcOptionDescription  {
  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Id
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer optionId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcOptionDescription() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
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
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}