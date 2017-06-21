package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationDescriptionId  implements Serializable  {
  @Column(name="information_id")
  private Integer informationId;

  @Column(name="language_id")
  private Integer languageId;

  public OcInformationDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( Integer value) {
      this.informationId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getInformationId() {
      return this.informationId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return informationId.hashCode() 
      + languageId.hashCode();
  }

}