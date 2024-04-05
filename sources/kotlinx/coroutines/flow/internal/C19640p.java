package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import p744gq.C19059b;

/* renamed from: kotlinx.coroutines.flow.internal.p */
public final class C19640p<T> implements C19340c<T>, C19059b {

    /* renamed from: b */
    public final C19340c<T> f43602b;

    /* renamed from: c */
    public final CoroutineContext f43603c;

    public C19640p(C19340c<? super T> cVar, CoroutineContext coroutineContext) {
        this.f43602b = cVar;
        this.f43603c = coroutineContext;
    }

    public final C19059b getCallerFrame() {
        C19340c<T> cVar = this.f43602b;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.f43603c;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        this.f43602b.resumeWith(obj);
    }
}
