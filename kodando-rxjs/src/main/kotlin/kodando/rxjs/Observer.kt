package kodando.rxjs

external interface Observer<in T> {
    val closed: Boolean?
    fun next(data: T)
    fun error(error: Error)
    fun complete()
}
