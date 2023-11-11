package com.example.video_player

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.net.Uri.*
import android.widget.VideoView
import android.widget.MediaController
import androidx.navigation.ui.AppBarConfiguration
import com.example.video_player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)

        val videoView = findViewById<VideoView>(binding.testview.id)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val uri: Uri = parse(
            "android.resource://" + packageName  + "/raw/test"
        )
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()




    }


}