package androidx.compose.material;

import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class AppBarKt$TopAppBar$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $actions;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $navigationIcon;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $title;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBarKt$TopAppBar$2(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, long j, long j2, float f, int i, int i2) {
        super(2);
        this.$title = pVar;
        this.$modifier = dVar;
        this.$navigationIcon = pVar2;
        this.$actions = qVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AppBarKt.m2166b(this.$title, this.$modifier, this.$navigationIcon, this.$actions, this.$backgroundColor, this.$contentColor, this.$elevation, dVar, this.$$changed | 1, this.$$default);
    }
}
