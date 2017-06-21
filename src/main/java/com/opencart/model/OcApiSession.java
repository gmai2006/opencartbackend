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
@Table(name="oc_api_session")
public class OcApiSession  {
  @Basic
  @Column(name="\"api_id\"" , length=10)
  @NotNull
  private Integer apiId;

  @Basic
  @Column(name="\"session_name\"" , length=32)
  @NotNull
  private String sessionName;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"session_id\"" , length=32)
  @NotNull
  private String sessionId;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"api_session_id\"" , length=10)
  @NotNull
  private Integer apiSessionId;

  @Basic
  @Column(name="\"token\"" , length=32)
  @NotNull
  private String token;

  public OcApiSession() {
  }

  public void setApiId( Integer value) {
    this.apiId = value;
  }
  public Integer getApiId() {
    return this.apiId;
  }
  public void setSessionName( String value) {
    this.sessionName = value;
  }
  public String getSessionName() {
    return this.sessionName;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setSessionId( String value) {
    this.sessionId = value;
  }
  public String getSessionId() {
    return this.sessionId;
  }
  public void setApiSessionId( Integer value) {
    this.apiSessionId = value;
  }
  public Integer getApiSessionId() {
    return this.apiSessionId;
  }
  public void setToken( String value) {
    this.token = value;
  }
  public String getToken() {
    return this.token;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.apiId)); 
     builder.append(String.valueOf(this.sessionName)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.sessionId)); 
     builder.append(String.valueOf(this.apiSessionId)); 
     builder.append(String.valueOf(this.token)); ;
    return builder.toString();
  }
}