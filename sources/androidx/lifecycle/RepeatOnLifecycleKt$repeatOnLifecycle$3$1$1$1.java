package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.C19814c;
import kotlinx.coroutines.sync.MutexImpl;
import p744gq.C19060c;
import p753kq.C19861p;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C2885q {

    /* renamed from: b */
    public final /* synthetic */ Lifecycle.Event f6445b;

    /* renamed from: c */
    public final /* synthetic */ Ref$ObjectRef<C19699g1> f6446c;

    /* renamed from: d */
    public final /* synthetic */ C19525d0 f6447d;

    /* renamed from: e */
    public final /* synthetic */ Lifecycle.Event f6448e;

    /* renamed from: f */
    public final /* synthetic */ C19747k<C19394m> f6449f;

    /* renamed from: g */
    public final /* synthetic */ C19814c f6450g;

    /* renamed from: h */
    public final /* synthetic */ C19861p<C19525d0, C19340c<? super C19394m>, Object> f6451h;

    @C19060c(mo70540c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", mo70541f = "RepeatOnLifecycle.kt", mo70542l = {171, 110}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 */
    public static final class C28351 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C28351(cVar, pVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C28351) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th;
            C19814c cVar;
            C19814c cVar2;
            C19861p<C19525d0, C19340c<? super C19394m>, Object> pVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                cVar2 = cVar;
                pVar = pVar;
                this.L$0 = cVar2;
                this.L$1 = pVar;
                this.label = 1;
                if (cVar2.mo72641c((Object) null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                pVar = (C19861p) this.L$1;
                C0761x.m1684O0(obj);
                cVar2 = (C19814c) this.L$0;
            } else if (i == 2) {
                cVar = (C19814c) this.L$0;
                try {
                    C0761x.m1684O0(obj);
                    C19394m mVar = C19394m.f43287a;
                    cVar.mo72642d((Object) null);
                    return C19394m.f43287a;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(pVar, (C19340c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1>) null);
                this.L$0 = cVar2;
                this.L$1 = null;
                this.label = 2;
                if (C19697g.m33466d(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = cVar2;
                C19394m mVar2 = C19394m.f43287a;
                cVar.mo72642d((Object) null);
                return C19394m.f43287a;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                cVar = cVar2;
                th = th4;
                cVar.mo72642d((Object) null);
                throw th;
            }
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, Ref$ObjectRef ref$ObjectRef, C19525d0 d0Var, Lifecycle.Event event2, C19753l lVar, MutexImpl mutexImpl, C19861p pVar) {
        this.f6445b = event;
        this.f6446c = ref$ObjectRef;
        this.f6447d = d0Var;
        this.f6448e = event2;
        this.f6449f = lVar;
        this.f6450g = mutexImpl;
        this.f6451h = pVar;
    }

    public final void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        if (event == this.f6445b) {
            Ref$ObjectRef<C19699g1> ref$ObjectRef = this.f6446c;
            C19525d0 d0Var = this.f6447d;
            final C19814c cVar = this.f6450g;
            final C19861p<C19525d0, C19340c<? super C19394m>, Object> pVar = this.f6451h;
            ref$ObjectRef.element = C19697g.m33468f(d0Var, (CoroutineContext) null, (CoroutineStart) null, new C28351((C19340c<? super C28351>) null), 3);
            return;
        }
        if (event == this.f6448e) {
            C19699g1 g1Var = (C19699g1) this.f6446c.element;
            if (g1Var != null) {
                g1Var.mo72134a((CancellationException) null);
            }
            this.f6446c.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f6449f.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }
}
