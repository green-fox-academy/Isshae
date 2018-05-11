package com.greenfoxacademy.openlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchBySubjectActivity extends AppCompatActivity {

  private RecyclerView recyclerView;
  private RecyclerView.LayoutManager layoutManager;
  private RecyclerAdapter adapter;
  private Book oneBook;
  private ApiInterface apiInterface;
  private String selectedType = "";


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search_by_subject);
  }

  public void searchBySubject(View view) {
    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    final RadioButton sciFi = (RadioButton) findViewById(R.id.sci_fi);
    final RadioButton horror = (RadioButton) findViewById(R.id.horror);
    final RadioButton fiction = (RadioButton) findViewById(R.id.fiction);

    if (horror.isChecked()) {
      selectedType = horror.getText().toString();
    } else if (fiction.isChecked()) {
      selectedType = fiction.getText().toString();
    } else {
      selectedType = sciFi.getText().toString();
    }

    recyclerView = (RecyclerView) findViewById(R.id.recyclerView2);
    layoutManager = new LinearLayoutManager(this);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setHasFixedSize(true);

    apiInterface = ApiClient.getApiClient().
            create(ApiInterface.class);

    Call<Book> call = apiInterface.getBooksBySubject(selectedType);
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
        System.out.println("hiba");
        System.out.println(t);
      }
    });
  }
}
