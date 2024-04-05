package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class CoreTextFieldKt$SelectionToolbarAndHandles$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ boolean $show;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$SelectionToolbarAndHandles$2(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i) {
        super(2);
        this.$manager = textFieldSelectionManager;
        this.$show = z;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CoreTextFieldKt.m1960d(this.$manager, this.$show, dVar, this.$$changed | 1);
    }
}
