package com.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;



    private MediaPlayer.OnCompletionListener onCompletionListener =new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Numbers");
        setContentView(R.layout.word_list);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two", "otiika", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three", "tolooosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six", "temmoka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter =new WordAdapter(this,words, R.color.Number);
        ListView listView =findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word =words.get(position);
                releaseMediaPlayer();
                mediaPlayer =MediaPlayer.create(NumbersActivity.this,word.getAudioId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(onCompletionListener);
            }
        });
    }
    public void releaseMediaPlayer(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}