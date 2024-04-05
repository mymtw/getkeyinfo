package androidx.compose.p015ui.input.pointer;

import android.support.p013v4.media.C0072d;
import p288y.C8343c;

/* renamed from: androidx.compose.ui.input.pointer.e */
public final class C1633e {

    /* renamed from: a */
    public final long f3627a;

    /* renamed from: b */
    public final long f3628b;

    public C1633e(long j, long j2) {
        this.f3627a = j;
        this.f3628b = j2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("HistoricalChange(uptimeMillis=");
        h.append(this.f3627a);
        h.append(", position=");
        h.append(C8343c.m16647h(this.f3628b));
        h.append(')');
        return h.toString();
    }
}
