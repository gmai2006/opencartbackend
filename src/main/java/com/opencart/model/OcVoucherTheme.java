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
@Table(name="oc_voucher_theme")
public class OcVoucherTheme  {
  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"voucher_theme_id\"" , length=10)
  @NotNull
  private Integer voucherThemeId;

  public OcVoucherTheme() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setVoucherThemeId( Integer value) {
    this.voucherThemeId = value;
  }
  public Integer getVoucherThemeId() {
    return this.voucherThemeId;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append(String.valueOf(this.image)); 
     builder.append(String.valueOf(this.voucherThemeId)); ;
    return builder.toString();
  }
}