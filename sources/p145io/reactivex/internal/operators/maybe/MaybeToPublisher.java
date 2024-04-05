package p145io.reactivex.internal.operators.maybe;

import p248tp.C8059l;
import p287xp.C8339g;
import p762or.C20023b;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToPublisher */
public enum MaybeToPublisher implements C8339g<C8059l<Object>, C20023b<Object>> {
    INSTANCE;

    public static <T> C8339g<C8059l<T>, C20023b<T>> instance() {
        return INSTANCE;
    }

    public C20023b<Object> apply(C8059l<Object> lVar) throws Exception {
        return new MaybeToFlowable(lVar);
    }
}
