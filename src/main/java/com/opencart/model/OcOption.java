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
@Table(name="oc_option")
public class OcOption  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer optionId;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcOption() {
  }

  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}