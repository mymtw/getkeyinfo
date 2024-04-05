package androidx.compose.p015ui.input.pointer;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.input.pointer.b */
public final class C1630b implements C1641m {

    /* renamed from: a */
    public final int f3624a = 1008;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C19383o.m32792b(C1630b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f3624a == ((C1630b) obj).f3624a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
    }

    public final int hashCode() {
        return this.f3624a;
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("AndroidPointerIcon(type="), this.f3624a, ')');
    }
}
