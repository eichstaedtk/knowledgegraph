package de.eichstaedt.knowledgegraph.domain

/**
 * Created by konrad.eichstaedt@gmx.de on 08.03.19.
 */


interface ViewBoundary {

    fun findTestArticle(): List<Article>

    fun findArticleByTitle(name: String): List<Article>

    fun findTestRelations(): List<Relationship>
}