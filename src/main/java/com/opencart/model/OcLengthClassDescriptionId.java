package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcLengthClassDescriptionId  implements Serializable  {
  @Column(name="length_class_id")
  private Integer lengthClassId;

  @Column(name="language_id")
  private Integer languageId;

  public OcLengthClassDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLengthClassId( Integer value) {
      this.lengthClassId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getLengthClassId() {
      return this.lengthClassId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return lengthClassId.hashCode() 
      + languageId.hashCode();
  }

}