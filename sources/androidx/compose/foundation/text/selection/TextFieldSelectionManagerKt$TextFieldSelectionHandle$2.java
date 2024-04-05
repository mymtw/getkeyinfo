package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class TextFieldSelectionManagerKt$TextFieldSelectionHandle$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ResolvedTextDirection $direction;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ TextFieldSelectionManager $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i) {
        super(2);
        this.$isStartHandle = z;
        this.$direction = resolvedTextDirection;
        this.$manager = textFieldSelectionManager;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        TextFieldSelectionManagerKt.m2057a(this.$isStartHandle, this.$direction, this.$manager, dVar, this.$$changed | 1);
    }
}
