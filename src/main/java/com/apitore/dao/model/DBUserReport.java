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
@Table(name="user_reports")
public class DBUserReport implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 4030350535166407918L;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Id
  @Column(name="userId")
  private Long userId;

  @Column(name="unethical")
  private Boolean unethical=false;

  @Column(name="enabled")
  private Boolean enabled=true;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBUserReport() {
  }
  public DBUserReport(long userId, long apiId) {
    this.userId = userId;
    this.apiId  = apiId;
    this.registeredAt = new Date();
  }

}
