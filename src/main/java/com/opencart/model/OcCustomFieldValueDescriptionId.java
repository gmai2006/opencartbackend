package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldValueDescriptionId  implements Serializable  {
  @Column(name="custom_field_value_id")
  private Integer customFieldValueId;

  @Column(name="language_id")
  private Integer languageId;

  public OcCustomFieldValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldValueId( Integer value) {
      this.customFieldValueId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getCustomFieldValueId() {
      return this.customFieldValueId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return customFieldValueId.hashCode() 
      + languageId.hashCode();
  }

}