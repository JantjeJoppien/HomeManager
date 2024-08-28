package com.janxi.homemanager.repositories

import com.janxi.homemanager.repositories.models.PackedArticle
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PackedArticleRepository : CrudRepository<PackedArticle, Long> {
}