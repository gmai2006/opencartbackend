package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcFilterDescriptionId  implements Serializable  {
  @Column(name="filter_id")
  private Integer filterId;

  @Column(name="language_id")
  private Integer languageId;

  public OcFilterDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setFilterId( Integer value) {
      this.filterId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getFilterId() {
      return this.filterId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return filterId.hashCode() 
      + languageId.hashCode();
  }

}