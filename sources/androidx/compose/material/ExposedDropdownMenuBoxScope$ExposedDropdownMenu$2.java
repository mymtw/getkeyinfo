package androidx.compose.material;

import androidx.compose.animation.core.C0418c0;
import androidx.compose.foundation.layout.C0739i;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.material.internal.ExposedDropdownMenuPopupKt;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7282b;
import p174m0.C7285e;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19861p;
import p753kq.C19862q;

final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19862q<C0739i, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19846a<C19394m> $onDismissRequest;
    public final /* synthetic */ C1218o0 $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(C1218o0 o0Var, boolean z, C19846a<C19394m> aVar, C1436d dVar, C19862q<? super C0739i, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = o0Var;
        this.$expanded = z;
        this.$onDismissRequest = aVar;
        this.$modifier = dVar;
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
        int i3;
        ComposerImpl composerImpl;
        C1436d dVar2;
        int i4;
        C1218o0 o0Var = this.$tmp0_rcvr;
        boolean z = this.$expanded;
        C19846a<C19394m> aVar = this.$onDismissRequest;
        C1436d dVar3 = this.$modifier;
        C19862q<C0739i, C1302d, Integer, C19394m> qVar = this.$content;
        int i5 = this.$$changed | 1;
        int i6 = this.$$default;
        C1224q0 q0Var = (C1224q0) o0Var;
        q0Var.getClass();
        C19383o.m32797g(aVar, "onDismissRequest");
        C19383o.m32797g(qVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1165636223);
        if ((i6 & 1) != 0) {
            i2 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i2 = (h.mo5427a(z) ? 4 : 2) | i5;
        } else {
            i2 = i5;
        }
        if ((i6 & 2) != 0) {
            i2 |= 48;
        } else if ((i5 & 112) == 0) {
            i2 |= h.mo5408I(aVar) ? 32 : 16;
        }
        int i7 = i6 & 4;
        if (i7 != 0) {
            i2 |= 384;
        } else if ((i5 & 896) == 0) {
            i2 |= h.mo5408I(dVar3) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i2 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i2 |= h.mo5408I(qVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if ((i6 & 16) != 0) {
            i2 |= 24576;
        } else if ((57344 & i5) == 0) {
            i2 |= h.mo5408I(q0Var) ? PrimitiveArrayBuilder.SMALL_CHUNK_SIZE : 8192;
        }
        if ((46811 & i2) != 9362 || !h.mo5442i()) {
            if (i7 != 0) {
                dVar3 = C1436d.C1437a.f3125b;
            }
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            Object obj = C1302d.C1303a.f2828a;
            if (c0 == obj) {
                c0 = new C0418c0(Boolean.FALSE);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C0418c0 c0Var = (C0418c0) c0;
            c0Var.f1094b.setValue(Boolean.valueOf(z));
            if (((Boolean) c0Var.f1093a.getValue()).booleanValue() || ((Boolean) c0Var.f1094b.getValue()).booleanValue()) {
                h.mo5465u(-492369756);
                Object c02 = h.mo5431c0();
                if (c02 == obj) {
                    c02 = C0761x.m1751w0(new C1540p0(C1540p0.f3337b), C1351n1.f2948a);
                    h.mo5407H0(c02);
                }
                h.mo5418R(false);
                C7282b bVar = (C7282b) h.mo5410J(CompositionLocalsKt.f4019e);
                long j = C7285e.f16156b;
                h.mo5465u(1157296644);
                C1338j0 j0Var = (C1338j0) c02;
                boolean I = h.mo5408I(j0Var);
                Object c03 = h.mo5431c0();
                if (I || c03 == obj) {
                    c03 = new C1082x4e7270a1(j0Var);
                    h.mo5407H0(c03);
                }
                h.mo5418R(false);
                composerImpl = h;
                i3 = i6;
                i4 = i5;
                ExposedDropdownMenuPopupKt.m2329a(aVar, new C1209l0(j, bVar, (C19861p) c03), C18263b.m30805A(h, -406650841, new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1(c0Var, j0Var, q0Var, dVar3, qVar, i2)), h, ((i2 >> 3) & 14) | 384, 0);
            } else {
                composerImpl = h;
                i3 = i6;
                i4 = i5;
            }
            dVar2 = dVar3;
        } else {
            h.mo5396C();
            dVar2 = dVar3;
            composerImpl = h;
            i3 = i6;
            i4 = i5;
        }
        C1418v0 U = composerImpl.mo5421U();
        if (U != null) {
            U.f3081d = new ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(q0Var, z, aVar, dVar2, qVar, i4, i3);
        }
    }
}
