package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomerWishlistId  implements Serializable  {
  @Column(name="product_id")
  private Integer productId;

  @Column(name="customer_id")
  private Integer customerId;

  public OcCustomerWishlistId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public void setCustomerId( Integer value) {
      this.customerId = value;
    }

    public Integer getProductId() {
      return this.productId;
    }

    public Integer getCustomerId() {
      return this.customerId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + customerId.hashCode();
  }

}