package androidx.datastore.core;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SimpleActor$offer$2", mo70541f = "SimpleActor.kt", mo70542l = {122, 122}, mo70543m = "invokeSuspend")
final class SimpleActor$offer$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public Object L$0;
    public int label;
    public final /* synthetic */ SimpleActor<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleActor$offer$2(SimpleActor<Object> simpleActor, C19340c<? super SimpleActor$offer$2> cVar) {
        super(2, cVar);
        this.this$0 = simpleActor;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SimpleActor$offer$2(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SimpleActor$offer$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0024
            if (r1 == r2) goto L_0x0019
            if (r1 != r3) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            r7 = r6
            goto L_0x005f
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0019:
            java.lang.Object r1 = r6.L$0
            kq.p r1 = (p753kq.C19861p) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L_0x0053
        L_0x0024:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            androidx.datastore.core.SimpleActor<java.lang.Object> r7 = r6.this$0
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f5725d
            int r7 = r7.get()
            if (r7 <= 0) goto L_0x0033
            r7 = r2
            goto L_0x0034
        L_0x0033:
            r7 = 0
        L_0x0034:
            if (r7 == 0) goto L_0x006c
            r7 = r6
        L_0x0037:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r7.this$0
            kotlinx.coroutines.d0 r1 = r1.f5722a
            kotlin.coroutines.CoroutineContext r1 = r1.getCoroutineContext()
            androidx.compose.p015ui.text.input.C1993m.m4379y(r1)
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r7.this$0
            kq.p<T, kotlin.coroutines.c<? super kotlin.m>, java.lang.Object> r4 = r1.f5723b
            kotlinx.coroutines.channels.AbstractChannel r1 = r1.f5724c
            r7.L$0 = r4
            r7.label = r2
            java.lang.Object r1 = r1.mo72138o(r7)
            if (r1 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r5 = 0
            r7.L$0 = r5
            r7.label = r3
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L_0x005f
            return r0
        L_0x005f:
            androidx.datastore.core.SimpleActor<java.lang.Object> r1 = r7.this$0
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f5725d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L_0x0037
            kotlin.m r7 = kotlin.C19394m.f43287a
            return r7
        L_0x006c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor$offer$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
