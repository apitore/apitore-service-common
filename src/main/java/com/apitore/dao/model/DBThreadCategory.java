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
@Table(name="thread_categories")
public class DBThreadCategory implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -6657689380368247017L;

  @Id
  @Column(name="threadId")
  private Long threadId;

  @Id
  @Column(name="categoryId")
  private Long categoryId;

  @OneToOne
  @JoinColumn(name="categoryId", insertable=false, updatable=false)
  private DBCategory category;

  @ManyToOne
  @JoinColumn(name="threadId", insertable=false, updatable=false)
  private DBThread thread;


  /* Constructor */
  public DBThreadCategory() {}
  public DBThreadCategory(Long threadId, Long categoryId) {
    this.threadId=threadId;
    this.categoryId=categoryId;
  }


  /* Getter, setter */

  public Long getThreadId() {
    return this.threadId;
  }
  public void setThreadId(Long value) {
    this.threadId = value;
  }

  public Long getCategoryId() {
    return this.categoryId;
  }
  public void setCategoryId(Long value) {
    this.categoryId = value;
  }

  public DBCategory getCategory() {
    return this.category;
  }
  public void setCategory(DBCategory value) {
    this.category = value;
  }

  public DBThread getThread() {
    return this.thread;
  }
  public void setThread(DBThread value) {
    this.thread = value;
  }

}
