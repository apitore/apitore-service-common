package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="user_credits")
public class DBUserCredits implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -8926680889188455985L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Column(name="restFreeCredit")
  private Long restFreeCredit=0L;

  @Column(name="restPaidCredit")
  private Long restPaidCredit=0L;

  @Column(name="earnedCredit")
  private Long earnedCredit=0L;

  @Column(name="paypalId")
  private String paypalId=null;


  /* Constructor */
  public DBUserCredits() {}
  public DBUserCredits(long userId) {
    this.userId=userId;
  }


  public void addRestPaidCredit(Long value) {
    this.restPaidCredit += value;
  }
  public void subRestPaidCredit(Long value) {
    this.restPaidCredit -= value;
  }

  public void addEarnedCredit(Long value) {
    this.earnedCredit += value;
  }
  public void subEarnedCredit(Long value) {
    this.earnedCredit -= value;
  }

}
