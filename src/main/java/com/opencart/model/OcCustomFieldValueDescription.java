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
@Table(name="oc_custom_field_value_description")
@IdClass(value=OcCustomFieldValueDescriptionId.class)
public class OcCustomFieldValueDescription  {
  @Basic
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="\"name\"" , length=128)
  @NotNull
  private String name;

  @Id
  @Column(name="\"custom_field_value_id\"" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcCustomFieldValueDescription() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}