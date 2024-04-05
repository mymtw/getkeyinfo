package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SwitchKt$Switch$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ C1267x1 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onCheckedChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$4(boolean z, C19857l<? super Boolean, C19394m> lVar, C1436d dVar, boolean z2, C0640j jVar, C1267x1 x1Var, int i, int i2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = lVar;
        this.$modifier = dVar;
        this.$enabled = z2;
        this.$interactionSource = jVar;
        this.$colors = x1Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SwitchKt.m2253a(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, this.$interactionSource, this.$colors, dVar, this.$$changed | 1, this.$$default);
    }
}
