package com.examples.miwok.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.examples.miwok.R;
import com.examples.miwok.model.Word;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> wordList;
    int color;
    MediaPlayer mediaPlayer;

    public WordAdapter(Context context, ArrayList<Word> wordList, int color) {
        super(context, 0, wordList);
        this.wordList = wordList;
        this.color = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

            TextView tv_Miwok = v.findViewById(R.id.tv_miwok);
            TextView tv_Number = v.findViewById(R.id.tv_number);
            ImageView imageView = v.findViewById(R.id.image);
            LinearLayout linearLayout = v.findViewById(R.id.linear_text);
            ImageView im_Play = v.findViewById(R.id.imagePlay);

            Word word = wordList.get(position);
            tv_Miwok.setText(word.getmMiwokTranslation());
            tv_Number.setText(word.getmDefaultTranslation());
            im_Play.setOnClickListener(view -> {
                mediaPlayer = MediaPlayer.create(parent.getContext(), word.getmAudioRuceorsesId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });
            });

            if (word.hasImage()) {
                imageView.setImageResource(word.getmImgeRucersesId());
            } else {
                imageView.setVisibility(View.GONE);
            }

            linearLayout.setBackgroundColor(color);
        }


        return v;
    }

    private void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;

        }
    }
}
