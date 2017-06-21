package com.opencart.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.IdClass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="oc_banner_image")
public class OcBannerImage  {
  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"banner_image_id\"" , length=10)
  @NotNull
  private Integer bannerImageId;

  @Basic
  @Column(name="\"banner_id\"" , length=10)
  @NotNull
  private Integer bannerId;

  @Basic
  @Column(name="\"link\"" , length=255)
  @NotNull
  private String link;

  @Basic
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  @Basic
  @Column(name="\"title\"" , length=64)
  @NotNull
  private String title;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  public OcBannerImage() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setBannerImageId( Integer value) {
    this.bannerImageId = value;
  }
  public Integer getBannerImageId() {
    return this.bannerImageId;
  }
  public void setBannerId( Integer value) {
    this.bannerId = value;
  }
  public Integer getBannerId() {
    return this.bannerId;
  }
  public void setLink( String value) {
    this.link = value;
  }
  public String getLink() {
    return this.link;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }
  public void setTitle( String value) {
    this.title = value;
  }
  public String getTitle() {
    return this.title;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.bannerImageId)); 
     builder.append(String.valueOf(this.bannerId)); 
     builder.append(String.valueOf(this.link)); 
     builder.append(String.valueOf(this.languageId)); 
     builder.append(String.valueOf(this.title)); 
     builder.append(String.valueOf(this.sortOrder)); ;
    return builder.toString();
  }
}