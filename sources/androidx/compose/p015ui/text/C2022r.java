package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import p001a0.C0005b;

/* renamed from: androidx.compose.ui.text.r */
public final class C2022r {

    /* renamed from: b */
    public static final long f4595b = C0005b.m47l(0, 0);

    /* renamed from: c */
    public static final /* synthetic */ int f4596c = 0;

    /* renamed from: a */
    public final long f4597a;

    public /* synthetic */ C2022r(long j) {
        this.f4597a = j;
    }

    /* renamed from: a */
    public static final boolean m4462a(long j, long j2) {
        return j == j2;
    }

    /* renamed from: b */
    public static final boolean m4463b(long j) {
        return ((int) (j >> 32)) == m4464c(j);
    }

    /* renamed from: c */
    public static final int m4464c(long j) {
        return (int) (j & UnsignedInteger.INT_MASK);
    }

    /* renamed from: d */
    public static final int m4465d(long j) {
        int i = (int) (j >> 32);
        return i > m4464c(j) ? i : m4464c(j);
    }

    /* renamed from: e */
    public static final int m4466e(long j) {
        int i = (int) (j >> 32);
        return i > m4464c(j) ? m4464c(j) : i;
    }

    /* renamed from: f */
    public static final boolean m4467f(long j) {
        return ((int) (j >> 32)) > m4464c(j);
    }

    /* renamed from: g */
    public static String m4468g(long j) {
        StringBuilder h = C0072d.m201h("TextRange(");
        h.append((int) (j >> 32));
        h.append(", ");
        h.append(m4464c(j));
        h.append(')');
        return h.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2022r) && this.f4597a == ((C2022r) obj).f4597a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4597a);
    }

    public final String toString() {
        return m4468g(this.f4597a);
    }
}
