package androidx.compose.foundation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p297z.C8412e;
import p753kq.C19857l;

public final class CanvasKt {
    /* renamed from: a */
    public static final void m1294a(C1436d dVar, C19857l<? super C8412e, C19394m> lVar, C1302d dVar2, int i) {
        int i2;
        C19383o.m32797g(dVar, "modifier");
        C19383o.m32797g(lVar, "onDraw");
        ComposerImpl h = dVar2.mo5440h(-932836462);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= h.mo5408I(lVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            C15588c1.m25324f(DrawModifierKt.m3070a(dVar, lVar), h, 0);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CanvasKt$Canvas$1(dVar, lVar, i);
        }
    }
}
