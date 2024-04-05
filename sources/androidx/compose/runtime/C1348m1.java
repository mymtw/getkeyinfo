package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.m1 */
public final class C1348m1<T> implements C1342k1<T> {

    /* renamed from: b */
    public final T f2941b;

    public C1348m1(T t) {
        this.f2941b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1348m1) && C19383o.m32792b(this.f2941b, ((C1348m1) obj).f2941b);
    }

    public final T getValue() {
        return this.f2941b;
    }

    public final int hashCode() {
        T t = this.f2941b;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        return C0073e.m209i(C0072d.m201h("StaticValueHolder(value="), this.f2941b, ')');
    }
}
