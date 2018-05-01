package com.apitore.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Where;

import lombok.Data;


@Data
@Entity
@Table(name="categories")
public class DBCategory implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1942754336892391630L;

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="categoryId")
  private Long categoryId;

  @Column(name="category")
  private String category;

  @Column(name="visible")
  private Boolean visible=true;

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="api_categories",
      joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
      inverseJoinColumns={@JoinColumn(name="apiId", referencedColumnName="apiId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("rateNumReview DESC")
  private List<DBApi> topRatedList = new ArrayList<DBApi>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="api_categories",
      joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
      inverseJoinColumns={@JoinColumn(name="apiId", referencedColumnName="apiId")})
  @Where(clause = "royalty=0 and enabled=1")
  @BatchSize(size=20)
  @OrderBy("numCalled DESC")
  private List<DBApi> mostCalledFreeList = new ArrayList<DBApi>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="api_categories",
      joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
      inverseJoinColumns={@JoinColumn(name="apiId", referencedColumnName="apiId")})
  @Where(clause = "royalty<>0 and enabled=1")
  @BatchSize(size=20)
  @OrderBy("numCalled DESC")
  private List<DBApi> mostCalledPaidList = new ArrayList<DBApi>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="api_categories",
      joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
      inverseJoinColumns={@JoinColumn(name="apiId", referencedColumnName="apiId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("registeredAt DESC")
  private List<DBApi> recentlyAddedList = new ArrayList<DBApi>();


  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="thread_categories",
    joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
    inverseJoinColumns={@JoinColumn(name="threadId", referencedColumnName="threadId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("registeredAt DESC")
  private List<DBThread> registeredAtThread = new ArrayList<DBThread>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="thread_categories",
    joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
    inverseJoinColumns={@JoinColumn(name="threadId", referencedColumnName="threadId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("updatedAt DESC")
  private List<DBThread> updatedAtThread = new ArrayList<DBThread>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="thread_categories",
    joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
    inverseJoinColumns={@JoinColumn(name="threadId", referencedColumnName="threadId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("numWant DESC")
  private List<DBThread> numWantThread = new ArrayList<DBThread>();

  @OneToMany(fetch = FetchType.LAZY)
  @JoinTable(name="thread_categories",
    joinColumns={@JoinColumn(name="categoryId", referencedColumnName="categoryId")},
    inverseJoinColumns={@JoinColumn(name="threadId", referencedColumnName="threadId")})
  @Where(clause = "enabled=1")
  @BatchSize(size=20)
  @OrderBy("numGood DESC")
  private List<DBThread> numGoodThread = new ArrayList<DBThread>();



  /* Constructor */
  public DBCategory() {}
  public DBCategory(String category) {
    this.category = category;
  }

}
