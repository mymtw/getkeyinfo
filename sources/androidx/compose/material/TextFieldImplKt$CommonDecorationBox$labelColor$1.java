package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends Lambda implements C19862q<InputPhase, C1302d, Integer, C1545s> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(C1166a2 a2Var, boolean z, boolean z2, C0639i iVar, int i, int i2) {
        super(3);
        this.$colors = a2Var;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = iVar;
        this.$$dirty = i;
        this.$$dirty1 = i2;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new C1545s(m34765invokeXeAY9LY((InputPhase) obj, (C1302d) obj2, ((Number) obj3).intValue()));
    }

    /* renamed from: invoke-XeAY9LY  reason: not valid java name */
    public final long m34765invokeXeAY9LY(InputPhase inputPhase, C1302d dVar, int i) {
        C19383o.m32797g(inputPhase, "it");
        dVar.mo5465u(697243846);
        C1166a2 a2Var = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = inputPhase == InputPhase.UnfocusedEmpty ? false : this.$isError;
        C0639i iVar = this.$interactionSource;
        int i2 = this.$$dirty1;
        long j = ((C1545s) a2Var.mo5225d(z, z2, iVar, dVar, ((this.$$dirty >> 27) & 14) | ((i2 << 3) & 896) | (i2 & 7168)).getValue()).f3366a;
        dVar.mo5406H();
        return j;
    }
}
