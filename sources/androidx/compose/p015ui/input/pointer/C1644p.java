package androidx.compose.p015ui.input.pointer;

import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.collections.EmptyList;
import p288y.C8343c;

/* renamed from: androidx.compose.ui.input.pointer.p */
public final class C1644p {

    /* renamed from: a */
    public final long f3656a;

    /* renamed from: b */
    public final long f3657b;

    /* renamed from: c */
    public final long f3658c;

    /* renamed from: d */
    public final boolean f3659d;

    /* renamed from: e */
    public final long f3660e;

    /* renamed from: f */
    public final long f3661f;

    /* renamed from: g */
    public final boolean f3662g;

    /* renamed from: h */
    public final int f3663h;

    /* renamed from: i */
    public final long f3664i;

    /* renamed from: j */
    public List<C1633e> f3665j;

    /* renamed from: k */
    public C1632d f3666k;

    public C1644p() {
        throw null;
    }

    public C1644p(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f3656a = j;
        this.f3657b = j2;
        this.f3658c = j3;
        this.f3659d = z;
        this.f3660e = j4;
        this.f3661f = j5;
        this.f3662g = z2;
        this.f3663h = i;
        this.f3664i = j6;
        boolean z4 = z3;
        this.f3666k = new C1632d(z4, z4);
    }

    /* renamed from: a */
    public final void mo6614a() {
        C1632d dVar = this.f3666k;
        dVar.f3626b = true;
        dVar.f3625a = true;
    }

    /* renamed from: b */
    public final boolean mo6615b() {
        C1632d dVar = this.f3666k;
        return dVar.f3626b || dVar.f3625a;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PointerInputChange(id=");
        h.append(C1643o.m3517b(this.f3656a));
        h.append(", uptimeMillis=");
        h.append(this.f3657b);
        h.append(", position=");
        h.append(C8343c.m16647h(this.f3658c));
        h.append(", pressed=");
        h.append(this.f3659d);
        h.append(", previousUptimeMillis=");
        h.append(this.f3660e);
        h.append(", previousPosition=");
        h.append(C8343c.m16647h(this.f3661f));
        h.append(", previousPressed=");
        h.append(this.f3662g);
        h.append(", isConsumed=");
        h.append(mo6615b());
        h.append(", type=");
        int i = this.f3663h;
        h.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch");
        h.append(", historical=");
        Object obj = this.f3665j;
        if (obj == null) {
            obj = EmptyList.INSTANCE;
        }
        h.append(obj);
        h.append(",scrollDelta=");
        h.append(C8343c.m16647h(this.f3664i));
        h.append(')');
        return h.toString();
    }

    public C1644p(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, false, i, j6);
        this.f3665j = list;
    }
}
