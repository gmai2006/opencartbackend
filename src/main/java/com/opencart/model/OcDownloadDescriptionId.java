package com.opencart.model;

import java.util.*;
import javax.persistence.*;
import java.io.Serializable;
/**
This class is auto generated from database schema
*/

public class OcDownloadDescriptionId  implements Serializable  {
  @Column(name="language_id")
  private Integer languageId;

  @Column(name="download_id")
  private Integer downloadId;

  public OcDownloadDescriptionId() {
        // Your class must have a no-arq constructor
    }

    public void setLanguageId( Integer value) {
      this.languageId = value;
    }

    public void setDownloadId( Integer value) {
      this.downloadId = value;
    }

    public Integer getLanguageId() {
      return this.languageId;
    }

    public Integer getDownloadId() {
      return this.downloadId;
    }

  @Override
  public int hashCode() {
      return languageId.hashCode() 
      + downloadId.hashCode();
  }

}