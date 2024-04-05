package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.state.ToggleableState;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class CheckboxKt$TriStateCheckbox$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1226r $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ ToggleableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$TriStateCheckbox$2(ToggleableState toggleableState, C19846a<C19394m> aVar, C1436d dVar, boolean z, C0640j jVar, C1226r rVar, int i, int i2) {
        super(2);
        this.$state = toggleableState;
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$enabled = z;
        this.$interactionSource = jVar;
        this.$colors = rVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CheckboxKt.m2172b(this.$state, this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$colors, dVar, this.$$changed | 1, this.$$default);
    }
}
