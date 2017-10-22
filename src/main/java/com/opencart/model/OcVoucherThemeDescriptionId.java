package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcVoucherThemeDescriptionId  implements Serializable  {
  @Column(name="voucher_theme_id")
  private Integer voucherThemeId;

  @Column(name="language_id")
  private Integer languageId;

  public OcVoucherThemeDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setVoucherThemeId( Integer value) {
      this.voucherThemeId = value;
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public Integer getVoucherThemeId() {
      return this.voucherThemeId;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

  @Override
  public int hashCode() {
      return voucherThemeId.hashCode() 
      + languageId.hashCode();
  }

}