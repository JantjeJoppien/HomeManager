package com.janxi.homemanager.services

import com.janxi.homemanager.models.ArticleResponse
import com.janxi.homemanager.repositories.FreshArticleRepository
import com.janxi.homemanager.repositories.PackedArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleService(
    @Autowired private val freshArticleRepository: FreshArticleRepository,
    @Autowired private val packedArticleRepository: PackedArticleRepository,
) {
    fun getArticles(): List<ArticleResponse> {
        val freshArticles = freshArticleRepository.findAll().map { ArticleResponse(it) }
        val packedArticles = packedArticleRepository.findAll().map { ArticleResponse(it) }
        return freshArticles + packedArticles
    }
}