package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionValueDescriptionId  implements Serializable  {
  @Column(name="option_value_id")
  private Integer optionValueId;

  @Column(name="language_id")
  private Integer languageId;

  public OcOptionValueDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionValueId( Integer value) {
      this.optionValueId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getOptionValueId() {
      return this.optionValueId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return optionValueId.hashCode() 
      + languageId.hashCode();
  }

}