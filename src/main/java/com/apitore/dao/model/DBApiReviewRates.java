package com.apitore.dao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="api_review_rates")
public class DBApiReviewRates implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -7982893813844089115L;

  @Id
  @Column(name="apiId")
  private Long apiId;

  /* For this version */
  @Column(name="numReviewThis")
  private Long numReviewThis=0L;

  @Column(name="rateThis")
  private Integer rateThis=0;

  @Column(name="numFiveThis")
  private Long numFiveThis=0L;

  @Column(name="numFourThis")
  private Long numFourThis=0L;

  @Column(name="numThreeThis")
  private Long numThreeThis=0L;

  @Column(name="numTwoThis")
  private Long numTwoThis=0L;

  @Column(name="numOneThis")
  private Long numOneThis=0L;

  @Column(name="percentFiveThis")
  private Integer percentFiveThis=0;

  @Column(name="percentFourThis")
  private Integer percentFourThis=0;

  @Column(name="percentThreeThis")
  private Integer percentThreeThis=0;

  @Column(name="percentTwoThis")
  private Integer percentTwoThis=0;

  @Column(name="percentOneThis")
  private Integer percentOneThis=0;

  /* For all version */
  @Column(name="numReviewAll")
  private Long numReviewAll=0L;

  @Column(name="rateAll")
  private Integer rateAll=0;

  @Column(name="numFiveAll")
  private Long numFiveAll=0L;

  @Column(name="numFourAll")
  private Long numFourAll=0L;

  @Column(name="numThreeAll")
  private Long numThreeAll=0L;

  @Column(name="numTwoAll")
  private Long numTwoAll=0L;

  @Column(name="numOneAll")
  private Long numOneAll=0L;

  @Column(name="percentFiveAll")
  private Integer percentFiveAll=0;

  @Column(name="percentFourAll")
  private Integer percentFourAll=0;

  @Column(name="percentThreeAll")
  private Integer percentThreeAll=0;

  @Column(name="percentTwoAll")
  private Integer percentTwoAll=0;

  @Column(name="percentOneAll")
  private Integer percentOneAll=0;


  /* Constructor */
  public DBApiReviewRates() {}
  public DBApiReviewRates(Long apiId) {
    this.apiId = apiId;
  }

}
