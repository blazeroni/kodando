package kodando.hasher

/**
 * Created by danfma on 26/03/17.
 */

@JsModule("hasher")
external object Hasher {
    val initialized: ChangedSignal
    val changed: ChangedSignal
    fun init()
    fun dispose()
}

