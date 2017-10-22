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
@Table(name="oc_layout_route")
public class OcLayoutRoute  {
  @Basic
  @Column(name="\"store_id\"" , length=10)
  @NotNull
  private Integer storeId;

  @Basic
  @Column(name="\"layout_id\"" , length=10)
  @NotNull
  private Integer layoutId;

  @Basic
  @Column(name="\"route\"" , length=64)
  @NotNull
  private String route;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"layout_route_id\"" , length=10)
  @NotNull
  private Integer layoutRouteId;

  public OcLayoutRoute() {
  }

  public void setStoreId( Integer value) {
    this.storeId = value;
  }
  public Integer getStoreId() {
    return this.storeId;
  }
  public void setLayoutId( Integer value) {
    this.layoutId = value;
  }
  public Integer getLayoutId() {
    return this.layoutId;
  }
  public void setRoute( String value) {
    this.route = value;
  }
  public String getRoute() {
    return this.route;
  }
  public void setLayoutRouteId( Integer value) {
    this.layoutRouteId = value;
  }
  public Integer getLayoutRouteId() {
    return this.layoutRouteId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.storeId)); 
     builder.append(String.valueOf(this.layoutId)); 
     builder.append(String.valueOf(this.route)); 
     builder.append(String.valueOf(this.layoutRouteId)); ;
    return builder.toString();
  }
}