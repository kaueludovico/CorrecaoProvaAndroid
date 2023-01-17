package com.bigrocket.provaprimeirociclo.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bigrocket.provaprimeirociclo.R
import kotlinx.android.synthetic.main.fragment_menu.*
import kotlinx.android.synthetic.main.fragment_register.*

class MenuFragment : Fragment(R.layout.fragment_menu) {

    val args: MenuFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setButtonClicked()
    }

    fun setButtonClicked() {
        registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_registerFragment)
        }

        listButton.setOnClickListener {
            val action = MenuFragmentDirections.actionMenuFragmentToListRecipeFragment(
                args.recipe
            )
            findNavController().navigate(action)
        }
    }
}