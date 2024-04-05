package kotlinx.coroutines.flow;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "kotlinx.coroutines.flow.StartedLazily$command$1", mo70541f = "SharingStarted.kt", mo70542l = {155}, mo70543m = "invokeSuspend")
public final class StartedLazily$command$1 extends SuspendLambda implements C19861p<C19600e<? super SharingCommand>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19689x1<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(C19689x1<Integer> x1Var, C19340c<? super StartedLazily$command$1> cVar) {
        super(2, cVar);
        this.$subscriptionCount = x1Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, cVar);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    public final Object invoke(C19600e<? super SharingCommand> eVar, C19340c<? super C19394m> cVar) {
        return ((StartedLazily$command$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C19600e eVar = (C19600e) this.L$0;
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            C19689x1<Integer> x1Var = this.$subscriptionCount;
            C195851 r4 = new C19600e() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object mo72325b(int r5, kotlin.coroutines.C19340c<? super kotlin.C19394m> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = (kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1 r0 = new kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L_0x002f
                        if (r2 != r3) goto L_0x0027
                        androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                        goto L_0x0049
                    L_0x0027:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x002f:
                        androidx.compose.foundation.layout.C0761x.m1684O0(r6)
                        if (r5 <= 0) goto L_0x004c
                        kotlin.jvm.internal.Ref$BooleanRef r5 = r1
                        boolean r6 = r5.element
                        if (r6 != 0) goto L_0x004c
                        r5.element = r3
                        kotlinx.coroutines.flow.e<kotlinx.coroutines.flow.SharingCommand> r5 = r6
                        kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                        r0.label = r3
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L_0x0049
                        return r1
                    L_0x0049:
                        kotlin.m r5 = kotlin.C19394m.f43287a
                        return r5
                    L_0x004c:
                        kotlin.m r5 = kotlin.C19394m.f43287a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedLazily$command$1.C195851.mo72325b(int, kotlin.coroutines.c):java.lang.Object");
                }

                public final /* bridge */ /* synthetic */ Object emit(Object obj, C19340c cVar) {
                    return mo72325b(((Number) obj).intValue(), cVar);
                }
            };
            this.label = 1;
            if (x1Var.collect(r4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C0761x.m1684O0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
