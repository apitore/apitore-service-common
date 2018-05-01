package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="users")
public class DBUser implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3911104739490836456L;

  @Id
  @GeneratedValue
  @Column(name="id")
  private Long id;

  @Column(name="username")
  private String username;

  @Column(name="password")
  private String password;

  @Column(name="activated")
  private Boolean activated;

  @Column(name="enabled")
  private Boolean enabled;

  @Column(name="accountNonExpired")
  private Boolean accountNonExpired;

  @Column(name="credentialsNonExpired")
  private Boolean credentialsNonExpired;

  @Column(name="accountNonLocked")
  private Boolean accountNonLocked;

  @OneToOne(cascade=CascadeType.ALL)
  @JoinTable(name="user_roles",
      joinColumns={@JoinColumn(name="userId",referencedColumnName="id")},
      inverseJoinColumns={@JoinColumn(name="roleId", referencedColumnName="id")}
  )
  private DBRole role;

}
