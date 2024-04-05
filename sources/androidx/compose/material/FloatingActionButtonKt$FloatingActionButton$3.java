package androidx.compose.material;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19861p;

public final class FloatingActionButtonKt$FloatingActionButton$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C1263w0 $elevation;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C1530k0 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$3(C19846a<C19394m> aVar, C1436d dVar, C0640j jVar, C1530k0 k0Var, long j, long j2, C1263w0 w0Var, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$onClick = aVar;
        this.$modifier = dVar;
        this.$interactionSource = jVar;
        this.$shape = k0Var;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = w0Var;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        FloatingActionButtonKt.m2183b(this.$onClick, this.$modifier, this.$interactionSource, this.$shape, this.$backgroundColor, this.$contentColor, this.$elevation, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
