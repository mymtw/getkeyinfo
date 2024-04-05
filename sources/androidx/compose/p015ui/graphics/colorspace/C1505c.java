package androidx.compose.p015ui.graphics.colorspace;

import android.support.p013v4.media.C0071c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;

/* renamed from: androidx.compose.ui.graphics.colorspace.c */
public abstract class C1505c {

    /* renamed from: a */
    public final String f3265a;

    /* renamed from: b */
    public final long f3266b;

    /* renamed from: c */
    public final int f3267c;

    public C1505c(int i, long j, String str) {
        this.f3265a = str;
        this.f3266b = j;
        this.f3267c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        } else if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    /* renamed from: a */
    public abstract float[] mo6293a(float[] fArr);

    /* renamed from: b */
    public abstract float mo6294b(int i);

    /* renamed from: c */
    public abstract float mo6295c(int i);

    /* renamed from: d */
    public boolean mo6296d() {
        return false;
    }

    /* renamed from: e */
    public abstract float[] mo6297e(float[] fArr);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(getClass()), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1505c cVar = (C1505c) obj;
        if (this.f3267c == cVar.f3267c && C19383o.m32792b(this.f3265a, cVar.f3265a)) {
            return C1504b.m3215a(this.f3266b, cVar.f3266b);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f3266b;
        int i = C1504b.f3264e;
        return C0071c.m190b(j, this.f3265a.hashCode() * 31, 31) + this.f3267c;
    }

    public final String toString() {
        return this.f3265a + " (id=" + this.f3267c + ", model=" + C1504b.m3216b(this.f3266b) + ')';
    }
}
