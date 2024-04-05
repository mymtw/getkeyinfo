package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class CoreTextFieldKt$CoreTextFieldRootBox$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextFieldRootBox$2(C1436d dVar, TextFieldSelectionManager textFieldSelectionManager, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$manager = textFieldSelectionManager;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        CoreTextFieldKt.m1958b(this.$modifier, this.$manager, this.$content, dVar, this.$$changed | 1);
    }
}
