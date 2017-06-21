package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnActionId  implements Serializable  {
  @Column(name="language_id")
  private Integer languageId;

  @Column(name="return_action_id")
  private Integer returnActionId;

  public OcReturnActionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public void setReturnActionId( Integer value) {
      this.returnActionId = value;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

    public Integer getReturnActionId() {
      return this.returnActionId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + returnActionId.hashCode();
  }

}