package androidx.compose.p015ui.tooling.data;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.tooling.data.f */
public final class C2063f {

    /* renamed from: a */
    public final String f4664a;

    /* renamed from: b */
    public final Object f4665b;

    /* renamed from: c */
    public final boolean f4666c;

    /* renamed from: d */
    public final boolean f4667d;

    /* renamed from: e */
    public final boolean f4668e;

    /* renamed from: f */
    public final String f4669f;

    /* renamed from: g */
    public final boolean f4670g;

    public C2063f(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.f4664a = str;
        this.f4665b = obj;
        this.f4666c = z;
        this.f4667d = z2;
        this.f4668e = z3;
        this.f4669f = str2;
        this.f4670g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2063f)) {
            return false;
        }
        C2063f fVar = (C2063f) obj;
        return C19383o.m32792b(this.f4664a, fVar.f4664a) && C19383o.m32792b(this.f4665b, fVar.f4665b) && this.f4666c == fVar.f4666c && this.f4667d == fVar.f4667d && this.f4668e == fVar.f4668e && C19383o.m32792b(this.f4669f, fVar.f4669f) && this.f4670g == fVar.f4670g;
    }

    public final int hashCode() {
        int hashCode = this.f4664a.hashCode() * 31;
        Object obj = this.f4665b;
        int i = 0;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z = this.f4666c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f4667d;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f4668e;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        String str = this.f4669f;
        if (str != null) {
            i = str.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z5 = this.f4670g;
        if (!z5) {
            z2 = z5;
        }
        return i5 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ParameterInformation(name=");
        h.append(this.f4664a);
        h.append(", value=");
        h.append(this.f4665b);
        h.append(", fromDefault=");
        h.append(this.f4666c);
        h.append(", static=");
        h.append(this.f4667d);
        h.append(", compared=");
        h.append(this.f4668e);
        h.append(", inlineClass=");
        h.append(this.f4669f);
        h.append(", stable=");
        return C0391c.m1058d(h, this.f4670g, ')');
    }
}
