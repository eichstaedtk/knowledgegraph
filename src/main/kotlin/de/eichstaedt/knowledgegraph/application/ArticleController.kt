package de.eichstaedt.knowledgegraph.application

import de.eichstaedt.knowledgegraph.domain.Article
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by konrad.eichstaedt@gmx.de on 02.03.19.
 */

@Controller
class ArticleController {

    @GetMapping("/")
    fun showArticle(model: Model): String {

        model["title"] = "Finde dein Wissen ...";

        val article: Article = Article("Kotlin als Alternative zu Java", "Kotline ist leichtgewichtiger", "konrad")

        val articles: MutableList<Article> = ArrayList()

        articles.add(article)

        model["articles"] = articles

        return "article";

    }

}