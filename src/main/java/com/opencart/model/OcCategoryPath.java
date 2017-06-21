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
@Table(name="oc_category_path")
@IdClass(value=OcCategoryPathId.class)
public class OcCategoryPath  {
  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="\"level\"" , length=10)
  @NotNull
  private Integer level;

  @Id
  @Column(name="\"path_id\"" , length=10)
  @NotNull
  private Integer pathId;

  public OcCategoryPath() {
  }

  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setLevel( Integer value) {
    this.level = value;
  }
  public Integer getLevel() {
    return this.level;
  }
  public void setPathId( Integer value) {
    this.pathId = value;
  }
  public Integer getPathId() {
    return this.pathId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.level)); 
     builder.append(String.valueOf(this.pathId)); ;
    return builder.toString();
  }
}