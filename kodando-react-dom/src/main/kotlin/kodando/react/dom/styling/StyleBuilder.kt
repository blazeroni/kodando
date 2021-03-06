package kodando.react.dom.styling

class StyleBuilder(vararg initialClasses: String) {
    val classes = arrayListOf<String>()

    init {
        initialClasses.forEach { add(it) }
    }

    fun add(className: String?): StyleBuilder {
        if (className != null) {
            classes += className
        }

        return this
    }

    fun add(className: String?, predicate: Boolean?): StyleBuilder {
        if (predicate == true) {
            add(className)
        }

        return this
    }

    override fun toString(): String {
        return classes.toTypedArray().joinToString(" ")
    }
}
