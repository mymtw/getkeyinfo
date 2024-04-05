package p744gq;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;

/* renamed from: gq.a */
public final class C19058a implements C19340c<Object> {

    /* renamed from: b */
    public static final C19058a f42555b = new C19058a();

    public final CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
