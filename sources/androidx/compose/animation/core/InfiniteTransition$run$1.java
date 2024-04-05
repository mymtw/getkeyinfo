package androidx.compose.animation.core;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.animation.core.InfiniteTransition$run$1", mo70541f = "InfiniteTransition.kt", mo70542l = {147, 169}, mo70543m = "invokeSuspend")
public final class InfiniteTransition$run$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(InfiniteTransition infiniteTransition, C19340c<? super InfiniteTransition$run$1> cVar) {
        super(2, cVar);
        this.this$0 = infiniteTransition;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.this$0, cVar);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((InfiniteTransition$run$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlinx.coroutines.d0} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.C19525d0) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x003e
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0020:
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            java.lang.Object r4 = r8.L$0
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.C19525d0) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            r9 = r8
            goto L_0x0053
        L_0x002d:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            java.lang.Object r9 = r8.L$0
            r4 = r9
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.C19525d0) r4
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r9 = 1065353216(0x3f800000, float:1.0)
            r1.element = r9
        L_0x003e:
            r9 = r8
        L_0x003f:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.animation.core.InfiniteTransition r6 = r9.this$0
            r5.<init>(r6, r1, r4)
            r9.L$0 = r4
            r9.L$1 = r1
            r9.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.C0464y.m1233a(r5, r9)
            if (r5 != r0) goto L_0x0053
            return r0
        L_0x0053:
            float r5 = r1.element
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x005c
            r5 = r3
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            if (r5 == 0) goto L_0x003f
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r5.<init>(r4)
            kotlinx.coroutines.flow.q1 r5 = androidx.compose.runtime.C1333i1.m2796b(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r7 = 0
            r6.<init>(r7)
            r9.L$0 = r4
            r9.L$1 = r1
            r9.label = r2
            java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt__ReduceKt.m33372b(r5, r6, r9)
            if (r5 != r0) goto L_0x003f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
