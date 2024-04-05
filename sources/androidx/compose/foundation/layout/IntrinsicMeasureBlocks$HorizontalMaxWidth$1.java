package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1681g;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

public final class IntrinsicMeasureBlocks$HorizontalMaxWidth$1 extends Lambda implements C19862q<List<? extends C1681g>, Integer, Integer, Integer> {
    public static final IntrinsicMeasureBlocks$HorizontalMaxWidth$1 INSTANCE = new IntrinsicMeasureBlocks$HorizontalMaxWidth$1();

    public IntrinsicMeasureBlocks$HorizontalMaxWidth$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((List<? extends C1681g>) (List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final Integer invoke(List<? extends C1681g> list, int i, int i2) {
        C19383o.m32797g(list, "measurables");
        C06541 r2 = C06541.INSTANCE;
        C06552 r3 = C06552.INSTANCE;
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return Integer.valueOf(C0761x.m1739q(list, r2, r3, i, i2, layoutOrientation, layoutOrientation));
    }
}
