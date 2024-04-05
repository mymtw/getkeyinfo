package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8343c;
import p297z.C8412e;
import p753kq.C19857l;

public final class SwitchKt$SwitchImpl$2$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C1545s> $trackColor$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2$1(C1342k1<C1545s> k1Var) {
        super(1);
        this.$trackColor$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        C1342k1<C1545s> k1Var = this.$trackColor$delegate;
        float f = SwitchKt.f2301a;
        long j = k1Var.getValue().f3366a;
        float B0 = eVar.mo3789B0(SwitchKt.f2301a);
        float B02 = eVar.mo3789B0(SwitchKt.f2302b);
        float f2 = B02 / ((float) 2);
        C8412e.m16787d0(eVar, j, C19421p.m32952q(f2, C8343c.m16643d(eVar.mo6907K0())), C19421p.m32952q(B0 - f2, C8343c.m16643d(eVar.mo6907K0())), B02, 1, 480);
    }
}
