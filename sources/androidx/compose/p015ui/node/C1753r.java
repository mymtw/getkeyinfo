package androidx.compose.p015ui.node;

import androidx.compose.p015ui.input.pointer.C1650u;
import androidx.compose.p015ui.input.pointer.C1651v;
import androidx.compose.p015ui.input.pointer.PointerInteropFilter$pointerInputFilter$1;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.r */
public final class C1753r extends C1742i<C1753r, C1651v> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1753r(LayoutNodeWrapper layoutNodeWrapper, C1651v vVar) {
        super(layoutNodeWrapper, vVar);
        C19383o.m32797g(layoutNodeWrapper, "layoutNodeWrapper");
        C19383o.m32797g(vVar, "modifier");
    }

    /* renamed from: a */
    public final void mo6735a() {
        this.f3922e = true;
        ((C1651v) this.f3920c).mo6547q0().f3687b = this.f3919b;
        ((C1651v) this.f3920c).mo6547q0().f3688c = true;
    }

    /* renamed from: b */
    public final void mo6919b() {
        this.f3922e = false;
        ((C1651v) this.f3920c).mo6547q0().f3688c = false;
    }

    /* renamed from: c */
    public final boolean mo6982c() {
        C1650u q0 = ((C1651v) this.f3920c).mo6547q0();
        q0.getClass();
        if (!(q0 instanceof PointerInteropFilter$pointerInputFilter$1)) {
            C1753r rVar = (C1753r) this.f3921d;
            return rVar != null ? rVar.mo6982c() : false;
        }
    }
}
