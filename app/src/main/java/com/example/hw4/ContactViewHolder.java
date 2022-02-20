package com.example.hw4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.contact);
    }
}
