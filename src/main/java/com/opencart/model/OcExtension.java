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
@Table(name="oc_extension")
public class OcExtension  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"extension_id\"" , length=10)
  @NotNull
  private Integer extensionId;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"type\"" , length=32)
  @NotNull
  private String type;

  public OcExtension() {
  }

  public void setExtensionId( Integer value) {
    this.extensionId = value;
  }
  public Integer getExtensionId() {
    return this.extensionId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.extensionId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.type)); ;
    return builder.toString();
  }
}