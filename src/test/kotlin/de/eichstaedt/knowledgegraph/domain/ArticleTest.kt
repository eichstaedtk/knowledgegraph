package de.eichstaedt.knowledgegraph.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Created by konrad.eichstaedt@gmx.de on 21.02.19.
 */


class ArticleTest {

    @Test
    fun createFirstArticle() {

        val article: Article = Article("First Article", "Kotlin is a great Language", "konrad")

        Assertions.assertEquals(article.title, "First Article")

        Assertions.assertNotNull(article.creationDate)

    }

    @Test
    fun testAddRelationShip() {

        val article = Article("First Article", "Kotlin is a great Language", "konrad")

        val article1 = Article("Second Article", "Kotlin is a great Language with less code than Java", "konrad")

        val relationship = Relationship(article, article1, Relationship.Type.RELATED_TERM)

        Assertions.assertEquals(relationship.source, article)

        Assertions.assertEquals(relationship.target, article1)
    }

    @Test
    fun testGetCreationDate() {

        val article = Article("First Article", "Kotlin is a great Language", "konrad")

        Assertions.assertNotNull(article.getCreationDate())

    }
}