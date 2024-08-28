package com.janxi.homemanager.controllers

import com.janxi.homemanager.models.ArticleResponse
import com.janxi.homemanager.services.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController(@Autowired private val articleService: ArticleService) {
    @GetMapping("/v1/articles")
    fun getArticles(): List<ArticleResponse> {
        return articleService.getArticles()
    }
}