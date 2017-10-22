package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcOrderStatusId  implements Serializable  {
  @Column(name="order_status_id")
  private Integer orderStatusId;

  @Column(name="language_id")
  private Integer languageId;

  public OcOrderStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setOrderStatusId( Integer value) {
      this.orderStatusId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getOrderStatusId() {
      return this.orderStatusId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return orderStatusId.hashCode() 
      + languageId.hashCode();
  }

}