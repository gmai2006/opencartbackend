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
@Table(name="oc_category_description")
@IdClass(value=OcCategoryDescriptionId.class)
public class OcCategoryDescription  {
  @Basic
  @Column(name="\"meta_description\"" , length=255)
  @NotNull
  private String metaDescription;

  @Id
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="\"meta_title\"" , length=255)
  @NotNull
  private String metaTitle;

  @Basic
  @Column(name="\"meta_keyword\"" , length=255)
  @NotNull
  private String metaKeyword;

  @Basic
  @Column(name="\"name\"" , length=255)
  @NotNull
  private String name;

  @Basic
  @Column(name="\"description\"" , length=65535)
  @NotNull
  private String description;

  @Id
  @Column(name="\"language_id\"" , length=10)
  @NotNull
  private Integer languageId;

  public OcCategoryDescription() {
  }

  public void setMetaDescription( String value) {
    this.metaDescription = value;
  }
  public String getMetaDescription() {
    return this.metaDescription;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setMetaTitle( String value) {
    this.metaTitle = value;
  }
  public String getMetaTitle() {
    return this.metaTitle;
  }
  public void setMetaKeyword( String value) {
    this.metaKeyword = value;
  }
  public String getMetaKeyword() {
    return this.metaKeyword;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setLanguageId( Integer value) {
    this.languageId = value;
  }
  public Integer getLanguageId() {
    return this.languageId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.metaDescription)); 
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.metaTitle)); 
     builder.append(String.valueOf(this.metaKeyword)); 
     builder.append(String.valueOf(this.name)); 
     builder.append(String.valueOf(this.description)); 
     builder.append(String.valueOf(this.languageId)); ;
    return builder.toString();
  }
}