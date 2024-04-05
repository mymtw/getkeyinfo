package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.runtime.m0 */
public final class C1347m0 {

    /* renamed from: a */
    public final String f2940a;

    public C1347m0(String str) {
        this.f2940a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1347m0) && C19383o.m32792b(this.f2940a, ((C1347m0) obj).f2940a);
    }

    public final int hashCode() {
        return this.f2940a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("OpaqueKey(key="), this.f2940a, ')');
    }
}
