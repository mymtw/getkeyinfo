package androidx.compose.foundation.layout;

import androidx.compose.p015ui.layout.C1665a;
import androidx.compose.p015ui.layout.C1679f;
import androidx.compose.p015ui.layout.C1686i0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7284d;
import p753kq.C19857l;

final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1665a $alignmentLine;
    public final /* synthetic */ float $before;
    public final /* synthetic */ int $height;
    public final /* synthetic */ int $paddingAfter;
    public final /* synthetic */ int $paddingBefore;
    public final /* synthetic */ C1686i0 $placeable;
    public final /* synthetic */ int $width;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(C1665a aVar, float f, int i, int i2, int i3, C1686i0 i0Var, int i4) {
        super(1);
        this.$alignmentLine = aVar;
        this.$before = f;
        this.$paddingBefore = i;
        this.$width = i2;
        this.$paddingAfter = i3;
        this.$placeable = i0Var;
        this.$height = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        int i;
        C19383o.m32797g(aVar, "$this$layout");
        int i2 = 0;
        if (this.$alignmentLine instanceof C1679f) {
            i = 0;
        } else if (!C7284d.m13983a(this.$before, Float.NaN)) {
            i = this.$paddingBefore;
        } else {
            i = (this.$width - this.$paddingAfter) - this.$placeable.f3722b;
        }
        if (this.$alignmentLine instanceof C1679f) {
            if (!C7284d.m13983a(this.$before, Float.NaN)) {
                i2 = this.$paddingBefore;
            } else {
                i2 = (this.$height - this.$paddingAfter) - this.$placeable.f3723c;
            }
        }
        C1686i0.C1687a.m3583e(aVar, this.$placeable, i, i2);
    }
}
