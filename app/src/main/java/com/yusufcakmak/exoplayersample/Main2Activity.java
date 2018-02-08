package com.yusufcakmak.exoplayersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.exoplayer2.ui.SimpleExoPlayerView;

public class Main2Activity extends AppCompatActivity {

    private SimpleExoPlayerView playerView;
    private PlayerManager player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        playerView = (SimpleExoPlayerView) findViewById(R.id.player_view);
        player = new PlayerManager(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        player.init(this, playerView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        player.reset();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.release();
    }
}
