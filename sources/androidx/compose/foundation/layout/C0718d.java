package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.LayoutDirection;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p173m.C7279a;
import p174m0.C7282b;
import p174m0.C7284d;
import p753kq.C19861p;

/* renamed from: androidx.compose.foundation.layout.d */
public final class C0718d {

    /* renamed from: a */
    public static final C0727i f1476a = new C0727i();

    /* renamed from: b */
    public static final C0721c f1477b = new C0721c();

    /* renamed from: c */
    public static final C0728j f1478c = new C0728j();

    /* renamed from: d */
    public static final C0719a f1479d = new C0719a();

    /* renamed from: e */
    public static final C0720b f1480e = new C0720b();

    /* renamed from: f */
    public static final C0725g f1481f = new C0725g();

    /* renamed from: g */
    public static final C0724f f1482g = new C0724f();

    /* renamed from: h */
    public static final C0723e f1483h = new C0723e();

    /* renamed from: androidx.compose.foundation.layout.d$a */
    public static final class C0719a implements C0729k {
        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1567c(i, iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$b */
    public static final class C0720b implements C0722d, C0729k {

        /* renamed from: a */
        public final float f1484a = ((float) 0);

        /* renamed from: a */
        public final float mo4094a() {
            return this.f1484a;
        }

        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1565a(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1565a(i, iArr, iArr2, false);
            } else {
                C0718d.m1565a(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$c */
    public static final class C0721c implements C0722d {
        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1567c(i, iArr, iArr2, false);
            } else {
                C0718d.m1566b(iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#End";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$d */
    public interface C0722d {
        /* renamed from: a */
        float mo4094a() {
            return (float) 0;
        }

        /* renamed from: c */
        void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2);
    }

    /* renamed from: androidx.compose.foundation.layout.d$e */
    public static final class C0723e implements C0722d, C0729k {

        /* renamed from: a */
        public final float f1485a = ((float) 0);

        /* renamed from: a */
        public final float mo4094a() {
            return this.f1485a;
        }

        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1568d(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1568d(i, iArr, iArr2, false);
            } else {
                C0718d.m1568d(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$f */
    public static final class C0724f implements C0722d, C0729k {

        /* renamed from: a */
        public final float f1486a = ((float) 0);

        /* renamed from: a */
        public final float mo4094a() {
            return this.f1486a;
        }

        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1569e(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1569e(i, iArr, iArr2, false);
            } else {
                C0718d.m1569e(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$g */
    public static final class C0725g implements C0722d, C0729k {

        /* renamed from: a */
        public final float f1487a = ((float) 0);

        /* renamed from: a */
        public final float mo4094a() {
            return this.f1487a;
        }

        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1570f(i, iArr, iArr2, false);
        }

        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1570f(i, iArr, iArr2, false);
            } else {
                C0718d.m1570f(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$h */
    public static final class C0726h implements C0722d, C0729k {

        /* renamed from: a */
        public final float f1488a;

        /* renamed from: b */
        public final boolean f1489b;

        /* renamed from: c */
        public final C19861p<Integer, LayoutDirection, Integer> f1490c;

        /* renamed from: d */
        public final float f1491d;

        public C0726h() {
            throw null;
        }

        public C0726h(float f, C19861p pVar) {
            this.f1488a = f;
            this.f1489b = true;
            this.f1490c = pVar;
            this.f1491d = f;
        }

        /* renamed from: a */
        public final float mo4094a() {
            return this.f1491d;
        }

        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            mo4095c(i, iArr, LayoutDirection.Ltr, bVar, iArr2);
        }

        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            int i2;
            int i3;
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (!(iArr.length == 0)) {
                int V = bVar.mo3791V(this.f1488a);
                boolean z = this.f1489b && layoutDirection == LayoutDirection.Rtl;
                C0727i iVar = C0718d.f1476a;
                if (!z) {
                    int length = iArr.length;
                    int i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = iArr[i4];
                        int min = Math.min(i3, i - i6);
                        iArr2[i5] = min;
                        int min2 = Math.min(V, (i - min) - i6);
                        int i7 = iArr2[i5] + i6 + min2;
                        i4++;
                        i5++;
                        int i8 = i7;
                        i2 = min2;
                        i3 = i8;
                    }
                } else {
                    int i9 = 0;
                    int i10 = 0;
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i11 = iArr[length2];
                        int min3 = Math.min(i3, i - i11);
                        iArr2[length2] = min3;
                        i10 = Math.min(V, (i - min3) - i11);
                        i9 = iArr2[length2] + i11 + i10;
                    }
                }
                int i12 = i3 - i2;
                C19861p<Integer, LayoutDirection, Integer> pVar = this.f1490c;
                if (pVar != null && i12 < i) {
                    int intValue = pVar.invoke(Integer.valueOf(i - i12), layoutDirection).intValue();
                    int length3 = iArr2.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        iArr2[i13] = iArr2[i13] + intValue;
                    }
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0726h)) {
                return false;
            }
            C0726h hVar = (C0726h) obj;
            return C7284d.m13983a(this.f1488a, hVar.f1488a) && this.f1489b == hVar.f1489b && C19383o.m32792b(this.f1490c, hVar.f1490c);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.f1488a) * 31;
            boolean z = this.f1489b;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            C19861p<Integer, LayoutDirection, Integer> pVar = this.f1490c;
            return i + (pVar == null ? 0 : pVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f1489b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            sb.append(C7284d.m13984c(this.f1488a));
            sb.append(", ");
            sb.append(this.f1490c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$i */
    public static final class C0727i implements C0722d {
        /* renamed from: c */
        public final void mo4095c(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(layoutDirection, "layoutDirection");
            C19383o.m32797g(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0718d.m1566b(iArr, iArr2, false);
            } else {
                C0718d.m1567c(i, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$j */
    public static final class C0728j implements C0729k {
        /* renamed from: b */
        public final void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2) {
            C19383o.m32797g(bVar, "<this>");
            C19383o.m32797g(iArr, "sizes");
            C19383o.m32797g(iArr2, "outPositions");
            C0718d.m1566b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* renamed from: androidx.compose.foundation.layout.d$k */
    public interface C0729k {
        /* renamed from: a */
        float mo4094a() {
            return (float) 0;
        }

        /* renamed from: b */
        void mo4092b(C7282b bVar, int i, int[] iArr, int[] iArr2);
    }

    /* renamed from: a */
    public static void m1565a(int i, int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = ((float) (i - i3)) / ((float) 2);
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = C7279a.m13954l(f);
                f += (float) i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = C7279a.m13954l(f);
            f += (float) i7;
        }
    }

    /* renamed from: b */
    public static void m1566b(int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    /* renamed from: c */
    public static void m1567c(int i, int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    /* renamed from: d */
    public static void m1568d(int i, int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (iArr.length == 0) ^ true ? ((float) (i - i3)) / ((float) iArr.length) : 0.0f;
        float f = length / ((float) 2);
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C7279a.m13954l(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C7279a.m13954l(f);
            f += ((float) i7) + length;
        }
    }

    /* renamed from: e */
    public static void m1569e(int i, int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = 0.0f;
        float length = iArr.length > 1 ? ((float) (i - i3)) / ((float) (iArr.length - 1)) : 0.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C7279a.m13954l(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C7279a.m13954l(f);
            f += ((float) i7) + length;
        }
    }

    /* renamed from: f */
    public static void m1570f(int i, int[] iArr, int[] iArr2, boolean z) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(iArr2, "outPosition");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = ((float) (i - i3)) / ((float) (iArr.length + 1));
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = C7279a.m13954l(f);
                f += ((float) i6) + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = C7279a.m13954l(f2);
            f2 += ((float) i7) + length;
        }
    }

    /* renamed from: g */
    public static C0726h m1571g(float f) {
        return new C0726h(f, Arrangement$spacedBy$1.INSTANCE);
    }
}
