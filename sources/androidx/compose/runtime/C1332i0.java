package androidx.compose.runtime;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p219r.C7731c;
import p228s.C7792d;

/* renamed from: androidx.compose.runtime.i0 */
public final class C1332i0 {

    /* renamed from: a */
    public final C1325g0<Object> f2915a;

    /* renamed from: b */
    public final Object f2916b;

    /* renamed from: c */
    public final C1349n f2917c;

    /* renamed from: d */
    public final C1301c1 f2918d;

    /* renamed from: e */
    public final C1296b f2919e;

    /* renamed from: f */
    public final List<Pair<C1418v0, C7731c<Object>>> f2920f;

    /* renamed from: g */
    public final C7792d<C1340k<Object>, C1342k1<Object>> f2921g;

    public C1332i0(C1325g0<Object> g0Var, Object obj, C1349n nVar, C1301c1 c1Var, C1296b bVar, List<Pair<C1418v0, C7731c<Object>>> list, C7792d<C1340k<Object>, ? extends C1342k1<? extends Object>> dVar) {
        C19383o.m32797g(g0Var, ResponseConstants.CONTENT);
        C19383o.m32797g(nVar, "composition");
        C19383o.m32797g(c1Var, "slotTable");
        C19383o.m32797g(list, "invalidations");
        C19383o.m32797g(dVar, "locals");
        this.f2915a = g0Var;
        this.f2916b = obj;
        this.f2917c = nVar;
        this.f2918d = c1Var;
        this.f2919e = bVar;
        this.f2920f = list;
        this.f2921g = dVar;
    }
}
