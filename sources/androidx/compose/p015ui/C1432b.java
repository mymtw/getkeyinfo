package androidx.compose.p015ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0388a;
import androidx.compose.p015ui.C1428a;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7290i;

/* renamed from: androidx.compose.ui.b */
public final class C1432b implements C1428a {

    /* renamed from: b */
    public final float f3119b;

    /* renamed from: c */
    public final float f3120c;

    /* renamed from: androidx.compose.ui.b$a */
    public static final class C1433a implements C1428a.C1430b {

        /* renamed from: a */
        public final float f3121a;

        public C1433a(float f) {
            this.f3121a = f;
        }

        /* renamed from: a */
        public final int mo6134a(int i, int i2, LayoutDirection layoutDirection) {
            C19383o.m32797g(layoutDirection, "layoutDirection");
            return C7279a.m13954l((((float) 1) + (layoutDirection == LayoutDirection.Ltr ? this.f3121a : ((float) -1) * this.f3121a)) * (((float) (i2 - i)) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1433a) && C19383o.m32792b(Float.valueOf(this.f3121a), Float.valueOf(((C1433a) obj).f3121a));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3121a);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("Horizontal(bias="), this.f3121a, ')');
        }
    }

    /* renamed from: androidx.compose.ui.b$b */
    public static final class C1434b implements C1428a.C1431c {

        /* renamed from: a */
        public final float f3122a;

        public C1434b(float f) {
            this.f3122a = f;
        }

        /* renamed from: a */
        public final int mo6135a(int i, int i2) {
            return C7279a.m13954l((((float) 1) + this.f3122a) * (((float) (i2 - i)) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1434b) && C19383o.m32792b(Float.valueOf(this.f3122a), Float.valueOf(((C1434b) obj).f3122a));
        }

        public final int hashCode() {
            return Float.hashCode(this.f3122a);
        }

        public final String toString() {
            return C0388a.m1048d(C0072d.m201h("Vertical(bias="), this.f3122a, ')');
        }
    }

    public C1432b(float f, float f2) {
        this.f3119b = f;
        this.f3120c = f2;
    }

    /* renamed from: a */
    public final long mo6133a(long j, long j2, LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "layoutDirection");
        float f = ((float) (((int) (j2 >> 32)) - ((int) (j >> 32)))) / 2.0f;
        float b = ((float) (C7290i.m13995b(j2) - C7290i.m13995b(j))) / 2.0f;
        float f2 = (float) 1;
        return C19421p.m32949o(C7279a.m13954l(((layoutDirection == LayoutDirection.Ltr ? this.f3119b : ((float) -1) * this.f3119b) + f2) * f), C7279a.m13954l((f2 + this.f3120c) * b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1432b)) {
            return false;
        }
        C1432b bVar = (C1432b) obj;
        return C19383o.m32792b(Float.valueOf(this.f3119b), Float.valueOf(bVar.f3119b)) && C19383o.m32792b(Float.valueOf(this.f3120c), Float.valueOf(bVar.f3120c));
    }

    public final int hashCode() {
        return Float.hashCode(this.f3120c) + (Float.hashCode(this.f3119b) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BiasAlignment(horizontalBias=");
        h.append(this.f3119b);
        h.append(", verticalBias=");
        return C0388a.m1048d(h, this.f3120c, ')');
    }
}
