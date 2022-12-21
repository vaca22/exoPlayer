package com.vaca.exoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem


class MainActivity : AppCompatActivity() {
    val x2="http://stream.eudic.net/fr_franceculture.mp3?agent=%2feusoft_ting_fr_android%2f10.4.3%2fc36080d41a2b4161%2f%2f%2f&token=QYN+eyJ0b2tlbiI6IiIsInVzZXJpZCI6IiIsInVybHNpZ24iOiJYUGI1aW5mNW5ueUpJdTMxS05kZ0pkdUZXV289IiwidCI6IkFCSU1UWTVNVFF4TWpVeU5RPT0ifQ%3d%3d&stamp=638072174135316410"
    val x3="http://stream.eudic.net/en_fox.webm?agent=%2feusoft_ting_en_android%2f10.4.5%2fc36080d41a2b4161%2f%2f%2f&token=QYN+eyJ0b2tlbiI6IiIsInVzZXJpZCI6IiIsInVybHNpZ24iOiI2bjZ5c0xUTE9nZ0FjWGNTK09rU2JrYlVzUE09IiwidCI6IkFCSU1UWTVNVFF4TXpRd053PT0ifQ%3d%3d&stamp=638072182957791223"
    val npr="https://npr-ice.streamguys1.com/live.mp3"
    val nwpr="http://ett-ts02.ett.wsu.edu:8000/NWPRNEWS"
    val nwpr2="http://ett-ts02.ett.wsu.edu:8000/NWPRCLASSICAL"
    val nwprjaz="http://ett-ts02.ett.wsu.edu:8000/NWPRKJEM"

//Voice of America
    val voa="http://voa-28.akacast.akamaistream.net/7/54/322040/v1/ibb.akacast.akamaistream.net/voa-28"


//CNN CNNI Simulcast (Atlanta GA)
    val cnn="http://tunein.streamguys1.com/cnn"

    //CNN Radio USA Live Online
    val cnn2="http://crystalout.surfernetwork.com:8001/KFNX_MP3"

//FOX News Talk (US) [Stereo AAC|amazonaws.com]
    val fox1="http://23.22.214.193/foxnewsradio-foxnewsaac-ibc2?session-id=79135571&source=TuneIn"

//CBS2 880AM (New York US)
    val cbs1="http://5883.live.streamtheworld.com/WCBSAMAAC?streamtheworld_user=1&SRC=CBS&DIST=CBS&TGT=CBSLocalWebPlayer"


//BBC World Service Online (UK)
    val bbc1="http://bbcwssc.ic.llnwd.net/stream/bbcwssc_mp1_ws-eieuk"

//BBC Radio 5 Live
    val bbc_radio1="http://open.live.bbc.co.uk/mediaselector/5/redir/version/2.0/mediaset/http-icy-mp3-a-stream/proto/http/vpid/bbc_radio_five_live"

//BBC Radio 4 FM (DAB)
    val bbc2="http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio4fm_mf_p?s=1454545804&e=1454560204&h=7efd244b5682d24bf2303c6715daa4ab"

    //BBC Radio 4 LW (LW)
    val bbc3="http://open.live.bbc.co.uk/mediaselector/5/redir/version/2.0/mediaset/http-icy-mp3-a-stream/proto/http/vpid/bbc_radio_fourlw"

//BBC Radio 4 Extra
    val bbc4="http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio4extra_mf_q?s=1454546062&e=1454560462&h=f8823508dd6f1f5061066e16c5e56b8d"

//BBC Radio 3
    val bbc5="http://a.files.bbci.co.uk/media/live/manifesto/audio/simulcast/hls/nonuk/low/ak/bbc_radio_three.m3u8"


    //LBC News
    val lbc="http://media-the.musicradio.com:80/LBC1152MP3Low"

// New Mexico Public Radio 89.1 FM
    val kanw="http://pubint.ic.llnwd.net/stream/pubint_kanw"

//WBHM (90.3 FM) University of Alabama (Birmingham AL-US)
    val nnn="http://audio.wbhm.org:8000/live.mp3"

    //# KQED belongs to the NPR family and offers news from California and the world. http://www.kqed.org/radio/listen/
    //#EXTINF:0,KQED Public Radio (San Francisco CA-US) [kqed.org]
    val kkk="http://streams.kqed.org/kqedradio"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player = ExoPlayer.Builder(this).build()
        val mediaItem: MediaItem = MediaItem.Builder()
            .setUri(voa)
            .build()

        player.setMediaItem(mediaItem)
        player.prepare();
        player.play()
    }
}