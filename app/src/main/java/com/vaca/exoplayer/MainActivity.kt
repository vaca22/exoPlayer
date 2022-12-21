package com.vaca.exoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = ExoPlayer.Builder(this).build()
        val mediaItem: MediaItem = MediaItem.fromUri("http://vaca.vip:8888/ga.webm")

        player.setMediaItem(mediaItem)
        player.prepare();
        player.play()
    }
}