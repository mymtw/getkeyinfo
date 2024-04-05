package p288y;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;

/* renamed from: y.b */
public final class C8342b {

    /* renamed from: a */
    public float f18291a = 0.0f;

    /* renamed from: b */
    public float f18292b = 0.0f;

    /* renamed from: c */
    public float f18293c = 0.0f;

    /* renamed from: d */
    public float f18294d = 0.0f;

    /* renamed from: a */
    public final void mo20920a(float f, float f2, float f3, float f4) {
        this.f18291a = Math.max(f, this.f18291a);
        this.f18292b = Math.max(f2, this.f18292b);
        this.f18293c = Math.min(f3, this.f18293c);
        this.f18294d = Math.min(f4, this.f18294d);
    }

    /* renamed from: b */
    public final boolean mo20921b() {
        return this.f18291a >= this.f18293c || this.f18292b >= this.f18294d;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MutableRect(");
        h.append(C0761x.m1700W0(this.f18291a));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18292b));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18293c));
        h.append(", ");
        h.append(C0761x.m1700W0(this.f18294d));
        h.append(')');
        return h.toString();
    }
}
