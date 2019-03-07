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

        Assertions.assertNotNull(article.relations)
    }

    @Test
    fun testAddRelationShip() {

        val article = Article("First Article", "Kotlin is a great Language", "konrad")

        val article1 = Article("Second Article", "Kotlin is a great Language with less code than Java", "konrad")

        val relationship = Relationship(article, Relationship.Type.RELATED_TERM)

        article.connectArticleRelation(relationship)

        Assertions.assertTrue(article.relations.size == 1)

        Assertions.assertTrue(article.relations.contains(relationship))
    }
}