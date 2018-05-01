package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="user_roles")
public class DBUserRole implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 2736765237595446408L;

  @Id
  @Column(name="userId")
  private Long userId;

  @Id
  @Column(name="roleId")
  private Long roleId;


  /* Constructor */
  public DBUserRole() {}
  public DBUserRole(long userId, long roleId) {
    this.userId=userId;
    this.roleId=roleId;
  }

}
