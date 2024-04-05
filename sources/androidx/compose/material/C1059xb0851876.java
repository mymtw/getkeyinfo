package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$sheetPlaceable$1 */
public final class C1059xb0851876 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<Integer, C1302d, Integer, C19394m> $bottomSheet;
    public final /* synthetic */ int $layoutHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1059xb0851876(C19862q<? super Integer, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$bottomSheet = qVar;
        this.$layoutHeight = i;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$bottomSheet.invoke(Integer.valueOf(this.$layoutHeight), dVar, Integer.valueOf((this.$$dirty >> 3) & 112));
        } else {
            dVar.mo5396C();
        }
    }
}
