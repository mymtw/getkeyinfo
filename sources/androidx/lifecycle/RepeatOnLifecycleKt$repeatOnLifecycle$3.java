package androidx.lifecycle;

import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.Lifecycle;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19764o1;
import kotlinx.coroutines.internal.C19729m;
import p744gq.C19060c;
import p753kq.C19861p;
import p768rq.C20153b;

@C19060c(mo70540c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", mo70541f = "RepeatOnLifecycle.kt", mo70542l = {84}, mo70543m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C19525d0, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ Lifecycle.State $state;
    public final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", mo70541f = "RepeatOnLifecycle.kt", mo70542l = {166}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    public static final class C28341 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C28341(lifecycle, state, d0Var, pVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C28341) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlin.jvm.internal.Ref$ObjectRef} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r16
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r1.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r4) goto L_0x002d
                java.lang.Object r0 = r1.L$5
                kq.p r0 = (p753kq.C19861p) r0
                java.lang.Object r0 = r1.L$4
                kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.C19525d0) r0
                java.lang.Object r0 = r1.L$3
                androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                java.lang.Object r0 = r1.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                java.lang.Object r0 = r1.L$1
                r2 = r0
                kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
                java.lang.Object r0 = r1.L$0
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)     // Catch:{ all -> 0x002a }
                goto L_0x0094
            L_0x002a:
                r0 = move-exception
                goto L_0x00b0
            L_0x002d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0035:
                androidx.compose.foundation.layout.C0761x.m1684O0(r17)
                androidx.lifecycle.Lifecycle r2 = r4
                androidx.lifecycle.Lifecycle$State r2 = r2.mo10734b()
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.DESTROYED
                if (r2 != r5) goto L_0x0045
                kotlin.m r0 = kotlin.C19394m.f43287a
                return r0
            L_0x0045:
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
                r12.<init>()
                androidx.lifecycle.Lifecycle$State r5 = r5     // Catch:{ all -> 0x00ad }
                androidx.lifecycle.Lifecycle r13 = r4     // Catch:{ all -> 0x00ad }
                kotlinx.coroutines.d0 r7 = r6     // Catch:{ all -> 0x00ad }
                kq.p<kotlinx.coroutines.d0, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r11 = r7     // Catch:{ all -> 0x00ad }
                r1.L$0 = r2     // Catch:{ all -> 0x00ad }
                r1.L$1 = r12     // Catch:{ all -> 0x00ad }
                r1.L$2 = r5     // Catch:{ all -> 0x00ad }
                r1.L$3 = r13     // Catch:{ all -> 0x00ad }
                r1.L$4 = r7     // Catch:{ all -> 0x00ad }
                r1.L$5 = r11     // Catch:{ all -> 0x00ad }
                r1.label = r4     // Catch:{ all -> 0x00ad }
                kotlinx.coroutines.l r14 = new kotlinx.coroutines.l     // Catch:{ all -> 0x00ad }
                kotlin.coroutines.c r6 = kotlin.jvm.internal.C19388s.m32873m0(r16)     // Catch:{ all -> 0x00ad }
                r14.<init>(r4, r6)     // Catch:{ all -> 0x00ad }
                r14.mo72548n()     // Catch:{ all -> 0x00ad }
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.Lifecycle.Event.upTo(r5)     // Catch:{ all -> 0x00ad }
                androidx.lifecycle.Lifecycle$Event r8 = androidx.lifecycle.Lifecycle.Event.downFrom(r5)     // Catch:{ all -> 0x00ad }
                kotlinx.coroutines.sync.MutexImpl r10 = p514bk.C14088a.m21779d()     // Catch:{ all -> 0x00ad }
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r15 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch:{ all -> 0x00ad }
                r4 = r15
                r5 = r6
                r6 = r2
                r9 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ad }
                r12.element = r15     // Catch:{ all -> 0x00ad }
                r13.mo10733a(r15)     // Catch:{ all -> 0x00ad }
                java.lang.Object r4 = r14.mo72547l()     // Catch:{ all -> 0x00ad }
                if (r4 != r0) goto L_0x0092
                return r0
            L_0x0092:
                r4 = r2
                r2 = r12
            L_0x0094:
                T r0 = r4.element
                kotlinx.coroutines.g1 r0 = (kotlinx.coroutines.C19699g1) r0
                if (r0 != 0) goto L_0x009b
                goto L_0x009e
            L_0x009b:
                r0.mo72134a(r3)
            L_0x009e:
                T r0 = r2.element
                androidx.lifecycle.q r0 = (androidx.lifecycle.C2885q) r0
                if (r0 != 0) goto L_0x00a5
                goto L_0x00aa
            L_0x00a5:
                androidx.lifecycle.Lifecycle r2 = r4
                r2.mo10735c(r0)
            L_0x00aa:
                kotlin.m r0 = kotlin.C19394m.f43287a
                return r0
            L_0x00ad:
                r0 = move-exception
                r4 = r2
                r2 = r12
            L_0x00b0:
                T r4 = r4.element
                kotlinx.coroutines.g1 r4 = (kotlinx.coroutines.C19699g1) r4
                if (r4 != 0) goto L_0x00b7
                goto L_0x00ba
            L_0x00b7:
                r4.mo72134a(r3)
            L_0x00ba:
                T r2 = r2.element
                androidx.lifecycle.q r2 = (androidx.lifecycle.C2885q) r2
                if (r2 != 0) goto L_0x00c1
                goto L_0x00c6
            L_0x00c1:
                androidx.lifecycle.Lifecycle r3 = r4
                r3.mo10735c(r2)
            L_0x00c6:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.C28341.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, C19861p<? super C19525d0, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> cVar) {
        super(2, cVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, cVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19525d0 d0Var = (C19525d0) this.L$0;
            C20153b bVar = C19760n0.f43719a;
            C19764o1 E0 = C19729m.f43681a.mo72111E0();
            final Lifecycle lifecycle = this.$this_repeatOnLifecycle;
            final Lifecycle.State state = this.$state;
            final C19861p<C19525d0, C19340c<? super C19394m>, Object> pVar = this.$block;
            C28341 r3 = new C28341((C19340c<? super C28341>) null);
            this.label = 1;
            if (C19697g.m33471i(this, E0, r3) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
