package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class AlertDialogKt$AlertDialogFlowRow$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ float $crossAxisSpacing;
    public final /* synthetic */ float $mainAxisSpacing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$2(float f, float f2, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        AlertDialogKt.m2160c(this.$mainAxisSpacing, this.$crossAxisSpacing, this.$content, dVar, this.$$changed | 1);
    }
}
