package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.rcacao.tactics.teambuild.R
import kotlinx.android.synthetic.main.activity_team_builder.*

class TeamBuilderActivity : AppCompatActivity() {

    private val soldierAdapter = SoldierAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_builder)

        soldierRecyclerView.layoutManager = GridLayoutManager(this, 4)
        soldierRecyclerView.adapter = soldierAdapter
    }
}
