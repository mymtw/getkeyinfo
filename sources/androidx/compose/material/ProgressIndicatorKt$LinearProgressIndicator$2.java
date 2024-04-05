package androidx.compose.material;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p764pq.C20052d;

final class ProgressIndicatorKt$LinearProgressIndicator$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $progress;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$2(float f, C1436d dVar, long j, long j2, int i, int i2) {
        super(2);
        this.$progress = f;
        this.$modifier = dVar;
        this.$color = j;
        this.$backgroundColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        long j;
        long j2;
        C1436d dVar2;
        C1436d dVar3;
        boolean z;
        C1436d dVar4;
        float f = this.$progress;
        C1436d dVar5 = this.$modifier;
        long j3 = this.$color;
        long j4 = this.$backgroundColor;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        float f2 = C1193i1.f2473a;
        ComposerImpl h = dVar.mo5440h(-850309746);
        if ((i4 & 1) != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5428b(f) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        int i5 = i4 & 2;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(dVar5) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= ((i4 & 4) != 0 || !h.mo5434e(j3)) ? 128 : 256;
        }
        if ((i3 & 7168) == 0) {
            i2 |= ((i4 & 8) != 0 || !h.mo5434e(j4)) ? RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE : RecyclerView.C3084b0.FLAG_MOVED;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i3 & 1) == 0 || h.mo5425Y()) {
                if (i5 != 0) {
                    dVar5 = C1436d.C1437a.f3125b;
                }
                if ((i4 & 4) != 0) {
                    j3 = ((C1259v) h.mo5410J(ColorsKt.f2187a)).mo5359f();
                }
                if ((i4 & 8) != 0) {
                    j4 = C1545s.m3356b(j3, 0.24f);
                }
            } else {
                h.mo5396C();
            }
            C1436d dVar6 = dVar5;
            long j5 = j3;
            long j6 = j4;
            h.mo5419S();
            C1436d m = SizeKt.m1493m(ProgressSemanticsKt.m1314b(dVar6, f, new C20052d(0.0f, 1.0f), 0), C1193i1.f2474b, C1193i1.f2473a);
            C1545s sVar = new C1545s(j6);
            Float valueOf = Float.valueOf(f);
            C1545s sVar2 = new C1545s(j5);
            h.mo5465u(1618982084);
            boolean I = h.mo5408I(sVar) | h.mo5408I(valueOf) | h.mo5408I(sVar2);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                ProgressIndicatorKt$LinearProgressIndicator$1$1 progressIndicatorKt$LinearProgressIndicator$1$1 = r1;
                dVar3 = dVar6;
                j = j6;
                z = false;
                dVar4 = m;
                ProgressIndicatorKt$LinearProgressIndicator$1$1 progressIndicatorKt$LinearProgressIndicator$1$12 = new ProgressIndicatorKt$LinearProgressIndicator$1$1(j6, f, j5);
                h.mo5407H0(progressIndicatorKt$LinearProgressIndicator$1$1);
                c0 = progressIndicatorKt$LinearProgressIndicator$1$1;
            } else {
                dVar3 = dVar6;
                j = j6;
                z = false;
                dVar4 = m;
            }
            h.mo5418R(z);
            CanvasKt.m1294a(dVar4, (C19857l) c0, h, z ? 1 : 0);
            dVar2 = dVar3;
            j2 = j5;
        } else {
            h.mo5396C();
            j = j4;
            j2 = j3;
            dVar2 = dVar5;
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ProgressIndicatorKt$LinearProgressIndicator$2(f, dVar2, j2, j, i3, i4);
        }
    }
}
