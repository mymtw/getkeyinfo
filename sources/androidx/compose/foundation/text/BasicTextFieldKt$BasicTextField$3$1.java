package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class BasicTextFieldKt$BasicTextField$3$1 extends Lambda implements C19857l<TextFieldValue, C19394m> {
    public final /* synthetic */ C1338j0<String> $lastTextValue$delegate;
    public final /* synthetic */ C19857l<String, C19394m> $onValueChange;
    public final /* synthetic */ C1338j0<TextFieldValue> $textFieldValueState$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$3$1(C19857l<? super String, C19394m> lVar, C1338j0<TextFieldValue> j0Var, C1338j0<String> j0Var2) {
        super(1);
        this.$onValueChange = lVar;
        this.$textFieldValueState$delegate = j0Var;
        this.$lastTextValue$delegate = j0Var2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextFieldValue) obj);
        return C19394m.f43287a;
    }

    public final void invoke(TextFieldValue textFieldValue) {
        C19383o.m32797g(textFieldValue, "newTextFieldValueState");
        this.$textFieldValueState$delegate.setValue(textFieldValue);
        boolean z = !C19383o.m32792b(this.$lastTextValue$delegate.getValue(), textFieldValue.f4448a.f4296b);
        this.$lastTextValue$delegate.setValue(textFieldValue.f4448a.f4296b);
        if (z) {
            this.$onValueChange.invoke(textFieldValue.f4448a.f4296b);
        }
    }
}
