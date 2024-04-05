package androidx.compose.p015ui.platform;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19499d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", mo70541f = "GlobalSnapshotManager.android.kt", mo70542l = {63}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1 */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19499d<C19394m> $channel;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(C19499d<C19394m> dVar, C19340c<? super GlobalSnapshotManager$ensureStarted$1> cVar) {
        super(2, cVar);
        this.$channel = dVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r9 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r8.L$1
            kotlinx.coroutines.channels.f r1 = (kotlinx.coroutines.channels.C19502f) r1
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.channels.q r3 = (kotlinx.coroutines.channels.C19515q) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ all -> 0x007c }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            kotlinx.coroutines.channels.d<kotlin.m> r3 = r8.$channel
            kotlinx.coroutines.channels.f r9 = r3.iterator()     // Catch:{ all -> 0x007c }
            r1 = r9
            r9 = r8
        L_0x002c:
            r9.L$0 = r3     // Catch:{ all -> 0x007c }
            r9.L$1 = r1     // Catch:{ all -> 0x007c }
            r9.label = r2     // Catch:{ all -> 0x007c }
            java.lang.Object r4 = r1.mo72148a(r9)     // Catch:{ all -> 0x007c }
            if (r4 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r7 = r0
            r0 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L_0x003f:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x007a }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x007a }
            kotlin.m r9 = (kotlin.C19394m) r9     // Catch:{ all -> 0x007a }
            java.lang.Object r9 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c     // Catch:{ all -> 0x007a }
            monitor-enter(r9)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r5 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i     // Catch:{ all -> 0x0071 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0071 }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x0071 }
            java.util.Set<androidx.compose.runtime.snapshots.w> r5 = r5.f3012g     // Catch:{ all -> 0x0071 }
            r6 = 0
            if (r5 == 0) goto L_0x0066
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0071 }
            r5 = r5 ^ r2
            if (r5 != r2) goto L_0x0066
            r6 = r2
        L_0x0066:
            monitor-exit(r9)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x006c
            androidx.compose.runtime.snapshots.SnapshotKt.m2902a()     // Catch:{ all -> 0x007a }
        L_0x006c:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002c
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x0074:
            kotlin.jvm.internal.C19388s.m32827J(r4, r5)
            kotlin.m r9 = kotlin.C19394m.f43287a
            return r9
        L_0x007a:
            r9 = move-exception
            goto L_0x007e
        L_0x007c:
            r9 = move-exception
            r4 = r3
        L_0x007e:
            throw r9     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            kotlin.jvm.internal.C19388s.m32827J(r4, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
