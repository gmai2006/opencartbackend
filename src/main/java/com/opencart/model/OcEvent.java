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
@Table(name="oc_event")
public class OcEvent  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"event_id\"" , length=10)
  @NotNull
  private Integer eventId;

  @Basic
  @Column(name="\"code\"" , length=32)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"action\"" , length=65535)
  @NotNull
  private String action;

  @Basic
  @Column(name="\"trigger\"" , length=65535)
  @NotNull
  private String trigger;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcEvent() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setEventId( Integer value) {
    this.eventId = value;
  }
  public Integer getEventId() {
    return this.eventId;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setTrigger( String value) {
    this.trigger = value;
  }
  public String getTrigger() {
    return this.trigger;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.eventId)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.action)); 
     builder.append(String.valueOf(this.trigger)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}