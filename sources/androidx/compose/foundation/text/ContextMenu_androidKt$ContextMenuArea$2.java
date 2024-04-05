package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ContextMenu_androidKt$ContextMenuArea$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ SelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$2(SelectionManager selectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$manager = selectionManager;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ContextMenu_androidKt.m1955a(this.$manager, this.$content, dVar, this.$$changed | 1);
    }
}
