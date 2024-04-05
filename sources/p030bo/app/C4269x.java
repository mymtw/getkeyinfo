package p030bo.app;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: bo.app.x */
public final class C4269x {

    /* renamed from: a */
    private final long f9419a;

    /* renamed from: b */
    private final int f9420b;

    public C4269x(long j, int i) {
        this.f9419a = j;
        this.f9420b = i;
    }

    /* renamed from: a */
    public final long mo14151a() {
        return this.f9419a;
    }

    /* renamed from: b */
    public final int mo14152b() {
        return this.f9420b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4269x)) {
            return false;
        }
        C4269x xVar = (C4269x) obj;
        return this.f9419a == xVar.f9419a && this.f9420b == xVar.f9420b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f9420b) + (Long.hashCode(this.f9419a) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ContentCardRetryEvent(timeInMs=");
        h.append(this.f9419a);
        h.append(", retryCount=");
        return C0073e.m208h(h, this.f9420b, ')');
    }
}
