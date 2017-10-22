package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcReturnStatusId  implements Serializable  {
  @Column(name="return_status_id")
  private Integer returnStatusId;

  @Column(name="language_id")
  private Integer languageId;

  public OcReturnStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setReturnStatusId( Integer value) {
      this.returnStatusId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getReturnStatusId() {
      return this.returnStatusId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return returnStatusId.hashCode() 
      + languageId.hashCode();
  }

}