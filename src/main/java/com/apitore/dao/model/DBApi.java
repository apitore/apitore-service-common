package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;


@Data
@Entity
@Table(name="apis")
public class DBApi implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3146346822669652297L;

  @Id
  @GeneratedValue
  @Column(name="apiId")
  private Long apiId;

  @Column(name="title")
  private String title;

  @Column(name="userId")
  private Long userId;

  @Column(name="devId")
  private Long devId;

  @Column(name="developer")
  private String developer;

  @Column(name="anonymous")
  private Boolean anonymous=false;

  @Column(name="thumbnail")
  private Boolean thumbnail=false;

  @Column(name="stable")
  private Boolean stable=false;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Column(name="ready")
  private Boolean ready=false;

  @Column(name="open")
  private Boolean open=false;

  @Column(name="exclusive")
  private Boolean exclusive=false;

  @Column(name="numCalled")
  private Long numCalled=0L;

  @Column(name="numRegistered")
  private Long numRegistered=1L;

  @Column(name="rate")
  private Integer rate=0;

  @Column(name="numReview")
  private Long numReview=0L;

  @Column(name="rateNumReview")
  private Float rateNumReview=0F;

  @Column(name="royalty")
  private Long royalty=0L;

  @Column(name="loadLevel")
  private Long loadLevel=0L;

  @Column(name="licenseId")
  private Integer licenseId=1;

  @Column(name="commercial")
  private Integer commercial=1;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Column(name="numUnethical")
  private Long numUnethical=0L;

  @OneToOne
  @JoinColumn(name="licenseId", insertable=false, updatable=false)
  private DBLicense license;

  @Transient
  private Boolean notRegistered=true;


  /* Constructor */
  public DBApi() {}
  public DBApi(
      String title, Long userId,
      Long devId, String developer)
  {
    this.title = title;
    this.userId = userId;
    this.devId = devId;
    this.developer = developer;
    this.registeredAt = new Date();
  }


  public void addNumCalled() {
    this.numCalled++;
  }
  public void addNumRegistered() {
    this.numRegistered++;
  }
  public void addNumReview() {
    this.numReview++;
  }
  public void addNumUnethical() {
    this.numUnethical++;
  }
  public void subNumUnethical() {
    this.numUnethical--;
  }

}
