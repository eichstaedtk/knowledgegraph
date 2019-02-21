package de.eichstaedt.knowledgegraph

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KnowledgegraphApplication

fun main(args: Array<String>) {
	runApplication<KnowledgegraphApplication>(*args)
}
