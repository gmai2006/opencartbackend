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
@Table(name="oc_custom_field")
public class OcCustomField  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"custom_field_id\"" , length=10)
  @NotNull
  private Integer customFieldId;

  @Basic
  @Column(name="\"location\"" , length=7)
  @NotNull
  private String location;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  @Basic
  @Column(name="\"value\"" , length=65535)
  @NotNull
  private String value;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"validation\"" , length=255)
  @NotNull
  private String validation;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcCustomField() {
  }

  public void setCustomFieldId( Integer value) {
    this.customFieldId = value;
  }
  public Integer getCustomFieldId() {
    return this.customFieldId;
  }
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setValue( String value) {
    this.value = value;
  }
  public String getValue() {
    return this.value;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setValidation( String value) {
    this.validation = value;
  }
  public String getValidation() {
    return this.validation;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.customFieldId)); 
     builder.append(String.valueOf(this.location)); 
     builder.append(String.valueOf(this.type)); 
     builder.append(String.valueOf(this.value)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.validation)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}