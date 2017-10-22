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
@Table(name="oc_api_ip")
public class OcApiIp  {
  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer apiId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"api_ip_id\"" , length=10)
  @NotNull
  private Integer apiIpId;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  public OcApiIp() {
  }

  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setApiIpId( Integer value) {
    this.apiIpId = value;
  }
  public Integer getApiIpId() {
    return this.apiIpId;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.apiIpId)); 
     builder.append(String.valueOf(this.ip)); ;
    return builder.toString();
  }
}