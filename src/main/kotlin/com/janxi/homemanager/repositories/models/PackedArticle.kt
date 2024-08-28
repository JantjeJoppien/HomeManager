package com.janxi.homemanager.repositories.models

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.Date

@Entity
class PackedArticle(
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id: Long = -1,
    val name: String,
    val amount: Int,
    val brand: String?,
    val price: BigDecimal?,
    @Column(name = "best_before")
    val bestBefore: Date?,
    @ManyToOne
    @JoinColumn(name = "category_id")
    val articleCategory: ArticleCategory,
) {
    constructor() : this(-1, "", 0, null, null, null, ArticleCategory())
}