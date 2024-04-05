package kotlinx.coroutines.stream;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.flow.C19597d;

public final class StreamFlow<T> implements C19597d<T> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43796b = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(kotlinx.coroutines.flow.C19600e<? super T> r7, kotlin.coroutines.C19340c<? super kotlin.C19394m> r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof kotlinx.coroutines.stream.StreamFlow$collect$1
            if (r7 == 0) goto L_0x0013
            r7 = r8
            kotlinx.coroutines.stream.StreamFlow$collect$1 r7 = (kotlinx.coroutines.stream.StreamFlow$collect$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r7.label = r0
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r7 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r7.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r7.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0058
            if (r1 != r3) goto L_0x0050
            java.lang.Object r1 = r7.L$2
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r7.L$1
            kotlinx.coroutines.flow.e r4 = (kotlinx.coroutines.flow.C19600e) r4
            java.lang.Object r5 = r7.L$0
            kotlinx.coroutines.stream.StreamFlow r5 = (kotlinx.coroutines.stream.StreamFlow) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)     // Catch:{ all -> 0x0072 }
        L_0x0033:
            boolean r8 = r1.hasNext()     // Catch:{ all -> 0x0072 }
            if (r8 == 0) goto L_0x004c
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0072 }
            r7.L$0 = r5     // Catch:{ all -> 0x0072 }
            r7.L$1 = r4     // Catch:{ all -> 0x0072 }
            r7.L$2 = r1     // Catch:{ all -> 0x0072 }
            r7.label = r3     // Catch:{ all -> 0x0072 }
            java.lang.Object r8 = r4.emit(r8, r7)     // Catch:{ all -> 0x0072 }
            if (r8 != r0) goto L_0x0033
            return r0
        L_0x004c:
            r5.getClass()
            throw r2
        L_0x0050:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0058:
            androidx.compose.foundation.layout.C0761x.m1684O0(r8)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f43796b
            r8 = 0
            boolean r7 = r7.compareAndSet(r6, r8, r3)
            if (r7 != 0) goto L_0x0070
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Stream.consumeAsFlow can be collected only once"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0070:
            throw r2     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = r6
        L_0x0072:
            r5.getClass()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.e, kotlin.coroutines.c):java.lang.Object");
    }
}
