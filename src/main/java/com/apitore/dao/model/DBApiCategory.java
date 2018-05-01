package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="api_categories")
public class DBApiCategory implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -5249640628283586072L;

  @Id
  @Column(name="apiId")
  private Long apiId;

  @Id
  @Column(name="categoryId")
  private Long categoryId;

  @Column(name="locked")
  private Boolean locked=false;

  @OneToOne
  @JoinColumn(name="categoryId", insertable=false, updatable=false)
  private DBCategory category;

  @ManyToOne
  @JoinColumn(name="apiId", insertable=false, updatable=false)
  private DBApiDetails apiDetails;


  /* Constructor */
  public DBApiCategory() {}
  public DBApiCategory(Long apiId, Long categoryId) {
    this.apiId=apiId;
    this.categoryId=categoryId;
  }
  public DBApiCategory(Long apiId, Long categoryId, Boolean locked) {
    this.apiId=apiId;
    this.categoryId=categoryId;
    this.locked=locked;
  }


  /* Getter, setter */

  public Long getApiId() {
    return this.apiId;
  }
  public void setApiId(Long value) {
    this.apiId = value;
  }

  public Long getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(Long value) {
    this.categoryId = value;
  }

  public Boolean isLocked() {
    return this.locked;
  }
  public void setLocked(Boolean value) {
    this.locked = value;
  }

  public DBCategory getCategory() {
    return this.category;
  }
  public void setCategory(DBCategory value) {
    this.category = value;
  }

  public DBApiDetails getApiDetails() {
    return this.apiDetails;
  }
  public void setApiDetails(DBApiDetails value) {
    this.apiDetails = value;
  }

}
