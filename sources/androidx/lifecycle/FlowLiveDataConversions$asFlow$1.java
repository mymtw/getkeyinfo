package androidx.lifecycle;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", mo70541f = "FlowLiveData.kt", mo70542l = {98, 102, 103}, mo70543m = "invokeSuspend")
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ LiveData<Object> $this_asFlow;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a */
    public static final class C2827a<T> implements C2843a0 {

        /* renamed from: b */
        public final /* synthetic */ C19499d<T> f6420b;

        public C2827a(AbstractChannel abstractChannel) {
            this.f6420b = abstractChannel;
        }

        public final void onChanged(T t) {
            this.f6420b.mo72199l(t);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<Object> liveData, C19340c<? super FlowLiveDataConversions$asFlow$1> cVar) {
        super(2, cVar);
        this.$this_asFlow = liveData;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, cVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ all -> 0x00da }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 == r5) goto L_0x0042
            if (r1 == r3) goto L_0x0029
            if (r1 != r2) goto L_0x0021
            java.lang.Object r1 = r11.L$2
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r5 = r11.L$1
            androidx.lifecycle.a0 r5 = (androidx.lifecycle.C2843a0) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ all -> 0x003f }
            goto L_0x008b
        L_0x0021:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0029:
            java.lang.Object r1 = r11.L$2
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r5 = r11.L$1
            androidx.lifecycle.a0 r5 = (androidx.lifecycle.C2843a0) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ all -> 0x003f }
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r11
            goto L_0x00a2
        L_0x003f:
            r12 = move-exception
            goto L_0x00e4
        L_0x0042:
            java.lang.Object r1 = r11.L$2
            androidx.lifecycle.a0 r1 = (androidx.lifecycle.C2843a0) r1
            java.lang.Object r5 = r11.L$1
            kotlinx.coroutines.channels.d r5 = (kotlinx.coroutines.channels.C19499d) r5
            java.lang.Object r6 = r11.L$0
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C19600e) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x0085
        L_0x0052:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C19600e) r12
            r1 = -1
            r6 = 6
            kotlinx.coroutines.channels.AbstractChannel r1 = p568fn.C17782b.m29872l(r1, r4, r6)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a r6 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$a
            r6.<init>(r1)
            rq.b r7 = kotlinx.coroutines.C19760n0.f43719a
            kotlinx.coroutines.o1 r7 = kotlinx.coroutines.internal.C19729m.f43681a
            kotlinx.coroutines.o1 r7 = r7.mo72111E0()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r8 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<java.lang.Object> r9 = r11.$this_asFlow
            r8.<init>(r9, r6, r4)
            r11.L$0 = r12
            r11.L$1 = r1
            r11.L$2 = r6
            r11.label = r5
            java.lang.Object r5 = kotlinx.coroutines.C19697g.m33471i(r11, r7, r8)
            if (r5 != r0) goto L_0x0082
            return r0
        L_0x0082:
            r5 = r1
            r1 = r6
            r6 = r12
        L_0x0085:
            kotlinx.coroutines.channels.f r12 = r5.iterator()     // Catch:{ all -> 0x00e2 }
            r5 = r1
            r1 = r12
        L_0x008b:
            r12 = r11
        L_0x008c:
            r12.L$0 = r6     // Catch:{ all -> 0x00e0 }
            r12.L$1 = r5     // Catch:{ all -> 0x00e0 }
            r12.L$2 = r1     // Catch:{ all -> 0x00e0 }
            r12.label = r3     // Catch:{ all -> 0x00e0 }
            java.lang.Object r7 = r1.mo72148a(r12)     // Catch:{ all -> 0x00e0 }
            if (r7 != r0) goto L_0x009b
            return r0
        L_0x009b:
            r10 = r0
            r0 = r12
            r12 = r7
            r7 = r6
            r6 = r5
            r5 = r1
            r1 = r10
        L_0x00a2:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x00da }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x00da }
            if (r12 == 0) goto L_0x00c3
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x00da }
            r0.L$0 = r7     // Catch:{ all -> 0x00da }
            r0.L$1 = r6     // Catch:{ all -> 0x00da }
            r0.L$2 = r5     // Catch:{ all -> 0x00da }
            r0.label = r2     // Catch:{ all -> 0x00da }
            java.lang.Object r12 = r7.emit(r12, r0)     // Catch:{ all -> 0x00da }
            if (r12 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r12 = r0
            r0 = r1
            r1 = r5
            r5 = r6
            r6 = r7
            goto L_0x008c
        L_0x00c3:
            kotlinx.coroutines.y0 r12 = kotlinx.coroutines.C19840y0.f43848b
            rq.b r1 = kotlinx.coroutines.C19760n0.f43719a
            kotlinx.coroutines.o1 r1 = kotlinx.coroutines.internal.C19729m.f43681a
            kotlinx.coroutines.o1 r1 = r1.mo72111E0()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r2 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<java.lang.Object> r0 = r0.$this_asFlow
            r2.<init>(r0, r6, r4)
            kotlinx.coroutines.C19697g.m33468f(r12, r1, r4, r2, r3)
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        L_0x00da:
            r12 = move-exception
            r5 = r6
            r10 = r0
            r0 = r12
            r12 = r10
            goto L_0x00e6
        L_0x00e0:
            r0 = move-exception
            goto L_0x00e6
        L_0x00e2:
            r12 = move-exception
            r5 = r1
        L_0x00e4:
            r0 = r12
            r12 = r11
        L_0x00e6:
            kotlinx.coroutines.y0 r1 = kotlinx.coroutines.C19840y0.f43848b
            rq.b r2 = kotlinx.coroutines.C19760n0.f43719a
            kotlinx.coroutines.o1 r2 = kotlinx.coroutines.internal.C19729m.f43681a
            kotlinx.coroutines.o1 r2 = r2.mo72111E0()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r6 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            androidx.lifecycle.LiveData<java.lang.Object> r12 = r12.$this_asFlow
            r6.<init>(r12, r5, r4)
            kotlinx.coroutines.C19697g.m33468f(r1, r2, r4, r6, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
