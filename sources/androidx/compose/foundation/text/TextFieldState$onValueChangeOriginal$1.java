package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldState$onValueChangeOriginal$1 extends Lambda implements C19857l<TextFieldValue, C19394m> {
    public static final TextFieldState$onValueChangeOriginal$1 INSTANCE = new TextFieldState$onValueChangeOriginal$1();

    public TextFieldState$onValueChangeOriginal$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C19394m.f43287a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "it");
    }
}
