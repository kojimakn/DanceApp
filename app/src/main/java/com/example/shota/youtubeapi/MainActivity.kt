package com.example.shota.youtubeapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val API_KEY = "AIzaSyCnp0lE676QiAnFmo7r5iirmVKPnw87cCE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reproducirId.setOnClickListener(View.OnClickListener {
            val intent=YouTubeStandalonePlayer.createVideoIntent(this,API_KEY,"n_wCTTyZsLI")
            startActivity(intent)
        })
    }
}
