package com.vokrob.moviesapp.Domain

import java.io.Serializable

data class CastModel(
    var PicUrl: String = "",
    var Actor: String = ""
) : Serializable
