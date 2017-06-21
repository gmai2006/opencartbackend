package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcAttributeDescriptionId  implements Serializable  {
  @Column(name="attribute_id")
  private Integer attributeId;

  @Column(name="language_id")
  private Integer languageId;

  public OcAttributeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setAttributeId( Integer value) {
      this.attributeId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getAttributeId() {
      return this.attributeId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return attributeId.hashCode() 
      + languageId.hashCode();
  }

}