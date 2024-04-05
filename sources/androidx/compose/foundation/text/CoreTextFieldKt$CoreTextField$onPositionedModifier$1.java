package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$onPositionedModifier$1 extends Lambda implements C19857l<C1689j, C19394m> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onPositionedModifier$1(TextFieldState textFieldState, boolean z, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$enabled = z;
        this.$manager = textFieldSelectionManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1689j) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1689j jVar) {
        C19383o.m32797g(jVar, "it");
        TextFieldState textFieldState = this.$state;
        textFieldState.f1949f = jVar;
        if (this.$enabled) {
            if (textFieldState.mo4560a() == HandleState.Selection) {
                if (this.$state.f1952i) {
                    this.$manager.mo4655n();
                } else {
                    this.$manager.mo4652k();
                }
                this.$state.f1953j.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.m2058b(this.$manager, true)));
                this.$state.f1954k.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.m2058b(this.$manager, false)));
            } else if (this.$state.mo4560a() == HandleState.Cursor) {
                this.$state.f1955l.setValue(Boolean.valueOf(TextFieldSelectionManagerKt.m2058b(this.$manager, true)));
            }
        }
        C0965r c = this.$state.mo4562c();
        if (c != null) {
            c.f2043b = jVar;
        }
    }
}
