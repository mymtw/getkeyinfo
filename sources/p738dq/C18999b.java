package p738dq;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.util.concurrent.TimeUnit;
import p145io.reactivex.internal.functions.C12965a;

/* renamed from: dq.b */
public final class C18999b<T> {

    /* renamed from: a */
    public final T f42338a;

    /* renamed from: b */
    public final long f42339b;

    /* renamed from: c */
    public final TimeUnit f42340c;

    public C18999b(T t, long j, TimeUnit timeUnit) {
        this.f42338a = t;
        this.f42339b = j;
        if (timeUnit != null) {
            this.f42340c = timeUnit;
            return;
        }
        throw new NullPointerException("unit is null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18999b)) {
            return false;
        }
        C18999b bVar = (C18999b) obj;
        return C12965a.m20649a(this.f42338a, bVar.f42338a) && this.f42339b == bVar.f42339b && C12965a.m20649a(this.f42340c, bVar.f42340c);
    }

    public final int hashCode() {
        T t = this.f42338a;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.f42339b;
        return this.f42340c.hashCode() + (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Timed[time=");
        h.append(this.f42339b);
        h.append(", unit=");
        h.append(this.f42340c);
        h.append(", value=");
        return C0071c.m192d(h, this.f42338a, "]");
    }
}
