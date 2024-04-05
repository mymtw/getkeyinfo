package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.DialogLayout$Content$4 */
public final class DialogLayout$Content$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ DialogLayout $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout$Content$4(DialogLayout dialogLayout, int i) {
        super(2);
        this.$tmp0_rcvr = dialogLayout;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.Content(dVar, this.$$changed | 1);
    }
}
