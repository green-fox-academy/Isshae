package com.greenfoxacademy.openlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

  }

  public void searchByAuthor(View view) {
    Intent intent = new Intent(this, SearchByAuthorActivity.class);
    startActivity(intent);
  }
  public void searchBySubjectActivity(View view) {
    Intent intent = new Intent(this, SearchBySubjectActivity.class);
    startActivity(intent);
  }

}
