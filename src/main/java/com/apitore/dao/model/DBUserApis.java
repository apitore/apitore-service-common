package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="user_apis")
public class DBUserApis implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -2941786508760137907L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Column(name="numCalledMonth")
  private Long numCalledMonth=0L;

  @Column(name="numCalledTotal")
  private Long numCalledTotal=0L;

  @Column(name="usedCreditMonth")
  private Long usedCreditMonth=0L;

  @Column(name="usedCreditTotal")
  private Long usedCreditTotal=0L;

  @Column(name="restTrial")
  private Long restTrial;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Column(name="enabled")
  private Boolean enabled=true;

  @OneToOne
  @JoinColumn(name="apiId", insertable=false, updatable=false)
  private DBApi apiInfo;


  /* Constructor */
  public DBUserApis() {
  }
  public DBUserApis(long userId, long apiId, long restTrial) {
    this.userId = userId;
    this.apiId  = apiId;
    this.restTrial = restTrial;
    this.registeredAt = new Date();
  }


  public void addNumCalledMonth() {
    this.numCalledMonth++;
  }

  public void addNumCalledTotal() {
    this.numCalledTotal++;
  }

  public void subRestTrial() {
    this.restTrial--;
  }

}
