package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SelectionContainerKt$SelectionContainer$5 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $children;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C1011g, C19394m> $onSelectionChange;
    public final /* synthetic */ C1011g $selection;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$5(C1436d dVar, C1011g gVar, C19857l<? super C1011g, C19394m> lVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$selection = gVar;
        this.$onSelectionChange = lVar;
        this.$children = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        SelectionContainerKt.m2019a(this.$modifier, this.$selection, this.$onSelectionChange, this.$children, dVar, this.$$changed | 1, this.$$default);
    }
}
