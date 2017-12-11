package kodando.rxjs.operators

import kodando.rxjs.Observable

@JsModule("rxjs/operator/map")
private external object MapOperatorModule {
    val map: dynamic
}

@Suppress("UnsafeCastFromDynamic")
fun <T, TResult> Observable<T>.map(transformer: (T) -> TResult): Observable<TResult> {
    return MapOperatorModule.map.call(this, transformer)
}
