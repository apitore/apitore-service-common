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
@Table(name="user_thread_comments")
public class DBUserThreadComment implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2208213587438459107L;

  @Id
  @Column(name="commentId")
  private Long commentId;

  @Id
  @Column(name="userId")
  private Long userId;

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
  public DBUserThreadComment() {
  }
  public DBUserThreadComment(long userId, long commentId) {
    this.userId = userId;
    this.commentId  = commentId;
    this.registeredAt = new Date();
  }

}