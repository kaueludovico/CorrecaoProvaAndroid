package com.bigrocket.provaprimeirociclo.model

import java.io.Serializable

data class Recipe(
    var title: String,
    var ingredients: String,
    var preparation: String
) : Serializable
