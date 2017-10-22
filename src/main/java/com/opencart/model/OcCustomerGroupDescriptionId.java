package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer languageId;

  @Column(name="customer_group_id")
  private Integer customerGroupId;

  public OcCustomerGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public void setCustomerGroupId( Integer value) {
      this.customerGroupId = value;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

    public Integer getCustomerGroupId() {
      return this.customerGroupId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + customerGroupId.hashCode();
  }

}