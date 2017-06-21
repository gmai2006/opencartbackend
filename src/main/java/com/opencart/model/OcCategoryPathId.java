package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryPathId  implements Serializable  {
  @Column(name="category_id")
  private Integer categoryId;

  @Column(name="path_id")
  private Integer pathId;

  public OcCategoryPathId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public void setPathId( Integer value) {
      this.pathId = value;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

    public Integer getPathId() {
      return this.pathId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + pathId.hashCode();
  }

}