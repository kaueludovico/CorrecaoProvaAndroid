package com.bigrocket.provaprimeirociclo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bigrocket.provaprimeirociclo.R
import com.bigrocket.provaprimeirociclo.model.Recipe
import kotlinx.android.synthetic.main.fragment_register.*


class RegisterFragment : Fragment(R.layout.fragment_register) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClicked()
    }

    fun setButtonClicked() {
        buttonRegister.setOnClickListener {
            createRecipe()
        }
    }

    fun createRecipe() {
        var recipe = Recipe(
            editTextRecipeTitle.text.toString(),
            editMultiLineIngredients.text.toString(),
            editMultiLinePreparation.text.toString()
        )

        var action = RegisterFragmentDirections.actionRegisterFragmentToMenuFragment(
            recipe
        )
        findNavController().navigate(action)

    }

}