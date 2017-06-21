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
@Table(name="oc_theme")
public class OcTheme  {
  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="\"route\"" , length=64)
  @NotNull
  private String route;

  @Basic
  @Column(name="\"code\"" , length=65535)
  @NotNull
  private String code;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"theme_id\"" , length=10)
  @NotNull
  private Integer themeId;

  @Basic
  @Column(name="\"theme\"" , length=64)
  @NotNull
  private String theme;

  public OcTheme() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setThemeId( Integer value) {
    this.themeId = value;
  }
  public Integer getThemeId() {
    return this.themeId;
  }
  public void setTheme( String value) {
    this.theme = value;
  }
  public String getTheme() {
    return this.theme;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.themeId)); 
     builder.append(String.valueOf(this.theme)); ;
    return builder.toString();
  }
}