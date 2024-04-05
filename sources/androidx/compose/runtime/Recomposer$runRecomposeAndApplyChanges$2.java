package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", mo70541f = "Recomposer.kt", mo70542l = {436, 454}, mo70543m = "invokeSuspend")
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements C19862q<C19525d0, C1321f0, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, C19340c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.this$0 = recomposer;
    }

    public static final void access$invokeSuspend$fillToInsert(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f2775d) {
            ArrayList arrayList = recomposer.f2782k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((C1332i0) arrayList.get(i));
            }
            recomposer.f2782k.clear();
            C19394m mVar = C19394m.f43287a;
        }
    }

    public final Object invoke(C19525d0 d0Var, C1321f0 f0Var, C19340c<? super C19394m> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, cVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = f0Var;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(C19394m.f43287a);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c6  */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0063
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.f0 r9 = (androidx.compose.runtime.C1321f0) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            r10 = r1
            r15 = r5
            r5 = r3
            r16 = r9
            r9 = r2
            r2 = r16
            r17 = r7
            r7 = r6
            r6 = r17
            goto L_0x011c
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r2 = r1.L$5
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r5 = r1.L$4
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r1.L$3
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r1.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r1.L$0
            androidx.compose.runtime.f0 r9 = (androidx.compose.runtime.C1321f0) r9
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            r11 = r1
            r10 = r2
            r15 = r5
            r14 = r6
            r13 = r7
            r12 = r8
            r2 = r9
            goto L_0x00a9
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r19)
            java.lang.Object r2 = r1.L$0
            androidx.compose.runtime.f0 r2 = (androidx.compose.runtime.C1321f0) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r10 = r1
        L_0x0084:
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            boolean r11 = androidx.compose.runtime.Recomposer.m2544t(r11)
            if (r11 == 0) goto L_0x0124
            androidx.compose.runtime.Recomposer r11 = r10.this$0
            r10.L$0 = r2
            r10.L$1 = r5
            r10.L$2 = r6
            r10.L$3 = r7
            r10.L$4 = r8
            r10.L$5 = r9
            r10.label = r4
            java.lang.Object r11 = androidx.compose.runtime.Recomposer.m2542r(r11, r10)
            if (r11 != r0) goto L_0x00a3
            return r0
        L_0x00a3:
            r12 = r5
            r13 = r6
            r14 = r7
            r15 = r8
            r11 = r10
            r10 = r9
        L_0x00a9:
            androidx.compose.runtime.Recomposer r5 = r11.this$0
            java.lang.Object r6 = r5.f2775d
            monitor-enter(r6)
            java.util.ArrayList r7 = r5.f2780i     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00e2 }
            r7 = r7 ^ r4
            r8 = 0
            if (r7 != 0) goto L_0x00c3
            androidx.compose.runtime.BroadcastFrameClock r7 = r5.f2772a     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7.mo5382c()     // Catch:{ all -> 0x00e2 }
            if (r7 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r7 = r8
            goto L_0x00c4
        L_0x00c3:
            r7 = r4
        L_0x00c4:
            if (r7 != 0) goto L_0x00e4
            androidx.compose.runtime.Recomposer.m2546v(r5)     // Catch:{ all -> 0x00e2 }
            java.util.ArrayList r7 = r5.f2780i     // Catch:{ all -> 0x00e2 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00e2 }
            r7 = r7 ^ r4
            if (r7 != 0) goto L_0x00dd
            androidx.compose.runtime.BroadcastFrameClock r5 = r5.f2772a     // Catch:{ all -> 0x00e2 }
            boolean r5 = r5.mo5382c()     // Catch:{ all -> 0x00e2 }
            if (r5 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r5 = r8
            goto L_0x00de
        L_0x00dd:
            r5 = r4
        L_0x00de:
            if (r5 != 0) goto L_0x00e4
            r8 = r4
            goto L_0x00e4
        L_0x00e2:
            r0 = move-exception
            goto L_0x0122
        L_0x00e4:
            monitor-exit(r6)
            if (r8 == 0) goto L_0x00ee
            r9 = r10
            r10 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            goto L_0x0084
        L_0x00ee:
            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2 r9 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2$2
            androidx.compose.runtime.Recomposer r6 = r11.this$0
            r5 = r9
            r7 = r12
            r8 = r13
            r4 = r9
            r9 = r15
            r19 = r10
            r10 = r14
            r3 = r11
            r11 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.L$0 = r2
            r3.L$1 = r12
            r3.L$2 = r13
            r3.L$3 = r14
            r3.L$4 = r15
            r9 = r19
            r3.L$5 = r9
            r5 = 2
            r3.label = r5
            java.lang.Object r4 = r2.mo5381Q(r4, r3)
            if (r4 != r0) goto L_0x0118
            return r0
        L_0x0118:
            r10 = r3
            r8 = r12
            r6 = r13
            r7 = r14
        L_0x011c:
            r3 = r5
            r5 = r8
            r8 = r15
            r4 = 1
            goto L_0x0084
        L_0x0122:
            monitor-exit(r6)
            throw r0
        L_0x0124:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
