package com.example.esthefanielanza.starwars.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.esthefanielanza.starwars.R;
import com.example.esthefanielanza.starwars.model.Character;
import com.example.esthefanielanza.starwars.viewholder.CharViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by esthefanie-note on 25/06/17.
 */

public class charAdapter extends RecyclerView.Adapter<CharViewHolder> {

    List<Character> currentList;
    Context context;

    public charAdapter(List<Character> currentList, Context context){
        this.currentList = currentList;
        this.context = context;
    }

    @Override
    public CharViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        return new CharViewHolder(v);
    }

    @Override
    public void onBindViewHolder(CharViewHolder holder, int position) {
        Character current = currentList.get(position);

//        holder.charAvatar.setImageResource(getPhoto(position));
        Picasso.with(context)
                .load(getPhoto(position))
                .into(holder.charAvatar);

        holder.charName.setText(current.getName());
        holder.charBirth.setText(current.getBirth_year());
        holder.charGender.setText(current.getGender());
    }

    @Override
    public int getItemCount() {
        return currentList.size();
    }

    public int getPhoto(int position){
        int photo;
        switch (position) {
            case 0:
                photo = R.drawable.luke_skywalker;
                break;
            case 1:
                photo = R.drawable.c3po;
                break;
            case 2:
                photo = R.drawable.r2d2;
                break;
            case 3:
                photo = R.drawable.darth_vader;
                break;
            case 4:
                photo = R.drawable.leia_organa;
                break;
            case 5:
                photo = R.drawable.owen_lars;
                break;
            case 6:
                photo = R.drawable.beru_lars;
                break;
            case 7:
                photo = R.drawable.r5d4;
                break;
            case 8:
                photo = R.drawable.biggs;
                break;
            case 9:
                photo = R.drawable.obi_wan;
                break;
            default:
                photo = R.drawable.darth_vader;
                break;

        }
        return photo;
    }
}

