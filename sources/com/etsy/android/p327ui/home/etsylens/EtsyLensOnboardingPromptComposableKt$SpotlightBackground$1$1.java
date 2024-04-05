package com.etsy.android.p327ui.home.etsylens;

import android.graphics.Path;
import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1521g;
import androidx.compose.p015ui.graphics.C1532l0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p288y.C8345d;
import p297z.C8406a;
import p297z.C8412e;
import p297z.C8413f;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.home.etsylens.EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1 */
public final class EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $center;
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $radius;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EtsyLensOnboardingPromptComposableKt$SpotlightBackground$1$1(long j, float f, long j2) {
        super(1);
        this.$center = j;
        this.$radius = f;
        this.$color = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        C1521g d = C18263b.m30838d();
        long j = this.$center;
        float f = this.$radius;
        d.f3297b.set(C0114h.m330y0(new C8345d(C8343c.m16642c(j) - f, C8343c.m16643d(j) - f, C8343c.m16642c(j) + f, C8343c.m16643d(j) + f)));
        d.f3296a.addOval(d.f3297b, Path.Direction.CCW);
        long j2 = this.$color;
        C8406a.C8408b C0 = eVar.mo6900C0();
        long b = C0.mo20992b();
        C0.mo20991a().mo6264r();
        C0.f18430a.mo20994a(d, 0);
        C8412e.m16780A0(eVar, new C1532l0(j2), 0, 0, 0.0f, (C8413f) null, 126);
        C0.mo20991a().mo6261m();
        C0.mo20993c(b);
    }
}
