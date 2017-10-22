package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOptionDescriptionId  implements Serializable  {
  @Column(name="option_id")
  private Integer optionId;

  @Column(name="language_id")
  private Integer languageId;

  public OcOptionDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setOptionId( Integer value) {
      this.optionId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getOptionId() {
      return this.optionId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return optionId.hashCode() 
      + languageId.hashCode();
  }

}