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
@Table(name="oc_layout_module")
public class OcLayoutModule  {
  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"layout_module_id\"" , length=10)
  @NotNull
  private Integer layoutModuleId;

  @Basic
  @Column(name="\"position\"" , length=14)
  @NotNull
  private String position;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcLayoutModule() {
  }

  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setLayoutModuleId( Integer value) {
    this.layoutModuleId = value;
  }
  public Integer getLayoutModuleId() {
    return this.layoutModuleId;
  }
  public void setPosition( String value) {
    this.position = value;
  }
  public String getPosition() {
    return this.position;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.layoutModuleId)); 
     builder.append(String.valueOf(this.position)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}