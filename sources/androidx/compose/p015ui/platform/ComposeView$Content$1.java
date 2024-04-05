package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.ComposeView$Content$1 */
public final class ComposeView$Content$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ ComposeView $tmp1_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(ComposeView composeView, int i) {
        super(2);
        this.$tmp1_rcvr = composeView;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp1_rcvr.Content(dVar, this.$$changed | 1);
    }
}
