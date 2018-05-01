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
@Table(name="user_projects")
public class DBUserProjects implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 236742263334253648L;

  @Id
  @GeneratedValue
  @Column(name="projectId")
  private Long projectId;

  @Column(name="userId")
  private Long userId;

  @Column(name="title")
  private String title;

  @Column(name="description")
  private String description;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="registeredAt")
  private Date registeredAt;

  @Column(name="open")
  private Boolean open=false;


  /* Constructor */
  public DBUserProjects() {
  }
  public DBUserProjects(long projectId, long userId) {
    this.projectId = projectId;
    this.userId = userId;
    this.title = null;
    this.description = null;
    this.open = null;
    this.registeredAt = null;
  }
  public DBUserProjects(long userId, String title, String description, boolean open) {
    this.userId = userId;
    this.title = title;
    this.description = description;
    this.open = open;
    this.registeredAt = new Date();
  }

}