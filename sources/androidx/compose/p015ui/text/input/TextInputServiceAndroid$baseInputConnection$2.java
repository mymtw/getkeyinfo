package androidx.compose.p015ui.text.input;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2 */
final class TextInputServiceAndroid$baseInputConnection$2 extends Lambda implements C19846a<BaseInputConnection> {
    public final /* synthetic */ TextInputServiceAndroid this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid$baseInputConnection$2(TextInputServiceAndroid textInputServiceAndroid) {
        super(0);
        this.this$0 = textInputServiceAndroid;
    }

    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.f4451a, false);
    }
}
