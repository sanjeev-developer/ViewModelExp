package com.viewmodelexp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.viewmodelexp.model.SaveConfig
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vobj = ViewModelProvider(this).get(SaveConfig::class.java)
        textView.text = vobj.incre.toString()
      button.setOnClickListener{
          vobj.upgrade()
         textView.text = vobj.incre.toString()
      }
    }
}