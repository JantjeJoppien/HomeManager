package com.janxi.homemanager.models

import com.janxi.homemanager.repositories.models.FreshArticle
import com.janxi.homemanager.repositories.models.PackedArticle


data class ArticleResponse(
    val name: String,

    ){
    constructor(freshArticle: FreshArticle):this(name = freshArticle.name)
    constructor(packedArticle: PackedArticle):this(name = packedArticle.name)
}

