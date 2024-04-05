package androidx.compose.p015ui.input.rotary;

import android.support.p013v4.media.C0072d;
import p003a2.C0015b;
import p003a2.C0023f;
import p076d0.C6615a;

/* renamed from: androidx.compose.ui.input.rotary.a */
public final class C1658a implements C6615a {

    /* renamed from: a */
    public final float f3691a;

    /* renamed from: b */
    public final float f3692b;

    /* renamed from: c */
    public final long f3693c;

    public C1658a(float f, long j, float f2) {
        this.f3691a = f;
        this.f3692b = f2;
        this.f3693c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1658a) {
            C1658a aVar = (C1658a) obj;
            if (aVar.f3691a == this.f3691a) {
                if ((aVar.f3692b == this.f3692b) && aVar.f3693c == this.f3693c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3693c) + C0023f.m104c(this.f3692b, C0023f.m104c(this.f3691a, 0, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RotaryScrollEvent(verticalScrollPixels=");
        h.append(this.f3691a);
        h.append(",horizontalScrollPixels=");
        h.append(this.f3692b);
        h.append(",uptimeMillis=");
        return C0015b.m91j(h, this.f3693c, ')');
    }
}
