package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryFilterId  implements Serializable  {
  @Column(name="category_id")
  private Integer categoryId;

  @Column(name="filter_id")
  private Integer filterId;

  public OcCategoryFilterId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public void setFilterId( Integer value) {
      this.filterId = value;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

    public Integer getFilterId() {
      return this.filterId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + filterId.hashCode();
  }

}