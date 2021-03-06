package de.eichstaedt.knowledgegraph.application

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.test.web.client.match.MockRestRequestMatchers.content
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.openqa.selenium.By
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest


/**
 * Created by konrad.eichstaedt@gmx.de on 08.03.19.
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class ArticleControllerTest(@Autowired var mockMvc: MockMvc,@Autowired var webDrive:WebDriver) {


    @Test
    fun testLandingPage() {

        mockMvc.perform(get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk).andExpect { content().contentType(MediaType.TEXT_HTML) }

        webDrive.get("/")

        val element = this.webDrive.findElement(By.ById("headline"))
        Assertions.assertEquals(element.getText(),"Finde dein Wissen ...")


    }


}