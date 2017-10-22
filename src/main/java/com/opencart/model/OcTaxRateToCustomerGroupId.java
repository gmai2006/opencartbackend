package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcTaxRateToCustomerGroupId  implements Serializable  {
  @Column(name="tax_rate_id")
  private Integer taxRateId;

  @Column(name="customer_group_id")
  private Integer customerGroupId;

  public OcTaxRateToCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setTaxRateId( Integer value) {
      this.taxRateId = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customerGroupId = value;
    }

    public Integer getTaxRateId() {
      return this.taxRateId;
    }

    public Integer getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return taxRateId.hashCode() 
      + customerGroupId.hashCode();
  }

}