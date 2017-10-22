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
@Table(name="oc_recurring")
public class OcRecurring  {
  @Basic
  @Column(name="\"duration\"" , length=10)
  @NotNull
  private Integer duration;

  @Basic
  @Column(name="\"trial_price\"" , length=10)
  @NotNull
  private Float trialPrice;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="\"price\"" , length=10)
  @NotNull
  private Float price;

  @Basic
  @Column(name="\"trial_status\"" , length=3)
  @NotNull
  private Integer trialStatus;

  @Basic
  @Column(name="\"trial_cycle\"" , length=10)
  @NotNull
  private Integer trialCycle;

  @Basic
  @Column(name="\"cycle\"" , length=10)
  @NotNull
  private Integer cycle;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"trial_frequency\"" , length=10)
  @NotNull
  private String trialFrequency;

  @Basic
  @Column(name="\"frequency\"" , length=10)
  @NotNull
  private String frequency;

  @Basic
  @Column(name="\"trial_duration\"" , length=10)
  @NotNull
  private Integer trialDuration;

  @Basic
  @Column(name="\"status\"" , length=3)
  @NotNull
  private Integer status;

  public OcRecurring() {
  }

  public void setDuration( Integer value) {
    this.duration = value;
  }
  public Integer getDuration() {
    return this.duration;
  }
  public void setTrialPrice( Float value) {
    this.trialPrice = value;
  }
  public Float getTrialPrice() {
    return this.trialPrice;
  }
  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setPrice( Float value) {
    this.price = value;
  }
  public Float getPrice() {
    return this.price;
  }
  public void setTrialStatus( Integer value) {
    this.trialStatus = value;
  }
  public Integer getTrialStatus() {
    return this.trialStatus;
  }
  public void setTrialCycle( Integer value) {
    this.trialCycle = value;
  }
  public Integer getTrialCycle() {
    return this.trialCycle;
  }
  public void setCycle( Integer value) {
    this.cycle = value;
  }
  public Integer getCycle() {
    return this.cycle;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setTrialFrequency( String value) {
    this.trialFrequency = value;
  }
  public String getTrialFrequency() {
    return this.trialFrequency;
  }
  public void setFrequency( String value) {
    this.frequency = value;
  }
  public String getFrequency() {
    return this.frequency;
  }
  public void setTrialDuration( Integer value) {
    this.trialDuration = value;
  }
  public Integer getTrialDuration() {
    return this.trialDuration;
  }
  public void setStatus( Integer value) {
    this.status = value;
  }
  public Integer getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.duration)); 
     builder.append(String.valueOf(this.trialPrice)); 
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.price)); 
     builder.append(String.valueOf(this.trialStatus)); 
     builder.append(String.valueOf(this.trialCycle)); 
     builder.append(String.valueOf(this.cycle)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.trialFrequency)); 
     builder.append(String.valueOf(this.frequency)); 
     builder.append(String.valueOf(this.trialDuration)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}