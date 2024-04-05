package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.SingleProcessDataStore$actor$3", mo70541f = "SingleProcessDataStore.kt", mo70542l = {239, 242}, mo70543m = "invokeSuspend")
final class SingleProcessDataStore$actor$3 extends SuspendLambda implements C19861p<SingleProcessDataStore.C2467a<Object>, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SingleProcessDataStore<Object> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<Object> singleProcessDataStore, C19340c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, cVar);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    public final Object invoke(SingleProcessDataStore.C2467a<Object> aVar, C19340c<? super C19394m> cVar) {
        return ((SingleProcessDataStore$actor$3) create(aVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0015:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x0082
        L_0x001a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            java.lang.Object r5 = r4.L$0
            androidx.datastore.core.SingleProcessDataStore$a r5 = (androidx.datastore.core.SingleProcessDataStore.C2467a) r5
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.C2467a.C2468a
            if (r1 == 0) goto L_0x0071
            androidx.datastore.core.SingleProcessDataStore<java.lang.Object> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$a$a r5 = (androidx.datastore.core.SingleProcessDataStore.C2467a.C2468a) r5
            r4.label = r3
            kotlinx.coroutines.flow.StateFlowImpl r2 = r1.f5735h
            java.lang.Object r2 = r2.getValue()
            androidx.datastore.core.k r2 = (androidx.datastore.core.C2484k) r2
            boolean r3 = r2 instanceof androidx.datastore.core.C2474b
            if (r3 == 0) goto L_0x0038
            goto L_0x0060
        L_0x0038:
            boolean r3 = r2 instanceof androidx.datastore.core.C2482i
            if (r3 == 0) goto L_0x004a
            androidx.datastore.core.k<T> r5 = r5.f5738a
            if (r2 != r5) goto L_0x0060
            java.lang.Object r5 = r1.mo9307f(r4)
            if (r5 != r0) goto L_0x0047
            goto L_0x0062
        L_0x0047:
            kotlin.m r5 = kotlin.C19394m.f43287a
            goto L_0x0062
        L_0x004a:
            androidx.datastore.core.l r5 = androidx.datastore.core.C2485l.f5754a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r2, r5)
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r1.mo9307f(r4)
            if (r5 != r0) goto L_0x0059
            goto L_0x0062
        L_0x0059:
            kotlin.m r5 = kotlin.C19394m.f43287a
            goto L_0x0062
        L_0x005c:
            boolean r5 = r2 instanceof androidx.datastore.core.C2480g
            if (r5 != 0) goto L_0x0065
        L_0x0060:
            kotlin.m r5 = kotlin.C19394m.f43287a
        L_0x0062:
            if (r5 != r0) goto L_0x0082
            return r0
        L_0x0065:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0071:
            boolean r1 = r5 instanceof androidx.datastore.core.SingleProcessDataStore.C2467a.C2469b
            if (r1 == 0) goto L_0x0082
            androidx.datastore.core.SingleProcessDataStore<java.lang.Object> r1 = r4.this$0
            androidx.datastore.core.SingleProcessDataStore$a$b r5 = (androidx.datastore.core.SingleProcessDataStore.C2467a.C2469b) r5
            r4.label = r2
            java.lang.Object r5 = androidx.datastore.core.SingleProcessDataStore.m5426b(r1, r5, r4)
            if (r5 != r0) goto L_0x0082
            return r0
        L_0x0082:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$actor$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
