package de.eichstaedt.knowledgegraph.application

import de.eichstaedt.knowledgegraph.domain.ViewBoundary
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


/**
 * Created by konrad.eichstaedt@gmx.de on 02.03.19.
 */

@Controller
class ArticleController() {

    private val logger: Logger = LoggerFactory.getLogger("ArticleController");

    @Autowired
    lateinit var viewService: ViewBoundary

    @GetMapping("/")
    fun showArticle(model: Model, @RequestParam("title", required = false, defaultValue = "") title: String): String {

        logger.info("GET all articles")

        model["title"] = "Finde dein Wissen ...";

        when (title) {

            "" -> {
                logger.info("No Title Found ... ")
                model["articles"] = viewService.findTestArticle()
            }

            else -> {
                model["articles"] = viewService.findArticleByTitle(title)
            }
        }

        model["relations"] = viewService.findTestRelations()

        return "article";
    }

}