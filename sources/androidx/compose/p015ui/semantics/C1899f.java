package androidx.compose.p015ui.semantics;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import p764pq.C20052d;
import p764pq.C20053e;

/* renamed from: androidx.compose.ui.semantics.f */
public final class C1899f {

    /* renamed from: d */
    public static final C1899f f4222d = new C1899f(0.0f, new C20052d(0.0f, 0.0f), 0);

    /* renamed from: a */
    public final float f4223a;

    /* renamed from: b */
    public final C20053e<Float> f4224b;

    /* renamed from: c */
    public final int f4225c;

    public C1899f(float f, C20053e<Float> eVar, int i) {
        C19383o.m32797g(eVar, "range");
        this.f4223a = f;
        this.f4224b = eVar;
        this.f4225c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1899f)) {
            return false;
        }
        C1899f fVar = (C1899f) obj;
        return ((this.f4223a > fVar.f4223a ? 1 : (this.f4223a == fVar.f4223a ? 0 : -1)) == 0) && C19383o.m32792b(this.f4224b, fVar.f4224b) && this.f4225c == fVar.f4225c;
    }

    public final int hashCode() {
        return ((this.f4224b.hashCode() + (Float.hashCode(this.f4223a) * 31)) * 31) + this.f4225c;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ProgressBarRangeInfo(current=");
        h.append(this.f4223a);
        h.append(", range=");
        h.append(this.f4224b);
        h.append(", steps=");
        return C0073e.m208h(h, this.f4225c, ')');
    }
}
