package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcCouponCategoryId  implements Serializable  {
  @Column(name="category_id")
  private Integer categoryId;

  @Column(name="coupon_id")
  private Integer couponId;

  public OcCouponCategoryId() {
        // Your class must have a no-arq constructor
    }

    public void setCategoryId( Integer value) {
      this.categoryId = value;
    }

    public void setCouponId( Integer value) {
      this.couponId = value;
    }

    public Integer getCategoryId() {
      return this.categoryId;
    }

    public Integer getCouponId() {
      return this.couponId;
    }

  @Override
  public int hashCode() {
      return categoryId.hashCode() 
      + couponId.hashCode();
  }

}