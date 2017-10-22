package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRecurringId  implements Serializable  {
  @Column(name="recurring_id")
  private Integer recurringId;

  @Column(name="product_id")
  private Integer productId;

  @Column(name="customer_group_id")
  private Integer customerGroupId;

  public OcProductRecurringId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( Integer value) {
      this.recurringId = value;
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customerGroupId = value;
    }

    public Integer getRecurringId() {
      return this.recurringId;
    }

    public Integer getProductId() {
      return this.productId;
    }

    public Integer getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return recurringId.hashCode() 
      + productId.hashCode()
   + customerGroupId.hashCode();
  }

}