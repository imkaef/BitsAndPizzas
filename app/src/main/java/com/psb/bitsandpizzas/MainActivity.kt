package com.psb.bitsandpizzas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionProvider
import android.view.View
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.ShareActionProvider
import androidx.core.view.MenuItemCompat
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
       // val menuItem = menu?.findItem(R.id.action_share)
     /*   val myshareActionProvider =  MenuItemCompat.getActionProvider(menuItem)as ShareActionProvider
        setShareActionIntent("Pizza EBat'",myshareActionProvider)*/
        return super.onCreateOptionsMenu(menu)
    }

  /*  private fun setShareActionIntent(text:String, msh:ShareActionProvider){
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,text)
        msh.setShareIntent(intent)
    }
   */ override fun onOptionsItemSelected(item: MenuItem): Boolean {

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
