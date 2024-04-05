package androidx.compose.foundation;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7290i;
import p288y.C8347f;
import p753kq.C19857l;

public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements C19857l<C7290i, C19394m> {
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m34645invokeozmzZPI(((C7290i) obj).f16171a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m34645invokeozmzZPI(long j) {
        boolean z = !C8347f.m16653a(C0761x.m1698V0(j), this.this$0.f1250n);
        this.this$0.f1250n = C0761x.m1698V0(j);
        if (z) {
            int i = (int) (j >> 32);
            this.this$0.f1238b.setSize(i, C7290i.m13995b(j));
            this.this$0.f1239c.setSize(i, C7290i.m13995b(j));
            this.this$0.f1240d.setSize(C7290i.m13995b(j), i);
            this.this$0.f1241e.setSize(C7290i.m13995b(j), i);
            this.this$0.f1243g.setSize(i, C7290i.m13995b(j));
            this.this$0.f1244h.setSize(i, C7290i.m13995b(j));
            this.this$0.f1245i.setSize(C7290i.m13995b(j), i);
            this.this$0.f1246j.setSize(C7290i.m13995b(j), i);
        }
        if (z) {
            this.this$0.mo3588k();
            this.this$0.mo3583g();
        }
    }
}
