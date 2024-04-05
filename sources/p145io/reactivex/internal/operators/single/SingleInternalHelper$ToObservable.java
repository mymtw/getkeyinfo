package p145io.reactivex.internal.operators.single;

import p248tp.C8061n;
import p248tp.C8075w;
import p287xp.C8339g;

/* renamed from: io.reactivex.internal.operators.single.SingleInternalHelper$ToObservable */
enum SingleInternalHelper$ToObservable implements C8339g<C8075w, C8061n> {
    INSTANCE;

    public C8061n apply(C8075w wVar) {
        return new SingleToObservable(wVar);
    }
}
