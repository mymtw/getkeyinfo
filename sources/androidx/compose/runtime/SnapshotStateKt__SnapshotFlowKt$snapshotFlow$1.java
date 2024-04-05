package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", mo70541f = "SnapshotFlow.kt", mo70542l = {134, 138, 160}, mo70543m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<Object> $block;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(C19846a<Object> aVar, C19340c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: kotlinx.coroutines.flow.e} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0197, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0199, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019a, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        androidx.compose.runtime.snapshots.C1385f.m2974o(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x019e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r2.mo5930c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x005a, B:24:0x009e, B:26:0x00a2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00df A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec A[Catch:{ all -> 0x017e, all -> 0x017c, all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0132 A[Catch:{ all -> 0x017e, all -> 0x017c, all -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0144 A[Catch:{ all -> 0x017e, all -> 0x017c, all -> 0x0191 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x0061
            if (r2 == r4) goto L_0x0044
            if (r2 == r5) goto L_0x001b
            if (r2 != r6) goto L_0x0013
            goto L_0x0044
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001b:
            int r2 = r1.I$0
            java.lang.Object r7 = r1.L$5
            java.lang.Object r8 = r1.L$4
            androidx.compose.runtime.snapshots.c r8 = (androidx.compose.runtime.snapshots.C1382c) r8
            java.lang.Object r9 = r1.L$3
            kotlinx.coroutines.channels.d r9 = (kotlinx.coroutines.channels.C19499d) r9
            java.lang.Object r10 = r1.L$2
            kq.l r10 = (p753kq.C19857l) r10
            java.lang.Object r11 = r1.L$1
            java.util.Set r11 = (java.util.Set) r11
            java.lang.Object r12 = r1.L$0
            kotlinx.coroutines.flow.e r12 = (kotlinx.coroutines.flow.C19600e) r12
            androidx.compose.foundation.layout.C0761x.m1684O0(r17)     // Catch:{ all -> 0x0041 }
            r13 = r17
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r1
            goto L_0x00e8
        L_0x0041:
            r0 = move-exception
            goto L_0x01a4
        L_0x0044:
            java.lang.Object r2 = r1.L$5
            java.lang.Object r7 = r1.L$4
            androidx.compose.runtime.snapshots.c r7 = (androidx.compose.runtime.snapshots.C1382c) r7
            java.lang.Object r8 = r1.L$3
            kotlinx.coroutines.channels.d r8 = (kotlinx.coroutines.channels.C19499d) r8
            java.lang.Object r9 = r1.L$2
            kq.l r9 = (p753kq.C19857l) r9
            java.lang.Object r10 = r1.L$1
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.L$0
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C19600e) r11
            androidx.compose.foundation.layout.C0761x.m1684O0(r17)     // Catch:{ all -> 0x005e }
            goto L_0x00c2
        L_0x005e:
            r0 = move-exception
            goto L_0x01a3
        L_0x0061:
            androidx.compose.foundation.layout.C0761x.m1684O0(r17)
            java.lang.Object r2 = r1.L$0
            r11 = r2
            kotlinx.coroutines.flow.e r11 = (kotlinx.coroutines.flow.C19600e) r11
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1 r9 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
            r9.<init>(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            kotlinx.coroutines.channels.AbstractChannel r8 = p568fn.C17782b.m29872l(r2, r8, r7)
            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1 r2 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
            r2.<init>(r8)
            kq.l<androidx.compose.runtime.snapshots.SnapshotIdSet, kotlin.m> r7 = androidx.compose.runtime.snapshots.SnapshotKt.f2987a
            androidx.compose.runtime.snapshots.SnapshotKt.m2907f(r7)
            java.lang.Object r7 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r7)
            java.util.ArrayList r12 = androidx.compose.runtime.snapshots.SnapshotKt.f2993g     // Catch:{ all -> 0x01a8 }
            r12.add(r2)     // Catch:{ all -> 0x01a8 }
            monitor-exit(r7)
            androidx.compose.runtime.snapshots.e r7 = new androidx.compose.runtime.snapshots.e
            r7.<init>(r2)
            androidx.compose.runtime.snapshots.f r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2910i()     // Catch:{ all -> 0x005e }
            androidx.compose.runtime.snapshots.f r2 = r2.mo5934r(r9)     // Catch:{ all -> 0x005e }
            kq.a<java.lang.Object> r12 = r1.$block     // Catch:{ all -> 0x005e }
            androidx.compose.runtime.snapshots.f r13 = r2.mo6001i()     // Catch:{ all -> 0x0197 }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x0199 }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r13)     // Catch:{ all -> 0x0197 }
            r2.mo5930c()     // Catch:{ all -> 0x005e }
            r1.L$0 = r11     // Catch:{ all -> 0x005e }
            r1.L$1 = r10     // Catch:{ all -> 0x005e }
            r1.L$2 = r9     // Catch:{ all -> 0x005e }
            r1.L$3 = r8     // Catch:{ all -> 0x005e }
            r1.L$4 = r7     // Catch:{ all -> 0x005e }
            r1.L$5 = r12     // Catch:{ all -> 0x005e }
            r1.label = r4     // Catch:{ all -> 0x005e }
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch:{ all -> 0x005e }
            if (r2 != r0) goto L_0x00c1
            return r0
        L_0x00c1:
            r2 = r12
        L_0x00c2:
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r1
        L_0x00c9:
            r2.L$0 = r12     // Catch:{ all -> 0x0194 }
            r2.L$1 = r11     // Catch:{ all -> 0x0194 }
            r2.L$2 = r10     // Catch:{ all -> 0x0194 }
            r2.L$3 = r9     // Catch:{ all -> 0x0194 }
            r2.L$4 = r8     // Catch:{ all -> 0x0194 }
            r2.L$5 = r7     // Catch:{ all -> 0x0194 }
            r2.I$0 = r3     // Catch:{ all -> 0x0194 }
            r2.label = r5     // Catch:{ all -> 0x0194 }
            java.lang.Object r13 = r9.mo72138o(r2)     // Catch:{ all -> 0x0194 }
            if (r13 != r0) goto L_0x00e0
            return r0
        L_0x00e0:
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r2
            r2 = r3
        L_0x00e8:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0191 }
        L_0x00ea:
            if (r2 != 0) goto L_0x0135
            int r2 = r12.size()     // Catch:{ all -> 0x0191 }
            int r15 = r13.size()     // Catch:{ all -> 0x0191 }
            if (r2 >= r15) goto L_0x0112
            boolean r2 = r12.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x00fd
            goto L_0x012f
        L_0x00fd:
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x0191 }
        L_0x0101:
            boolean r15 = r2.hasNext()     // Catch:{ all -> 0x0191 }
            if (r15 == 0) goto L_0x012f
            java.lang.Object r15 = r2.next()     // Catch:{ all -> 0x0191 }
            boolean r15 = r13.contains(r15)     // Catch:{ all -> 0x0191 }
            if (r15 == 0) goto L_0x0101
            goto L_0x012d
        L_0x0112:
            boolean r2 = r13.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x0119
            goto L_0x012f
        L_0x0119:
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x0191 }
        L_0x011d:
            boolean r13 = r2.hasNext()     // Catch:{ all -> 0x0191 }
            if (r13 == 0) goto L_0x012f
            java.lang.Object r13 = r2.next()     // Catch:{ all -> 0x0191 }
            boolean r13 = r12.contains(r13)     // Catch:{ all -> 0x0191 }
            if (r13 == 0) goto L_0x011d
        L_0x012d:
            r2 = r4
            goto L_0x0130
        L_0x012f:
            r2 = r3
        L_0x0130:
            if (r2 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r2 = r3
            goto L_0x0136
        L_0x0135:
            r2 = r4
        L_0x0136:
            java.lang.Object r13 = r10.mo72144w()     // Catch:{ all -> 0x0191 }
            java.lang.Object r13 = kotlinx.coroutines.channels.C19503g.m33188b(r13)     // Catch:{ all -> 0x0191 }
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0191 }
            if (r13 != 0) goto L_0x00ea
            if (r2 == 0) goto L_0x0188
            r12.clear()     // Catch:{ all -> 0x0191 }
            androidx.compose.runtime.snapshots.f r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2910i()     // Catch:{ all -> 0x0191 }
            androidx.compose.runtime.snapshots.f r2 = r2.mo5934r(r11)     // Catch:{ all -> 0x0191 }
            kq.a<java.lang.Object> r13 = r7.$block     // Catch:{ all -> 0x0191 }
            androidx.compose.runtime.snapshots.f r15 = r2.mo6001i()     // Catch:{ all -> 0x017c }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x017e }
            androidx.compose.runtime.snapshots.C1385f.m2974o(r15)     // Catch:{ all -> 0x017c }
            r2.mo5930c()     // Catch:{ all -> 0x0191 }
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r13, r8)     // Catch:{ all -> 0x0191 }
            if (r2 != 0) goto L_0x0188
            r7.L$0 = r14     // Catch:{ all -> 0x0191 }
            r7.L$1 = r12     // Catch:{ all -> 0x0191 }
            r7.L$2 = r11     // Catch:{ all -> 0x0191 }
            r7.L$3 = r10     // Catch:{ all -> 0x0191 }
            r7.L$4 = r9     // Catch:{ all -> 0x0191 }
            r7.L$5 = r13     // Catch:{ all -> 0x0191 }
            r7.label = r6     // Catch:{ all -> 0x0191 }
            java.lang.Object r2 = r14.emit(r13, r7)     // Catch:{ all -> 0x0191 }
            if (r2 != r0) goto L_0x017a
            return r0
        L_0x017a:
            r8 = r13
            goto L_0x0188
        L_0x017c:
            r0 = move-exception
            goto L_0x0184
        L_0x017e:
            r0 = move-exception
            r3 = r0
            androidx.compose.runtime.snapshots.C1385f.m2974o(r15)     // Catch:{ all -> 0x017c }
            throw r3     // Catch:{ all -> 0x017c }
        L_0x0184:
            r2.mo5930c()     // Catch:{ all -> 0x0191 }
            throw r0     // Catch:{ all -> 0x0191 }
        L_0x0188:
            r2 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            goto L_0x00c9
        L_0x0191:
            r0 = move-exception
            r8 = r9
            goto L_0x01a4
        L_0x0194:
            r0 = move-exception
            r7 = r8
            goto L_0x01a3
        L_0x0197:
            r0 = move-exception
            goto L_0x019f
        L_0x0199:
            r0 = move-exception
            r3 = r0
            androidx.compose.runtime.snapshots.C1385f.m2974o(r13)     // Catch:{ all -> 0x0197 }
            throw r3     // Catch:{ all -> 0x0197 }
        L_0x019f:
            r2.mo5930c()     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x01a3:
            r8 = r7
        L_0x01a4:
            r8.dispose()
            throw r0
        L_0x01a8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
