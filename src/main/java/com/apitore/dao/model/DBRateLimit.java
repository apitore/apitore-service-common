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
@Table(name="rate_limits")
public class DBRateLimit implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 6653875872790529079L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Column(name="numCalled")
  private Long numCalled=0L;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="lastCalledAt")
  private Date lastCalledAt;


  /* Constructor */
  public DBRateLimit() {
  }
  public DBRateLimit(long userId, long apiId) {
    this.userId = userId;
    this.apiId  = apiId;
    this.lastCalledAt = new Date();
  }

  public void addNumCalled() {
    this.numCalled++;
  }

}
