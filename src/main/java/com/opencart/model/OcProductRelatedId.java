package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductRelatedId  implements Serializable  {
  @Column(name="related_id")
  private Integer relatedId;

  @Column(name="product_id")
  private Integer productId;

  public OcProductRelatedId() {
        // Your class must have a no-arq constructor
    }

    public void setRelatedId( Integer value) {
      this.relatedId = value;
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public Integer getRelatedId() {
      return this.relatedId;
    }

    public Integer getProductId() {
      return this.productId;
    }

  @Override
  public int hashCode() {
      return relatedId.hashCode() 
      + productId.hashCode();
  }

}