package androidx.compose.material;

import androidx.compose.foundation.layout.C0718d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19857l;

public final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ List<Integer> $crossAxisPositions;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ List<List<C1686i0>> $sequences;
    public final /* synthetic */ C1713x $this_Layout;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<C1686i0>> list, C1713x xVar, float f, int i, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = xVar;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        C19383o.m32797g(aVar, "$this$layout");
        List<List<C1686i0>> list = this.$sequences;
        C1713x xVar = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            List list3 = list.get(i3);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i4 = i2;
            while (i4 < size2) {
                iArr[i4] = ((C1686i0) list3.get(i4)).f3722b + (i4 < C17782b.m29859Y(list3) ? xVar.mo3791V(f) : i2);
                i4++;
            }
            C0718d.C0719a aVar2 = C0718d.f1479d;
            int[] iArr2 = new int[size2];
            for (int i5 = i2; i5 < size2; i5++) {
                iArr2[i5] = i2;
            }
            aVar2.mo4092b(xVar, i, iArr, iArr2);
            int size3 = list3.size();
            for (int i6 = i2; i6 < size3; i6++) {
                C1686i0.C1687a.m3581c((C1686i0) list3.get(i6), iArr2[i6], list2.get(i3).intValue(), 0.0f);
            }
            i3++;
            i2 = 0;
        }
    }
}
