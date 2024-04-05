package androidx.compose.runtime;

import androidx.compose.animation.C0391c;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class ComposerImpl$deactivateToEndGroup$2 extends Lambda implements C19861p<Integer, Object, C19394m> {
    public final /* synthetic */ int $group;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposerImpl$deactivateToEndGroup$2(ComposerImpl composerImpl, int i) {
        super(2);
        this.this$0 = composerImpl;
        this.$group = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke(((Number) obj).intValue(), obj2);
        return C19394m.f43287a;
    }

    public final void invoke(final int i, final Object obj) {
        if (obj instanceof C1426z0) {
            this.this$0.f2695D.mo5634l(this.$group);
            ComposerImpl composerImpl = this.this$0;
            final int i2 = this.$group;
            composerImpl.mo5455o0(false, new C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>() {
                public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
                    C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "rememberManager");
                    if (C19383o.m32792b(obj, d1Var.mo5659H(i2, i))) {
                        y0Var.mo5823a((C1426z0) obj);
                        d1Var.mo5656E(i, C1302d.C1303a.f2828a);
                        return;
                    }
                    ComposerKt.m2526c("Slot table is out of sync".toString());
                    throw null;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
                    return C19394m.f43287a;
                }
            });
        } else if (obj instanceof C1418v0) {
            C1418v0 v0Var = (C1418v0) obj;
            C1330i iVar = v0Var.f3079b;
            if (iVar != null) {
                iVar.f2904o = true;
                v0Var.f3079b = null;
                v0Var.f3083f = null;
                v0Var.f3084g = null;
            }
            this.this$0.f2695D.mo5634l(this.$group);
            ComposerImpl composerImpl2 = this.this$0;
            final int i3 = this.$group;
            composerImpl2.mo5455o0(false, new C19862q<C1299c<?>, C1306d1, C1424y0, C19394m>() {
                public final void invoke(C1299c<?> cVar, C1306d1 d1Var, C1424y0 y0Var) {
                    C0391c.m1059f(cVar, "<anonymous parameter 0>", d1Var, "slots", y0Var, "<anonymous parameter 2>");
                    if (C19383o.m32792b(obj, d1Var.mo5659H(i3, i))) {
                        d1Var.mo5656E(i, C1302d.C1303a.f2828a);
                    } else {
                        ComposerKt.m2526c("Slot table is out of sync".toString());
                        throw null;
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C1299c<?>) (C1299c) obj, (C1306d1) obj2, (C1424y0) obj3);
                    return C19394m.f43287a;
                }
            });
        }
    }
}
