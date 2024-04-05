package kotlinx.coroutines;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.C19389t;
import kotlinx.coroutines.internal.ThreadContextKt;
import p753kq.C19857l;
import p753kq.C19861p;

public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C19463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43393a = null;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            iArr[CoroutineStart.LAZY.ordinal()] = 4;
            f43393a = iArr;
        }
    }

    public final <T> void invoke(C19857l<? super C19340c<? super T>, ? extends Object> lVar, C19340c<? super T> cVar) {
        CoroutineContext context;
        Object c;
        int i = C19463a.f43393a[ordinal()];
        if (i == 1) {
            C19543e0.m33320l0(lVar, cVar);
        } else if (i == 2) {
            C19383o.m32797g(lVar, "<this>");
            C19383o.m32797g(cVar, "completion");
            C19388s.m32873m0(C19388s.m32841Q(lVar, cVar)).resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        } else if (i == 3) {
            C19383o.m32797g(cVar, "completion");
            try {
                context = cVar.getContext();
                c = ThreadContextKt.m33530c(context, (Object) null);
                C19389t.m32910d(1, lVar);
                Object invoke = lVar.invoke(cVar);
                ThreadContextKt.m33528a(context, c);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    cVar.resumeWith(Result.m35480constructorimpl(invoke));
                }
            } catch (Throwable th) {
                cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
            }
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(C19861p<? super R, ? super C19340c<? super T>, ? extends Object> pVar, R r, C19340c<? super T> cVar) {
        CoroutineContext context;
        Object c;
        int i = C19463a.f43393a[ordinal()];
        if (i == 1) {
            C19543e0.m33322m0(pVar, r, cVar, (C19857l) null);
        } else if (i == 2) {
            C19383o.m32797g(pVar, "<this>");
            C19383o.m32797g(cVar, "completion");
            C19388s.m32873m0(C19388s.m32843R(pVar, r, cVar)).resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        } else if (i == 3) {
            C19383o.m32797g(cVar, "completion");
            try {
                context = cVar.getContext();
                c = ThreadContextKt.m33530c(context, (Object) null);
                C19389t.m32910d(2, pVar);
                Object invoke = pVar.invoke(r, cVar);
                ThreadContextKt.m33528a(context, c);
                if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    cVar.resumeWith(Result.m35480constructorimpl(invoke));
                }
            } catch (Throwable th) {
                cVar.resumeWith(Result.m35480constructorimpl(C0761x.m1673J(th)));
            }
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
