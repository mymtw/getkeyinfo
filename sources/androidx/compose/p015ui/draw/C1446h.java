package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.platform.C1862p0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p297z.C8410c;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.draw.h */
public final class C1446h extends C1862p0 implements C1444f {

    /* renamed from: c */
    public final C19857l<C8410c, C19394m> f3138c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1446h(p753kq.C19857l r3) {
        /*
            r2 = this;
            kq.l<androidx.compose.ui.platform.o0, kotlin.m> r0 = androidx.compose.p015ui.platform.InspectableValueKt.f4032a
            java.lang.String r1 = "inspectorInfo"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r2.<init>(r0)
            r2.f3138c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.draw.C1446h.<init>(kq.l):void");
    }

    /* renamed from: P */
    public final void mo3715P(C1741h hVar) {
        this.f3138c.invoke(hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1446h)) {
            return false;
        }
        return C19383o.m32792b(this.f3138c, ((C1446h) obj).f3138c);
    }

    public final int hashCode() {
        return this.f3138c.hashCode();
    }
}
