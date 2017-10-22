package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldCustomerGroupId  implements Serializable  {
  @Column(name="custom_field_id")
  private Integer customFieldId;

  @Column(name="customer_group_id")
  private Integer customerGroupId;

  public OcCustomFieldCustomerGroupId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( Integer value) {
      this.customFieldId = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customerGroupId = value;
    }

    public Integer getCustomFieldId() {
      return this.customFieldId;
    }

    public Integer getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return customFieldId.hashCode() 
      + customerGroupId.hashCode();
  }

}