package com.greenfoxacademy.openlibrary;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Doc {

  @SerializedName("author_name")
  private List<String> authorName;

  private String title;

  public List<String> getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public Doc(List<String> authorName, String title) {
    this.authorName = authorName;
    this.title = title;
  }

  public Doc() {
  }
}
