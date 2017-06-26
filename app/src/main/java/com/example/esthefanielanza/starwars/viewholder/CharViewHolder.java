package com.example.esthefanielanza.starwars.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.esthefanielanza.starwars.R;

/**
 * Created by esthefanie-note on 25/06/17.
 */

public class CharViewHolder extends RecyclerView.ViewHolder {

    public ImageView charAvatar;
    public TextView charName, charBirth, charGender;

    public CharViewHolder(View itemView) {
        super(itemView);
        this.charAvatar = (ImageView) itemView.findViewById(R.id.avatar);
        this.charName = (TextView) itemView.findViewById(R.id.name_content);
        this.charBirth = (TextView) itemView.findViewById(R.id.birthday_content);
        this.charGender = (TextView) itemView.findViewById(R.id.gender_content);
    }
}
