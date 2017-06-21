package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcRecurringDescriptionId  implements Serializable  {
  @Column(name="recurring_id")
  private Integer recurringId;

  @Column(name="language_id")
  private Integer languageId;

  public OcRecurringDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setRecurringId( Integer value) {
      this.recurringId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getRecurringId() {
      return this.recurringId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return recurringId.hashCode() 
      + languageId.hashCode();
  }

}