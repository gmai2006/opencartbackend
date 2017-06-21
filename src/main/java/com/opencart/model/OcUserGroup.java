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
@Table(name="oc_user_group")
public class OcUserGroup  {
  @Basic
  @Column(name="\"name\"" , length=64)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"permission\"" , length=65535)
  @NotNull
  private String permission;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"user_group_id\"" , length=10)
  @NotNull
  private Integer userGroupId;

  public OcUserGroup() {
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setPermission( String value) {
    this.permission = value;
  }
  public String getPermission() {
    return this.permission;
  }
  public void setUserGroupId( Integer value) {
    this.userGroupId = value;
  }
  public Integer getUserGroupId() {
    return this.userGroupId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.permission)); 
     builder.append(String.valueOf(this.userGroupId)); ;
    return builder.toString();
  }
}