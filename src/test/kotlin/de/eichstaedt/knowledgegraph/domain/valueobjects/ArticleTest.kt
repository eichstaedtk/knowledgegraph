package de.eichstaedt.knowledgegraph.domain.valueobjects

import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

import org.hamcrest.core.Is.`is`
import org.junit.jupiter.api.Assertions

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */


class ArticleTest {

    @Test
    fun createFirstArticle() {

        val article:Article = Article("First Article" ,"Kotlin is a great Language" ,"konrad")

        Assertions.assertEquals(article.title, "First Article")
    }

}