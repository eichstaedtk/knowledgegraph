package de.eichstaedt.knowledgegraph.domain

import java.net.URL
import java.time.LocalDateTime

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */
data class Article(val title:String,val describtion: String, val author: String,val creationDate:LocalDateTime?= LocalDateTime.now()) {

    val relations:List<Relationship> = ArrayList()

    val webLinks:List<URL> = ArrayList()

    fun connectArticleRelation(relation:Relationship) {
        relations.plus(relation)
    }

    fun connectToWebLink(link:URL) {
        webLinks.plus(link)
    }
}