package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductDescriptionId  implements Serializable  {
  @Column(name="product_id")
  private Integer productId;

  @Column(name="language_id")
  private Integer languageId;

  public OcProductDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getProductId() {
      return this.productId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + languageId.hashCode();
  }

}