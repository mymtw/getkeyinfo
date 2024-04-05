package p354gc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.f */
public final class C12772f {

    /* renamed from: a */
    public final int f28224a;

    /* renamed from: b */
    public final int f28225b;

    /* renamed from: c */
    public final String f28226c;

    public C12772f(int i, int i2, String str) {
        C19383o.m32797g(str, "url");
        this.f28224a = i;
        this.f28225b = i2;
        this.f28226c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12772f)) {
            return false;
        }
        C12772f fVar = (C12772f) obj;
        return this.f28224a == fVar.f28224a && this.f28225b == fVar.f28225b && C19383o.m32792b(this.f28226c, fVar.f28226c);
    }

    public final int hashCode() {
        return this.f28226c.hashCode() + C0069a.m170a(this.f28225b, Integer.hashCode(this.f28224a) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ImageSourceUiModel(height=");
        h.append(this.f28224a);
        h.append(", width=");
        h.append(this.f28225b);
        h.append(", url=");
        return C0391c.m1057c(h, this.f28226c, ')');
    }
}
