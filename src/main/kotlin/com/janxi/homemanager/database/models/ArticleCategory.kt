package com.janxi.homemanager.database.models

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ArticleCategory(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,
    val name: String,
)
