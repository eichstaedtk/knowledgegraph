package de.eichstaedt.knowledgegraph.domain

/**
 * Created by konrad.eichstaedt@gmx.de on 22.02.19.
 */
    class Relationship(val source: Article, val target: Article, val type: Type) {

    enum class Type { USED_FOR, SYNONYM, BORDER_TERM, NARROWED_TERM, RELATED_TERM, TOP_TERM }

}