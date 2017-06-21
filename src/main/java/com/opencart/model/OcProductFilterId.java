package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductFilterId  implements Serializable  {
  @Column(name="filter_id")
  private Integer filterId;

  @Column(name="product_id")
  private Integer productId;

  public OcProductFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( Integer value) {
      this.filterId = value;
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public Integer getFilterId() {
      return this.filterId;
    }

    public Integer getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return filterId.hashCode() 
      + productId.hashCode();
  }

}