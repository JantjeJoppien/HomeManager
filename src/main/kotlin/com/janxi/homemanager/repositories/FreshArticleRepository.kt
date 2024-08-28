package com.janxi.homemanager.repositories

import com.janxi.homemanager.repositories.models.FreshArticle
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FreshArticleRepository : CrudRepository<FreshArticle, Long> {
}