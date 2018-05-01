package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="licenses")
public class DBLicense implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2841357408075966160L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="licenseId")
  private Long licenseId;

  @Column(name="license")
  private String license;


  /* Constructor */
  public DBLicense() {}

}
