package com.janxi.homemanager.database.models

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*


@Entity
class FreshArticle(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,
    val name: String,
    val amount: Int,
    val brand: String,
    val price: BigDecimal,
    @Column(name = "bought_on")
    val boughtOn: Date,
    val origin: String,
    @ManyToOne
    @JoinColumn(name = "category_id")
    val articleCategory: ArticleCategory,
)