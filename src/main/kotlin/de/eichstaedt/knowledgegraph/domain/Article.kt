package de.eichstaedt.knowledgegraph.domain

import java.net.URL
import java.time.LocalDateTime

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */
data class Article(val title: String, val description: String, val author: String, val creationDate: LocalDateTime? = LocalDateTime.now()) {

    val relations: MutableList<Relationship> = ArrayList()

    val webLinks: MutableList<URL> = ArrayList()

    fun connectArticleRelation(relation: Relationship) {
        relations.add(relation)
    }

    fun connectToWebLink(link: URL) {
        webLinks.add(link)
    }
}