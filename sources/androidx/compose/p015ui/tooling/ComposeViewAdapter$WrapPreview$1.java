package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1 */
public final class ComposeViewAdapter$WrapPreview$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ ComposeViewAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapter$WrapPreview$1(ComposeViewAdapter composeViewAdapter, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.this$0 = composeViewAdapter;
        this.$content = pVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            InspectableKt.m4484a(this.this$0.slotTableRecord, this.$content, dVar, (this.$$dirty << 3) & 112);
        } else {
            dVar.mo5396C();
        }
    }
}
