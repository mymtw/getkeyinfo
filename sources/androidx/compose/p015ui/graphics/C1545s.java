package androidx.compose.p015ui.graphics;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.graphics.colorspace.C1505c;
import androidx.compose.p015ui.graphics.colorspace.C1507e;
import androidx.compose.p015ui.graphics.colorspace.ColorSpaces;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import kotlin.C19356i;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.s */
public final class C1545s {

    /* renamed from: b */
    public static final long f3357b = C18263b.m30836c(4278190080L);

    /* renamed from: c */
    public static final long f3358c = C18263b.m30836c(UnsignedInteger.INT_MASK);

    /* renamed from: d */
    public static final long f3359d = C18263b.m30836c(4294901760L);

    /* renamed from: e */
    public static final long f3360e = C18263b.m30836c(4278255360L);

    /* renamed from: f */
    public static final long f3361f = C18263b.m30836c(4278190335L);

    /* renamed from: g */
    public static final long f3362g = C18263b.m30836c(4294967040L);

    /* renamed from: h */
    public static final long f3363h = C18263b.m30834b(0);

    /* renamed from: i */
    public static final long f3364i = C18263b.m30832a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.f3242s);

    /* renamed from: j */
    public static final /* synthetic */ int f3365j = 0;

    /* renamed from: a */
    public final long f3366a;

    static {
        C18263b.m30836c(4282664004L);
        C18263b.m30836c(4287137928L);
        C18263b.m30836c(4291611852L);
        C18263b.m30836c(4278255615L);
        C18263b.m30836c(4294902015L);
    }

    public /* synthetic */ C1545s(long j) {
        this.f3366a = j;
    }

    /* renamed from: a */
    public static final long m3355a(long j, C1505c cVar) {
        C19383o.m32797g(cVar, "colorSpace");
        if (C19383o.m32792b(cVar, m3360f(j))) {
            return j;
        }
        C1507e G = C19543e0.m33291G(m3360f(j), cVar, 2);
        float[] O = C18263b.m30820O(j);
        G.mo6311a(O);
        return C18263b.m30832a(O[0], O[1], O[2], O[3], cVar);
    }

    /* renamed from: b */
    public static long m3356b(long j, float f) {
        return C18263b.m30832a(m3362h(j), m3361g(j), m3359e(j), f, m3360f(j));
    }

    /* renamed from: c */
    public static final boolean m3357c(long j, long j2) {
        return j == j2;
    }

    /* renamed from: d */
    public static final float m3358d(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f2 = (float) C19543e0.m33333s0((j >>> 56) & 255);
            f = 255.0f;
        } else {
            f2 = (float) C19543e0.m33333s0((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return f2 / f;
    }

    /* renamed from: e */
    public static final float m3359e(long j) {
        return (63 & j) == 0 ? ((float) C19543e0.m33333s0((j >>> 32) & 255)) / 255.0f : C1547u.m3365c((short) ((int) ((j >>> 16) & 65535)));
    }

    /* renamed from: f */
    public static final C1505c m3360f(long j) {
        float[] fArr = ColorSpaces.f3224a;
        return ColorSpaces.f3244u[(int) (j & 63)];
    }

    /* renamed from: g */
    public static final float m3361g(long j) {
        return (63 & j) == 0 ? ((float) C19543e0.m33333s0((j >>> 40) & 255)) / 255.0f : C1547u.m3365c((short) ((int) ((j >>> 32) & 65535)));
    }

    /* renamed from: h */
    public static final float m3362h(long j) {
        return (63 & j) == 0 ? ((float) C19543e0.m33333s0((j >>> 48) & 255)) / 255.0f : C1547u.m3365c((short) ((int) ((j >>> 48) & 65535)));
    }

    /* renamed from: i */
    public static String m3363i(long j) {
        StringBuilder h = C0072d.m201h("Color(");
        h.append(m3362h(j));
        h.append(", ");
        h.append(m3361g(j));
        h.append(", ");
        h.append(m3359e(j));
        h.append(", ");
        h.append(m3358d(j));
        h.append(", ");
        return C0391c.m1057c(h, m3360f(j).f3265a, ')');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1545s) && this.f3366a == ((C1545s) obj).f3366a;
    }

    public final int hashCode() {
        return C19356i.m32678a(this.f3366a);
    }

    public final String toString() {
        return m3363i(this.f3366a);
    }
}
