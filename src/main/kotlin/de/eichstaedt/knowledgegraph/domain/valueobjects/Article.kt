package de.eichstaedt.knowledgegraph.domain.valueobjects

import java.time.LocalDateTime

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */
data class Article(val title:String,val describtion: String, val author: String,val creationDate:LocalDateTime?= LocalDateTime.now()) {
}