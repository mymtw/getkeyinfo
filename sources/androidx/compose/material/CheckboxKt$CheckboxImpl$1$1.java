package androidx.compose.material;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1515d0;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1342k1;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p288y.C8347f;
import p297z.C8412e;
import p297z.C8415h;
import p297z.C8416i;
import p753kq.C19857l;

public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1342k1<C1545s> $borderColor$delegate;
    public final /* synthetic */ C1342k1<C1545s> $boxColor$delegate;
    public final /* synthetic */ C1223q $checkCache;
    public final /* synthetic */ C1342k1<Float> $checkCenterGravitationShiftFraction$delegate;
    public final /* synthetic */ C1342k1<C1545s> $checkColor$delegate;
    public final /* synthetic */ C1342k1<Float> $checkDrawFraction$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(C1223q qVar, C1342k1<C1545s> k1Var, C1342k1<C1545s> k1Var2, C1342k1<C1545s> k1Var3, C1342k1<Float> k1Var4, C1342k1<Float> k1Var5) {
        super(1);
        this.$checkCache = qVar;
        this.$boxColor$delegate = k1Var;
        this.$borderColor$delegate = k1Var2;
        this.$checkColor$delegate = k1Var3;
        this.$checkDrawFraction$delegate = k1Var4;
        this.$checkCenterGravitationShiftFraction$delegate = k1Var5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C8412e eVar2 = eVar;
        C19383o.m32797g(eVar2, "$this$Canvas");
        float floor = (float) Math.floor((double) eVar2.mo3789B0(CheckboxKt.f2184d));
        long j = this.$boxColor$delegate.getValue().f3366a;
        long j2 = this.$borderColor$delegate.getValue().f3366a;
        float B0 = eVar2.mo3789B0(CheckboxKt.f2185e);
        float f = floor / 2.0f;
        C8416i iVar = new C8416i(floor, 0.0f, 0, 0, 30);
        float d = C8347f.m16656d(eVar.mo6913b());
        if (C1545s.m3357c(j, j2)) {
            C8412e.m16791u0(eVar, j, 0, C0114h.m319t(d, d), C0114h.m317s(B0, B0), C8415h.f18433a, 226);
        } else {
            long q = C19421p.m32952q(floor, floor);
            float f2 = d - (((float) 2) * floor);
            long t = C0114h.m319t(f2, f2);
            float max = Math.max(0.0f, B0 - floor);
            long j3 = t;
            float f3 = f;
            C8412e.m16791u0(eVar, j, q, j3, C0114h.m317s(max, max), C8415h.f18433a, 224);
            float f4 = d - floor;
            float f5 = B0 - f3;
            C8412e.m16791u0(eVar, j2, C19421p.m32952q(f3, f3), C0114h.m319t(f4, f4), C0114h.m317s(f5, f5), iVar, 224);
        }
        long j4 = this.$checkColor$delegate.getValue().f3366a;
        float floatValue = this.$checkDrawFraction$delegate.getValue().floatValue();
        float floatValue2 = this.$checkCenterGravitationShiftFraction$delegate.getValue().floatValue();
        C1223q qVar = this.$checkCache;
        C8416i iVar2 = new C8416i(floor, 0.0f, 2, 0, 26);
        float d2 = C8347f.m16656d(eVar.mo6913b());
        float w0 = C15588c1.m25354w0(0.4f, 0.5f, floatValue2);
        float w02 = C15588c1.m25354w0(0.7f, 0.5f, floatValue2);
        float w03 = C15588c1.m25354w0(0.5f, 0.5f, floatValue2);
        float w04 = C15588c1.m25354w0(0.3f, 0.5f, floatValue2);
        qVar.f2541a.reset();
        qVar.f2541a.mo6280g(0.2f * d2, w03 * d2);
        qVar.f2541a.mo6286m(w0 * d2, w02 * d2);
        qVar.f2541a.mo6286m(0.8f * d2, d2 * w04);
        qVar.f2542b.mo6324b(qVar.f2541a);
        qVar.f2543c.reset();
        C1515d0 d0Var = qVar.f2542b;
        d0Var.mo6323a(0.0f, d0Var.getLength() * floatValue, qVar.f2543c);
        C8412e.m16782E(eVar, qVar.f2543c, j4, iVar2, 52);
    }
}
