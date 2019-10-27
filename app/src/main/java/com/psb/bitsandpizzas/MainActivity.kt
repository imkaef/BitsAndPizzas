package com.psb.bitsandpizzas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolBar))
        jul.setOnClickListener {
            val int12 = Intent(this,OrderActivity::class.java)
            startActivity(int12)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

            when (item.itemId){
                R.id.action_create_order -> {
                    val intent = Intent(this, OrderActivity::class.java)
                    startActivity(intent)
                }
                else -> return super.onOptionsItemSelected(item)
            }
        return super.onOptionsItemSelected(item)
    }
}
