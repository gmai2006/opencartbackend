package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcWeightClassDescriptionId  implements Serializable  {
  @Column(name="weight_class_id")
  private Integer weightClassId;

  @Column(name="language_id")
  private Integer languageId;

  public OcWeightClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setWeightClassId( Integer value) {
      this.weightClassId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getWeightClassId() {
      return this.weightClassId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return weightClassId.hashCode() 
      + languageId.hashCode();
  }

}