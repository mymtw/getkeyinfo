package androidx.compose.p015ui.window;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1412t0;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$PopupTestTag$1 */
final class AndroidPopup_androidKt$PopupTestTag$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19861p<C1302d, Integer, C19394m> $content;
    public final /* synthetic */ String $tag;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$PopupTestTag$1(String str, C19861p<? super C1302d, ? super Integer, C19394m> pVar, int i) {
        super(2);
        this.$tag = str;
        this.$content = pVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        int i2;
        String str = this.$tag;
        C19861p<C1302d, Integer, C19394m> pVar = this.$content;
        int i3 = this.$$changed | 1;
        C1411t tVar = AndroidPopup_androidKt.f4705a;
        C19383o.m32797g(str, "tag");
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-498879600);
        if ((i3 & 14) == 0) {
            i2 = (h.mo5408I(str) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= h.mo5408I(pVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !h.mo5442i()) {
            CompositionLocalKt.m2530a(new C1412t0[]{AndroidPopup_androidKt.f4705a.mo5908b(str)}, pVar, h, (i2 & 112) | 8);
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new AndroidPopup_androidKt$PopupTestTag$1(str, pVar, i3);
        }
    }
}
