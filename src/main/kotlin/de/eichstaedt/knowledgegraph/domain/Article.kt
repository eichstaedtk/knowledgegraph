package de.eichstaedt.knowledgegraph.domain

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */
data class Article(val title: String, val description: String, val author: String, val creationDate: LocalDateTime? = LocalDateTime.now(),
                   val id: String = title.hashCode().toString()) {

    val webLinks: MutableList<Weblink> = ArrayList()

    val createDate: LocalDateTime = LocalDateTime.now()

    fun connectToWebLink(link: Weblink) {
        webLinks.add(link)
    }

    fun getCreationDate(): String {

        if (creationDate != null)
            return DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss", Locale.GERMAN).format(createDate)

        return "";
    }
}