package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

final class SelectionContainerKt$SelectionContainer$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C1436d $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionContainerKt$SelectionContainer$2(C1436d dVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i, int i2) {
        super(2);
        this.$modifier = dVar;
        this.$content = pVar;
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
        C19861p<C1302d, Integer, C19394m> pVar = this.$content;
        int i3 = this.$$changed | 1;
        int i4 = this.$$default;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1075498320);
        int i5 = i4 & 1;
        if (i5 != 0) {
            i2 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i4 & 2) != 0) {
            i2 |= 48;
        } else if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            if (i5 != 0) {
                dVar2 = C1436d.C1437a.f3125b;
            }
            h.mo5465u(-492369756);
            Object c0 = h.mo5431c0();
            Object obj = C1302d.C1303a.f2828a;
            if (c0 == obj) {
                c0 = C0761x.m1751w0((Object) null, C1351n1.f2948a);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1338j0 j0Var = (C1338j0) c0;
            C1011g gVar = (C1011g) j0Var.getValue();
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(j0Var);
            Object c02 = h.mo5431c0();
            if (I || c02 == obj) {
                c02 = new SelectionContainerKt$SelectionContainer$1$1(j0Var);
                h.mo5407H0(c02);
            }
            h.mo5418R(false);
            SelectionContainerKt.m2019a(dVar2, gVar, (C19857l) c02, pVar, h, (i2 & 14) | ((i2 << 6) & 7168), 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new SelectionContainerKt$SelectionContainer$2(dVar2, pVar, i3, i4);
        }
    }
}
