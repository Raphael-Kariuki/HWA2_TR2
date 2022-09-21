package ren.tianh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linear = findViewById<MaterialButton>(R.id.linearLayout)
        val constraintLayout = findViewById<MaterialButton>(R.id.constraintLayout)
        val cardView = findViewById<MaterialButton>(R.id.cardView)
        val quit = findViewById<MaterialButton>(R.id.quit)


    }


}


