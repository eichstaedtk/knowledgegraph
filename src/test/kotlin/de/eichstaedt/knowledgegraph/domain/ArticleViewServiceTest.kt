package de.eichstaedt.knowledgegraph.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * Created by konrad.eichstaedt@gmx.de on 11.03.19.
 */

@SpringBootTest()
class ArticleViewServiceTest {

    @Autowired
    lateinit var viewService: ViewBoundary

    @Test
    internal fun testFindArticleByName() {

        Assertions.assertEquals(viewService.findArticleByName("Clean").size,1);

    }
}