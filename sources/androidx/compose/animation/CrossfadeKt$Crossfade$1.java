package androidx.compose.animation;

import androidx.compose.animation.core.C0448r;
import androidx.compose.animation.core.C0454t;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

final class CrossfadeKt$Crossfade$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0454t<Float> $animationSpec;
    public final /* synthetic */ C19862q<Object, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ Object $targetState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$1(Object obj, C1436d dVar, C0454t<Float> tVar, C19862q<Object, ? super C1302d, ? super Integer, C19394m> qVar, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = dVar;
        this.$animationSpec = tVar;
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
        Object obj = this.$targetState;
        C1436d dVar2 = this.$modifier;
        C0454t tVar = this.$animationSpec;
        C19862q<Object, C1302d, Integer, C19394m> qVar = this.$content;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        C19383o.m32797g(qVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(523603005);
        if ((i4 & 1) != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(obj) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        int i5 = i4 & 2;
        if (i5 != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(dVar2) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i2 |= 128;
        }
        if ((i4 & 8) != 0) {
            i2 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i2 |= h.mo5408I(qVar) ? RecyclerView.C3084b0.FLAG_MOVED : RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        }
        if (i6 == 4 && (i2 & 5851) == 1170 && h.mo5442i()) {
            h.mo5396C();
        } else {
            if (i5 != 0) {
                dVar2 = C1436d.C1437a.f3125b;
            }
            if (i6 != 0) {
                tVar = C0761x.m1706Z0(0, 0, (C0448r) null, 7);
            }
            CrossfadeKt.m1031a(TransitionKt.m1103e(obj, (String) null, h, (i2 & 8) | (i2 & 14), 2), dVar2, tVar, (C19857l) null, qVar, h, (i2 & 112) | RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN | ((i2 << 3) & 57344), 4);
        }
        C1436d dVar3 = dVar2;
        C0454t tVar2 = tVar;
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CrossfadeKt$Crossfade$1(obj, dVar3, tVar2, qVar, i3, i4);
        }
    }
}
