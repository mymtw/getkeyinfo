package androidx.compose.foundation.text.selection;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.text.Handle;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.text.selection.h */
public final class C1013h {

    /* renamed from: a */
    public final Handle f2127a;

    /* renamed from: b */
    public final long f2128b;

    public C1013h(Handle handle, long j) {
        this.f2127a = handle;
        this.f2128b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1013h)) {
            return false;
        }
        C1013h hVar = (C1013h) obj;
        return this.f2127a == hVar.f2127a && C8343c.m16640a(this.f2128b, hVar.f2128b);
    }

    public final int hashCode() {
        long j = this.f2128b;
        int i = C8343c.f18298e;
        return Long.hashCode(j) + (this.f2127a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelectionHandleInfo(handle=");
        h.append(this.f2127a);
        h.append(", position=");
        h.append(C8343c.m16647h(this.f2128b));
        h.append(')');
        return h.toString();
    }
}
