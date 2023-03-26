package com.example.megaui;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartHolder> {


//    public ArrayList<String> cartItems;

//    public CartAdapter(ArrayList<String> arrayList){
//        this.cartItems = arrayList;
//    }
    @NonNull
    @Override
    public CartHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cart_item,parent,false);
        return new CartHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull CartHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
//        return cartItems.size();
        return 10;
    }

    static class CartHolder extends RecyclerView.ViewHolder{

        TextView textView;
        public CartHolder(@NonNull View itemView) {
            super(itemView);
//            textView = itemView.findViewById(R.id.tv);
        }
    }

}
