package com.gehad.math_2

import android.app.Dialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
import android.widget.VideoView
import kotlinx.android.synthetic.main.activity_forth_1.*

class forth_Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth_1)

        val play_btn = findViewById<Button>(R.id.play_btn)
        val pause_btn = findViewById<Button>(R.id.pause_btn)
        val my_video =findViewById<VideoView>(R.id.my_video)

        val video_uri = Uri.parse("android.resource://"+packageName+ "/" + R.raw.gb10 )
        my_video.setVideoURI(video_uri)

        play_btn.setOnClickListener(){

            my_video.start()
        }

        pause_btn.setOnClickListener(){

            my_video.pause()
        }
            }



        }

