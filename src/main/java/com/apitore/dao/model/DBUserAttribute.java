package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="user_attributes")
public class DBUserAttribute implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 7839705339782757734L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Column(name="numFollows")
  private Long numFollows=0L;

  @Column(name="numFollowers")
  private Long numFollowers=0L;

  @Column(name="numDeveloped")
  private Long numDeveloped=0L;

  @OneToOne
  @JoinColumn(name="userId", insertable=false, updatable=false)
  private DBUserInfo userInfo;


  /* Constructor */
  public DBUserAttribute() {}
  public DBUserAttribute(Long userId) {
    this.userId = userId;
  }


  public void addNumFollows() {
    this.numFollows++;
  }
  public void subNumFollows() {
    this.numFollows--;
  }

  public void addNumFollowers() {
    this.numFollowers++;
  }
  public void subNumFollowers() {
    this.numFollowers--;
  }

  public void addNumDeveloped() {
    this.numDeveloped++;
  }

}
