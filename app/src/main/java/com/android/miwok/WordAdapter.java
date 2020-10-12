package com.android.miwok;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
int mCOlorId;
    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int number) {
        super(context,0, words);
        this.mCOlorId=number;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_list_item,parent,false);
        }
        Word currentWord =getItem(position);
        TextView miwokTextView =listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);


        miwokTextView.setText(currentWord.getMiwokTranslation());
        defaultTextView.setText(currentWord.getDefaultTranslation());
        ImageView image = listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImage());
        }
        else
        {
            image.setVisibility(View.GONE);
        }
        int color = ContextCompat.getColor(getContext(),mCOlorId);
        RelativeLayout subLayout= listItemView.findViewById(R.id.sub_layout);
        subLayout.setBackgroundColor(color);
        return listItemView;
    }
}
