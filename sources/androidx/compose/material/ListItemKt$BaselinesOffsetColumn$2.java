package androidx.compose.material;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7284d;
import p753kq.C19861p;

final class ListItemKt$BaselinesOffsetColumn$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ List<C7284d> $offsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListItemKt$BaselinesOffsetColumn$2(List<C7284d> list, C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$offsets = list;
        this.$modifier = dVar;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        C1270y0.m2406a(this.$offsets, this.$modifier, this.$content, dVar, this.$$changed | 1, this.$$default);
    }
}
