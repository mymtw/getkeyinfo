package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class BasicTextFieldKt$BasicTextField$7$1 extends Lambda implements C19857l<TextFieldValue, C19394m> {
    public final /* synthetic */ C19857l<TextFieldValue, C19394m> $onValueChange;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$7$1(TextFieldValue textFieldValue, C19857l<? super TextFieldValue, C19394m> lVar) {
        super(1);
        this.$value = textFieldValue;
        this.$onValueChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C19394m.f43287a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "it");
        if (!C19383o.m32792b(this.$value, textFieldValue)) {
            this.$onValueChange.invoke(textFieldValue);
        }
    }
}
