package com.etsy.collagecompose;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7284d;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8415h;
import p297z.C8416i;
import p753kq.C19857l;

public final class RadioButtonKt$RadioAnimated$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C1545s> $animatedBorderColor;
    public final /* synthetic */ C1342k1<C1545s> $animatedFillColor;
    public final /* synthetic */ long $dotColor;
    public final /* synthetic */ C1342k1<C7284d> $dotRadiusAnimated;
    public final /* synthetic */ C1342k1<C7284d> $fillRadiusAnimated;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioAnimated$1$1(C1342k1<C1545s> k1Var, C1342k1<C1545s> k1Var2, C1342k1<C7284d> k1Var3, C1342k1<C7284d> k1Var4, long j) {
        super(1);
        this.$animatedFillColor = k1Var;
        this.$animatedBorderColor = k1Var2;
        this.$fillRadiusAnimated = k1Var3;
        this.$dotRadiusAnimated = k1Var4;
        this.$dotColor = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "$this$Canvas");
        float floor = (float) Math.floor((double) eVar2.mo3789B0(RadioButtonKt.f27054c));
        long j = this.$animatedFillColor.getValue().f3366a;
        long j2 = this.$animatedBorderColor.getValue().f3366a;
        float B0 = eVar2.mo3789B0(this.$fillRadiusAnimated.getValue().f16155b);
        if (C1545s.m3357c(j, j2)) {
            C8412e.m16793y(eVar, j, B0, 0, C8415h.f18433a, 108);
        } else {
            C8412e.m16793y(eVar, j, B0, 0, C8415h.f18433a, 108);
            float f = (float) 2;
            C8412e.m16793y(eVar, j2, (C8347f.m16656d(eVar.mo6913b()) / f) - (floor / f), 0, new C8416i(floor, 0.0f, 0, 0, 30), 108);
        }
        if (Float.compare(this.$dotRadiusAnimated.getValue().f16155b, (float) 0) > 0) {
            C8412e.m16793y(eVar, this.$dotColor, eVar2.mo3789B0(this.$dotRadiusAnimated.getValue().f16155b), 0, C8415h.f18433a, 108);
        }
    }
}
