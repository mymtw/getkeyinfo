package p145io.reactivex.internal.operators.flowable;

import p248tp.C8054g;

/* renamed from: io.reactivex.internal.operators.flowable.a */
public abstract class C19104a<T, R> extends C8054g<R> {

    /* renamed from: c */
    public final C8054g<T> f42671c;

    public C19104a(C8054g<T> gVar) {
        if (gVar != null) {
            this.f42671c = gVar;
            return;
        }
        throw new NullPointerException("source is null");
    }
}
