package de.eichstaedt.knowledgegraph.domain

import org.springframework.stereotype.Service
import java.net.URL
import java.util.*

/**
 * Created by konrad.eichstaedt@gmx.de on 08.03.19.
 */

@Service
class ArticleViewService : ViewBoundary {
    override fun findTestRelations(): List<Relationship> {
        return Arrays.asList(Relationship(findTestArticle().get(0), findTestArticle().get(1), Relationship.Type.RELATED_TERM))
    }

    override fun findTestArticle(): List<Article> {

        val article = Article("Kotlin als Alternative zu Java", "Kotline ist leichtgewichtiger", "konrad")
        article.connectToWebLink(Weblink("Kotlin", URL("https://kotlinlang.org/")))


        val article1 = Article("Clean Code", "Qualitätsstandards für Softwareentwickler", "konrad")
        article1.connectToWebLink(Weblink("Clean Code", URL("https://clean-code-developer.de/")))

        return Arrays.asList(article, article1)
    }
}