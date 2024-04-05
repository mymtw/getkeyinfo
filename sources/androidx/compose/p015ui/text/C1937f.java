package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.text.platform.C2016a;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.f */
public final class C1937f {

    /* renamed from: a */
    public final C1977g f4375a;

    /* renamed from: b */
    public final int f4376b;

    /* renamed from: c */
    public final int f4377c;

    public C1937f(C2016a aVar, int i, int i2) {
        this.f4375a = aVar;
        this.f4376b = i;
        this.f4377c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1937f)) {
            return false;
        }
        C1937f fVar = (C1937f) obj;
        return C19383o.m32792b(this.f4375a, fVar.f4375a) && this.f4376b == fVar.f4376b && this.f4377c == fVar.f4377c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4377c) + C0069a.m170a(this.f4376b, this.f4375a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ParagraphIntrinsicInfo(intrinsics=");
        h.append(this.f4375a);
        h.append(", startIndex=");
        h.append(this.f4376b);
        h.append(", endIndex=");
        return C0073e.m208h(h, this.f4377c, ')');
    }
}
