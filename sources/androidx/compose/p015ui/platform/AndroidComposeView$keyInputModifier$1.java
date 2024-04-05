package androidx.compose.p015ui.platform;

import android.view.KeyEvent;
import androidx.compose.p015ui.focus.C1465a;
import androidx.compose.p015ui.input.key.C1612b;
import androidx.compose.p015ui.input.key.C1613c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1 */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements C19857l<C1612b, Boolean> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m34799invokeZmokQxo(((C1612b) obj).f3587a);
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m34799invokeZmokQxo(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "it");
        C1465a r0 = this.this$0.m34793getFocusDirectionP8AzH3I(keyEvent);
        if (r0 != null) {
            if (C1613c.m3424b(keyEvent) == 2) {
                return Boolean.valueOf(this.this$0.getFocusManager().mo6184a(r0.f3173a));
            }
        }
        return Boolean.FALSE;
    }
}
