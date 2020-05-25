package com.rcacao.tactics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rcacao.tactics.teambuild.view.ui.TeamBuilderActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, TeamBuilderActivity::class.java)
        startActivity(intent)

    }
}
