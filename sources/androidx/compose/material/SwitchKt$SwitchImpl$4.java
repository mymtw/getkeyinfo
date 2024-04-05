package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.layout.C0733f;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SwitchKt$SwitchImpl$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C1267x1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ C0733f $this_SwitchImpl;
    public final /* synthetic */ C1342k1<Float> $thumbValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$4(C0733f fVar, boolean z, boolean z2, C1267x1 x1Var, C1342k1<Float> k1Var, C0639i iVar, int i) {
        super(2);
        this.$this_SwitchImpl = fVar;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = x1Var;
        this.$thumbValue = k1Var;
        this.$interactionSource = iVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SwitchKt.m2254b(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$interactionSource, dVar, this.$$changed | 1);
    }
}
