package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p753kq.C19857l;

public final class TextFieldMeasurePolicy$measure$1 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ int $effectiveLabelBaseline;
    public final /* synthetic */ int $height;
    public final /* synthetic */ C1686i0 $labelPlaceable;
    public final /* synthetic */ int $lastBaseline;
    public final /* synthetic */ C1686i0 $leadingPlaceable;
    public final /* synthetic */ C1686i0 $placeholderPlaceable;
    public final /* synthetic */ C1686i0 $textFieldPlaceable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ int $topPadding;
    public final /* synthetic */ int $topPaddingValue;
    public final /* synthetic */ C1686i0 $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ TextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldMeasurePolicy$measure$1(C1686i0 i0Var, int i, int i2, int i3, int i4, C1686i0 i0Var2, C1686i0 i0Var3, C1686i0 i0Var4, C1686i0 i0Var5, TextFieldMeasurePolicy textFieldMeasurePolicy, int i5, int i6, C1713x xVar) {
        super(1);
        this.$labelPlaceable = i0Var;
        this.$topPaddingValue = i;
        this.$lastBaseline = i2;
        this.$width = i3;
        this.$height = i4;
        this.$textFieldPlaceable = i0Var2;
        this.$placeholderPlaceable = i0Var3;
        this.$leadingPlaceable = i0Var4;
        this.$trailingPlaceable = i0Var5;
        this.this$0 = textFieldMeasurePolicy;
        this.$effectiveLabelBaseline = i5;
        this.$topPadding = i6;
        this.$this_measure = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        int i;
        int i2;
        C1686i0.C1687a aVar2 = aVar;
        C19383o.m32797g(aVar2, "$this$layout");
        C1686i0 i0Var = this.$labelPlaceable;
        if (i0Var != null) {
            int i3 = this.$topPaddingValue - this.$lastBaseline;
            if (i3 < 0) {
                i3 = 0;
            }
            int i4 = this.$width;
            int i5 = this.$height;
            C1686i0 i0Var2 = this.$textFieldPlaceable;
            C1686i0 i0Var3 = this.$placeholderPlaceable;
            C1686i0 i0Var4 = this.$leadingPlaceable;
            C1686i0 i0Var5 = this.$trailingPlaceable;
            TextFieldMeasurePolicy textFieldMeasurePolicy = this.this$0;
            boolean z = textFieldMeasurePolicy.f2337a;
            int i6 = this.$topPadding + this.$effectiveLabelBaseline;
            float f = textFieldMeasurePolicy.f2338b;
            float density = this.$this_measure.getDensity();
            float f2 = TextFieldKt.f2334a;
            if (i0Var4 != null) {
                C1686i0.C1687a.m3583e(aVar2, i0Var4, 0, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i5 - i0Var4.f3723c)) / 2.0f)));
            }
            if (i0Var5 != null) {
                C1686i0.C1687a.m3583e(aVar2, i0Var5, i4 - i0Var5.f3722b, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i5 - i0Var5.f3723c)) / 2.0f)));
            }
            if (z) {
                i2 = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i5 - i0Var.f3723c)) / 2.0f));
            } else {
                i2 = C7279a.m13954l(TextFieldImplKt.f2330b * density);
            }
            C1686i0.C1687a.m3583e(aVar2, i0Var, TextFieldImplKt.m2271e(i0Var4), i2 - C7279a.m13954l(((float) (i2 - i3)) * f));
            C1686i0.C1687a.m3583e(aVar2, i0Var2, TextFieldImplKt.m2271e(i0Var4), i6);
            if (i0Var3 != null) {
                C1686i0.C1687a.m3583e(aVar2, i0Var3, TextFieldImplKt.m2271e(i0Var4), i6);
            }
            return;
        }
        int i7 = this.$width;
        int i8 = this.$height;
        C1686i0 i0Var6 = this.$textFieldPlaceable;
        C1686i0 i0Var7 = this.$placeholderPlaceable;
        C1686i0 i0Var8 = this.$leadingPlaceable;
        C1686i0 i0Var9 = this.$trailingPlaceable;
        boolean z2 = this.this$0.f2337a;
        float density2 = this.$this_measure.getDensity();
        C0759v vVar = this.this$0.f2339c;
        float f3 = TextFieldKt.f2334a;
        int l = C7279a.m13954l(vVar.mo4153d() * density2);
        if (i0Var8 != null) {
            C1686i0.C1687a.m3583e(aVar2, i0Var8, 0, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i8 - i0Var8.f3723c)) / 2.0f)));
        }
        if (i0Var9 != null) {
            C1686i0.C1687a.m3583e(aVar2, i0Var9, i7 - i0Var9.f3722b, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i8 - i0Var9.f3723c)) / 2.0f)));
        }
        if (z2) {
            i = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i8 - i0Var6.f3723c)) / 2.0f));
        } else {
            i = l;
        }
        C1686i0.C1687a.m3583e(aVar2, i0Var6, TextFieldImplKt.m2271e(i0Var8), i);
        if (i0Var7 != null) {
            if (z2) {
                l = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i8 - i0Var7.f3723c)) / 2.0f));
            }
            C1686i0.C1687a.m3583e(aVar2, i0Var7, TextFieldImplKt.m2271e(i0Var8), l);
        }
    }
}
