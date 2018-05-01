package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Data;


@Data
@Entity
@Table(
    name="api_reviews",
    uniqueConstraints=@UniqueConstraint(columnNames = {"apiId", "userId", "version"})
    )
public class DBApiReviews implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 3284358287300084150L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="reviewId")
  private Long reviewId;

  @Column(name="apiId")
  private Long apiId;

  @Column(name="userId")
  private Long userId;

  @Column(name="version")
  private String version;

  @Column(name="rate")
  private Integer rate;

  @Column(name="description")
  private String description;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Column(name="numGood")
  private Long numGood=0L;

  @Column(name="numNotGood")
  private Long numNotGood=0L;

  @Column(name="numUnethical")
  private Long numUnethical=0L;

  @Column(name="enabled")
  private Boolean enabled=true;

  @OneToOne
  @JoinColumn(name="userId", insertable=false, updatable=false)
  private DBUserInfo userInfo;


  /* Constructor */
  public DBApiReviews(){}
  public DBApiReviews(Long apiId, Long userId, String version, Integer rate, String description) {
    this.apiId = apiId;
    this.userId = userId;
    this.version = version;
    this.rate = rate;
    this.description = description;
    this.registeredAt = new Date();
  }

}
