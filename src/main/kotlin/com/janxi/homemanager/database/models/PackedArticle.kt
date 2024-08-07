package com.janxi.homemanager.database.models

import jakarta.persistence.*
import org.springframework.data.annotation.Id
import java.math.BigDecimal
import java.util.Date

@Entity
class PackedArticle(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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