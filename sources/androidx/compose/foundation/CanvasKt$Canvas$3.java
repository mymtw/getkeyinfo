package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;
import p753kq.C19861p;

final class CanvasKt$Canvas$3 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ C1436d $modifier;
    public final /* synthetic */ C19857l<C8412e, C19394m> $onDraw;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CanvasKt$Canvas$3(C1436d dVar, String str, C19857l<? super C8412e, C19394m> lVar, int i) {
        super(2);
        this.$modifier = dVar;
        this.$contentDescription = str;
        this.$onDraw = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C1436d dVar2 = this.$modifier;
        String str = this.$contentDescription;
        C19857l<C8412e, C19394m> lVar = this.$onDraw;
        int i3 = this.$$changed | 1;
        C19383o.m32797g(dVar2, "modifier");
        C19383o.m32797g(str, "contentDescription");
        C19383o.m32797g(lVar, "onDraw");
        ComposerImpl h = dVar.mo5440h(-1162737955);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(dVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(str) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i2 |= h.mo5408I(lVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !h.mo5442i()) {
            C1436d a = DrawModifierKt.m3070a(dVar2, lVar);
            h.mo5465u(1157296644);
            boolean I = h.mo5408I(str);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new CanvasKt$Canvas$2$1(str);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C15588c1.m25324f(SemanticsModifierKt.m4174a(a, false, (C19857l) c0), h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CanvasKt$Canvas$3(dVar2, str, lVar, i3);
        }
    }
}
