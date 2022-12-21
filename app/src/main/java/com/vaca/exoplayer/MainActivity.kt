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
        val mediaItem: MediaItem = MediaItem.Builder()
            .setUri("http://stream.eudic.net/fr_rfimonde.webm?agent=%2feusoft_ting_fr_android%2f10.4.3%2fc36080d41a2b4161%2f%2f%2f&token=QYN+eyJ0b2tlbiI6IiIsInVzZXJpZCI6IiIsInVybHNpZ24iOiJZY0RuVzlOT0FGaGFHckdjZzFUS3MwaXY2eDg9IiwidCI6IkFCSU1UWTVNVFF3T1RFMk5nPT0ifQ%3d%3d&stamp=638072140553023803")
            .build()

        player.setMediaItem(mediaItem)
        player.prepare();
        player.play()
    }
}