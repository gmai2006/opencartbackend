package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToLayoutId  implements Serializable  {
  @Column(name="store_id")
  private Integer storeId;

  @Column(name="product_id")
  private Integer productId;

  public OcProductToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.storeId = value;
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public Integer getStoreId() {
      return this.storeId;
    }

    public Integer getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + productId.hashCode();
  }

}