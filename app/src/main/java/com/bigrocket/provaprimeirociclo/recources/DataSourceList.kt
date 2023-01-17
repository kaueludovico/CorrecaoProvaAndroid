package com.bigrocket.provaprimeirociclo.recources

import com.bigrocket.provaprimeirociclo.model.Recipe

class DataSourceList {
    companion object {
        fun castToList(recipe: Recipe) : List<Recipe> {
            return listOf(recipe)
        }
    }
}