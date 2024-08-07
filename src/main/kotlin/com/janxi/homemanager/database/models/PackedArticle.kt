package com.janxi.homemanager.database.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
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
)