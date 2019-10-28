package com.psb.bitsandpizzas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)
        setSupportActionBar(findViewById(R.id.toolBar))
        val ActionBar = supportActionBar
        ActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
