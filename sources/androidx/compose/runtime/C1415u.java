package androidx.compose.runtime;

import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1302d;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19830v;
import kotlinx.coroutines.internal.C19721f;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.runtime.u */
public final class C1415u {

    /* renamed from: a */
    public static final C1360s f3074a = new C1360s();

    /* renamed from: a */
    public static final void m3027a(Object obj, Object obj2, C19857l lVar, C1302d dVar) {
        dVar.mo5465u(1429097729);
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(obj) | dVar.mo5408I(obj2);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1356q(lVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: b */
    public static final void m3028b(Object obj, C19857l lVar, C1302d dVar) {
        C19383o.m32797g(lVar, "effect");
        dVar.mo5465u(-1371986847);
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(obj);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1356q(lVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: c */
    public static final void m3029c(Object obj, Object obj2, Object obj3, C19861p pVar, C1302d dVar) {
        dVar.mo5465u(-54093371);
        CoroutineContext l = dVar.mo5448l();
        dVar.mo5465u(1618982084);
        boolean I = dVar.mo5408I(obj) | dVar.mo5408I(obj2) | dVar.mo5408I(obj3);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1305d0(l, pVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: d */
    public static final void m3030d(Object obj, Object obj2, C19861p pVar, C1302d dVar) {
        dVar.mo5465u(590241125);
        CoroutineContext l = dVar.mo5448l();
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(obj) | dVar.mo5408I(obj2);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1305d0(l, pVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: e */
    public static final void m3031e(Object obj, C19861p pVar, C1302d dVar) {
        C19383o.m32797g(pVar, "block");
        dVar.mo5465u(1179185413);
        CoroutineContext l = dVar.mo5448l();
        dVar.mo5465u(1157296644);
        boolean I = dVar.mo5408I(obj);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1305d0(l, pVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: f */
    public static final void m3032f(Object[] objArr, C19861p pVar, C1302d dVar) {
        C19383o.m32797g(objArr, "keys");
        dVar.mo5465u(-139560008);
        CoroutineContext l = dVar.mo5448l();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        dVar.mo5465u(-568225417);
        boolean z = false;
        for (Object I : copyOf) {
            z |= dVar.mo5408I(I);
        }
        Object v = dVar.mo5467v();
        if (z || v == C1302d.C1303a.f2828a) {
            dVar.mo5454o(new C1305d0(l, pVar));
        }
        dVar.mo5406H();
        dVar.mo5406H();
    }

    /* renamed from: g */
    public static final void m3033g(C19846a aVar, C1302d dVar) {
        C19383o.m32797g(aVar, "effect");
        dVar.mo5465u(-1288466761);
        dVar.mo5444j(aVar);
        dVar.mo5406H();
    }

    /* renamed from: h */
    public static final C19721f m3034h(EmptyCoroutineContext emptyCoroutineContext, C1302d dVar) {
        C19383o.m32797g(emptyCoroutineContext, "coroutineContext");
        C19383o.m32797g(dVar, "composer");
        C19699g1.C19701b bVar = C19699g1.C19701b.f43635b;
        if (emptyCoroutineContext.get(bVar) != null) {
            C19707i1 l = C1993m.m4368l();
            l.mo72524n0(new C19830v(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            return C19697g.m33463a(l);
        }
        CoroutineContext l2 = dVar.mo5448l();
        return C19697g.m33463a(l2.plus(new C19707i1((C19699g1) l2.get(bVar))).plus(emptyCoroutineContext));
    }
}
