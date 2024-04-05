package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19861p;

public final class CompositionLocalKt {
    /* renamed from: a */
    public static final void m2530a(C1412t0<?>[] t0VarArr, C19861p<? super C1302d, ? super Integer, C19394m> pVar, C1302d dVar, int i) {
        C19383o.m32797g(t0VarArr, ResponseConstants.VALUES);
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        ComposerImpl h = dVar.mo5440h(-1390796515);
        h.mo5472x0(t0VarArr);
        pVar.invoke(h, Integer.valueOf((i >> 3) & 14));
        h.mo5420T();
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new CompositionLocalKt$CompositionLocalProvider$1(t0VarArr, pVar, i);
        }
    }

    /* renamed from: b */
    public static C1411t m2531b(C19846a aVar) {
        C1351n1 n1Var = C1351n1.f2948a;
        C19383o.m32797g(aVar, "defaultFactory");
        return new C1411t(n1Var, aVar);
    }

    /* renamed from: c */
    public static final C1345l1 m2532c(C19846a aVar) {
        C19383o.m32797g(aVar, "defaultFactory");
        return new C1345l1(aVar);
    }
}
