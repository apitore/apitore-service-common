package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="thread_follows")
public class DBThreadFollow implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 7377426101805393315L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Id
  @Column(name="threadId")
  private Long threadId;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="updatedAt")
  private Date updatedAt;


  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="userId", insertable=false, updatable=false)
  private DBUserInfo userInfo;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="threadId", insertable=false, updatable=false)
  private DBThread threadInfo;


  /* Constructor */
  public DBThreadFollow() {
  }
  public DBThreadFollow(long userId, long threadId) {
    this.userId = userId;
    this.threadId  = threadId;
    this.updatedAt = new Date();
  }

}
