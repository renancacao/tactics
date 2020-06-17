package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import com.rcacao.tactics.teambuild.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TeamBuilderActivity : FullScreenActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_builder)
    }

}
