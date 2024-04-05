package androidx.compose.material;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p297z.C8416i;
import p753kq.C19861p;
import p764pq.C20052d;

final class ProgressIndicatorKt$CircularProgressIndicator$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ float $strokeWidth;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$2(float f, C1436d dVar, long j, float f2, int i, int i2) {
        super(2);
        this.$progress = f;
        this.$modifier = dVar;
        this.$color = j;
        this.$strokeWidth = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        float f = this.$progress;
        C1436d dVar2 = this.$modifier;
        long j = this.$color;
        float f2 = this.$strokeWidth;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        float f3 = C1193i1.f2473a;
        ComposerImpl h = dVar.mo5440h(-409649739);
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
            i2 |= h.mo5408I(dVar2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= ((i4 & 4) != 0 || !h.mo5434e(j)) ? 128 : 256;
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i2 |= h.mo5428b(f2) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i2 & 5851) != 1170 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i3 & 1) == 0 || h.mo5425Y()) {
                if (i5 != 0) {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                if ((i4 & 4) != 0) {
                    j = ((C1259v) h.mo5410J(ColorsKt.f2187a)).mo5359f();
                }
                if (i6 != 0) {
                    f2 = C1190h1.f2470a;
                }
            } else {
                h.mo5396C();
            }
            h.mo5419S();
            C8416i iVar = r10;
            C8416i iVar2 = new C8416i(((C7282b) h.mo5410J(CompositionLocalsKt.f4019e)).mo3789B0(f2), 0.0f, 0, 0, 26);
            CanvasKt.m1294a(SizeKt.m1492l(ProgressSemanticsKt.m1314b(dVar2, f, new C20052d(0.0f, 1.0f), 0), C1193i1.f2475c), new ProgressIndicatorKt$CircularProgressIndicator$1(f, j, iVar), h, 0);
        } else {
            h.mo5396C();
        }
        float f4 = f2;
        long j2 = j;
        C1436d dVar3 = dVar2;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new ProgressIndicatorKt$CircularProgressIndicator$2(f, dVar3, j2, f4, i3, i4);
        }
    }
}
