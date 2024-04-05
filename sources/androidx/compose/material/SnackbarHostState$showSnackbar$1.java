package androidx.compose.material;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.material.SnackbarHostState", mo70541f = "SnackbarHost.kt", mo70542l = {379, 382}, mo70543m = "showSnackbar")
final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C1254t1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(C1254t1 t1Var, C19340c<? super SnackbarHostState$showSnackbar$1> cVar) {
        super(cVar);
        this.this$0 = t1Var;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v11, types: [kotlinx.coroutines.sync.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x00c8=Splitter:B:27:0x00c8, B:22:0x00b9=Splitter:B:22:0x00b9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r11.result = r12
            int r12 = r11.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 | r0
            r11.label = r12
            androidx.compose.material.t1 r12 = r11.this$0
            r12.getClass()
            int r1 = r11.label
            r2 = r1 & r0
            if (r2 == 0) goto L_0x0019
            int r1 = r1 - r0
            r11.label = r1
            r0 = r11
            goto L_0x001e
        L_0x0019:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r12, r11)
        L_0x001e:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x006f
            if (r3 == r5) goto L_0x0055
            if (r3 != r4) goto L_0x004d
            java.lang.Object r12 = r0.L$5
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r12 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r12
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.C19814c) r12
            java.lang.Object r2 = r0.L$3
            androidx.compose.material.SnackbarDuration r2 = (androidx.compose.material.SnackbarDuration) r2
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.L$0
            androidx.compose.material.t1 r0 = (androidx.compose.material.C1254t1) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)     // Catch:{ all -> 0x004a }
            goto L_0x00b9
        L_0x004a:
            r1 = move-exception
            goto L_0x00c8
        L_0x004d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0055:
            java.lang.Object r12 = r0.L$4
            kotlinx.coroutines.sync.c r12 = (kotlinx.coroutines.sync.C19814c) r12
            java.lang.Object r3 = r0.L$3
            androidx.compose.material.SnackbarDuration r3 = (androidx.compose.material.SnackbarDuration) r3
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            androidx.compose.material.t1 r9 = (androidx.compose.material.C1254t1) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            r1 = r12
            r12 = r9
            goto L_0x008a
        L_0x006f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r1)
            kotlinx.coroutines.sync.MutexImpl r1 = r12.f2616a
            r0.L$0 = r12
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.L$4 = r1
            r0.label = r5
            java.lang.Object r3 = r1.mo72641c(r6, r0)
            if (r3 != r2) goto L_0x0087
            goto L_0x00c2
        L_0x0087:
            r3 = r6
            r7 = r3
            r8 = r7
        L_0x008a:
            r0.L$0 = r12     // Catch:{ all -> 0x00c3 }
            r0.L$1 = r8     // Catch:{ all -> 0x00c3 }
            r0.L$2 = r7     // Catch:{ all -> 0x00c3 }
            r0.L$3 = r3     // Catch:{ all -> 0x00c3 }
            r0.L$4 = r1     // Catch:{ all -> 0x00c3 }
            r0.L$5 = r0     // Catch:{ all -> 0x00c3 }
            r0.label = r4     // Catch:{ all -> 0x00c3 }
            kotlinx.coroutines.l r4 = new kotlinx.coroutines.l     // Catch:{ all -> 0x00c3 }
            kotlin.coroutines.c r0 = kotlin.jvm.internal.C19388s.m32873m0(r0)     // Catch:{ all -> 0x00c3 }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x00c3 }
            r4.mo72548n()     // Catch:{ all -> 0x00c3 }
            androidx.compose.material.t1$a r0 = new androidx.compose.material.t1$a     // Catch:{ all -> 0x00c3 }
            r0.<init>(r8, r7, r3, r4)     // Catch:{ all -> 0x00c3 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r3 = r12.f2617b     // Catch:{ all -> 0x00c3 }
            r3.setValue(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.Object r0 = r4.mo72547l()     // Catch:{ all -> 0x00c3 }
            if (r0 != r2) goto L_0x00b5
            goto L_0x00c2
        L_0x00b5:
            r10 = r0
            r0 = r12
            r12 = r1
            r1 = r10
        L_0x00b9:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f2617b     // Catch:{ all -> 0x00ce }
            r0.setValue(r6)     // Catch:{ all -> 0x00ce }
            r12.mo72642d(r6)
            r2 = r1
        L_0x00c2:
            return r2
        L_0x00c3:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r1
            r1 = r10
        L_0x00c8:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.f2617b     // Catch:{ all -> 0x00ce }
            r0.setValue(r6)     // Catch:{ all -> 0x00ce }
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r12.mo72642d(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState$showSnackbar$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
