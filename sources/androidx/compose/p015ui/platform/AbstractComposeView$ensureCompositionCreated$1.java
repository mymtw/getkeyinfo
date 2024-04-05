package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1 */
public final class AbstractComposeView$ensureCompositionCreated$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ AbstractComposeView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView$ensureCompositionCreated$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.this$0 = abstractComposeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.this$0.Content(dVar, 8);
        } else {
            dVar.mo5396C();
        }
    }
}
