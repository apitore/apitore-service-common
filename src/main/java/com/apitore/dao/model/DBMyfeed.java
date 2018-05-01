package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="myfeeds")
public class DBMyfeed implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2596834479689417074L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="feedId")
  private Long feedId;

  @Column(name="userId")
  private Long userId;

  @Column(name="description")
  private String description;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  /* Constructor */
  public DBMyfeed() {}
  public DBMyfeed(Long userId, String description) {
    this.userId = userId;
    this.description = description;
    this.registeredAt = new Date();
  }

}
