package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="user_threads")
public class DBUserThread implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 8576393331112168170L;

  @Id
  @Column(name="threadId")
  private Long threadId;

  @Id
  @Column(name="userId")
  private Long userId;

  @Column(name="want")
  private Boolean want=false;

  @Column(name="make")
  private Boolean make=false;

  @Column(name="good")
  private Boolean good=false;

  @Column(name="notGood")
  private Boolean notGood=false;

  @Column(name="unethical")
  private Boolean unethical=false;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBUserThread() {
  }
  public DBUserThread(long userId, long threadId) {
    this.userId = userId;
    this.threadId  = threadId;
    this.registeredAt = new Date();
  }

}
