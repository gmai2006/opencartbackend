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
@Table(name="oc_option_value")
public class OcOptionValue  {
  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"option_value_id\"" , length=10)
  @NotNull
  private Integer optionValueId;

  @Basic
  @Column(name="\"option_id\"" , length=10)
  @NotNull
  private Integer optionId;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcOptionValue() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setOptionValueId( Integer value) {
    this.optionValueId = value;
  }
  public Integer getOptionValueId() {
    return this.optionValueId;
  }
  public void setOptionId( Integer value) {
    this.optionId = value;
  }
  public Integer getOptionId() {
    return this.optionId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.optionValueId)); 
     builder.append(String.valueOf(this.optionId)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}