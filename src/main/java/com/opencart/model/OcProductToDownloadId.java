package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcProductToDownloadId  implements Serializable  {
  @Column(name="product_id")
  private Integer productId;

  @Column(name="download_id")
  private Integer downloadId;

  public OcProductToDownloadId() {
        // Your class must have a no-arq constructor
    }

    public void setProductId( Integer value) {
      this.productId = value;
    }

    public void setDownloadId( Integer value) {
      this.downloadId = value;
    }

    public Integer getProductId() {
      return this.productId;
    }

    public Integer getDownloadId() {
      return this.downloadId;
    }

  @Override
  public int hashCode() {
      return productId.hashCode() 
      + downloadId.hashCode();
  }

}