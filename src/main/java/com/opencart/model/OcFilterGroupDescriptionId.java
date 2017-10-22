package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterGroupDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer languageId;

  @Column(name="filter_group_id")
  private Integer filterGroupId;

  public OcFilterGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public void setFilterGroupId( Integer value) {
      this.filterGroupId = value;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

    public Integer getFilterGroupId() {
      return this.filterGroupId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + filterGroupId.hashCode();
  }

}