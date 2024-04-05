package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p003a2.C0023f;
import p174m0.C7282b;

/* renamed from: androidx.compose.animation.n */
public final class C0478n {

    /* renamed from: a */
    public final float f1219a;

    /* renamed from: b */
    public final C7282b f1220b;

    /* renamed from: c */
    public final float f1221c;

    /* renamed from: androidx.compose.animation.n$a */
    public static final class C0479a {

        /* renamed from: a */
        public final float f1222a;

        /* renamed from: b */
        public final float f1223b;

        /* renamed from: c */
        public final long f1224c;

        public C0479a(float f, long j, float f2) {
            this.f1222a = f;
            this.f1223b = f2;
            this.f1224c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0479a)) {
                return false;
            }
            C0479a aVar = (C0479a) obj;
            return C19383o.m32792b(Float.valueOf(this.f1222a), Float.valueOf(aVar.f1222a)) && C19383o.m32792b(Float.valueOf(this.f1223b), Float.valueOf(aVar.f1223b)) && this.f1224c == aVar.f1224c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f1224c) + C0023f.m104c(this.f1223b, Float.hashCode(this.f1222a) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FlingInfo(initialVelocity=");
            h.append(this.f1222a);
            h.append(", distance=");
            h.append(this.f1223b);
            h.append(", duration=");
            return C0015b.m91j(h, this.f1224c, ')');
        }
    }

    public C0478n(float f, C7282b bVar) {
        this.f1219a = f;
        this.f1220b = bVar;
        float density = bVar.getDensity();
        float f2 = C0480o.f1225a;
        this.f1221c = density * 386.0878f * 160.0f * 0.84f;
    }

    /* renamed from: a */
    public final C0479a mo3557a(float f) {
        double b = mo3558b(f);
        double d = (double) C0480o.f1225a;
        double d2 = d - 1.0d;
        double exp = Math.exp((d / d2) * b);
        return new C0479a(f, (long) (Math.exp(b / d2) * 1000.0d), (float) (exp * ((double) (this.f1219a * this.f1221c))));
    }

    /* renamed from: b */
    public final double mo3558b(float f) {
        float[] fArr = C0389b.f1003a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f1219a * this.f1221c)));
    }
}
