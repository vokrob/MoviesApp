package com.vokrob.moviesapp.Domain

import java.io.Serializable

data class FilmItemModel(
    var Title: String = "",
    var Description: String = "",
    var Poster: String = "",
    var Time: String = "",
    var Trailer: String = "",
    var Imdb: String = "",
    var Year: String = "",
    var price: Double = 0.0,
    var Genre: ArrayList<String> = ArrayList(),
    var Casts: ArrayList<CastModel> = ArrayList()
) : Serializable





















