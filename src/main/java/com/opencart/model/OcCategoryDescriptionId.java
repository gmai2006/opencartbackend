package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCategoryDescriptionId  implements Serializable  {
  @Column(name="category_id")
  private Integer categoryId;

  @Column(name="language_id")
  private Integer languageId;

  public OcCategoryDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + languageId.hashCode();
  }

}