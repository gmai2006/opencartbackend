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
@Table(name="oc_tax_rate_to_customer_group")
@IdClass(value=OcTaxRateToCustomerGroupId.class)
public class OcTaxRateToCustomerGroup  {
  @Id
  @Column(name="\"tax_rate_id\"" , length=10)
  @NotNull
  private Integer taxRateId;

  @Id
  @Column(name="\"customer_group_id\"" , length=10)
  @NotNull
  private Integer customerGroupId;

  public OcTaxRateToCustomerGroup() {
  }

  public void setTaxRateId( Integer value) {
    this.taxRateId = value;
  }
  public Integer getTaxRateId() {
    return this.taxRateId;
  }
  public void setCustomerGroupId( Integer value) {
    this.customerGroupId = value;
  }
  public Integer getCustomerGroupId() {
    return this.customerGroupId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.taxRateId)); 
     builder.append(String.valueOf(this.customerGroupId)); ;
    return builder.toString();
  }
}