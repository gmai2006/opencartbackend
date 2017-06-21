package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryToLayoutId  implements Serializable  {
  @Column(name="store_id")
  private Integer storeId;

  @Column(name="category_id")
  private Integer categoryId;

  public OcCategoryToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.storeId = value;
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public Integer getStoreId() {
      return this.storeId;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + categoryId.hashCode();
  }

}