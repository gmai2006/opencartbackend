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
@Table(name="oc_recurring_description")
@IdClass(value=OcRecurringDescriptionId.class)
public class OcRecurringDescription  {
  @Id
  @Column(name="\"recurring_id\"" , length=10)
  @NotNull
  private Integer recurringId;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcRecurringDescription() {
  }

  public void setRecurringId( Integer value) {
    this.recurringId = value;
  }
  public Integer getRecurringId() {
    return this.recurringId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.recurringId)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}