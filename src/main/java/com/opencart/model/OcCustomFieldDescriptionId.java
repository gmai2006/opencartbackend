package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCustomFieldDescriptionId  implements Serializable  {
  @Column(name="custom_field_id")
  private Integer customFieldId;

  @Column(name="language_id")
  private Integer languageId;

  public OcCustomFieldDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setCustomFieldId( Integer value) {
      this.customFieldId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getCustomFieldId() {
      return this.customFieldId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return customFieldId.hashCode() 
      + languageId.hashCode();
  }

}