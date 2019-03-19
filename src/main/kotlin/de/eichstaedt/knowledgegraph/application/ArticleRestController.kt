package de.eichstaedt.knowledgegraph.application

import de.eichstaedt.knowledgegraph.domain.Article
import de.eichstaedt.knowledgegraph.domain.ViewBoundary
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * Created by konrad.eichstaedt@sbb.spk-berlin.de on 19.03.2019.
 */

@RestController
class ArticleRestController() {

    private val logger: Logger = LoggerFactory.getLogger("ArticleRestController");

    @Autowired
    lateinit var viewService: ViewBoundary

    @GetMapping("/rest/articles")
    fun findArticles(@RequestParam(value = "title", required = false, defaultValue = "") title: String): ResponseEntity<List<Article>> {

        logger.info("GET REST Request for {} ", title)

        return ResponseEntity.of(Optional.of(viewService.findArticleByTitle(title)))
    }


}