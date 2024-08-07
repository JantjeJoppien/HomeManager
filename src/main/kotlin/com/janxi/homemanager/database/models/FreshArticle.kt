package com.janxi.homemanager.database.models

import jakarta.persistence.CollectionTable
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
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
    val category: String,
)