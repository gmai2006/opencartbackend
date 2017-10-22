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
@Table(name="oc_return_history")
public class OcReturnHistory  {
  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"return_history_id\"" , length=10)
  @NotNull
  private Integer returnHistoryId;

  @Basic
  @Column(name="\"return_id\"" , length=10)
  @NotNull
  private Integer returnId;

  @Basic
  @Column(name="\"return_status_id\"" , length=10)
  @NotNull
  private Integer returnStatusId;

  @Basic
  @Column(name="\"comment\"" , length=65535)
  @NotNull
  private String comment;

  @Basic
  @Column(name="\"notify\"" )
  @NotNull
  private Boolean notify;

  public OcReturnHistory() {
  }

  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setReturnHistoryId( Integer value) {
    this.returnHistoryId = value;
  }
  public Integer getReturnHistoryId() {
    return this.returnHistoryId;
  }
  public void setReturnId( Integer value) {
    this.returnId = value;
  }
  public Integer getReturnId() {
    return this.returnId;
  }
  public void setReturnStatusId( Integer value) {
    this.returnStatusId = value;
  }
  public Integer getReturnStatusId() {
    return this.returnStatusId;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void setNotify( Boolean value) {
    this.notify = value;
  }
  public Boolean getNotify() {
    return this.notify;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.returnHistoryId)); 
     builder.append(String.valueOf(this.returnId)); 
     builder.append(String.valueOf(this.returnStatusId)); 
     builder.append(String.valueOf(this.comment)); 
     builder.append(String.valueOf(this.notify)); ;
    return builder.toString();
  }
}