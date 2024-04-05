package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.InspectableKt$Inspectable$1 */
public final class InspectableKt$Inspectable$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C2055b $compositionDataRecord;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InspectableKt$Inspectable$1(C2055b bVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$compositionDataRecord = bVar;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        InspectableKt.m4484a(this.$compositionDataRecord, this.$content, dVar, this.$$changed | 1);
    }
}
