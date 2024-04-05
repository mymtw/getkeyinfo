package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.SaversKt;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1 */
public final class TextFieldValue$Companion$Saver$1 extends Lambda implements C19861p<C1375i, TextFieldValue, Object> {
    public static final TextFieldValue$Companion$Saver$1 INSTANCE = new TextFieldValue$Companion$Saver$1();

    public TextFieldValue$Companion$Saver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, TextFieldValue textFieldValue) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(textFieldValue, "it");
        return C17782b.m29888u(SaversKt.m4209a(textFieldValue.f4448a, SaversKt.f4276a, iVar), SaversKt.m4209a(new C2022r(textFieldValue.f4449b), SaversKt.f4287l, iVar));
    }
}
