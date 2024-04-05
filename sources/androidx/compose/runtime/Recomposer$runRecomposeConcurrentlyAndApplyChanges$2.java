package androidx.compose.runtime;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", mo70541f = "Recomposer.kt", mo70542l = {592, 612, 613}, mo70543m = "invokeSuspend")
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements C19862q<C19525d0, C1321f0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, C19340c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    public final Object invoke(C19525d0 d0Var, C1321f0 f0Var, C19340c<? super C19394m> cVar) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, cVar);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = d0Var;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = f0Var;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(C19394m.f43287a);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128  */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.label
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            if (r1 == r4) goto L_0x0027
            if (r1 == r2) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            goto L_0x016c
        L_0x0015:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001d:
            java.lang.Object r1 = r14.L$0
            kotlinx.coroutines.g1 r1 = (kotlinx.coroutines.C19699g1) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            r15 = r14
            goto L_0x0160
        L_0x0027:
            java.lang.Object r1 = r14.L$2
            kotlinx.coroutines.g1 r1 = (kotlinx.coroutines.C19699g1) r1
            java.lang.Object r2 = r14.L$1
            androidx.compose.runtime.p0 r2 = (androidx.compose.runtime.C1355p0) r2
            java.lang.Object r3 = r14.L$0
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.C19525d0) r3
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            r15 = r14
            goto L_0x00a0
        L_0x0038:
            androidx.compose.foundation.layout.C0761x.m1684O0(r15)
            java.lang.Object r15 = r14.L$0
            kotlinx.coroutines.d0 r15 = (kotlinx.coroutines.C19525d0) r15
            java.lang.Object r1 = r14.L$1
            androidx.compose.runtime.f0 r1 = (androidx.compose.runtime.C1321f0) r1
            kotlin.coroutines.CoroutineContext r2 = r14.$recomposeCoroutineContext
            kotlinx.coroutines.g1$b r6 = kotlinx.coroutines.C19699g1.C19701b.f43635b
            kotlin.coroutines.CoroutineContext$a r2 = r2.get(r6)
            if (r2 != 0) goto L_0x004f
            r2 = r4
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            kotlin.coroutines.CoroutineContext r7 = r14.$recomposeCoroutineContext
            if (r2 == 0) goto L_0x016f
            kotlin.coroutines.CoroutineContext r2 = r15.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r6 = r14.$recomposeCoroutineContext
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r6)
            kotlin.coroutines.CoroutineContext r6 = r15.getCoroutineContext()
            kotlinx.coroutines.g1 r6 = androidx.compose.p015ui.text.input.C1993m.m4345F(r6)
            kotlinx.coroutines.i1 r7 = new kotlinx.coroutines.i1
            r7.<init>(r6)
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r7)
            kotlinx.coroutines.internal.f r2 = kotlinx.coroutines.C19697g.m33463a(r2)
            androidx.compose.runtime.p0 r6 = new androidx.compose.runtime.p0
            r6.<init>()
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1 r7 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1
            androidx.compose.runtime.Recomposer r8 = r14.this$0
            r7.<init>(r8, r1, r6, r5)
            kotlinx.coroutines.w1 r15 = kotlinx.coroutines.C19697g.m33468f(r15, r5, r5, r7, r3)
            r1 = r15
            r3 = r2
            r2 = r6
            r15 = r14
        L_0x0087:
            androidx.compose.runtime.Recomposer r5 = r15.this$0
            boolean r5 = androidx.compose.runtime.Recomposer.m2544t(r5)
            if (r5 == 0) goto L_0x0147
            androidx.compose.runtime.Recomposer r5 = r15.this$0
            r15.L$0 = r3
            r15.L$1 = r2
            r15.L$2 = r1
            r15.label = r4
            java.lang.Object r5 = androidx.compose.runtime.Recomposer.m2542r(r5, r15)
            if (r5 != r0) goto L_0x00a0
            return r0
        L_0x00a0:
            androidx.compose.runtime.Recomposer r5 = r15.this$0
            java.lang.Object r6 = r5.f2775d
            monitor-enter(r6)
            java.util.ArrayList r7 = r5.f2779h     // Catch:{ all -> 0x0144 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0144 }
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x00da
            java.util.ArrayList r4 = r5.f2779h     // Catch:{ all -> 0x0144 }
            int r7 = r4.size()     // Catch:{ all -> 0x0144 }
            r8 = 0
        L_0x00b5:
            if (r8 >= r7) goto L_0x00d5
            java.lang.Object r9 = r4.get(r8)     // Catch:{ all -> 0x0144 }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ all -> 0x0144 }
            java.util.ArrayList r10 = r5.f2778g     // Catch:{ all -> 0x0144 }
            int r11 = r10.size()     // Catch:{ all -> 0x0144 }
            r12 = 0
        L_0x00c4:
            if (r12 >= r11) goto L_0x00d2
            java.lang.Object r13 = r10.get(r12)     // Catch:{ all -> 0x0144 }
            androidx.compose.runtime.n r13 = (androidx.compose.runtime.C1349n) r13     // Catch:{ all -> 0x0144 }
            r13.mo5809j(r9)     // Catch:{ all -> 0x0144 }
            int r12 = r12 + 1
            goto L_0x00c4
        L_0x00d2:
            int r8 = r8 + 1
            goto L_0x00b5
        L_0x00d5:
            java.util.ArrayList r4 = r5.f2779h     // Catch:{ all -> 0x0144 }
            r4.clear()     // Catch:{ all -> 0x0144 }
        L_0x00da:
            java.util.ArrayList r4 = r5.f2780i     // Catch:{ all -> 0x0144 }
            int r7 = r4.size()     // Catch:{ all -> 0x0144 }
            r8 = 0
        L_0x00e1:
            if (r8 >= r7) goto L_0x0100
            java.lang.Object r9 = r4.get(r8)     // Catch:{ all -> 0x0144 }
            androidx.compose.runtime.n r9 = (androidx.compose.runtime.C1349n) r9     // Catch:{ all -> 0x0144 }
            int r10 = r5.f2786o     // Catch:{ all -> 0x0144 }
            int r10 = r10 + 1
            r5.f2786o = r10     // Catch:{ all -> 0x0144 }
            kotlin.coroutines.CoroutineContext r10 = androidx.compose.runtime.C1337j.m2820b(r9)     // Catch:{ all -> 0x0144 }
            androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1 r11 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1     // Catch:{ all -> 0x0144 }
            r12 = 0
            r11.<init>(r5, r9, r12)     // Catch:{ all -> 0x0144 }
            r9 = 2
            kotlinx.coroutines.C19697g.m33468f(r3, r10, r12, r11, r9)     // Catch:{ all -> 0x0144 }
            int r8 = r8 + 1
            goto L_0x00e1
        L_0x0100:
            java.util.ArrayList r4 = r5.f2780i     // Catch:{ all -> 0x0144 }
            r4.clear()     // Catch:{ all -> 0x0144 }
            kotlinx.coroutines.k r4 = r5.mo5576z()     // Catch:{ all -> 0x0144 }
            if (r4 != 0) goto L_0x0138
            java.util.ArrayList r4 = r5.f2781j     // Catch:{ all -> 0x0144 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0144 }
            r7 = 1
            r4 = r4 ^ r7
            if (r4 != 0) goto L_0x0120
            androidx.compose.runtime.BroadcastFrameClock r4 = r5.f2772a     // Catch:{ all -> 0x0144 }
            boolean r4 = r4.mo5382c()     // Catch:{ all -> 0x0144 }
            if (r4 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r4 = 0
            goto L_0x0121
        L_0x0120:
            r4 = r7
        L_0x0121:
            if (r4 == 0) goto L_0x0128
            kotlin.coroutines.c r4 = r2.mo5906a()     // Catch:{ all -> 0x0144 }
            goto L_0x0129
        L_0x0128:
            r4 = 0
        L_0x0129:
            monitor-exit(r6)
            if (r4 == 0) goto L_0x0135
            kotlin.m r5 = kotlin.C19394m.f43287a
            java.lang.Object r5 = kotlin.Result.m35480constructorimpl(r5)
            r4.resumeWith(r5)
        L_0x0135:
            r4 = r7
            goto L_0x0087
        L_0x0138:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0144 }
            r15.<init>(r0)     // Catch:{ all -> 0x0144 }
            throw r15     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r15 = move-exception
            monitor-exit(r6)
            throw r15
        L_0x0147:
            kotlin.coroutines.CoroutineContext r2 = r3.getCoroutineContext()
            kotlinx.coroutines.g1 r2 = androidx.compose.p015ui.text.input.C1993m.m4345F(r2)
            r15.L$0 = r1
            r5 = 0
            r15.L$1 = r5
            r15.L$2 = r5
            r3 = 2
            r15.label = r3
            java.lang.Object r2 = androidx.compose.p015ui.text.input.C1993m.m4373s(r2, r15)
            if (r2 != r0) goto L_0x0160
            return r0
        L_0x0160:
            r15.L$0 = r5
            r2 = 3
            r15.label = r2
            java.lang.Object r15 = androidx.compose.p015ui.text.input.C1993m.m4373s(r1, r15)
            if (r15 != r0) goto L_0x016c
            return r0
        L_0x016c:
            kotlin.m r15 = kotlin.C19394m.f43287a
            return r15
        L_0x016f:
            java.lang.String r15 = "recomposeCoroutineContext may not contain a Job; found "
            java.lang.StringBuilder r15 = android.support.p013v4.media.C0072d.m201h(r15)
            kotlin.coroutines.CoroutineContext$a r0 = r7.get(r6)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r15 = r15.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
