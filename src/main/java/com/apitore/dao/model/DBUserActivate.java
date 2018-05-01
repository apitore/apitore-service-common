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
@Table(name="user_activate")
public class DBUserActivate implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -6440856668109741546L;

  @Id
  @Column(name="username")
  private String username;

  @Column(name="userId")
  private Long userId;

  @Column(name="password")
  private String password;

  @Column(name="confirmation")
  private String confirmation;

  @Column(name="enabled")
  private Boolean enabled;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBUserActivate() {}
  public DBUserActivate(String username, String password, String confirmation) {
    this.userId=null;
    this.username=username;
    this.password=password;
    this.confirmation=confirmation;
    this.enabled=false;
    this.registeredAt=new Date();
  }
  public DBUserActivate(long userId, String username, String password, String confirmation) {
    this.userId=userId;
    this.username=username;
    this.password=password;
    this.confirmation=confirmation;
    this.enabled=false;
    this.registeredAt=new Date();
  }

}
