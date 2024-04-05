package com.etsy.collagecompose;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8416i;
import p753kq.C19857l;

public final class LoadingIndicatorKt$LoadingIndicator$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $arcColor;
    public final /* synthetic */ C1342k1<Integer> $currentRotation$delegate;
    public final /* synthetic */ C8416i $stroke;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingIndicatorKt$LoadingIndicator$1(C8416i iVar, long j, C1342k1<Integer> k1Var) {
        super(1);
        this.$stroke = iVar;
        this.$arcColor = j;
        this.$currentRotation$delegate = k1Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        int intValue = this.$currentRotation$delegate.getValue().intValue();
        int i = intValue < 180 ? intValue : 360 - intValue;
        float f = (float) intValue;
        float f2 = ((float) i) / 2.0f;
        float f3 = f - f2;
        Pair pair = new Pair(Float.valueOf(f3 - 90.0f), Float.valueOf((f + f2) - f3));
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        float f4 = (float) 2;
        float f5 = this.$stroke.f18434a / f4;
        float d = C8347f.m16656d(eVar.mo6913b()) - (f4 * f5);
        C8412e eVar2 = eVar;
        C8412e.m16788j0(eVar2, C1545s.m3356b(this.$arcColor, 0.2f), C19421p.m32952q(f5, f5), C0114h.m319t(d, d), this.$stroke);
        C8412e.m16781C(eVar2, this.$arcColor, floatValue, floatValue2, C19421p.m32952q(f5, f5), C0114h.m319t(d, d), this.$stroke);
    }
}
