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
@Table(name="oauth_twitter_token")
public class DBTwitterOauth implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -9102132986820812268L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Column(name="token")
  private String token;

  @Column(name="secret")
  private String secret;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBTwitterOauth() {}
  public DBTwitterOauth(Long userId, String token, String secret) {
    this.userId = userId;
    this.token = token;
    this.secret = secret;
    this.registeredAt = new Date();
  }

}
