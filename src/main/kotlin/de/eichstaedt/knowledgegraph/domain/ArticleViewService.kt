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

        val article2 = Article("Microservices", "Verteilte Architektur für Enterprise Systeme", "konrad")
        article2.connectToWebLink(Weblink("Martin Fowler Microservices", URL("https://martinfowler.com/articles/microservices.html")))

        val article3 = Article("Self Contained System", "Architekturansatz tzr Trennung von Funktionalitäten", "konrad")
        article3.connectToWebLink(Weblink("Self Contained System", URL("https://scs-architecture.org/")))

        val article4 = Article("Resource Oriented Client Architecture", "A collection of simple recommandations for decent Web Applications", "konrad")
        article4.connectToWebLink(Weblink("ROCA Style", URL("https://roca-style.org/")))

        return Arrays.asList(article, article1,article2,article3,article4)
    }
}