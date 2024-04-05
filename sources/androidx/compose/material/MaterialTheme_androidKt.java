package androidx.compose.material;

import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

public final class MaterialTheme_androidKt {
    /* renamed from: a */
    public static final void m2190a(C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        int i2;
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1322912246);
        if ((i & 14) == 0) {
            i2 = (h.mo5408I(pVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !h.mo5442i()) {
            pVar.invoke(h, Integer.valueOf(i2 & 14));
        } else {
            h.mo5396C();
        }
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new MaterialTheme_androidKt$PlatformMaterialTheme$1(pVar, i);
        }
    }
}
