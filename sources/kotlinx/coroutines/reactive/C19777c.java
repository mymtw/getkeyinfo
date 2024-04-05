package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.C19464a;
import org.reactivestreams.Subscription;

/* renamed from: kotlinx.coroutines.reactive.c */
public final class C19777c<T> extends C19464a<C19394m> implements Subscription {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f43737d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43738e;
    private volatile boolean cancellationRequested;
    public volatile /* synthetic */ Object producer;
    public volatile /* synthetic */ long requested;

    static {
        Class<C19777c> cls = C19777c.class;
        f43737d = AtomicLongFieldUpdater.newUpdater(cls, "requested");
        f43738e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "producer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.C19394m m33730E0(kotlinx.coroutines.reactive.C19777c r4, kotlin.coroutines.C19340c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            if (r0 == 0) goto L_0x0016
            r0 = r5
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = (kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1 r0 = new kotlinx.coroutines.reactive.FlowSubscription$flowProcessing$1
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0043
            if (r1 == r2) goto L_0x002f
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.reactive.c r4 = (kotlinx.coroutines.reactive.C19777c) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ all -> 0x004b }
            r4.getClass()     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ all -> 0x003a }
        L_0x003a:
            r5 = move-exception
            kotlin.coroutines.CoroutineContext r4 = r4.f43394c
            p514bk.C14088a.m21785m(r5, r4)
            kotlin.m r4 = kotlin.C19394m.f43287a
            goto L_0x0069
        L_0x0043:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r0.L$0 = r4     // Catch:{ all -> 0x004b }
            r0.label = r2     // Catch:{ all -> 0x004b }
            throw r3     // Catch:{ all -> 0x004b }
        L_0x004b:
            r5 = move-exception
            boolean r0 = r4.cancellationRequested
            if (r0 == 0) goto L_0x005d
            boolean r0 = r4.isActive()
            if (r0 != 0) goto L_0x005d
            java.util.concurrent.CancellationException r0 = r4.mo72398h()
            if (r5 != r0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            throw r3     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            p568fn.C17782b.m29886t(r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.f43394c
            p514bk.C14088a.m21785m(r5, r4)
        L_0x0067:
            kotlin.m r4 = kotlin.C19394m.f43287a
        L_0x0069:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.C19777c.m33730E0(kotlinx.coroutines.reactive.c, kotlin.coroutines.c):kotlin.m");
    }

    public final void cancel() {
        this.cancellationRequested = true;
        mo72134a((CancellationException) null);
    }

    public final void request(long j) {
        long j2;
        long j3;
        C19340c cVar;
        if (j > 0) {
            do {
                j2 = this.requested;
                j3 = j2 + j;
                if (j3 <= 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!f43737d.compareAndSet(this, j2, j3));
            if (j2 <= 0) {
                do {
                    cVar = (C19340c) f43738e.getAndSet(this, (Object) null);
                } while (cVar == null);
                cVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            }
        }
    }
}
