package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1545s;
import com.google.android.play.core.assetpacks.C15588c1;
import p174m0.C7292j;
import p174m0.C7293k;

/* renamed from: androidx.compose.ui.text.o */
public final class C2013o {

    /* renamed from: a */
    public static final long f4551a = C0114h.m302g0(14);

    /* renamed from: b */
    public static final long f4552b = C0114h.m302g0(0);

    /* renamed from: c */
    public static final long f4553c = C1545s.f3363h;

    /* renamed from: d */
    public static final long f4554d = C1545s.f3357b;

    /* renamed from: e */
    public static final /* synthetic */ int f4555e = 0;

    static {
        int i = C1545s.f3365j;
    }

    /* renamed from: a */
    public static final Object m4413a(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    /* renamed from: b */
    public static final long m4414b(long j, float f, long j2) {
        if (C0114h.m307l0(j) || C0114h.m307l0(j2)) {
            return ((C7292j) m4413a(f, new C7292j(j), new C7292j(j2))).f16174a;
        }
        if (!(!C0114h.m307l0(j) && !C0114h.m307l0(j2))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        } else if (C7293k.m14001a(C7292j.m13998b(j), C7292j.m13998b(j2))) {
            return C0114h.m316r0(1095216660480L & j, C15588c1.m25354w0(C7292j.m13999c(j), C7292j.m13999c(j2), f));
        } else {
            StringBuilder h = C0072d.m201h("Cannot perform operation for ");
            h.append(C7293k.m14002b(C7292j.m13998b(j)));
            h.append(" and ");
            h.append(C7293k.m14002b(C7292j.m13998b(j2)));
            throw new IllegalArgumentException(h.toString().toString());
        }
    }
}
