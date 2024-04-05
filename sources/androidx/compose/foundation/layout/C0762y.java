package androidx.compose.foundation.layout;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.foundation.layout.y */
public final class C0762y {

    /* renamed from: a */
    public float f1569a;

    /* renamed from: b */
    public boolean f1570b;

    /* renamed from: c */
    public C0743k f1571c;

    public C0762y() {
        this(0);
    }

    public C0762y(int i) {
        this.f1569a = 0.0f;
        this.f1570b = true;
        this.f1571c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0762y)) {
            return false;
        }
        C0762y yVar = (C0762y) obj;
        return C19383o.m32792b(Float.valueOf(this.f1569a), Float.valueOf(yVar.f1569a)) && this.f1570b == yVar.f1570b && C19383o.m32792b(this.f1571c, yVar.f1571c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f1569a) * 31;
        boolean z = this.f1570b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        C0743k kVar = this.f1571c;
        return i + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("RowColumnParentData(weight=");
        h.append(this.f1569a);
        h.append(", fill=");
        h.append(this.f1570b);
        h.append(", crossAxisAlignment=");
        h.append(this.f1571c);
        h.append(')');
        return h.toString();
    }
}
