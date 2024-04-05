package p145io.reactivex.internal.operators.single;

import p248tp.C8075w;
import p287xp.C8339g;
import p762or.C20023b;

/* renamed from: io.reactivex.internal.operators.single.SingleInternalHelper$ToFlowable */
enum SingleInternalHelper$ToFlowable implements C8339g<C8075w, C20023b> {
    INSTANCE;

    public C20023b apply(C8075w wVar) {
        return new SingleToFlowable(wVar);
    }
}
