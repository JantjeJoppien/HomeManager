package com.janxi.homemanager.controllers

import com.janxi.homemanager.services.ArticleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController (@Autowired private val articleService: ArticleService){
}