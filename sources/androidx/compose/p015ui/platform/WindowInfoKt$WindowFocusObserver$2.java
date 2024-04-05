package androidx.compose.p015ui.platform;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1415u;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2 */
final class WindowInfoKt$WindowFocusObserver$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19857l<Boolean, C19394m> $onWindowFocusChanged;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoKt$WindowFocusObserver$2(C19857l<? super Boolean, C19394m> lVar, int i) {
        super(2);
        this.$onWindowFocusChanged = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        C19857l<Boolean, C19394m> lVar = this.$onWindowFocusChanged;
        int i3 = this.$$changed | 1;
        C19383o.m32797g(lVar, "onWindowFocusChanged");
        ComposerImpl h = dVar.mo5440h(127829799);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(lVar) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            C1863p1 p1Var = (C1863p1) h.mo5410J(CompositionLocalsKt.f4030p);
            C1338j0 E0 = C0761x.m1664E0(lVar, h);
            h.mo5465u(511388516);
            boolean I = h.mo5408I(p1Var) | h.mo5408I(E0);
            Object c0 = h.mo5431c0();
            if (I || c0 == C1302d.C1303a.f2828a) {
                c0 = new WindowInfoKt$WindowFocusObserver$1$1(p1Var, E0, (C19340c<? super WindowInfoKt$WindowFocusObserver$1$1>) null);
                h.mo5407H0(c0);
            }
            h.mo5418R(false);
            C1415u.m3031e(p1Var, (C19861p) c0, h);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new WindowInfoKt$WindowFocusObserver$2(lVar, i3);
        }
    }
}
