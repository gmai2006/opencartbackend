package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcManufacturerToStoreId  implements Serializable  {
  @Column(name="store_id")
  private Integer storeId;

  @Column(name="manufacturer_id")
  private Integer manufacturerId;

  public OcManufacturerToStoreId() {
        // Your class must have a no-arq constructor
    }

    public void setStoreId( Integer value) {
      this.storeId = value;
    }

    public void setManufacturerId( Integer value) {
      this.manufacturerId = value;
    }

    public Integer getStoreId() {
      return this.storeId;
    }

    public Integer getManufacturerId() {
      return this.manufacturerId;
    }

  @Override
  public int hashCode() {
      return storeId.hashCode() 
      + manufacturerId.hashCode();
  }

}