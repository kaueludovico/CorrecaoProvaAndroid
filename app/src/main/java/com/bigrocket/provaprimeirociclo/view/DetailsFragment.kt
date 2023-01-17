package com.bigrocket.provaprimeirociclo.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bigrocket.provaprimeirociclo.R
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : Fragment(R.layout.fragment_details) {

    val args: DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        receiveData()
    }

    fun receiveData() {
        titleRecipe.text = args.recipe?.title
        ingredientsRecipe.text = args.recipe?.ingredients
        preparationRecipe.text = args.recipe?.preparation
    }
}