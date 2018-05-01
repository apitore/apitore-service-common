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
@Table(name="api_projects")
public class DBApiProjects implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -7965806779790148867L;

  @Id
  @Column(name="projectId")
  private Long projectId;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @OneToOne
  @JoinColumn(name="projectId", insertable=false, updatable=false)
  private DBUserProjects projectInfo;

  @OneToOne
  @JoinColumn(name="apiId", insertable=false, updatable=false)
  private DBApi apiInfo;


  /* Constructor */
  public DBApiProjects() {
  }
  public DBApiProjects(long projectId) {
    this.projectId = projectId;
    this.apiId=null;
    this.registeredAt=null;
  }
  public DBApiProjects(long projectId, long apiId) {
    this.projectId = projectId;
    this.apiId  = apiId;
    this.registeredAt = new Date();
  }
  public DBApiProjects(long projectId, long apiId, Date registeredAt) {
    this.projectId = projectId;
    this.apiId  = apiId;
    this.registeredAt = registeredAt;
  }
}
