package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;


@Data
@Entity
@Table(name="user_info")
public class DBUserInfo implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 691167932508040529L;

  @Id
  @GeneratedValue
  @Column(name="userId")
  private Long userId;

  @Column(name="username")
  private String username;

  @Column(name="displayname")
  private String displayname;

  @Column(name="thumbnail")
  private Boolean thumbnail;

  @Column(name="homepage")
  private String homepage;

  @Column(name="firstname")
  private String firstname;

  @Column(name="familyname")
  private String familyname;

  @Column(name="affiliation")
  private String affiliation;

  @Column(name="description")
  private String description;

  @Column(name="open")
  private Boolean open;

  @Column(name="isOrganization")
  private Boolean isOrganization;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="lastLoginedAt")
  private Date lastLoginedAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="updatedAt")
  private Date updatedAt;

  @Transient
  private Boolean followWake=true;


  /* Constructor */
  public DBUserInfo(){}
  public DBUserInfo(String username, String displayname, Boolean open){
    this.username=username;
    this.displayname=displayname;
    this.open=open;
    this.thumbnail=false;
    this.homepage=null;
    this.firstname=null;
    this.familyname=null;
    this.affiliation=null;
    this.description=null;
    this.isOrganization=false;
    this.registeredAt=new Date();
    this.lastLoginedAt=this.registeredAt;
    this.updatedAt=this.registeredAt;
  }
  public DBUserInfo(DBUserInfo src) {
    this.userId=src.getUserId();
    this.username=src.getUsername();
    this.displayname=src.getDisplayname();
    this.open=src.getOpen();
    this.thumbnail=src.getThumbnail();
    this.homepage=src.getHomepage();
    this.firstname=src.getFirstname();
    this.familyname=src.getFamilyname();
    this.affiliation=src.getAffiliation();
    this.description=src.getDescription();
    this.isOrganization=src.getIsOrganization();
    this.registeredAt=src.getRegisteredAt();
    this.lastLoginedAt=src.getLastLoginedAt();
    this.updatedAt=src.getUpdatedAt();
  }

}