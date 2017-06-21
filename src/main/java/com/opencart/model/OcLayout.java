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
@Table(name="oc_layout")
public class OcLayout  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  public OcLayout() {
  }

  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.name)); ;
    return builder.toString();
  }
}