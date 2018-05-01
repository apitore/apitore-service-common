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
@Table(name="follows")
public class DBFollow implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2532444503527161998L;

  @Id
  @Column(name="fromId")
  private Long fromId;

  @Id
  @Column(name="toId")
  private Long toId;

  @Column(name="blocked")
  private Boolean blocked=false;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;


  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="fromId", insertable=false, updatable=false)
  private DBUserInfo fromInfo;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="toId", insertable=false, updatable=false)
  private DBUserInfo toInfo;


  /* Constructor */
  public DBFollow() {
  }
  public DBFollow(long fromId, long toId) {
    this.fromId = fromId;
    this.toId  = toId;
    this.registeredAt = new Date();
  }

}
