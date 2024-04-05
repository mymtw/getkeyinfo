package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.google.logging.type.LogSeverity;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.text.font.m */
public final class C1959m implements Comparable<C1959m> {

    /* renamed from: c */
    public static final C1959m f4409c;

    /* renamed from: d */
    public static final C1959m f4410d;

    /* renamed from: e */
    public static final C1959m f4411e;

    /* renamed from: f */
    public static final C1959m f4412f;

    /* renamed from: g */
    public static final C1959m f4413g;

    /* renamed from: h */
    public static final C1959m f4414h;

    /* renamed from: i */
    public static final C1959m f4415i;

    /* renamed from: j */
    public static final List<C1959m> f4416j;

    /* renamed from: b */
    public final int f4417b;

    static {
        C1959m mVar = new C1959m(100);
        C1959m mVar2 = new C1959m(200);
        C1959m mVar3 = new C1959m(LogSeverity.NOTICE_VALUE);
        C1959m mVar4 = new C1959m(LogSeverity.WARNING_VALUE);
        f4409c = mVar4;
        C1959m mVar5 = new C1959m(500);
        f4410d = mVar5;
        C1959m mVar6 = new C1959m(LogSeverity.CRITICAL_VALUE);
        f4411e = mVar6;
        C1959m mVar7 = new C1959m(LogSeverity.ALERT_VALUE);
        C1959m mVar8 = new C1959m(LogSeverity.EMERGENCY_VALUE);
        C1959m mVar9 = new C1959m(900);
        f4412f = mVar3;
        f4413g = mVar4;
        f4414h = mVar5;
        f4415i = mVar7;
        f4416j = C17782b.m29865e0(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9);
    }

    public C1959m(int i) {
        this.f4417b = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C0015b.m88g("Font weight can be in range [1, 1000]. Current value: ", i).toString());
        }
    }

    /* renamed from: a */
    public final int compareTo(C1959m mVar) {
        C19383o.m32797g(mVar, "other");
        return C19383o.m32799i(this.f4417b, mVar.f4417b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1959m) && this.f4417b == ((C1959m) obj).f4417b;
    }

    public final int hashCode() {
        return this.f4417b;
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("FontWeight(weight="), this.f4417b, ')');
    }
}
