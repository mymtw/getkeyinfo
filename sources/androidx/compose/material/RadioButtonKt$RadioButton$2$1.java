package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7284d;
import p297z.C8412e;
import p297z.C8415h;
import p297z.C8416i;
import p753kq.C19857l;

final class RadioButtonKt$RadioButton$2$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C7284d> $dotRadius;
    public final /* synthetic */ C1342k1<C1545s> $radioColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(C1342k1<C1545s> k1Var, C1342k1<C7284d> k1Var2) {
        super(1);
        this.$radioColor = k1Var;
        this.$dotRadius = k1Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        float B0 = eVar.mo3789B0(C1207k1.f2513f);
        float f = B0 / ((float) 2);
        C8412e.m16793y(eVar, this.$radioColor.getValue().f3366a, eVar.mo3789B0(C1207k1.f2511d) - f, 0, new C8416i(B0, 0.0f, 0, 0, 30), 108);
        if (Float.compare(this.$dotRadius.getValue().f16155b, (float) 0) > 0) {
            C8412e.m16793y(eVar, this.$radioColor.getValue().f3366a, eVar.mo3789B0(this.$dotRadius.getValue().f16155b) - f, 0, C8415h.f18433a, 108);
        }
    }
}
