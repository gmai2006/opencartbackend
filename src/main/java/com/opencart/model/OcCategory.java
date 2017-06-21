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
@Table(name="oc_category")
public class OcCategory  {
  @Basic
  @Column(name="\"image\"" , length=255)
  private String image;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"category_id\"" , length=10)
  @NotNull
  private Integer categoryId;

  @Basic
  @Column(name="\"top\"" )
  @NotNull
  private Boolean top;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"parent_id\"" , length=10)
  @NotNull
  private Integer parentId;

  @Basic
  @Column(name="\"column\"" , length=10)
  @NotNull
  private Integer column;

  @Basic
  @Column(name="\"sort_order\"" , length=10)
  @NotNull
  private Integer sortOrder;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcCategory() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setCategoryId( Integer value) {
    this.categoryId = value;
  }
  public Integer getCategoryId() {
    return this.categoryId;
  }
  public void setTop( Boolean value) {
    this.top = value;
  }
  public Boolean getTop() {
    return this.top;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setParentId( Integer value) {
    this.parentId = value;
  }
  public Integer getParentId() {
    return this.parentId;
  }
  public void setColumn( Integer value) {
    this.column = value;
  }
  public Integer getColumn() {
    return this.column;
  }
  public void setSortOrder( Integer value) {
    this.sortOrder = value;
  }
  public Integer getSortOrder() {
    return this.sortOrder;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.categoryId)); 
     builder.append(String.valueOf(this.top)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.parentId)); 
     builder.append(String.valueOf(this.column)); 
     builder.append(String.valueOf(this.sortOrder)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}