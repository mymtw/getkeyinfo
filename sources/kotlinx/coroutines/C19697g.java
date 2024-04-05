package kotlinx.coroutines;

import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.internal.C19721f;
import kotlinx.coroutines.internal.C19733q;
import kotlinx.coroutines.internal.ThreadContextKt;
import p514bk.C14088a;
import p753kq.C19857l;
import p753kq.C19861p;
import p768rq.C20153b;

/* renamed from: kotlinx.coroutines.g */
public final class C19697g {
    /* renamed from: a */
    public static final C19721f m33463a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C19699g1.C19701b.f43635b) == null) {
            coroutineContext = coroutineContext.plus(C1993m.m4368l());
        }
        return new C19721f(coroutineContext);
    }

    /* renamed from: b */
    public static C19706i0 m33464b(C19525d0 d0Var, C19861p pVar) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineContext c = CoroutineContextKt.m33062c(d0Var, emptyCoroutineContext);
        C19706i0 m1Var = coroutineStart.isLazy() ? new C19758m1(c, pVar) : new C19706i0(c, true);
        coroutineStart.invoke(pVar, m1Var, m1Var);
        return m1Var;
    }

    /* renamed from: c */
    public static void m33465c(C19525d0 d0Var) {
        C19699g1 g1Var = (C19699g1) d0Var.getCoroutineContext().get(C19699g1.C19701b.f43635b);
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
            return;
        }
        throw new IllegalStateException(C19383o.m32802l(d0Var, "Scope cannot be cancelled because it does not have a job: ").toString());
    }

    /* renamed from: d */
    public static final Object m33466d(C19861p pVar, C19340c cVar) {
        C19733q qVar = new C19733q(cVar, cVar.getContext());
        Object o0 = C19543e0.m33325o0(qVar, qVar, pVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return o0;
    }

    /* renamed from: e */
    public static final boolean m33467e(C19525d0 d0Var) {
        CoroutineContext coroutineContext = d0Var.getCoroutineContext();
        int i = C19699g1.f43634d1;
        C19699g1 g1Var = (C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b);
        if (g1Var == null) {
            return true;
        }
        return g1Var.isActive();
    }

    /* renamed from: f */
    public static C19835w1 m33468f(C19525d0 d0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, C19861p pVar, int i) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineContext c = CoroutineContextKt.m33062c(d0Var, coroutineContext);
        C19835w1 n1Var = coroutineStart.isLazy() ? new C19761n1(c, pVar) : new C19835w1(c, true);
        coroutineStart.invoke(pVar, n1Var, n1Var);
        return n1Var;
    }

    /* renamed from: g */
    public static final Object m33469g(CoroutineContext coroutineContext, C19861p pVar) throws InterruptedException {
        CoroutineContext coroutineContext2;
        C19821t0 t0Var;
        C19821t0 t0Var2;
        Thread currentThread = Thread.currentThread();
        C19341d.C19342a aVar = C19341d.C19342a.f43195b;
        C19341d dVar = (C19341d) coroutineContext.get(aVar);
        if (dVar == null) {
            t0Var = C19845z1.m33859a();
            coroutineContext2 = CoroutineContextKt.m33060a(EmptyCoroutineContext.INSTANCE, coroutineContext.plus(t0Var), true);
            C20153b bVar = C19760n0.f43719a;
            if (coroutineContext2 != bVar && coroutineContext2.get(aVar) == null) {
                coroutineContext2 = coroutineContext2.plus(bVar);
            }
        } else {
            if (dVar instanceof C19821t0) {
                C19821t0 t0Var3 = (C19821t0) dVar;
            }
            t0Var = C19845z1.f43852a.get();
            coroutineContext2 = CoroutineContextKt.m33060a(EmptyCoroutineContext.INSTANCE, coroutineContext, true);
            C20153b bVar2 = C19760n0.f43719a;
            if (coroutineContext2 != bVar2 && coroutineContext2.get(aVar) == null) {
                coroutineContext2 = coroutineContext2.plus(bVar2);
            }
        }
        C19542e eVar = new C19542e(coroutineContext2, currentThread, t0Var);
        CoroutineStart.DEFAULT.invoke(pVar, eVar, eVar);
        C19821t0 t0Var4 = eVar.f43488e;
        if (t0Var4 != null) {
            int i = C19821t0.f43821f;
            t0Var4.mo72659G0(false);
        }
        while (!Thread.interrupted()) {
            try {
                C19821t0 t0Var5 = eVar.f43488e;
                long I0 = t0Var5 == null ? Long.MAX_VALUE : t0Var5.mo72661I0();
                if (eVar.mo72395f()) {
                    if (t0Var2 != null) {
                        int i2 = C19821t0.f43821f;
                        t0Var2.mo72657E0(false);
                    }
                    Object y = C14088a.m21796y(eVar.mo72521h0());
                    C19830v vVar = y instanceof C19830v ? (C19830v) y : null;
                    if (vVar == null) {
                        return y;
                    }
                    throw vVar.f43842a;
                }
                LockSupport.parkNanos(eVar, I0);
            } finally {
                t0Var2 = eVar.f43488e;
                if (t0Var2 != null) {
                    int i3 = C19821t0.f43821f;
                    t0Var2.mo72657E0(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        eVar.mo72508K(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public static final Object m33471i(C19340c cVar, CoroutineContext coroutineContext, C19861p pVar) {
        Object obj;
        CoroutineContext context = cVar.getContext();
        CoroutineContext plus = !CoroutineContextKt.m33061b(coroutineContext) ? context.plus(coroutineContext) : CoroutineContextKt.m33060a(context, coroutineContext, false);
        C1993m.m4379y(plus);
        if (plus == context) {
            C19733q qVar = new C19733q(cVar, plus);
            obj = C19543e0.m33325o0(qVar, qVar, pVar);
        } else {
            C19341d.C19342a aVar = C19341d.C19342a.f43195b;
            if (C19383o.m32792b(plus.get(aVar), context.get(aVar))) {
                C19527d2 d2Var = new C19527d2(cVar, plus);
                Object c = ThreadContextKt.m33530c(plus, (Object) null);
                try {
                    Object o0 = C19543e0.m33325o0(d2Var, d2Var, pVar);
                    ThreadContextKt.m33528a(plus, c);
                    obj = o0;
                } catch (Throwable th) {
                    ThreadContextKt.m33528a(plus, c);
                    throw th;
                }
            } else {
                C19748k0 k0Var = new C19748k0(cVar, plus);
                C19543e0.m33322m0(pVar, k0Var, k0Var, (C19857l) null);
                obj = k0Var.mo72505E0();
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return obj;
    }
}
