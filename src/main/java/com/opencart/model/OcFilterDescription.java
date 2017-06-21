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
@Table(name="oc_filter_description")
@IdClass(value=OcFilterDescriptionId.class)
public class OcFilterDescription  {
  @Id
  @Column(name="\"filter_id\"" , length=10)
  @NotNull
  private Integer filterId;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"filter_group_id\"" , length=10)
  @NotNull
  private Integer filterGroupId;

  public OcFilterDescription() {
  }

  public void setFilterId( Integer value) {
    this.filterId = value;
  }
  public Integer getFilterId() {
    return this.filterId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setFilterGroupId( Integer value) {
    this.filterGroupId = value;
  }
  public Integer getFilterGroupId() {
    return this.filterGroupId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.filterId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.filterGroupId)); ;
    return builder.toString();
  }
}