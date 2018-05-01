package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.Data;


@Data
@Entity
@Table(name="threads")
public class DBThread implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -6497125850348028286L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="threadId")
  private Long threadId;

  @Column(name="title")
  private String title;

  @Column(name="askPrice")
  private Long askPrice;

  @Column(name="userId")
  private Long userId;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="updatedAt")
  private Date updatedAt;

  @Column(name="open")
  private Boolean open=true;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Column(name="numComment")
  private Long numComment=1L;

  @Column(name="numWant")
  private Long numWant=0L;

  @Column(name="numMake")
  private Long numMake=0L;

  @Column(name="numGood")
  private Long numGood=0L;

  @Column(name="numNotGood")
  private Long numNotGood=0L;

  @Column(name="numUnethical")
  private Long numUnethical=0L;

  @OneToOne
  @JoinColumn(name="userId", insertable=false, updatable=false)
  private DBUserInfo userInfo;

  @OneToMany(fetch = FetchType.EAGER, mappedBy="thread")
  private Set<DBThreadCategory> categories;

  @Transient
  private DBUserThread userThread;


  /* Constructor */
  public DBThread() {}
  public DBThread(String title, Long askPrice, Long userId) {
    this.title = title;
    this.askPrice = askPrice;
    this.userId = userId;
    this.registeredAt = new Date();
    this.updatedAt = this.registeredAt;
  }
  public DBThread(DBThread threadInfo) {
    this.threadId = threadInfo.getThreadId();
    this.title = threadInfo.getTitle();
    this.askPrice = threadInfo.getAskPrice();
    this.userId = threadInfo.getUserId();
    this.registeredAt = threadInfo.getRegisteredAt();
    this.updatedAt = threadInfo.getUpdatedAt();
    this.open = threadInfo.getOpen();
    this.enabled = threadInfo.getEnabled();
    this.numComment = threadInfo.getNumComment();
    this.numWant = threadInfo.getNumWant();
    this.numMake = threadInfo.getNumMake();
    this.numGood = threadInfo.getNumGood();
    this.numNotGood = threadInfo.getNumNotGood();
    this.numUnethical = threadInfo.getNumUnethical();
    this.userInfo = threadInfo.getUserInfo();
    this.categories = threadInfo.getCategories();
  }


  public void reverseOpen() {
    this.open = !this.open;
  }

  public void addNumComment() {
    this.numComment++;
  }

  public void addNumWant() {
    this.numWant++;
  }
  public void subNumWant() {
    this.numWant--;
  }

  public void addNumMake() {
    this.numMake++;
  }
  public void subNumMake() {
    this.numMake--;
  }

  public void addNumGood() {
    this.numGood++;
  }
  public void subNumGood() {
    this.numGood--;
  }

  public void addNumNotGood() {
    this.numNotGood++;
  }
  public void subNumNotGood() {
    this.numNotGood--;
  }

  public void addNumUnethical() {
    this.numUnethical++;
  }
  public void subNumUnethical() {
    this.numUnethical--;
  }

}
