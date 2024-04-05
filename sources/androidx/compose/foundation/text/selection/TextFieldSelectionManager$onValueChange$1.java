package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldSelectionManager$onValueChange$1 extends Lambda implements C19857l<TextFieldValue, C19394m> {
    public static final TextFieldSelectionManager$onValueChange$1 INSTANCE = new TextFieldSelectionManager$onValueChange$1();

    public TextFieldSelectionManager$onValueChange$1() {
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
