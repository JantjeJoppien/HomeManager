package com.janxi.homemanager.services

import com.janxi.homemanager.repositories.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleService (@Autowired private val articleRepository: ArticleRepository) {
}