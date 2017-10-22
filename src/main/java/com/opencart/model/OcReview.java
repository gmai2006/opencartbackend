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
@Table(name="oc_review")
public class OcReview  {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"review_id\"" , length=10)
  @NotNull
  private Integer reviewId;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"date_modified\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateModified;

  @Basic
  @Column(name="\"author\"" , length=64)
  @NotNull
  private String author;

  @Basic
  @Column(name="\"product_id\"" , length=10)
  @NotNull
  private Integer productId;

  @Basic
  @Column(name="\"rating\"" , length=10)
  @NotNull
  private Integer rating;

  @Basic
  @Column(name="\"text\"" , length=65535)
  @NotNull
  private String text;

  @Basic
  @Column(name="\"customer_id\"" , length=10)
  @NotNull
  private Integer customerId;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcReview() {
  }

  public void setReviewId( Integer value) {
    this.reviewId = value;
  }
  public Integer getReviewId() {
    return this.reviewId;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setDateModified( java.sql.Timestamp value) {
    this.dateModified = value;
  }
  public java.sql.Timestamp getDateModified() {
    return this.dateModified;
  }
  public void setAuthor( String value) {
    this.author = value;
  }
  public String getAuthor() {
    return this.author;
  }
  public void setProductId( Integer value) {
    this.productId = value;
  }
  public Integer getProductId() {
    return this.productId;
  }
  public void setRating( Integer value) {
    this.rating = value;
  }
  public Integer getRating() {
    return this.rating;
  }
  public void setText( String value) {
    this.text = value;
  }
  public String getText() {
    return this.text;
  }
  public void setCustomerId( Integer value) {
    this.customerId = value;
  }
  public Integer getCustomerId() {
    return this.customerId;
  }
  public void setStatus( Boolean value) {
    this.status = value;
  }
  public Boolean getStatus() {
    return this.status;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.reviewId)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.dateModified)); 
     builder.append(String.valueOf(this.author)); 
     builder.append(String.valueOf(this.productId)); 
     builder.append(String.valueOf(this.rating)); 
     builder.append(String.valueOf(this.text)); 
     builder.append(String.valueOf(this.customerId)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}