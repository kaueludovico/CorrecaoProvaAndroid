package com.bigrocket.provaprimeirociclo.recources

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bigrocket.provaprimeirociclo.R
import com.bigrocket.provaprimeirociclo.model.Recipe
import kotlinx.android.synthetic.main.res_item_list.view.*

class ListRecipeAdapter(private val onClicked: (Recipe) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Recipe>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListRecipeViewHolder (
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ListRecipeViewHolder ->
                holder.bind(items[position], onClicked)
        }
    }

    override fun getItemCount(): Int {
        return this.items.size
    }

    fun setDataSet(list: List<Recipe>) {
        this.items = list
    }


    class ListRecipeViewHolder
    constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        var titleRecipe: TextView = itemView.textViewTitleRecipe
        var ingredientsRecipe: TextView = itemView.textViewIngredients
        var preparationRecipe: TextView = itemView.textViewPreparation

        fun bind(recipe: Recipe, onClicked: (Recipe) -> Unit) {
            titleRecipe.text = recipe.title
            ingredientsRecipe.text = recipe.ingredients
            preparationRecipe.text = recipe.preparation

            itemView.setOnClickListener {
                onClicked(recipe)
            }
        }
    }
}