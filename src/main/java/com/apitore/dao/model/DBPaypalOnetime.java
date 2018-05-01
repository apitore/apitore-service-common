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
@Table(name="paypal_onetime_status")
public class DBPaypalOnetime implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -8298791795029980920L;

  @Id
  @Column(name="id")
  private String id;

  @Column(name="userId")
  private Long userId;

  @Column(name="yen")
  private Integer yen;

  @Column(name="credit")
  private Long credit;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBPaypalOnetime() {}
  public DBPaypalOnetime(String id, Long userId, Integer yen, Long credit) {
    this.id = id;
    this.userId = userId;
    this.yen = yen;
    this.credit = credit;
    this.registeredAt = new Date();
  }

}
