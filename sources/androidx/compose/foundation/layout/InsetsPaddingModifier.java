package androidx.compose.foundation.layout;

import androidx.activity.C0114h;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p628nj.C18263b;

public final class InsetsPaddingModifier extends C1862p0 implements C1702p, C6764b, C6765c<C0736g0> {

    /* renamed from: c */
    public final C0736g0 f1399c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f1400d;

    /* renamed from: e */
    public final ParcelableSnapshotMutableState f1401e;

    public InsetsPaddingModifier() {
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public InsetsPaddingModifier(androidx.compose.foundation.layout.C0736g0 r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "insets"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f1399c = r3
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = androidx.compose.foundation.layout.C0761x.m1751w0(r3, androidx.compose.runtime.C1351n1.f2948a)
            r2.f1400d = r0
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = androidx.compose.foundation.layout.C0761x.m1751w0(r3, androidx.compose.runtime.C1351n1.f2948a)
            r2.f1401e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.InsetsPaddingModifier.<init>(androidx.compose.foundation.layout.g0):void");
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        C0736g0 g0Var = (C0736g0) dVar.mo6818a(WindowInsetsPaddingKt.f1455a);
        C0736g0 g0Var2 = this.f1399c;
        C19383o.m32797g(g0Var2, "<this>");
        C19383o.m32797g(g0Var, "insets");
        this.f1400d.setValue(new C0750m(g0Var2, g0Var));
        this.f1401e.setValue(C18263b.m30869t0(g0Var, this.f1399c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingModifier)) {
            return false;
        }
        return C19383o.m32792b(((InsetsPaddingModifier) obj).f1399c, this.f1399c);
    }

    public final C6767e<C0736g0> getKey() {
        return WindowInsetsPaddingKt.f1455a;
    }

    public final Object getValue() {
        return (C0736g0) this.f1401e.getValue();
    }

    public final int hashCode() {
        return this.f1399c.hashCode();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        int c = ((C0736g0) this.f1400d.getValue()).mo4084c(xVar, xVar.getLayoutDirection());
        int a = ((C0736g0) this.f1400d.getValue()).mo4082a(xVar);
        int d = ((C0736g0) this.f1400d.getValue()).mo4085d(xVar, xVar.getLayoutDirection()) + c;
        int b = ((C0736g0) this.f1400d.getValue()).mo4083b(xVar) + a;
        C1686i0 J = uVar.mo6665J(C0114h.m312p0(-d, -b, j));
        return xVar.mo4387Z(C0114h.m287R(J.f3722b + d, j), C0114h.m286Q(J.f3723c + b, j), C19294b0.m32559p0(), new InsetsPaddingModifier$measure$1(J, c, a));
    }
}
