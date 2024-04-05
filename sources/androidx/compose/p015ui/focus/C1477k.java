package androidx.compose.p015ui.focus;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.focus.k */
public final class C1477k extends C1862p0 implements C6764b, C6765c<C1477k> {

    /* renamed from: c */
    public final C19857l<C1475i, C19394m> f3191c;

    /* renamed from: d */
    public final ParcelableSnapshotMutableState f3192d = C0761x.m1751w0((Object) null, C1351n1.f2948a);

    /* renamed from: e */
    public final C6767e<C1477k> f3193e = FocusPropertiesKt.f3168a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1477k(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "focusPropertiesScope"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3191c = r3
            r3 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = androidx.compose.foundation.layout.C0761x.m1751w0(r3, androidx.compose.runtime.C1351n1.f2948a)
            r2.f3192d = r3
            f0.e<androidx.compose.ui.focus.k> r3 = androidx.compose.p015ui.focus.FocusPropertiesKt.f3168a
            r2.f3193e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.focus.C1477k.<init>(kq.l):void");
    }

    /* renamed from: M */
    public final void mo3622M(C6766d dVar) {
        C19383o.m32797g(dVar, "scope");
        this.f3192d.setValue((C1477k) dVar.mo6818a(FocusPropertiesKt.f3168a));
    }

    /* renamed from: b */
    public final void mo6215b(C1476j jVar) {
        C19383o.m32797g(jVar, "focusProperties");
        this.f3191c.invoke(jVar);
        C1477k kVar = (C1477k) this.f3192d.getValue();
        if (kVar != null) {
            kVar.mo6215b(jVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1477k) && C19383o.m32792b(this.f3191c, ((C1477k) obj).f3191c);
    }

    public final C6767e<C1477k> getKey() {
        return this.f3193e;
    }

    public final Object getValue() {
        return this;
    }

    public final int hashCode() {
        return this.f3191c.hashCode();
    }
}
