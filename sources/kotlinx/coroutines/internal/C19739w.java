package kotlinx.coroutines.internal;

import android.support.p013v4.media.C0072d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;

/* renamed from: kotlinx.coroutines.internal.w */
public final class C19739w implements CoroutineContext.C19337b<C19738v<?>> {

    /* renamed from: b */
    public final ThreadLocal<?> f43692b;

    public C19739w(ThreadLocal<?> threadLocal) {
        this.f43692b = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19739w) && C19383o.m32792b(this.f43692b, ((C19739w) obj).f43692b);
    }

    public final int hashCode() {
        return this.f43692b.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ThreadLocalKey(threadLocal=");
        h.append(this.f43692b);
        h.append(')');
        return h.toString();
    }
}
