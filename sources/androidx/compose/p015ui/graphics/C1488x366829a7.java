package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.platform.C1859o0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1 */
public final class C1488x366829a7 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ float $alpha$inlined;
    public final /* synthetic */ long $ambientShadowColor$inlined;
    public final /* synthetic */ float $cameraDistance$inlined;
    public final /* synthetic */ boolean $clip$inlined;
    public final /* synthetic */ C1520f0 $renderEffect$inlined;
    public final /* synthetic */ float $rotationX$inlined;
    public final /* synthetic */ float $rotationY$inlined;
    public final /* synthetic */ float $rotationZ$inlined;
    public final /* synthetic */ float $scaleX$inlined;
    public final /* synthetic */ float $scaleY$inlined;
    public final /* synthetic */ float $shadowElevation$inlined;
    public final /* synthetic */ C1530k0 $shape$inlined;
    public final /* synthetic */ long $spotShadowColor$inlined;
    public final /* synthetic */ long $transformOrigin$inlined;
    public final /* synthetic */ float $translationX$inlined;
    public final /* synthetic */ float $translationY$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1488x366829a7(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C1530k0 k0Var, boolean z, C1520f0 f0Var, long j2, long j3) {
        super(1);
        this.$scaleX$inlined = f;
        this.$scaleY$inlined = f2;
        this.$alpha$inlined = f3;
        this.$translationX$inlined = f4;
        this.$translationY$inlined = f5;
        this.$shadowElevation$inlined = f6;
        this.$rotationX$inlined = f7;
        this.$rotationY$inlined = f8;
        this.$rotationZ$inlined = f9;
        this.$cameraDistance$inlined = f10;
        this.$transformOrigin$inlined = j;
        this.$shape$inlined = k0Var;
        this.$clip$inlined = z;
        this.$renderEffect$inlined = f0Var;
        this.$ambientShadowColor$inlined = j2;
        this.$spotShadowColor$inlined = j3;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$scaleX$inlined), "scaleX");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$scaleY$inlined), "scaleY");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$alpha$inlined), "alpha");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$translationX$inlined), "translationX");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$translationY$inlined), "translationY");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$shadowElevation$inlined), "shadowElevation");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$rotationX$inlined), "rotationX");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$rotationY$inlined), "rotationY");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$rotationZ$inlined), "rotationZ");
        o0Var.f4114b.mo7222b(Float.valueOf(this.$cameraDistance$inlined), "cameraDistance");
        o0Var.f4114b.mo7222b(new C1540p0(this.$transformOrigin$inlined), "transformOrigin");
        o0Var.f4114b.mo7222b(this.$shape$inlined, "shape");
        o0Var.f4114b.mo7222b(Boolean.valueOf(this.$clip$inlined), "clip");
        o0Var.f4114b.mo7222b(this.$renderEffect$inlined, "renderEffect");
        o0Var.f4114b.mo7222b(new C1545s(this.$ambientShadowColor$inlined), "ambientShadowColor");
        o0Var.f4114b.mo7222b(new C1545s(this.$spotShadowColor$inlined), "spotShadowColor");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
