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
@Table(name="oc_menu_module")
public class OcMenuModule  {
  @Basic
  @Column(name="\"code\"" , length=64)
  @NotNull
  private String code;

  @Id
  @Column(name="\"menu_module_id\"" , length=10)
  @NotNull
  private Integer menuModuleId;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"menu_id\"" , length=10)
  @NotNull
  private Integer menuId;

  public OcMenuModule() {
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setMenuModuleId( Integer value) {
    this.menuModuleId = value;
  }
  public Integer getMenuModuleId() {
    return this.menuModuleId;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setMenuId( Integer value) {
    this.menuId = value;
  }
  public Integer getMenuId() {
    return this.menuId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.menuModuleId)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.menuId)); ;
    return builder.toString();
  }
}