package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.c */
public final class C1820c extends C1812a {

    /* renamed from: d */
    public static C1820c f4073d;

    /* renamed from: e */
    public static final ResolvedTextDirection f4074e = ResolvedTextDirection.Rtl;

    /* renamed from: f */
    public static final ResolvedTextDirection f4075f = ResolvedTextDirection.Ltr;

    /* renamed from: c */
    public C2021q f4076c;

    /* renamed from: a */
    public final int[] mo7194a(int i) {
        int i2;
        if (mo7180d().length() <= 0 || i >= mo7180d().length()) {
            return null;
        }
        if (i < 0) {
            C2021q qVar = this.f4076c;
            if (qVar != null) {
                i2 = qVar.mo7744f(0);
            } else {
                C19383o.m32805o("layoutResult");
                throw null;
            }
        } else {
            C2021q qVar2 = this.f4076c;
            if (qVar2 != null) {
                int f = qVar2.mo7744f(i);
                i2 = mo7199e(f, f4074e) == i ? f : f + 1;
            } else {
                C19383o.m32805o("layoutResult");
                throw null;
            }
        }
        C2021q qVar3 = this.f4076c;
        if (qVar3 == null) {
            C19383o.m32805o("layoutResult");
            throw null;
        } else if (i2 >= qVar3.f4590b.f4365f) {
            return null;
        } else {
            return mo7179c(mo7199e(i2, f4074e), mo7199e(i2, f4075f) + 1);
        }
    }

    /* renamed from: b */
    public final int[] mo7195b(int i) {
        int i2;
        if (mo7180d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > mo7180d().length()) {
            C2021q qVar = this.f4076c;
            if (qVar != null) {
                i2 = qVar.mo7744f(mo7180d().length());
            } else {
                C19383o.m32805o("layoutResult");
                throw null;
            }
        } else {
            C2021q qVar2 = this.f4076c;
            if (qVar2 != null) {
                int f = qVar2.mo7744f(i);
                i2 = mo7199e(f, f4075f) + 1 == i ? f : f - 1;
            } else {
                C19383o.m32805o("layoutResult");
                throw null;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return mo7179c(mo7199e(i2, f4074e), mo7199e(i2, f4075f) + 1);
    }

    /* renamed from: e */
    public final int mo7199e(int i, ResolvedTextDirection resolvedTextDirection) {
        C2021q qVar = this.f4076c;
        if (qVar != null) {
            int j = qVar.mo7749j(i);
            C2021q qVar2 = this.f4076c;
            if (qVar2 == null) {
                C19383o.m32805o("layoutResult");
                throw null;
            } else if (resolvedTextDirection != qVar2.mo7752m(j)) {
                C2021q qVar3 = this.f4076c;
                if (qVar3 != null) {
                    return qVar3.mo7749j(i);
                }
                C19383o.m32805o("layoutResult");
                throw null;
            } else {
                C2021q qVar4 = this.f4076c;
                if (qVar4 != null) {
                    return qVar4.mo7742e(i, false) - 1;
                }
                C19383o.m32805o("layoutResult");
                throw null;
            }
        } else {
            C19383o.m32805o("layoutResult");
            throw null;
        }
    }
}
