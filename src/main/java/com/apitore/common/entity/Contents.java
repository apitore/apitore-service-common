package com.apitore.common.entity;

import java.util.List;

import com.apitore.dao.model.DBApi;


public class Contents {
  private String title;
  private String link;
  private List<DBApi> list;

  public Contents (String title, String link, List<DBApi> list) {
    this.title = title;
    this.link = link;
    this.list = list;
  }

  public String getTitle() {
    return this.title;
  }
  public void setTitle(String value) {
    this.title = value;
  }

  public String getLink() {
    return this.link;
  }
  public void setLink(String value) {
    this.link = value;
  }

  public List<DBApi> getList() {
    return this.list;
  }
  public void setList(List<DBApi> value) {
    this.list = value;
  }
}