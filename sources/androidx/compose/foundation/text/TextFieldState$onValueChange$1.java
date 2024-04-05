package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldState$onValueChange$1 extends Lambda implements C19857l<TextFieldValue, C19394m> {
    public final /* synthetic */ TextFieldState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldState$onValueChange$1(TextFieldState textFieldState) {
        super(1);
        this.this$0 = textFieldState;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "it");
        if (!C19383o.m32792b(textFieldValue.f4448a.f4296b, this.this$0.f1944a.f2013a.f4296b)) {
            TextFieldState textFieldState = this.this$0;
            HandleState handleState = HandleState.None;
            textFieldState.getClass();
            C19383o.m32797g(handleState, "<set-?>");
            textFieldState.f1951h.setValue(handleState);
        }
        this.this$0.f1957n.invoke(textFieldValue);
        this.this$0.f1945b.invalidate();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C19394m.f43287a;
    }
}
