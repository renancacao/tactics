package com.rcacao.tactics.teambuild.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.rcacao.tactics.teambuild.R
import com.rcacao.tactics.teambuild.view.ui.adapter.SoldierAdapter
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderUiEvent
import com.rcacao.tactics.teambuild.view.viewmodel.TeamBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_soldiers_list.*

@AndroidEntryPoint
class SoldierListFragment : Fragment() {

    private val viewModel: TeamBuilderViewModel by activityViewModels()
    private lateinit var soldierAdapter: SoldierAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_soldiers_list, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soldierAdapter =
            SoldierAdapter(viewModel)
        soldierAdapter.setHasStableIds(true)
        soldierRecyclerView.layoutManager = GridLayoutManager(activity, 3)
        soldierRecyclerView.adapter = soldierAdapter
        initViewModelObserver()
    }

    private fun initViewModelObserver() {
        viewModel.event.observe(viewLifecycleOwner, Observer { event ->
            event.getContentIfNotHandled()?.let(this::handleEvent)
        })
    }

    private fun handleEvent(event: TeamBuilderUiEvent) {
        if (event is TeamBuilderUiEvent.UpdateSoldiers) {
            soldierAdapter.notifyDataSetChanged()
        }
    }

}