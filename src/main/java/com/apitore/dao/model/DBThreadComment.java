package com.apitore.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="thread_comments")
public class DBThreadComment implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -4419355536101427541L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="commentId")
  private Long commentId;

  @Column(name="threadId")
  private Long threadId;

  @Column(name="userId")
  private Long userId;

  @Column(name="parentId")
  private Long parentId;

  @Column(name="apiId")
  private Long apiId;

  @Column(name="askPrice")
  private Long askPrice;

  @Column(name="description")
  private String description;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Column(name="numGood")
  private Long numGood=0L;

  @Column(name="numNotGood")
  private Long numNotGood=0L;

  @Column(name="numUnethical")
  private Long numUnethical=0L;

  @OneToOne
  @JoinColumn(name="userId", insertable=false, updatable=false)
  private DBUserInfo userInfo;

  @Transient
  private DBUserThreadComment userThreadComment;

  @Transient
  private List<DBThreadComment> children=new ArrayList<DBThreadComment>();


  /* Constructor */
  public DBThreadComment() {}
  public DBThreadComment(Long threadId, Long userId, Long parentId, Long apiId, Long askPrice, String description) {
    this.threadId = threadId;
    this.userId = userId;
    this.parentId = parentId;
    this.apiId = apiId;
    this.askPrice = askPrice;
    this.description = description;
    this.registeredAt = new Date();
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

  public void addChild(DBThreadComment val) {
    this.children.add(val);
  }

}
