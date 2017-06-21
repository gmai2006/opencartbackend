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
@Table(name="oc_attribute_group")
public class OcAttributeGroup  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"attribute_group_id\"" , length=10)
  @NotNull
  private Integer attributeGroupId;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcAttributeGroup() {
  }

  public void setAttributeGroupId( Integer value) {
    this.attributeGroupId = value;
  }
  public Integer getAttributeGroupId() {
    return this.attributeGroupId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.attributeGroupId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}