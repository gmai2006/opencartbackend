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
@Table(name="oc_filter_group")
public class OcFilterGroup  {
  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"filter_group_id\"" , length=10)
  @NotNull
  private Integer filterGroupId;

  public OcFilterGroup() {
  }

  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setFilterGroupId( Integer value) {
    this.filterGroupId = value;
  }
  public Integer getFilterGroupId() {
    return this.filterGroupId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.filterGroupId)); ;
    return builder.toString();
  }
}