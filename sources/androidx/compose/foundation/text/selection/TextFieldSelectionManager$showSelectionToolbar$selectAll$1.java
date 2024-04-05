package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p753kq.C19846a;

public final class TextFieldSelectionManager$showSelectionToolbar$selectAll$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$showSelectionToolbar$selectAll$1(TextFieldSelectionManager textFieldSelectionManager) {
        super(0);
        this.this$0 = textFieldSelectionManager;
    }

    public final void invoke() {
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        TextFieldValue e = TextFieldSelectionManager.m2039e(textFieldSelectionManager.mo4651j().f4448a, C0005b.m47l(0, textFieldSelectionManager.mo4651j().f4448a.f4296b.length()));
        textFieldSelectionManager.f2085c.invoke(e);
        textFieldSelectionManager.f2098p = TextFieldValue.m4312a(textFieldSelectionManager.f2098p, (C1913a) null, e.f4449b, 5);
        TextFieldState textFieldState = textFieldSelectionManager.f2086d;
        if (textFieldState != null) {
            textFieldState.f1952i = true;
        }
    }
}
