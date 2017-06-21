package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToCategoryId  implements Serializable  {
  @Column(name="category_id")
  private Integer categoryId;

  @Column(name="product_id")
  private Integer productId;

  public OcProductToCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

    public Integer getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + productId.hashCode();
  }

}