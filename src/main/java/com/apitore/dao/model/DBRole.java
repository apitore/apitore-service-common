package com.apitore.dao.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="roles")
public class DBRole implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3623906499914551862L;

  @Id
  @GeneratedValue
  @Column(name="id")
  private Integer id;

  @Column(name="role")
  private String role;

  @OneToMany(cascade=CascadeType.ALL)
  @JoinTable(name="user_roles",
      joinColumns={@JoinColumn(name="roleId", referencedColumnName="id")},
      inverseJoinColumns={@JoinColumn(name="userId", referencedColumnName="id")}
  )
  private Set<DBUser> userRoles;

}
