package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.PopupLayout$Content$4 */
public final class PopupLayout$Content$4 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ PopupLayout $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$Content$4(PopupLayout popupLayout, int i) {
        super(2);
        this.$tmp0_rcvr = popupLayout;
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
