package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.p0 */
public final class C1355p0 {

    /* renamed from: a */
    public Object f2953a;

    /* renamed from: a */
    public final C19340c<C19394m> mo5906a() {
        Object obj = this.f2953a;
        if (obj instanceof C19340c) {
            this.f2953a = C1420w0.f3088b;
            return (C19340c) obj;
        }
        Object obj2 = C1420w0.f3087a;
        if (C19383o.m32792b(obj, obj2) ? true : C19383o.m32792b(obj, C1420w0.f3088b)) {
            return null;
        }
        if (obj == null) {
            this.f2953a = obj2;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }
}
