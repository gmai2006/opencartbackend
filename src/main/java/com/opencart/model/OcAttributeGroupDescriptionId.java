package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeGroupDescriptionId  implements Serializable  {
  @Column(name="attribute_group_id")
  private Integer attributeGroupId;

  @Column(name="language_id")
  private Integer languageId;

  public OcAttributeGroupDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeGroupId( Integer value) {
      this.attributeGroupId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getAttributeGroupId() {
      return this.attributeGroupId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return attributeGroupId.hashCode() 
      + languageId.hashCode();
  }

}