package androidx.compose.p015ui.text.platform.extensions;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.platform.extensions.b */
public final class C2019b {

    /* renamed from: a */
    public final Object f4586a;

    /* renamed from: b */
    public final int f4587b;

    /* renamed from: c */
    public final int f4588c;

    public C2019b(MetricAffectingSpan metricAffectingSpan, int i, int i2) {
        this.f4586a = metricAffectingSpan;
        this.f4587b = i;
        this.f4588c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2019b)) {
            return false;
        }
        C2019b bVar = (C2019b) obj;
        return C19383o.m32792b(this.f4586a, bVar.f4586a) && this.f4587b == bVar.f4587b && this.f4588c == bVar.f4588c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4588c) + C0069a.m170a(this.f4587b, this.f4586a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SpanRange(span=");
        h.append(this.f4586a);
        h.append(", start=");
        h.append(this.f4587b);
        h.append(", end=");
        return C0073e.m208h(h, this.f4588c, ')');
    }
}
