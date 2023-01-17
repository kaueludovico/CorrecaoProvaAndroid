package com.bigrocket.provaprimeirociclo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bigrocket.provaprimeirociclo.R
import com.bigrocket.provaprimeirociclo.recources.DataSourceList
import com.bigrocket.provaprimeirociclo.recources.ListRecipeAdapter
import kotlinx.android.synthetic.main.fragment_list_recipe.*

class ListRecipeFragment : Fragment(R.layout.fragment_list_recipe) {

    val args: ListRecipeFragmentArgs by navArgs()
    private lateinit var listAdapter: ListRecipeAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()
        setButtonClicked()
    }


    fun setRecyclerView() {
        listAdapter = ListRecipeAdapter {
            var action = ListRecipeFragmentDirections.actionListRecipeFragmentToDetailsFragment(
                it
            )
            findNavController().navigate(action)
        }

        args.recipe?.let {
            DataSourceList.castToList(it)
        }?.let {
            listAdapter.setDataSet(it)
        }



        recyclerView.apply {
            adapter = listAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }

    fun setButtonClicked() {
        // do nothing
    }
}