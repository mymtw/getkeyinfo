package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.runtime.C1302d;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;

/* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1$bodyPlaceable$1 */
public final class C1058xcc9d0b25 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C19862q<C0759v, C1302d, Integer, C19394m> $body;
    public final /* synthetic */ float $sheetPeekHeight;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1058xcc9d0b25(C19862q<? super C0759v, ? super C1302d, ? super Integer, C19394m> qVar, float f, int i) {
        super(2);
        this.$body = qVar;
        this.$sheetPeekHeight = f;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            this.$body.invoke(C15588c1.m25322e(0.0f, 0.0f, this.$sheetPeekHeight, 7), dVar, Integer.valueOf(this.$$dirty & 112));
        } else {
            dVar.mo5396C();
        }
    }
}
