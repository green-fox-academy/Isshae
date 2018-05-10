package com.greenfoxacademy.openlibrary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

  private Book oneBook;

  public RecyclerAdapter(Book oneBook) {
    this.oneBook = oneBook;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
    return new MyViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    holder.title.setText(oneBook.getDocs().get(position).getTitle());
  }

  @Override
  public int getItemCount() {
    return 10;
  }

  public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView  title;

    public MyViewHolder(View itemView) {
      super(itemView);
      title = (TextView) itemView.findViewById(R.id.title);
    }
  }
}
