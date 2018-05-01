package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="api_details")
public class DBApiDetails implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3188859001360332670L;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Column(name="description")
  private String description;

  @Column(name="usages")
  private String usages;

  @Column(name="url")
  private String url;

  @Column(name="version")
  private String version;

  @Column(name="updateInfo")
  private String updateInfo;

  @Column(name="endpoint")
  private String endpoint;

  @Column(name="numTrial")
  private Long numTrial;

  @Column(name="aveCpuCost")
  private Long aveCpuCost=0L;

  @Column(name="numCalledThis")
  private Long numCalledThis=0L;

  @Column(name="numCalledAll")
  private Long numCalledAll=0L;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="lastUpdatedAt")
  private Date lastUpdatedAt;

  @OneToOne
  @JoinColumn(name="apiId", insertable=false, updatable=false)
  private DBApi apiInfo;

  @OneToMany(fetch = FetchType.EAGER, mappedBy="apiDetails")
  private Set<DBApiCategory> categories;


  /* Constructor */
  public DBApiDetails() {}
  public DBApiDetails(Long apiId, String description, String usages, String url) {
    this.apiId = apiId;
    this.description = description;
    this.usages = usages;
    this.url = url;
    this.version = "1.0.0";
    this.updateInfo = "";
    this.endpoint = "We are getting ready.";
    this.numTrial = 0L;
    this.lastUpdatedAt = new Date();
  }


  public void addNumCalledThis() {
    this.numCalledThis++;
  }
  public void addNumCalledAll() {
    this.numCalledAll++;
  }

}
