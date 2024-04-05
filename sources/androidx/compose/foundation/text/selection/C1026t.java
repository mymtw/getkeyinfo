package androidx.compose.foundation.text.selection;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1545s;
import kotlin.C19356i;
import p010a9.C0048b;

/* renamed from: androidx.compose.foundation.text.selection.t */
public final class C1026t {

    /* renamed from: a */
    public final long f2154a;

    /* renamed from: b */
    public final long f2155b;

    public C1026t(long j, long j2) {
        this.f2154a = j;
        this.f2155b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1026t)) {
            return false;
        }
        C1026t tVar = (C1026t) obj;
        return C1545s.m3357c(this.f2154a, tVar.f2154a) && C1545s.m3357c(this.f2155b, tVar.f2155b);
    }

    public final int hashCode() {
        long j = this.f2154a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(this.f2155b) + (C19356i.m32678a(j) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelectionColors(selectionHandleColor=");
        C0048b.m165d(this.f2154a, h, ", selectionBackgroundColor=");
        h.append(C1545s.m3363i(this.f2155b));
        h.append(')');
        return h.toString();
    }
}
