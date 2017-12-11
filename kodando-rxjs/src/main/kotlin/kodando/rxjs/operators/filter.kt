package kodando.rxjs.operators

import kodando.rxjs.Observable

@JsModule("rxjs/operator/filter")
private external object FilterOpModule {
    val filter: dynamic
}

@Suppress("UnsafeCastFromDynamic")
fun <T> Observable<T>.filter(filter: (T) -> Boolean): Observable<T> {
    return FilterOpModule.filter.call(this, filter)
}