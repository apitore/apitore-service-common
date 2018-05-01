package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Data
@Entity
@Table(name="update_data")
public class DBUpdateData implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -246070365463806114L;

  @Id
  @Column(name="id")
  private Integer id;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="lastUpdatedAt")
  private Date lastUpdatedAt;


  /* Constructor */
  public DBUpdateData(){}
  public DBUpdateData(Integer id) {
    this.id = id;
    this.lastUpdatedAt = new Date();
  }

}
