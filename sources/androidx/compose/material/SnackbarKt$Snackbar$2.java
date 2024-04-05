package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class SnackbarKt$Snackbar$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $action;
    public final /* synthetic */ boolean $actionOnNewLine;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$2(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, boolean z, C1530k0 k0Var, long j, long j2, float f, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$action = pVar;
        this.$actionOnNewLine = z;
        this.$shape = k0Var;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = f;
        this.$content = pVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SnackbarKt.m2227a(this.$modifier, this.$action, this.$actionOnNewLine, this.$shape, this.$backgroundColor, this.$contentColor, this.$elevation, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
