package com.greenfoxacademy.openlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchByAuthorActivity extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private RecyclerAdapter adapter;
  private Book oneBook;
  private ApiInterface apiInterface;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_by_author);
  }

  public void searchByAuthor(View view) {

    EditText editText = (EditText) findViewById(R.id.editText);
    String search = editText.getText().toString();

    recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    apiInterface = ApiClient.getApiClient().
            create(ApiInterface.class);

    Call<Book> call = apiInterface.getBooks(search);
    call.enqueue(new Callback<Book>()

    {
      @Override
      public void onResponse(Call<Book> call, Response<Book> response) {
        oneBook = response.body();
        adapter = new RecyclerAdapter(oneBook);
        recyclerView.setAdapter(adapter);
      }

      @Override
      public void onFailure(Call<Book> call, Throwable t) {
        System.out.println("hiba2");
        System.out.println(t);
      }
    });
  }
}


