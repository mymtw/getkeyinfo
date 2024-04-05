package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.p015ui.layout.SubcomposeLayoutState;
import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.internal.C19383o;

public final class LazyLayoutPrefetcher_androidKt {
    /* renamed from: a */
    public static final void m1864a(C0845h hVar, C0839c cVar, SubcomposeLayoutState subcomposeLayoutState, C1302d dVar, int i) {
        C19383o.m32797g(hVar, "prefetchState");
        C19383o.m32797g(cVar, "itemContentFactory");
        C19383o.m32797g(subcomposeLayoutState, "subcomposeLayoutState");
        ComposerImpl h = dVar.mo5440h(1113453182);
        View view = (View) h.mo5410J(AndroidCompositionLocals_androidKt.f3991f);
        h.mo5465u(1618982084);
        boolean I = h.mo5408I(subcomposeLayoutState) | h.mo5408I(hVar) | h.mo5408I(view);
        Object c0 = h.mo5431c0();
        if (I || c0 == C1302d.C1303a.f2828a) {
            h.mo5407H0(new LazyLayoutPrefetcher(hVar, subcomposeLayoutState, cVar, view));
        }
        h.mo5418R(false);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(hVar, cVar, subcomposeLayoutState, i);
        }
    }
}
