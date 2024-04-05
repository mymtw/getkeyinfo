package androidx.compose.foundation.text.selection;

import androidx.activity.C0114h;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19459m;
import p001a0.C0005b;
import p753kq.C19857l;

public interface SelectionAdjustment {

    public static final class Companion {

        /* renamed from: a */
        public static final C0972c f2053a = new C0972c();

        /* renamed from: b */
        public static final C0970a f2054b = new C0970a();

        /* renamed from: c */
        public static final SelectionAdjustment$Companion$Word$1 f2055c = new SelectionAdjustment$Companion$Word$1();

        /* renamed from: d */
        public static final SelectionAdjustment$Companion$Paragraph$1 f2056d = new SelectionAdjustment$Companion$Paragraph$1();

        /* renamed from: e */
        public static final C0971b f2057e = new C0971b();

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$a */
        public static final class C0970a implements SelectionAdjustment {
            /* renamed from: a */
            public final long mo4590a(C2021q qVar, long j, int i, boolean z, C2022r rVar) {
                if (!C2022r.m4463b(j)) {
                    return j;
                }
                return C0114h.m293X((int) (j >> 32), C19459m.m33039h1(qVar.f4589a.f4556a), z, rVar != null ? C2022r.m4467f(rVar.f4597a) : false);
            }
        }

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$b */
        public static final class C0971b implements SelectionAdjustment {
            /* renamed from: b */
            public static int m2013b(C2021q qVar, int i, int i2, int i3, boolean z, boolean z2) {
                long n = qVar.mo7753n(i);
                int i4 = (int) (n >> 32);
                if (qVar.mo7744f(i4) != i2) {
                    i4 = qVar.mo7749j(i2);
                }
                int c = qVar.mo7744f(C2022r.m4464c(n)) == i2 ? C2022r.m4464c(n) : qVar.mo7742e(i2, false);
                if (i4 == i3) {
                    return c;
                }
                if (c == i3) {
                    return i4;
                }
                int i5 = (i4 + c) / 2;
                if (z ^ z2) {
                    if (i <= i5) {
                        return i4;
                    }
                } else if (i < i5) {
                    return i4;
                }
                return c;
            }

            /* renamed from: c */
            public static int m2014c(C2021q qVar, int i, int i2, int i3, int i4, boolean z, boolean z2) {
                if (i == i2) {
                    return i3;
                }
                int f = qVar.mo7744f(i);
                if (f != qVar.mo7744f(i3)) {
                    return m2013b(qVar, i, f, i4, z, z2);
                }
                boolean z3 = false;
                if (!(i2 == -1 || (i != i2 && (!(z ^ z2) ? i > i2 : i < i2)))) {
                    return i;
                }
                long n = qVar.mo7753n(i3);
                if (i3 == ((int) (n >> 32)) || i3 == C2022r.m4464c(n)) {
                    z3 = true;
                }
                return !z3 ? i : m2013b(qVar, i, f, i4, z, z2);
            }

            /* renamed from: a */
            public final long mo4590a(C2021q qVar, long j, int i, boolean z, C2022r rVar) {
                int i2;
                int i3;
                C2021q qVar2 = qVar;
                long j2 = j;
                boolean z2 = z;
                C2022r rVar2 = rVar;
                if (rVar2 == null) {
                    return Companion.m2011a(qVar, j, new SelectionAdjustment$Companion$Word$1$adjust$1(qVar));
                }
                if (C2022r.m4463b(j)) {
                    return C0114h.m293X((int) (j2 >> 32), C19459m.m33039h1(qVar2.f4589a.f4556a), z, C2022r.m4467f(rVar2.f4597a));
                }
                if (z2) {
                    i3 = m2014c(qVar, (int) (j2 >> 32), i, (int) (rVar2.f4597a >> 32), C2022r.m4464c(j), true, C2022r.m4467f(j));
                    i2 = C2022r.m4464c(j);
                } else {
                    int i4 = (int) (j2 >> 32);
                    i2 = m2014c(qVar, C2022r.m4464c(j), i, C2022r.m4464c(rVar2.f4597a), i4, false, C2022r.m4467f(j));
                    i3 = i4;
                }
                return C0005b.m47l(i3, i2);
            }
        }

        /* renamed from: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$c */
        public static final class C0972c implements SelectionAdjustment {
            /* renamed from: a */
            public final long mo4590a(C2021q qVar, long j, int i, boolean z, C2022r rVar) {
                return j;
            }
        }

        /* renamed from: a */
        public static final long m2011a(C2021q qVar, long j, C19857l lVar) {
            if (qVar.f4589a.f4556a.length() == 0) {
                return C2022r.f4595b;
            }
            int h1 = C19459m.m33039h1(qVar.f4589a.f4556a);
            int i = C2022r.f4596c;
            long j2 = ((C2022r) lVar.invoke(Integer.valueOf(C19388s.m32833M((int) (j >> 32), 0, h1)))).f4597a;
            long j3 = ((C2022r) lVar.invoke(Integer.valueOf(C19388s.m32833M(C2022r.m4464c(j), 0, h1)))).f4597a;
            return C0005b.m47l(C2022r.m4467f(j) ? C2022r.m4464c(j2) : (int) (j2 >> 32), C2022r.m4467f(j) ? (int) (j3 >> 32) : C2022r.m4464c(j3));
        }
    }

    /* renamed from: a */
    long mo4590a(C2021q qVar, long j, int i, boolean z, C2022r rVar);
}
