package com.vaca.exoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MainActivity : AppCompatActivity() {
    val x2="http://stream.eudic.net/fr_franceculture.mp3?agent=%2feusoft_ting_fr_android%2f10.4.3%2fc36080d41a2b4161%2f%2f%2f&token=QYN+eyJ0b2tlbiI6IiIsInVzZXJpZCI6IiIsInVybHNpZ24iOiJYUGI1aW5mNW5ueUpJdTMxS05kZ0pkdUZXV289IiwidCI6IkFCSU1UWTVNVFF4TWpVeU5RPT0ifQ%3d%3d&stamp=638072174135316410"
    val x3="http://stream.eudic.net/en_fox.webm?agent=%2feusoft_ting_en_android%2f10.4.5%2fc36080d41a2b4161%2f%2f%2f&token=QYN+eyJ0b2tlbiI6IiIsInVzZXJpZCI6IiIsInVybHNpZ24iOiI2bjZ5c0xUTE9nZ0FjWGNTK09rU2JrYlVzUE09IiwidCI6IkFCSU1UWTVNVFF4TXpRd053PT0ifQ%3d%3d&stamp=638072182957791223"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = ExoPlayer.Builder(this).build()
        val mediaItem: MediaItem = MediaItem.Builder()
            .setUri(x3)
            .setMimeType("audio/webm")
            .build()

        player.setMediaItem(mediaItem)
        player.prepare();
        player.play()
    }
}