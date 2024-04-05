package p221r3;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;

/* renamed from: r3.b */
public final class C7740b {

    /* renamed from: a */
    public final int f17165a;

    public C7740b(int i) {
        this.f17165a = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7740b) && this.f17165a == ((C7740b) obj).f17165a;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17165a);
    }

    public final String toString() {
        return C0071c.m191c(C0072d.m201h("DpValue(dpValue="), this.f17165a, ")");
    }
}
