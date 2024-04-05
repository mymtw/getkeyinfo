package androidx.compose.p015ui.input.pointer;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.input.pointer.s */
public final class C1648s {

    /* renamed from: a */
    public final long f3673a;

    /* renamed from: b */
    public final long f3674b;

    /* renamed from: c */
    public final long f3675c;

    /* renamed from: d */
    public final long f3676d;

    /* renamed from: e */
    public final boolean f3677e;

    /* renamed from: f */
    public final int f3678f;

    /* renamed from: g */
    public final boolean f3679g;

    /* renamed from: h */
    public final List<C1633e> f3680h;

    /* renamed from: i */
    public final long f3681i;

    public C1648s() {
        throw null;
    }

    public C1648s(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, ArrayList arrayList, long j5) {
        this.f3673a = j;
        this.f3674b = j2;
        this.f3675c = j3;
        this.f3676d = j4;
        this.f3677e = z;
        this.f3678f = i;
        this.f3679g = z2;
        this.f3680h = arrayList;
        this.f3681i = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1648s)) {
            return false;
        }
        C1648s sVar = (C1648s) obj;
        if (!C1643o.m3516a(this.f3673a, sVar.f3673a) || this.f3674b != sVar.f3674b || !C8343c.m16640a(this.f3675c, sVar.f3675c) || !C8343c.m16640a(this.f3676d, sVar.f3676d) || this.f3677e != sVar.f3677e) {
            return false;
        }
        return (this.f3678f == sVar.f3678f) && this.f3679g == sVar.f3679g && C19383o.m32792b(this.f3680h, sVar.f3680h) && C8343c.m16640a(this.f3681i, sVar.f3681i);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f3674b, Long.hashCode(this.f3673a) * 31, 31);
        long j = this.f3675c;
        int i = C8343c.f18298e;
        int b2 = C0071c.m190b(this.f3676d, C0071c.m190b(j, b, 31), 31);
        boolean z = this.f3677e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a = C0069a.m170a(this.f3678f, (b2 + (z ? 1 : 0)) * 31, 31);
        boolean z3 = this.f3679g;
        if (!z3) {
            z2 = z3;
        }
        return Long.hashCode(this.f3681i) + C13983i.m21488g(this.f3680h, (a + (z2 ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PointerInputEventData(id=");
        h.append(C1643o.m3517b(this.f3673a));
        h.append(", uptime=");
        h.append(this.f3674b);
        h.append(", positionOnScreen=");
        h.append(C8343c.m16647h(this.f3675c));
        h.append(", position=");
        h.append(C8343c.m16647h(this.f3676d));
        h.append(", down=");
        h.append(this.f3677e);
        h.append(", type=");
        int i = this.f3678f;
        h.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        h.append(", issuesEnterExit=");
        h.append(this.f3679g);
        h.append(", historical=");
        h.append(this.f3680h);
        h.append(", scrollDelta=");
        h.append(C8343c.m16647h(this.f3681i));
        h.append(')');
        return h.toString();
    }
}
