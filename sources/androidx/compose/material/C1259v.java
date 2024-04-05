package androidx.compose.material;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: androidx.compose.material.v */
public final class C1259v {

    /* renamed from: a */
    public final ParcelableSnapshotMutableState f2632a;

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f2633b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f2634c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f2635d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f2636e;

    /* renamed from: f */
    public final ParcelableSnapshotMutableState f2637f;

    /* renamed from: g */
    public final ParcelableSnapshotMutableState f2638g;

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f2639h;

    /* renamed from: i */
    public final ParcelableSnapshotMutableState f2640i;

    /* renamed from: j */
    public final ParcelableSnapshotMutableState f2641j;

    /* renamed from: k */
    public final ParcelableSnapshotMutableState f2642k;

    /* renamed from: l */
    public final ParcelableSnapshotMutableState f2643l;

    /* renamed from: m */
    public final ParcelableSnapshotMutableState f2644m;

    public C1259v(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        long j13 = j;
        C1545s sVar = new C1545s(j);
        C1351n1 n1Var = C1351n1.f2948a;
        this.f2632a = C0761x.m1751w0(sVar, n1Var);
        long j14 = j2;
        this.f2633b = C0761x.m1751w0(new C1545s(j2), n1Var);
        long j15 = j3;
        this.f2634c = C0761x.m1751w0(new C1545s(j3), n1Var);
        long j16 = j4;
        this.f2635d = C0761x.m1751w0(new C1545s(j4), n1Var);
        long j17 = j5;
        this.f2636e = C0761x.m1751w0(new C1545s(j5), n1Var);
        this.f2637f = C0761x.m1751w0(new C1545s(j6), n1Var);
        this.f2638g = C0761x.m1751w0(new C1545s(j7), n1Var);
        this.f2639h = C0761x.m1751w0(new C1545s(j8), n1Var);
        this.f2640i = C0761x.m1751w0(new C1545s(j9), n1Var);
        this.f2641j = C0761x.m1751w0(new C1545s(j10), n1Var);
        this.f2642k = C0761x.m1751w0(new C1545s(j11), n1Var);
        this.f2643l = C0761x.m1751w0(new C1545s(j12), n1Var);
        this.f2644m = C0761x.m1751w0(Boolean.valueOf(z), n1Var);
    }

    /* renamed from: a */
    public final long mo5354a() {
        return ((C1545s) this.f2636e.getValue()).f3366a;
    }

    /* renamed from: b */
    public final long mo5355b() {
        return ((C1545s) this.f2638g.getValue()).f3366a;
    }

    /* renamed from: c */
    public final long mo5356c() {
        return ((C1545s) this.f2639h.getValue()).f3366a;
    }

    /* renamed from: d */
    public final long mo5357d() {
        return ((C1545s) this.f2640i.getValue()).f3366a;
    }

    /* renamed from: e */
    public final long mo5358e() {
        return ((C1545s) this.f2642k.getValue()).f3366a;
    }

    /* renamed from: f */
    public final long mo5359f() {
        return ((C1545s) this.f2632a.getValue()).f3366a;
    }

    /* renamed from: g */
    public final long mo5360g() {
        return ((C1545s) this.f2633b.getValue()).f3366a;
    }

    /* renamed from: h */
    public final long mo5361h() {
        return ((C1545s) this.f2634c.getValue()).f3366a;
    }

    /* renamed from: i */
    public final long mo5362i() {
        return ((C1545s) this.f2635d.getValue()).f3366a;
    }

    /* renamed from: j */
    public final long mo5363j() {
        return ((C1545s) this.f2637f.getValue()).f3366a;
    }

    /* renamed from: k */
    public final boolean mo5364k() {
        return ((Boolean) this.f2644m.getValue()).booleanValue();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Colors(primary=");
        h.append(C1545s.m3363i(mo5359f()));
        h.append(", primaryVariant=");
        h.append(C1545s.m3363i(mo5360g()));
        h.append(", secondary=");
        h.append(C1545s.m3363i(mo5361h()));
        h.append(", secondaryVariant=");
        h.append(C1545s.m3363i(mo5362i()));
        h.append(", background=");
        h.append(C1545s.m3363i(mo5354a()));
        h.append(", surface=");
        h.append(C1545s.m3363i(mo5363j()));
        h.append(", error=");
        h.append(C1545s.m3363i(mo5355b()));
        h.append(", onPrimary=");
        h.append(C1545s.m3363i(mo5356c()));
        h.append(", onSecondary=");
        h.append(C1545s.m3363i(mo5357d()));
        h.append(", onBackground=");
        h.append(C1545s.m3363i(((C1545s) this.f2641j.getValue()).f3366a));
        h.append(", onSurface=");
        h.append(C1545s.m3363i(mo5358e()));
        h.append(", onError=");
        h.append(C1545s.m3363i(((C1545s) this.f2643l.getValue()).f3366a));
        h.append(", isLight=");
        h.append(mo5364k());
        h.append(')');
        return h.toString();
    }
}
