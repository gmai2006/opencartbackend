package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnReasonId  implements Serializable  {
  @Column(name="return_reason_id")
  private Integer returnReasonId;

  @Column(name="language_id")
  private Integer languageId;

  public OcReturnReasonId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnReasonId( Integer value) {
      this.returnReasonId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getReturnReasonId() {
      return this.returnReasonId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return returnReasonId.hashCode() 
      + languageId.hashCode();
  }

}