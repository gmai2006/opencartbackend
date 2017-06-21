package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcMenuDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer languageId;

  @Column(name="menu_id")
  private Integer menuId;

  public OcMenuDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public void setMenuId( Integer value) {
      this.menuId = value;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

    public Integer getMenuId() {
      return this.menuId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + menuId.hashCode();
  }

}