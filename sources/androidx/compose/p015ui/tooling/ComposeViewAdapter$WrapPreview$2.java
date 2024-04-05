package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$2 */
public final class ComposeViewAdapter$WrapPreview$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ ComposeViewAdapter $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$WrapPreview$2(ComposeViewAdapter composeViewAdapter, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$tmp0_rcvr = composeViewAdapter;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.WrapPreview(this.$content, dVar, this.$$changed | 1);
    }
}
