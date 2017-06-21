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
@Table(name="oc_custom_field_value")
public class OcCustomFieldValue  {
  @Basic
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer customFieldId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"custom_field_value_id\"" , length=10)
  @NotNull
  private Integer customFieldValueId;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcCustomFieldValue() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setCustomFieldValueId( Integer value) {
    this.customFieldValueId = value;
  }
  public Integer getCustomFieldValueId() {
    return this.customFieldValueId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.customFieldValueId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}