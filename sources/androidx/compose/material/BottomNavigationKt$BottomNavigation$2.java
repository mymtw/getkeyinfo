package androidx.compose.material;

import androidx.compose.animation.core.C0433j0;
import androidx.compose.foundation.C0556g;
import androidx.compose.foundation.layout.C0763z;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19861p;
import p753kq.C19862q;

final class BottomNavigationKt$BottomNavigation$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C19862q<C0763z, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ float $elevation;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigation$2(C1436d dVar, long j, long j2, float f, C19862q<? super C0763z, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$elevation = f;
        this.$content = qVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C1436d dVar2 = this.$modifier;
        long j = this.$backgroundColor;
        long j2 = this.$contentColor;
        float f = this.$elevation;
        C19862q<C0763z, C1302d, Integer, C19394m> qVar = this.$content;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        C0433j0<Float> j0Var = BottomNavigationKt.f2176a;
        C19383o.m32797g(qVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(456489494);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= ((i4 & 2) != 0 || !h.mo5434e(j)) ? 16 : 32;
        }
        if ((i3 & 896) == 0) {
            i2 |= ((i4 & 4) != 0 || !h.mo5434e(j2)) ? 128 : 256;
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i2 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i2 |= h.mo5428b(f) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i4 & 16) != 0) {
            i2 |= 24576;
        } else if ((57344 & i3) == 0) {
            i2 |= h.mo5408I(qVar) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((46811 & i2) != 9362 || !h.mo5442i()) {
            h.mo5466u0();
            if ((i3 & 1) == 0 || h.mo5425Y()) {
                if (i5 != 0) {
                    dVar2 = C1436d.C1437a.f3125b;
                }
                if ((i4 & 2) != 0) {
                    j = ColorsKt.m2175c((C1259v) h.mo5410J(ColorsKt.f2187a));
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    j2 = ColorsKt.m2174b(j, h);
                    i2 &= -897;
                }
                if (i6 != 0) {
                    f = C1188h.f2469a;
                }
            } else {
                h.mo5396C();
                if ((i4 & 2) != 0) {
                    i2 &= -113;
                }
                if ((i4 & 4) != 0) {
                    i2 &= -897;
                }
            }
            h.mo5419S();
            int i7 = i2 << 3;
            SurfaceKt.m2234a(dVar2, (C1530k0) null, j, j2, (C0556g) null, f, C18263b.m30805A(h, 678339930, new BottomNavigationKt$BottomNavigation$1(qVar, i2)), h, 1572864 | (i2 & 14) | (i7 & 896) | (i7 & 7168) | ((i2 << 6) & 458752), 18);
        } else {
            h.mo5396C();
        }
        C1436d dVar3 = dVar2;
        long j3 = j;
        long j4 = j2;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new BottomNavigationKt$BottomNavigation$2(dVar3, j3, j4, f, qVar, i3, i4);
        }
    }
}
