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
@Table(name="oc_information")
public class OcInformation  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"information_id\"" , length=10)
  @NotNull
  private Integer informationId;

  @Basic
  @Column(name="\"bottom\"" , length=10)
  @NotNull
  private Integer bottom;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status = true;

  public OcInformation() {
  }

  public void setInformationId( Integer value) {
    this.informationId = value;
  }
  public Integer getInformationId() {
    return this.informationId;
  }
  public void setBottom( Integer value) {
    this.bottom = value;
  }
  public Integer getBottom() {
    return this.bottom;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.informationId)); 
     builder.append(String.valueOf(this.bottom)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}