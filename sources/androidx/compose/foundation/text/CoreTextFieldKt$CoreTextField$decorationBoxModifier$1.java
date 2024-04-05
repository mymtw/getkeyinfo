package androidx.compose.foundation.text;

import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        C0965r c = this.$state.mo4562c();
        if (c != null) {
            c.f2044c = jVar;
        }
    }
}
