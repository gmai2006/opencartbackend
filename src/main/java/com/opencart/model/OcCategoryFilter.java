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
@Table(name="oc_category_filter")
@IdClass(value=OcCategoryFilterId.class)
public class OcCategoryFilter  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer categoryId;

  @Id
  @Column(name="\"filter_id\"" , length=10)
  @NotNull
  private Integer filterId;

  public OcCategoryFilter() {
  }

  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setFilterId( Integer value) {
    this.filterId = value;
  }
  public Integer getFilterId() {
    return this.filterId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.filterId)); ;
    return builder.toString();
  }
}