package androidx.compose.material;

import androidx.compose.p015ui.layout.C1681g;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 extends Lambda implements C19861p<C1681g, Integer, Integer> {
    public static final OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1 INSTANCE = new OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1();

    public OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((C1681g) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(C1681g gVar, int i) {
        C19383o.m32797g(gVar, "intrinsicMeasurable");
        return Integer.valueOf(gVar.mo6669z(i));
    }
}
