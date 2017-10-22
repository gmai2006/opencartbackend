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
@Table(name="oc_tax_rule")
public class OcTaxRule  {
  @Basic
  @Column(name="\"tax_rate_id\"" , length=10)
  @NotNull
  private Integer taxRateId;

  @Basic
  @Column(name="\"based\"" , length=10)
  @NotNull
  private String based;

  @Basic
  @Column(name="\"tax_class_id\"" , length=10)
  @NotNull
  private Integer taxClassId;

  @Basic
  @Column(name="\"priority\"" , length=10)
  @NotNull
  private Integer priority = 1;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"tax_rule_id\"" , length=10)
  @NotNull
  private Integer taxRuleId;

  public OcTaxRule() {
  }

  public void setTaxRateId( Integer value) {
    this.taxRateId = value;
  }
  public Integer getTaxRateId() {
    return this.taxRateId;
  }
  public void setBased( String value) {
    this.based = value;
  }
  public String getBased() {
    return this.based;
  }
  public void setTaxClassId( Integer value) {
    this.taxClassId = value;
  }
  public Integer getTaxClassId() {
    return this.taxClassId;
  }
  public void setPriority( Integer value) {
    this.priority = value;
  }
  public Integer getPriority() {
    return this.priority;
  }
  public void setTaxRuleId( Integer value) {
    this.taxRuleId = value;
  }
  public Integer getTaxRuleId() {
    return this.taxRuleId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.taxRateId)); 
     builder.append(String.valueOf(this.based)); 
     builder.append(String.valueOf(this.taxClassId)); 
     builder.append(String.valueOf(this.priority)); 
     builder.append(String.valueOf(this.taxRuleId)); ;
    return builder.toString();
  }
}