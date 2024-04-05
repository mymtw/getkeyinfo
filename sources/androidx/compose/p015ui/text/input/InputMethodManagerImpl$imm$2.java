package androidx.compose.p015ui.text.input;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2 */
public final class InputMethodManagerImpl$imm$2 extends Lambda implements C19846a<InputMethodManager> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputMethodManagerImpl$imm$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final InputMethodManager invoke() {
        Object systemService = this.$context.getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
