package com.rhinotrivaldi.eduwaste

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        initActionBar()
        initPhotoProfile()
        photoClick()
    }

    private fun photoClick() {
        photoProfile.setOnClickListener {
            intent = Intent(this, PopUpActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initPhotoProfile() {
        val photoProfile: ImageView = findViewById(R.id.photoProfile)
        val photo = RequestOptions()
            .placeholder(R.drawable.profile_picture)

        Glide.with(this)
            .load(photo)
            .apply(photo)
            .into(photoProfile)
    }

    private fun initActionBar() {
        setSupportActionBar(tbAbout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Profil"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
