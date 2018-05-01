package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="api_use_logs")
public class DBApiUseLog implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 3934387471882850567L;


  @Id
  @GeneratedValue
  @Column(name="logId")
  private Long logId;

  @Column(name="projectId")
  private Long projectId;

  @Column(name="apiId")
  private Long apiId;

  @Column(name="userId")
  private Long userId;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="accessDate")
  private Date accessDate;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="finishDate")
  private Date finishDate;

  @Column(name="processTime")
  private Long processTime;

  @Column(name="processFee")
  private Long processFee;

  @Column(name="royaltyFee")
  private Long royaltyFee;

  @Column(name="success")
  private Boolean success=true;

  @Column(name="paid")
  private Boolean paid=false;

  @Column(name="apitoreFree")
  private Boolean apitoreFree=false;

  @Column(name="donation")
  private Boolean donation=false;


  /* Constructor */
  public DBApiUseLog () {}
  public DBApiUseLog (
      Long projectId, Long apiId, Long userId, Date accessDate,
      Date finishDate, Long processTime, Long processFee, Long royaltyFee) {
    this.projectId = projectId;
    this.apiId = apiId;
    this.userId = userId;
    this.accessDate = accessDate;
    this.finishDate = finishDate;
    this.processTime = processTime;
    this.processFee = processFee;
    this.royaltyFee = royaltyFee;
  }

}
