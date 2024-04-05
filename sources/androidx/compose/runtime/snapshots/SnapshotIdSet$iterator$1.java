package androidx.compose.runtime.snapshots;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", mo70541f = "SnapshotIdSet.kt", mo70542l = {295, 300, 307}, mo70543m = "invokeSuspend")
public final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super Integer>, C19340c<? super C19394m>, Object> {
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SnapshotIdSet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, C19340c<? super SnapshotIdSet$iterator$1> cVar) {
        super(2, cVar);
        this.this$0 = snapshotIdSet;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, cVar);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    public final Object invoke(C19433i<? super Integer> iVar, C19340c<? super C19394m> cVar) {
        return ((SnapshotIdSet$iterator$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r5 = 0
            r6 = 2
            r7 = 3
            r8 = 64
            r10 = 0
            r12 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r12) goto L_0x003a
            if (r2 == r6) goto L_0x002e
            if (r2 != r7) goto L_0x0026
            int r2 = r0.I$0
            java.lang.Object r6 = r0.L$0
            kotlin.sequences.i r6 = (kotlin.sequences.C19433i) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r20)
            r13 = r7
            r7 = r6
            r6 = r0
            goto L_0x00e9
        L_0x0026:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x002e:
            int r2 = r0.I$0
            java.lang.Object r13 = r0.L$0
            kotlin.sequences.i r13 = (kotlin.sequences.C19433i) r13
            androidx.compose.foundation.layout.C0761x.m1684O0(r20)
            r9 = r0
            goto L_0x00b0
        L_0x003a:
            int r2 = r0.I$1
            int r13 = r0.I$0
            java.lang.Object r14 = r0.L$1
            int[] r14 = (int[]) r14
            java.lang.Object r15 = r0.L$0
            kotlin.sequences.i r15 = (kotlin.sequences.C19433i) r15
            androidx.compose.foundation.layout.C0761x.m1684O0(r20)
            r9 = r0
            goto L_0x0078
        L_0x004b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r20)
            java.lang.Object r2 = r0.L$0
            kotlin.sequences.i r2 = (kotlin.sequences.C19433i) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r13 = r0.this$0
            int[] r13 = r13.f2986e
            if (r13 == 0) goto L_0x007e
            int r14 = r13.length
            r9 = r0
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = 0
        L_0x005e:
            if (r13 >= r2) goto L_0x007c
            r7 = r14[r13]
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r9.L$0 = r15
            r9.L$1 = r14
            r9.I$0 = r13
            r9.I$1 = r2
            r9.label = r12
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r15.mo72006a(r6, r9)
            if (r6 != r1) goto L_0x0078
            return r1
        L_0x0078:
            int r13 = r13 + r12
            r6 = 2
            r7 = 3
            goto L_0x005e
        L_0x007c:
            r2 = r15
            goto L_0x007f
        L_0x007e:
            r9 = r0
        L_0x007f:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r6 = r6.f2984c
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00b3
            r13 = r2
            r2 = 0
        L_0x0089:
            if (r2 >= r8) goto L_0x00b2
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r14 = r6.f2984c
            long r17 = r3 << r2
            long r14 = r14 & r17
            int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x00af
            int r6 = r6.f2985d
            int r6 = r6 + r2
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            r9.L$0 = r13
            r9.L$1 = r5
            r9.I$0 = r2
            r6 = 2
            r9.label = r6
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = r13.mo72006a(r7, r9)
            if (r7 != r1) goto L_0x00b0
            return r1
        L_0x00af:
            r6 = 2
        L_0x00b0:
            int r2 = r2 + r12
            goto L_0x0089
        L_0x00b2:
            r2 = r13
        L_0x00b3:
            androidx.compose.runtime.snapshots.SnapshotIdSet r6 = r9.this$0
            long r6 = r6.f2983b
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ee
            r6 = r2
            r2 = r9
            r9 = 0
        L_0x00be:
            if (r9 >= r8) goto L_0x00ee
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r2.this$0
            long r13 = r7.f2983b
            long r15 = r3 << r9
            long r13 = r13 & r15
            int r13 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r13 == 0) goto L_0x00e5
            int r13 = r9 + 64
            int r7 = r7.f2985d
            int r13 = r13 + r7
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r13)
            r2.L$0 = r6
            r2.L$1 = r5
            r2.I$0 = r9
            r13 = 3
            r2.label = r13
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = r6.mo72006a(r7, r2)
            if (r7 != r1) goto L_0x00e6
            return r1
        L_0x00e5:
            r13 = 3
        L_0x00e6:
            r7 = r6
            r6 = r2
            r2 = r9
        L_0x00e9:
            int r9 = r2 + 1
            r2 = r6
            r6 = r7
            goto L_0x00be
        L_0x00ee:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
