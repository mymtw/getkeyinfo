package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class SelectionContainerKt$DisableSelection$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$DisableSelection$1(C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C19861p<C1302d, Integer, C19394m> pVar = this.$content;
        int i3 = this.$$changed | 1;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(336063542);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(pVar) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            CompositionLocalKt.m2530a(new C1412t0[]{SelectionRegistrarKt.f2081a.mo5908b(null)}, pVar, h, ((i2 << 3) & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SelectionContainerKt$DisableSelection$1(pVar, i3);
        }
    }
}
