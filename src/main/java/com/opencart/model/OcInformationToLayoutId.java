package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcInformationToLayoutId  implements Serializable  {
  @Column(name="information_id")
  private Integer informationId;

  @Column(name="store_id")
  private Integer storeId;

  public OcInformationToLayoutId() {
        // Your class must have a no-arq constructor
    }

    public void setInformationId( Integer value) {
      this.informationId = value;
    }

    public void setStoreId( Integer value) {
      this.storeId = value;
    }

    public Integer getInformationId() {
      return this.informationId;
    }

    public Integer getStoreId() {
      return this.storeId;
    }

  @Override
  public int hashCode() {
      return informationId.hashCode() 
      + storeId.hashCode();
  }

}