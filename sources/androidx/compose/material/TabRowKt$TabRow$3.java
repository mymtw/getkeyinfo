package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

public final class TabRowKt$TabRow$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $divider;
    public final /* synthetic */ C19862q<List<C1271y1>, C1302d, Integer, C19394m> $indicator;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ int $selectedTabIndex;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $tabs;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$3(int i, C1436d dVar, long j, long j2, C19862q<? super List<C1271y1>, ? super C1302d, ? super Integer, C19394m> qVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar2, int i2, int i3) {
        super(2);
        this.$selectedTabIndex = i;
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$indicator = qVar;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        TabRowKt.m2260a(this.$selectedTabIndex, this.$modifier, this.$backgroundColor, this.$contentColor, this.$indicator, this.$divider, this.$tabs, dVar, this.$$changed | 1, this.$$default);
    }
}
