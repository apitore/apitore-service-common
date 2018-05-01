package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="users")
public class DBUserSimple implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 6937035506262987795L;

  @Id
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


  /* Constructor */
  public DBUserSimple() {}
  public DBUserSimple(long id, String username, String password) {
    this.id=id;
    this.username=username;
    this.password=password;
    this.activated=true;
    this.enabled=true;
    this.accountNonExpired=true;
    this.credentialsNonExpired=true;
    this.accountNonLocked=true;
  }
  public DBUserSimple(DBUser user) {
    this.id=user.getId();
    this.username=user.getUsername();
    this.password=user.getPassword();
    this.activated=user.getActivated();
    this.enabled=user.getEnabled();
    this.accountNonExpired=user.getAccountNonExpired();
    this.credentialsNonExpired=user.getCredentialsNonExpired();
    this.accountNonLocked=user.getAccountNonLocked();
  }

}
