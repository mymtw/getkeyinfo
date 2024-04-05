package kotlinx.coroutines.flow.internal;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.channels.C19512n;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.internal.ThreadContextKt;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", mo70541f = "Combine.kt", mo70542l = {129}, mo70543m = "invokeSuspend")
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19597d<Object> $flow;
    public final /* synthetic */ C19597d<Object> $flow2;
    public final /* synthetic */ C19600e<Object> $this_unsafeFlow;
    public final /* synthetic */ C19862q<Object, Object, C19340c<Object>, Object> $transform;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", mo70541f = "Combine.kt", mo70542l = {130}, mo70543m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 */
    public static final class C196202 extends SuspendLambda implements C19861p<C19394m, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C196202(dVar, coroutineContext, b2, nVar2, eVar2, qVar2, cVar);
        }

        public final Object invoke(C19394m mVar, C19340c<? super C19394m> cVar) {
            return ((C196202) create(mVar, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19597d<Object> dVar = dVar;
                final CoroutineContext coroutineContext = coroutineContext;
                final Object obj2 = b2;
                final C19515q<Object> qVar = nVar2;
                final C19600e<Object> eVar = eVar2;
                final C19862q<Object, Object, C19340c<Object>, Object> qVar2 = qVar2;
                C196211 r3 = new C19600e() {
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.C19340c<? super kotlin.C19394m> r14) {
                        /*
                            r12 = this;
                            boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                            if (r0 == 0) goto L_0x0013
                            r0 = r14
                            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0013
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L_0x0018
                        L_0x0013:
                            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                            r0.<init>(r12, r14)
                        L_0x0018:
                            java.lang.Object r14 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L_0x002f
                            if (r2 != r3) goto L_0x0027
                            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                            goto L_0x004f
                        L_0x0027:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r14)
                            throw r13
                        L_0x002f:
                            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
                            kotlin.coroutines.CoroutineContext r14 = r4
                            kotlin.m r2 = kotlin.C19394m.f43287a
                            java.lang.Object r4 = r5
                            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                            kotlinx.coroutines.channels.q<java.lang.Object> r6 = r6
                            kotlinx.coroutines.flow.e<java.lang.Object> r7 = r7
                            kq.q<java.lang.Object, java.lang.Object, kotlin.coroutines.c<java.lang.Object>, java.lang.Object> r8 = r8
                            r10 = 0
                            r5 = r11
                            r9 = r13
                            r5.<init>(r6, r7, r8, r9, r10)
                            r0.label = r3
                            java.lang.Object r13 = p568fn.C17782b.m29887t0(r14, r2, r4, r11, r0)
                            if (r13 != r1) goto L_0x004f
                            return r1
                        L_0x004f:
                            kotlin.m r13 = kotlin.C19394m.f43287a
                            return r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.C196202.C196211.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                    }
                };
                this.label = 1;
                if (dVar.collect(r3, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(C19600e<Object> eVar, C19597d<Object> dVar, C19597d<Object> dVar2, C19862q<Object, Object, ? super C19340c<Object>, ? extends Object> qVar, C19340c<? super CombineKt$zipImpl$1$1> cVar) {
        super(2, cVar);
        this.$this_unsafeFlow = eVar;
        this.$flow2 = dVar;
        this.$flow = dVar2;
        this.$transform = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, cVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CombineKt$zipImpl$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19512n nVar;
        C19515q qVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            C19512n b = ProduceKt.m33139b(d0Var, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, (C19340c<? super CombineKt$zipImpl$1$1$second$1>) null), 3);
            final C19707i1 l = C1993m.m4368l();
            final C19600e<Object> eVar = this.$this_unsafeFlow;
            b.mo72190c(new C19857l<Throwable, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(Throwable th) {
                    if (l.isActive()) {
                        l.mo72134a(new AbortFlowException(eVar));
                    }
                }
            });
            try {
                final CoroutineContext coroutineContext = d0Var.getCoroutineContext();
                final Object b2 = ThreadContextKt.m33529b(coroutineContext);
                CoroutineContext plus = d0Var.getCoroutineContext().plus(l);
                C19394m mVar = C19394m.f43287a;
                final C19597d<Object> dVar = this.$flow;
                final C19600e<Object> eVar2 = this.$this_unsafeFlow;
                final C19862q<Object, Object, C19340c<Object>, Object> qVar2 = this.$transform;
                final C19512n nVar2 = b;
                C196202 r6 = new C196202((C19340c<? super C196202>) null);
                this.L$0 = b;
                this.label = 1;
                if (C17782b.m29887t0(plus, mVar, ThreadContextKt.m33529b(plus), r6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qVar = b;
            } catch (AbortFlowException e) {
                e = e;
                qVar = b;
                try {
                    if (e.getOwner() != this.$this_unsafeFlow) {
                        throw e;
                    }
                    qVar.mo72134a((CancellationException) null);
                    return C19394m.f43287a;
                } catch (Throwable th) {
                    th = th;
                    nVar = qVar;
                }
            } catch (Throwable th2) {
                th = th2;
                nVar = b;
                nVar.mo72134a((CancellationException) null);
                throw th;
            }
        } else if (i == 1) {
            qVar = (C19515q) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (AbortFlowException e2) {
                e = e2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar.mo72134a((CancellationException) null);
        return C19394m.f43287a;
    }
}
