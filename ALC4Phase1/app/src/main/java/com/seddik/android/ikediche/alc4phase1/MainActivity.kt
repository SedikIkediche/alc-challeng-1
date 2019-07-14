package com.seddik.android.ikediche.alc4phase1

import android.content.Intent
import android.os.Bundle
import android.view.View.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        container.systemUiVisibility = SYSTEM_UI_FLAG_LAYOUT_STABLE or SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

        profile_button.setOnClickListener {
            val profileIntent = Intent(this,ProfileActivity::class.java)
            startActivity(profileIntent)
        }

        about_alc_button.setOnClickListener {
            val aboutAlcIntent = Intent(this,AboutAlcActivity::class.java)
            startActivity(aboutAlcIntent)
        }
    }
}

