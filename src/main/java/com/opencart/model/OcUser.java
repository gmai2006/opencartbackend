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
@Table(name="oc_user")
public class OcUser  {
  @Basic
  @Column(name="\"image\"" , length=255)
  @NotNull
  private String image;

  @Basic
  @Column(name="\"firstname\"" , length=32)
  @NotNull
  private String firstname;

  @Basic
  @Column(name="\"salt\"" , length=9)
  @NotNull
  private String salt;

  @Basic
  @Column(name="\"code\"" , length=40)
  @NotNull
  private String code;

  @Basic
  @Column(name="\"ip\"" , length=40)
  @NotNull
  private String ip;

  @Basic
  @Column(name="\"lastname\"" , length=32)
  @NotNull
  private String lastname;

  @Basic
  @Column(name="\"date_added\"" , length=19)
  @NotNull
  private java.sql.Timestamp dateAdded;

  @Basic
  @Column(name="\"password\"" , length=40)
  @NotNull
  private String password;

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="\"user_id\"" , length=10)
  @NotNull
  private Integer userId;

  @Basic
  @Column(name="\"user_group_id\"" , length=10)
  @NotNull
  private Integer userGroupId;

  @Basic
  @Column(name="\"email\"" , length=96)
  @NotNull
  private String email;

  @Basic
  @Column(name="\"username\"" , length=20)
  @NotNull
  private String username;

  @Basic
  @Column(name="\"status\"" )
  @NotNull
  private Boolean status;

  public OcUser() {
  }

  public void setImage( String value) {
    this.image = value;
  }
  public String getImage() {
    return this.image;
  }
  public void setFirstname( String value) {
    this.firstname = value;
  }
  public String getFirstname() {
    return this.firstname;
  }
  public void setSalt( String value) {
    this.salt = value;
  }
  public String getSalt() {
    return this.salt;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setIp( String value) {
    this.ip = value;
  }
  public String getIp() {
    return this.ip;
  }
  public void setLastname( String value) {
    this.lastname = value;
  }
  public String getLastname() {
    return this.lastname;
  }
  public void setDateAdded( java.sql.Timestamp value) {
    this.dateAdded = value;
  }
  public java.sql.Timestamp getDateAdded() {
    return this.dateAdded;
  }
  public void setPassword( String value) {
    this.password = value;
  }
  public String getPassword() {
    return this.password;
  }
  public void setUserId( Integer value) {
    this.userId = value;
  }
  public Integer getUserId() {
    return this.userId;
  }
  public void setUserGroupId( Integer value) {
    this.userGroupId = value;
  }
  public Integer getUserGroupId() {
    return this.userGroupId;
  }
  public void setEmail( String value) {
    this.email = value;
  }
  public String getEmail() {
    return this.email;
  }
  public void setUsername( String value) {
    this.username = value;
  }
  public String getUsername() {
    return this.username;
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
     builder.append(String.valueOf(this.firstname)); 
     builder.append(String.valueOf(this.salt)); 
     builder.append(String.valueOf(this.code)); 
     builder.append(String.valueOf(this.ip)); 
     builder.append(String.valueOf(this.lastname)); 
     builder.append(String.valueOf(this.dateAdded)); 
     builder.append(String.valueOf(this.password)); 
     builder.append(String.valueOf(this.userId)); 
     builder.append(String.valueOf(this.userGroupId)); 
     builder.append(String.valueOf(this.email)); 
     builder.append(String.valueOf(this.username)); 
     builder.append(String.valueOf(this.status)); ;
    return builder.toString();
  }
}