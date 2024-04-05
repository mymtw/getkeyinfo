package androidx.compose.p015ui.tooling.data;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.tooling.data.j */
public final class C2067j {

    /* renamed from: a */
    public final int f4682a;

    /* renamed from: b */
    public final int f4683b;

    /* renamed from: c */
    public final int f4684c;

    /* renamed from: d */
    public final String f4685d;

    /* renamed from: e */
    public final int f4686e;

    public C2067j(int i, int i2, int i3, String str, int i4) {
        this.f4682a = i;
        this.f4683b = i2;
        this.f4684c = i3;
        this.f4685d = str;
        this.f4686e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2067j)) {
            return false;
        }
        C2067j jVar = (C2067j) obj;
        return this.f4682a == jVar.f4682a && this.f4683b == jVar.f4683b && this.f4684c == jVar.f4684c && C19383o.m32792b(this.f4685d, jVar.f4685d) && this.f4686e == jVar.f4686e;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f4684c, C0069a.m170a(this.f4683b, Integer.hashCode(this.f4682a) * 31, 31), 31);
        String str = this.f4685d;
        return Integer.hashCode(this.f4686e) + ((a + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SourceLocation(lineNumber=");
        h.append(this.f4682a);
        h.append(", offset=");
        h.append(this.f4683b);
        h.append(", length=");
        h.append(this.f4684c);
        h.append(", sourceFile=");
        h.append(this.f4685d);
        h.append(", packageHash=");
        return C0073e.m208h(h, this.f4686e, ')');
    }
}
