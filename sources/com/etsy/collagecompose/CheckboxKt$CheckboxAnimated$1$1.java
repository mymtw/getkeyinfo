package com.etsy.collagecompose;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1515d0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import com.etsy.collagecompose.C12155h;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8415h;
import p297z.C8416i;
import p753kq.C19857l;

public final class CheckboxKt$CheckboxAnimated$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C1545s> $animatedBorderColor;
    public final /* synthetic */ C1342k1<C1545s> $animatedBoxColor;
    public final /* synthetic */ C12151f $checkCache;
    public final /* synthetic */ long $checkColor;
    public final /* synthetic */ C1342k1<Float> $checkDrawFraction;
    public final /* synthetic */ C12155h $size;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxAnimated$1$1(C1342k1<C1545s> k1Var, C1342k1<C1545s> k1Var2, C12155h hVar, C1342k1<Float> k1Var3, long j, C12151f fVar) {
        super(1);
        this.$animatedBoxColor = k1Var;
        this.$animatedBorderColor = k1Var2;
        this.$size = hVar;
        this.$checkDrawFraction = k1Var3;
        this.$checkColor = j;
        this.$checkCache = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        float f;
        C12155h.C12156a aVar;
        float f2;
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "$this$Canvas");
        float floor = (float) Math.floor((double) eVar2.mo3789B0(CheckboxKt.f27022c));
        long j = this.$animatedBoxColor.getValue().f3366a;
        long j2 = this.$animatedBorderColor.getValue().f3366a;
        C12155h hVar = this.$size;
        C12155h.C12156a aVar2 = C12155h.C12156a.f27093a;
        if (C19383o.m32792b(hVar, aVar2)) {
            f = CheckboxKt.f27025f;
        } else if (C19383o.m32792b(hVar, C12155h.C12157b.f27094a)) {
            f = CheckboxKt.f27026g;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float B0 = eVar2.mo3789B0(f);
        float f3 = floor / 2.0f;
        C8416i iVar = new C8416i(floor, 0.0f, 0, 0, 30);
        float d = C8347f.m16656d(eVar.mo6913b());
        if (C1545s.m3357c(j, j2)) {
            C8412e.m16791u0(eVar, j, 0, C0114h.m319t(d, d), C0114h.m317s(B0, B0), C8415h.f18433a, 226);
            aVar = aVar2;
        } else {
            long q = C19421p.m32952q(floor, floor);
            float f4 = d - (((float) 2) * floor);
            long t = C0114h.m319t(f4, f4);
            float max = Math.max(0.0f, B0 - floor);
            float f5 = f3;
            aVar = aVar2;
            C8412e.m16791u0(eVar, j, q, t, C0114h.m317s(max, max), C8415h.f18433a, 224);
            float f6 = d - floor;
            float f7 = B0 - f5;
            C8412e.m16791u0(eVar, j2, C19421p.m32952q(f5, f5), C0114h.m319t(f6, f6), C0114h.m317s(f7, f7), iVar, 224);
        }
        C12155h hVar2 = this.$size;
        if (C19383o.m32792b(hVar2, aVar)) {
            f2 = CheckboxKt.f27023d;
        } else if (C19383o.m32792b(hVar2, C12155h.C12157b.f27094a)) {
            f2 = CheckboxKt.f27024e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        float floor2 = (float) Math.floor((double) eVar.mo3789B0(f2));
        float floatValue = this.$checkDrawFraction.getValue().floatValue();
        long j3 = this.$checkColor;
        C12151f fVar = this.$checkCache;
        C8416i iVar2 = new C8416i(floor2, 0.0f, 1, 0, 26);
        float d2 = C8347f.m16656d(eVar.mo6913b());
        fVar.f27088a.reset();
        fVar.f27088a.mo6280g(0.2f * d2, 0.5f * d2);
        fVar.f27088a.mo6286m(0.4f * d2, 0.7f * d2);
        fVar.f27088a.mo6286m(0.8f * d2, d2 * 0.25f);
        fVar.f27089b.mo6324b(fVar.f27088a);
        fVar.f27090c.reset();
        C1515d0 d0Var = fVar.f27089b;
        d0Var.mo6323a(0.0f, d0Var.getLength() * floatValue, fVar.f27090c);
        C8412e.m16782E(eVar, fVar.f27090c, j3, iVar2, 52);
    }
}
