package com.rhinotrivaldi.eduwaste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.tvLimbahDetail
import kotlinx.android.synthetic.main.layout_materi.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_GAMBAR = "extra_gambar"
        const val EXTRA_NAMA_LIMBAH = "extra_nama_limbah"
        const val EXTRA_DETAIL_LIMBAH = "extra_detail_limbah"
        const val EXTRA_DETAIL_PENGELOLAAN = "extra_detail_pengelolaan"
        const val EXTRA_KODE_LIMBAH = "extra_kode_limbah"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initActionBar()

        val tGambar = intent.getIntExtra(EXTRA_GAMBAR, 0)
        val tNamalimbah = intent.getStringExtra(EXTRA_NAMA_LIMBAH)
        val tDetaillimbah = intent.getStringExtra(EXTRA_DETAIL_LIMBAH)
        val tDetailpengelolaan = intent.getStringExtra(EXTRA_DETAIL_PENGELOLAAN)
        val tKodelimbah = intent.getStringExtra(EXTRA_KODE_LIMBAH)

        Glide.with(this)
            .load(tGambar)
            .apply(RequestOptions())
            .into(ivGambarLimbah)
        tvLimbah.text = tNamalimbah
        tvLimbahDetail.text = tDetaillimbah
        tvDetailPengelolaan.text = tDetailpengelolaan
        tvKodeLimbah.text = tKodelimbah

    }

    private fun initActionBar() {
        val detail = intent.getStringExtra(EXTRA_NAMA_LIMBAH)
        tvLimbah.text = detail
        setSupportActionBar(tbDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""+ detail
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
