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
@Table(name="oc_return_status")
@IdClass(value=OcReturnStatusId.class)
public class OcReturnStatus  {
  @Basic
  @Column(name="\"name\"" , length=32)
  @NotNull
  private String name;

  @Id
  @Column(name="\"return_status_id\"" , length=10)
  @NotNull
  private Integer returnStatusId;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcReturnStatus() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setReturnStatusId( Integer value) {
    this.returnStatusId = value;
  }
  public Integer getReturnStatusId() {
    return this.returnStatusId;
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
     builder.append(String.valueOf(this.returnStatusId)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}