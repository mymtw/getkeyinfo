package androidx.compose.material;

import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldDefaults$BorderBox$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1166a2 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ float $focusedBorderThickness;
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ C1530k0 $shape;
    public final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    public final /* synthetic */ float $unfocusedBorderThickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$BorderBox$1(TextFieldDefaults textFieldDefaults, boolean z, boolean z2, C0639i iVar, C1166a2 a2Var, C1530k0 k0Var, float f, float f2, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = iVar;
        this.$colors = a2Var;
        this.$shape = k0Var;
        this.$focusedBorderThickness = f;
        this.$unfocusedBorderThickness = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo5164a(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$shape, this.$focusedBorderThickness, this.$unfocusedBorderThickness, dVar, this.$$changed | 1, this.$$default);
    }
}
