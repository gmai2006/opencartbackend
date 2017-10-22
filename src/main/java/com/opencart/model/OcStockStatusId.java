package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcStockStatusId  implements Serializable  {
  @Column(name="stock_status_id")
  private Integer stockStatusId;

  @Column(name="language_id")
  private Integer languageId;

  public OcStockStatusId() {
        // Your class must have a no-arq constructor
    }

    public void setStockStatusId( Integer value) {
      this.stockStatusId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getStockStatusId() {
      return this.stockStatusId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return stockStatusId.hashCode() 
      + languageId.hashCode();
  }

}