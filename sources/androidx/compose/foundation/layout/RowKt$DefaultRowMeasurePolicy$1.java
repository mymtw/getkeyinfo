package androidx.compose.foundation.layout;

import androidx.compose.p015ui.unit.LayoutDirection;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p753kq.C19864s;

public final class RowKt$DefaultRowMeasurePolicy$1 extends Lambda implements C19864s<Integer, int[], LayoutDirection, C7282b, int[], C19394m> {
    public static final RowKt$DefaultRowMeasurePolicy$1 INSTANCE = new RowKt$DefaultRowMeasurePolicy$1();

    public RowKt$DefaultRowMeasurePolicy$1() {
        super(5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (C7282b) obj4, (int[]) obj5);
        return C19394m.f43287a;
    }

    public final void invoke(int i, int[] iArr, LayoutDirection layoutDirection, C7282b bVar, int[] iArr2) {
        C19383o.m32797g(iArr, ResponseConstants.SIZE);
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        C19383o.m32797g(iArr2, "outPosition");
        C0718d.f1476a.mo4095c(i, iArr, layoutDirection, bVar, iArr2);
    }
}
