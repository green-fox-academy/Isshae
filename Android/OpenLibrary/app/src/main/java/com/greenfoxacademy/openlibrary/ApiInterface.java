package com.greenfoxacademy.openlibrary;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

  @Headers({"Content-Type: application/json", "Accept: application/json"})
  @GET("/search.json")
  Call<Book> getBooks(@Query(value = "author") String author);

  @Headers({"Content-Type: application/json", "Accept: application/json"})
  @GET("/subjects/{subject}.json")
  Call<Book> getBooksBySubject(@Path(value = "subject") String subject);
}
