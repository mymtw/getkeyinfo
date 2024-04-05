package com.braze.coroutine;

import androidx.compose.p015ui.text.input.C1993m;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19338a;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19835w1;
import kotlinx.coroutines.C19842z;
import kotlinx.coroutines.CoroutineStart;
import p001a0.C0005b;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class BrazeCoroutineScope implements C19525d0 {

    /* renamed from: b */
    public static final BrazeCoroutineScope f11696b = new BrazeCoroutineScope();

    /* renamed from: c */
    public static final CoroutineContext f11697c = C19760n0.f43720b.plus(new C5415d()).plus(C0005b.m44j());

    /* renamed from: com.braze.coroutine.BrazeCoroutineScope$a */
    public static final class C5412a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5412a f11698b = new C5412a();

        public C5412a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cancelling children of BrazeCoroutineScope";
        }
    }

    /* renamed from: com.braze.coroutine.BrazeCoroutineScope$b */
    public static final class C5413b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Throwable f11699b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5413b(Throwable th) {
            super(0);
            this.f11699b = th;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f11699b, "Child job of BrazeCoroutineScope got exception: ");
        }
    }

    @C19060c(mo70540c = "com.braze.coroutine.BrazeCoroutineScope$launchDelayed$1", mo70541f = "BrazeCoroutineScope.kt", mo70542l = {52, 55}, mo70543m = "invokeSuspend")
    /* renamed from: com.braze.coroutine.BrazeCoroutineScope$c */
    final class C5414c extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {

        /* renamed from: b */
        public int f11700b;

        /* renamed from: c */
        private /* synthetic */ Object f11701c;

        /* renamed from: d */
        public final /* synthetic */ Number f11702d;

        /* renamed from: e */
        public final /* synthetic */ C19857l<C19340c<? super C19394m>, Object> f11703e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5414c(Number number, C19857l<? super C19340c<? super C19394m>, ? extends Object> lVar, C19340c<? super C5414c> cVar) {
            super(2, cVar);
            this.f11702d = number;
            this.f11703e = lVar;
        }

        /* renamed from: a */
        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C5414c) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C5414c cVar2 = new C5414c(this.f11702d, this.f11703e, cVar);
            cVar2.f11701c = obj;
            return cVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.d0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.f11700b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                goto L_0x004d
            L_0x0010:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0018:
                java.lang.Object r1 = r6.f11701c
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                goto L_0x0039
            L_0x0020:
                androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                java.lang.Object r7 = r6.f11701c
                r1 = r7
                kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
                java.lang.Number r7 = r6.f11702d
                long r4 = r7.longValue()
                r6.f11701c = r1
                r6.f11700b = r3
                java.lang.Object r7 = p628nj.C18263b.m30814I(r4, r6)
                if (r7 != r0) goto L_0x0039
                return r0
            L_0x0039:
                boolean r7 = kotlinx.coroutines.C19697g.m33467e(r1)
                if (r7 == 0) goto L_0x004d
                kq.l<kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r7 = r6.f11703e
                r1 = 0
                r6.f11701c = r1
                r6.f11700b = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L_0x004d
                return r0
            L_0x004d:
                kotlin.m r7 = kotlin.C19394m.f43287a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.coroutine.BrazeCoroutineScope.C5414c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.braze.coroutine.BrazeCoroutineScope$d */
    public static final class C5415d extends C19338a implements C19842z {
        public C5415d() {
            super(C19842z.C19843a.f43850b);
        }

        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, BrazeCoroutineScope.f11696b, BrazeLogger.Priority.E, th, new C5413b(th), 4);
        }
    }

    /* renamed from: a */
    public static final void m11006a() {
        BrazeLogger.m11282d(BrazeLogger.f11932a, f11696b, BrazeLogger.Priority.I, (Throwable) null, C5412a.f11698b, 6);
        C1993m.m4374t(f11697c);
    }

    /* renamed from: c */
    public static C19835w1 m11007c(Number number, C19857l lVar) {
        return f11696b.mo15906b(number, f11697c, lVar);
    }

    /* renamed from: b */
    public final C19835w1 mo15906b(Number number, CoroutineContext coroutineContext, C19857l lVar) {
        C19383o.m32797g(number, "startDelayInMs");
        C19383o.m32797g(coroutineContext, "specificContext");
        return C19697g.m33468f(this, coroutineContext, (CoroutineStart) null, new C5414c(number, lVar, (C19340c<? super C5414c>) null), 2);
    }

    public final CoroutineContext getCoroutineContext() {
        return f11697c;
    }
}
