package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C19525d0;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C19721f implements C19525d0 {

    /* renamed from: b */
    public final CoroutineContext f43661b;

    public C19721f(CoroutineContext coroutineContext) {
        this.f43661b = coroutineContext;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f43661b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CoroutineScope(coroutineContext=");
        h.append(this.f43661b);
        h.append(')');
        return h.toString();
    }
}
