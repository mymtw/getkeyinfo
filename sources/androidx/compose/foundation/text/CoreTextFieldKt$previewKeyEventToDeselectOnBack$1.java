package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.input.key.C1612b;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class CoreTextFieldKt$previewKeyEventToDeselectOnBack$1 extends Lambda implements C19857l<C1612b, Boolean> {
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$manager = textFieldSelectionManager;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34705invokeZmokQxo(((C1612b) obj).f3587a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean m34705invokeZmokQxo(android.view.KeyEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "keyEvent"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            androidx.compose.foundation.text.TextFieldState r0 = r4.$state
            androidx.compose.foundation.text.HandleState r0 = r0.mo4560a()
            androidx.compose.foundation.text.HandleState r1 = androidx.compose.foundation.text.HandleState.Selection
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x002f
            int r0 = r5.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L_0x0025
            int r5 = androidx.compose.p015ui.input.key.C1613c.m3424b(r5)
            if (r5 != r3) goto L_0x0020
            r5 = r3
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            if (r5 == 0) goto L_0x0025
            r5 = r3
            goto L_0x0026
        L_0x0025:
            r5 = r2
        L_0x0026:
            if (r5 == 0) goto L_0x002f
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = r4.$manager
            r0 = 0
            r5.mo4648g(r0)
            r2 = r3
        L_0x002f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$previewKeyEventToDeselectOnBack$1.m34705invokeZmokQxo(android.view.KeyEvent):java.lang.Boolean");
    }
}
