package com.rhinotrivaldi.eduwaste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.rhinotrivaldi.eduwaste.adapter.TabViewAdapter
import com.rhinotrivaldi.eduwaste.fragment.InformasiFragment
import com.rhinotrivaldi.eduwaste.fragment.MateriFragment
import com.rhinotrivaldi.eduwaste.fragment.PeraturanFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var doubleBackToExitPressedOnce: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tbMenu)
        val actionBar = supportActionBar
        actionBar?.title = "EduWaste"


        val adapter = TabViewAdapter(
            supportFragmentManager
        )
        adapter.setData(MateriFragment(), "Materi LB3")
        adapter.setData(PeraturanFragment(), "Peraturan")
        adapter.setData(InformasiFragment(), "Informasi")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)

    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_layout, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemSelected: Int) {
        when (itemSelected) {
            R.id.menuUp -> {
                val about = Intent(this, AboutActivity::class.java)
                startActivity(about)
            }
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            finish()
            return
        }
        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 2000)
    }

}
