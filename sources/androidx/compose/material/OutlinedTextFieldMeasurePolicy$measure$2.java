package androidx.compose.material;

import androidx.compose.foundation.layout.C0759v;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p173m.C7279a;
import p174m0.C7287g;
import p753kq.C19857l;

public final class OutlinedTextFieldMeasurePolicy$measure$2 extends Lambda implements C19857l<C1686i0.C1687a, C19394m> {
    public final /* synthetic */ C1686i0 $borderPlaceable;
    public final /* synthetic */ int $height;
    public final /* synthetic */ C1686i0 $labelPlaceable;
    public final /* synthetic */ C1686i0 $leadingPlaceable;
    public final /* synthetic */ C1686i0 $placeholderPlaceable;
    public final /* synthetic */ C1686i0 $textFieldPlaceable;
    public final /* synthetic */ C1713x $this_measure;
    public final /* synthetic */ C1686i0 $trailingPlaceable;
    public final /* synthetic */ int $width;
    public final /* synthetic */ OutlinedTextFieldMeasurePolicy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldMeasurePolicy$measure$2(int i, int i2, C1686i0 i0Var, C1686i0 i0Var2, C1686i0 i0Var3, C1686i0 i0Var4, C1686i0 i0Var5, C1686i0 i0Var6, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, C1713x xVar) {
        super(1);
        this.$height = i;
        this.$width = i2;
        this.$leadingPlaceable = i0Var;
        this.$trailingPlaceable = i0Var2;
        this.$textFieldPlaceable = i0Var3;
        this.$labelPlaceable = i0Var4;
        this.$placeholderPlaceable = i0Var5;
        this.$borderPlaceable = i0Var6;
        this.this$0 = outlinedTextFieldMeasurePolicy;
        this.$this_measure = xVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1686i0.C1687a) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1686i0.C1687a aVar) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        float f2;
        C1686i0.C1687a aVar2 = aVar;
        C19383o.m32797g(aVar2, "$this$layout");
        int i6 = this.$height;
        int i7 = this.$width;
        C1686i0 i0Var = this.$leadingPlaceable;
        C1686i0 i0Var2 = this.$trailingPlaceable;
        C1686i0 i0Var3 = this.$textFieldPlaceable;
        C1686i0 i0Var4 = this.$labelPlaceable;
        C1686i0 i0Var5 = this.$placeholderPlaceable;
        C1686i0 i0Var6 = this.$borderPlaceable;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this.this$0;
        float f3 = outlinedTextFieldMeasurePolicy.f2248c;
        boolean z = outlinedTextFieldMeasurePolicy.f2247b;
        float density = this.$this_measure.getDensity();
        LayoutDirection layoutDirection = this.$this_measure.getLayoutDirection();
        C0759v vVar = this.this$0.f2249d;
        float f4 = OutlinedTextFieldKt.f2243a;
        int l = C7279a.m13954l(vVar.mo4153d() * density);
        int l2 = C7279a.m13954l(C15588c1.m25290L(vVar, layoutDirection) * density);
        float f5 = TextFieldImplKt.f2331c * density;
        if (i0Var != null) {
            i = l;
            C1686i0.C1687a.m3583e(aVar2, i0Var, 0, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i6 - i0Var.f3723c)) / 2.0f)));
        } else {
            i = l;
        }
        if (i0Var2 != null) {
            C1686i0.C1687a.m3583e(aVar2, i0Var2, i7 - i0Var2.f3722b, C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i6 - i0Var2.f3723c)) / 2.0f)));
        }
        if (i0Var4 != null) {
            if (z) {
                i4 = 1;
                i5 = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i6 - i0Var4.f3723c)) / 2.0f));
            } else {
                i4 = 1;
                i5 = i;
            }
            float f6 = ((float) i4) - f3;
            float f7 = (((float) i5) * f6) - (((float) (i0Var4.f3723c / 2)) * f3);
            if (i0Var == null) {
                f2 = 0.0f;
            } else {
                f2 = (((float) TextFieldImplKt.m2271e(i0Var)) - f5) * f6;
            }
            C1686i0.C1687a.m3583e(aVar2, i0Var4, C7279a.m13954l(f2) + l2, C7279a.m13954l(f7));
        }
        if (z) {
            i2 = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i6 - i0Var3.f3723c)) / 2.0f));
        } else {
            i2 = i;
        }
        C1686i0.C1687a.m3583e(aVar2, i0Var3, TextFieldImplKt.m2271e(i0Var), Math.max(i2, TextFieldImplKt.m2270d(i0Var4) / 2));
        if (i0Var5 != null) {
            if (z) {
                f = 0.0f;
                i3 = C7279a.m13954l((((float) 1) + 0.0f) * (((float) (i6 - i0Var5.f3723c)) / 2.0f));
            } else {
                f = 0.0f;
                i3 = i;
            }
            C1686i0.C1687a.m3583e(aVar2, i0Var5, TextFieldImplKt.m2271e(i0Var), i3);
        } else {
            f = 0.0f;
        }
        C1686i0.C1687a.m3582d(i0Var6, C7287g.f16164b, f);
    }
}
