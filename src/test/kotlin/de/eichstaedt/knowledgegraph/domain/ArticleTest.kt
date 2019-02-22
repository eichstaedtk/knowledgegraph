package de.eichstaedt.knowledgegraph.domain

import de.eichstaedt.knowledgegraph.domain.Article
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */


class ArticleTest {

    @Test
    fun createFirstArticle() {

        val article: Article = Article("First Article", "Kotlin is a great Language", "konrad")

        Assertions.assertEquals(article.title, "First Article")

        Assertions.assertNotNull(article.creationDate)

        Assertions.assertNotNull(article.relations)
    }

}