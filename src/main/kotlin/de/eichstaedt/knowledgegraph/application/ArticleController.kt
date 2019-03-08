package de.eichstaedt.knowledgegraph.application

import de.eichstaedt.knowledgegraph.domain.ArticleViewService
import de.eichstaedt.knowledgegraph.domain.ViewBoundary
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping


/**
 * Created by konrad.eichstaedt@gmx.de on 02.03.19.
 */

@Controller
class ArticleController() {

    @Autowired lateinit var viewService: ViewBoundary

    @GetMapping("/")
    fun showArticle(model: Model): String {

        model["title"] = "Finde dein Wissen ...";

        model["articles"] = viewService.findTestArticle()

        return "article";

    }

}