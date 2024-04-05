package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.C1379a;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.C1387g;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.C1413a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19432h;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import p219r.C7731c;
import p259v.C8182b;
import p628nj.C18263b;

public final class Recomposer extends C1324g {

    /* renamed from: s */
    public static final StateFlowImpl f2771s = C19388s.m32862g(C8182b.f17959e);

    /* renamed from: a */
    public final BroadcastFrameClock f2772a;

    /* renamed from: b */
    public final C19707i1 f2773b;

    /* renamed from: c */
    public final CoroutineContext f2774c;

    /* renamed from: d */
    public final Object f2775d = new Object();

    /* renamed from: e */
    public C19699g1 f2776e;

    /* renamed from: f */
    public Throwable f2777f;

    /* renamed from: g */
    public final ArrayList f2778g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f2779h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f2780i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f2781j = new ArrayList();

    /* renamed from: k */
    public final ArrayList f2782k = new ArrayList();

    /* renamed from: l */
    public final LinkedHashMap f2783l = new LinkedHashMap();

    /* renamed from: m */
    public final LinkedHashMap f2784m = new LinkedHashMap();

    /* renamed from: n */
    public C19747k<? super C19394m> f2785n;

    /* renamed from: o */
    public int f2786o;

    /* renamed from: p */
    public boolean f2787p;

    /* renamed from: q */
    public final StateFlowImpl f2788q = C19388s.m32862g(State.Inactive);

    /* renamed from: r */
    public final C1284b f2789r = new C1284b();

    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* renamed from: androidx.compose.runtime.Recomposer$a */
    public static final class C1283a {
    }

    /* renamed from: androidx.compose.runtime.Recomposer$b */
    public final class C1284b {
    }

    static {
        new C1283a();
    }

    public Recomposer(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f2772a = broadcastFrameClock;
        C19707i1 i1Var = new C19707i1((C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b));
        i1Var.mo72401k(new Recomposer$effectJob$1$1(this));
        this.f2773b = i1Var;
        this.f2774c = coroutineContext.plus(broadcastFrameClock).plus(i1Var);
    }

    /* renamed from: C */
    public static final void m2541C(ArrayList arrayList, Recomposer recomposer, C1349n nVar) {
        arrayList.clear();
        synchronized (recomposer.f2775d) {
            Iterator it = recomposer.f2782k.iterator();
            while (it.hasNext()) {
                C1332i0 i0Var = (C1332i0) it.next();
                if (C19383o.m32792b(i0Var.f2917c, nVar)) {
                    arrayList.add(i0Var);
                    it.remove();
                }
            }
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: r */
    public static final Object m2542r(Recomposer recomposer, SuspendLambda suspendLambda) {
        if (recomposer.mo5571A()) {
            return C19394m.f43287a;
        }
        C19753l lVar = new C19753l(1, C19388s.m32873m0(suspendLambda));
        lVar.mo72548n();
        synchronized (recomposer.f2775d) {
            if (recomposer.mo5571A()) {
                lVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
            } else {
                recomposer.f2785n = lVar;
            }
            C19394m mVar = C19394m.f43287a;
        }
        Object l = lVar.mo72547l();
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2543s(androidx.compose.runtime.Recomposer r9) {
        /*
            java.lang.Object r0 = r9.f2775d
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r9.f2783l     // Catch:{ all -> 0x0070 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0070 }
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L_0x004a
            java.util.LinkedHashMap r1 = r9.f2783l     // Catch:{ all -> 0x0070 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0070 }
            java.util.ArrayList r1 = kotlin.collections.C19322o.m32625G0(r1)     // Catch:{ all -> 0x0070 }
            java.util.LinkedHashMap r3 = r9.f2783l     // Catch:{ all -> 0x0070 }
            r3.clear()     // Catch:{ all -> 0x0070 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0070 }
            int r4 = r1.size()     // Catch:{ all -> 0x0070 }
            r3.<init>(r4)     // Catch:{ all -> 0x0070 }
            int r4 = r1.size()     // Catch:{ all -> 0x0070 }
            r5 = r2
        L_0x002b:
            if (r5 >= r4) goto L_0x0044
            java.lang.Object r6 = r1.get(r5)     // Catch:{ all -> 0x0070 }
            androidx.compose.runtime.i0 r6 = (androidx.compose.runtime.C1332i0) r6     // Catch:{ all -> 0x0070 }
            java.util.LinkedHashMap r7 = r9.f2784m     // Catch:{ all -> 0x0070 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0070 }
            kotlin.Pair r8 = new kotlin.Pair     // Catch:{ all -> 0x0070 }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x0070 }
            r3.add(r8)     // Catch:{ all -> 0x0070 }
            int r5 = r5 + 1
            goto L_0x002b
        L_0x0044:
            java.util.LinkedHashMap r9 = r9.f2784m     // Catch:{ all -> 0x0070 }
            r9.clear()     // Catch:{ all -> 0x0070 }
            goto L_0x004c
        L_0x004a:
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ all -> 0x0070 }
        L_0x004c:
            monitor-exit(r0)
            int r9 = r3.size()
        L_0x0051:
            if (r2 >= r9) goto L_0x006f
            java.lang.Object r0 = r3.get(r2)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            androidx.compose.runtime.i0 r1 = (androidx.compose.runtime.C1332i0) r1
            java.lang.Object r0 = r0.component2()
            androidx.compose.runtime.h0 r0 = (androidx.compose.runtime.C1328h0) r0
            if (r0 == 0) goto L_0x006c
            androidx.compose.runtime.n r1 = r1.f2917c
            r1.mo5802c(r0)
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x006f:
            return
        L_0x0070:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.m2543s(androidx.compose.runtime.Recomposer):void");
    }

    /* renamed from: t */
    public static final boolean m2544t(Recomposer recomposer) {
        boolean z;
        boolean z2;
        synchronized (recomposer.f2775d) {
            z = !recomposer.f2787p;
        }
        if (z) {
            return true;
        }
        Iterator<Object> it = recomposer.f2773b.mo72397g().iterator();
        while (true) {
            C19432h hVar = (C19432h) it;
            if (hVar.hasNext()) {
                if (((C19699g1) hVar.next()).isActive()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        return z2;
    }

    /* renamed from: u */
    public static final C1349n m2545u(Recomposer recomposer, C1349n nVar, C7731c cVar) {
        C1379a y;
        C1385f i;
        recomposer.getClass();
        if (nVar.mo5811l() || nVar.isDisposed()) {
            return null;
        }
        Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(nVar);
        Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(nVar, cVar);
        C1385f i2 = SnapshotKt.m2910i();
        C1379a aVar = i2 instanceof C1379a ? (C1379a) i2 : null;
        if (aVar == null || (y = aVar.mo5936y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            i = y.mo6001i();
            boolean z = false;
            if (cVar != null) {
                if (cVar.f17147b > 0) {
                    z = true;
                }
            }
            if (z) {
                nVar.mo5814p(new Recomposer$performRecompose$1$1(cVar, nVar));
            }
            boolean d = nVar.mo5803d();
            C1385f.m2974o(i);
            m2548x(y);
            if (!d) {
                nVar = null;
            }
            return nVar;
        } catch (Throwable th) {
            m2548x(y);
            throw th;
        }
    }

    /* renamed from: v */
    public static final void m2546v(Recomposer recomposer) {
        if (!recomposer.f2779h.isEmpty()) {
            ArrayList arrayList = recomposer.f2779h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Set set = (Set) arrayList.get(i);
                ArrayList arrayList2 = recomposer.f2778g;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C1349n) arrayList2.get(i2)).mo5809j(set);
                }
            }
            recomposer.f2779h.clear();
            if (recomposer.mo5576z() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: w */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m2547w(androidx.compose.runtime.Recomposer r9, androidx.compose.runtime.C1321f0 r10, androidx.compose.runtime.C1355p0 r11, kotlin.coroutines.C19340c r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L_0x0016
            r0 = r12
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r9, r12)
        L_0x001b:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0063
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r9 = r0.L$4
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.L$2
            androidx.compose.runtime.p0 r11 = (androidx.compose.runtime.C1355p0) r11
            java.lang.Object r2 = r0.L$1
            androidx.compose.runtime.f0 r2 = (androidx.compose.runtime.C1321f0) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.runtime.Recomposer r5 = (androidx.compose.runtime.Recomposer) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x00e3
        L_0x0042:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004a:
            java.lang.Object r9 = r0.L$4
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$3
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.L$2
            androidx.compose.runtime.p0 r11 = (androidx.compose.runtime.C1355p0) r11
            java.lang.Object r2 = r0.L$1
            androidx.compose.runtime.f0 r2 = (androidx.compose.runtime.C1321f0) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.runtime.Recomposer r5 = (androidx.compose.runtime.Recomposer) r5
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x00cb
        L_0x0063:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0070:
            java.lang.Object r5 = r9.f2775d
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            r0.L$4 = r2
            r0.label = r4
            r11.getClass()
            monitor-enter(r5)
            java.lang.Object r6 = r11.f2953a     // Catch:{ all -> 0x00eb }
            java.lang.Object r7 = androidx.compose.runtime.C1420w0.f3087a     // Catch:{ all -> 0x00eb }
            if (r6 != r7) goto L_0x0090
            java.lang.Object r6 = androidx.compose.runtime.C1420w0.f3088b     // Catch:{ all -> 0x00eb }
            r11.f2953a = r6     // Catch:{ all -> 0x00eb }
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00eb }
            monitor-exit(r5)
            goto L_0x00c4
        L_0x0090:
            kotlin.m r6 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00eb }
            monitor-exit(r5)
            kotlinx.coroutines.l r6 = new kotlinx.coroutines.l
            kotlin.coroutines.c r8 = kotlin.jvm.internal.C19388s.m32873m0(r0)
            r6.<init>(r4, r8)
            r6.mo72548n()
            monitor-enter(r5)
            java.lang.Object r8 = r11.f2953a     // Catch:{ all -> 0x00e8 }
            if (r8 != r7) goto L_0x00aa
            java.lang.Object r7 = androidx.compose.runtime.C1420w0.f3088b     // Catch:{ all -> 0x00e8 }
            r11.f2953a = r7     // Catch:{ all -> 0x00e8 }
            r7 = r6
            goto L_0x00ad
        L_0x00aa:
            r11.f2953a = r6     // Catch:{ all -> 0x00e8 }
            r7 = 0
        L_0x00ad:
            monitor-exit(r5)
            if (r7 == 0) goto L_0x00b9
            kotlin.m r5 = kotlin.C19394m.f43287a
            java.lang.Object r5 = kotlin.Result.m35480constructorimpl(r5)
            r7.resumeWith(r5)
        L_0x00b9:
            java.lang.Object r6 = r6.mo72547l()
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r6 != r5) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            kotlin.m r6 = kotlin.C19394m.f43287a
        L_0x00c4:
            if (r6 != r1) goto L_0x00c7
            goto L_0x00e2
        L_0x00c7:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r12
        L_0x00cb:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r12 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r12.<init>(r5, r10, r9, r11)
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r11
            r0.L$3 = r10
            r0.L$4 = r9
            r0.label = r3
            java.lang.Object r12 = r2.mo5381Q(r12, r0)
            if (r12 != r1) goto L_0x00e3
        L_0x00e2:
            return r1
        L_0x00e3:
            r12 = r10
            r10 = r2
            r2 = r9
            r9 = r5
            goto L_0x0070
        L_0x00e8:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L_0x00eb:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.m2547w(androidx.compose.runtime.Recomposer, androidx.compose.runtime.f0, androidx.compose.runtime.p0, kotlin.coroutines.c):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* renamed from: x */
    public static void m2548x(C1379a aVar) {
        try {
            if (aVar.mo5935t() instanceof C1387g.C1388a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            aVar.mo5930c();
        }
    }

    /* renamed from: A */
    public final boolean mo5571A() {
        boolean z;
        synchronized (this.f2775d) {
            z = true;
            if (!(!this.f2779h.isEmpty()) && !(!this.f2780i.isEmpty()) && !this.f2772a.mo5382c()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: B */
    public final Object mo5572B(C19340c<? super C19394m> cVar) {
        Object b = FlowKt__ReduceKt.m33372b(this.f2788q, new Recomposer$join$2((C19340c<? super Recomposer$join$2>) null), cVar);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: D */
    public final List<C1349n> mo5573D(List<C1332i0> list, C7731c<Object> cVar) {
        C1379a y;
        ArrayList arrayList;
        Object obj;
        Recomposer recomposer = this;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1332i0 i0Var = list.get(i);
            C1349n nVar = i0Var.f2917c;
            Object obj2 = hashMap.get(nVar);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(nVar, obj2);
            }
            ((ArrayList) obj2).add(i0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C1349n nVar2 = (C1349n) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.m2529f(!nVar2.mo5811l());
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(nVar2);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(nVar2, cVar);
            C1385f i2 = SnapshotKt.m2910i();
            C1379a aVar = i2 instanceof C1379a ? (C1379a) i2 : null;
            if (aVar == null || (y = aVar.mo5936y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                C1385f i3 = y.mo6001i();
                try {
                    synchronized (recomposer.f2775d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            C1332i0 i0Var2 = (C1332i0) list2.get(i4);
                            LinkedHashMap linkedHashMap = recomposer.f2783l;
                            C1325g0<Object> g0Var = i0Var2.f2915a;
                            Object obj3 = C1420w0.f3087a;
                            C19383o.m32797g(linkedHashMap, "<this>");
                            List list3 = (List) linkedHashMap.get(g0Var);
                            if (list3 == null) {
                                obj = null;
                            } else if (!list3.isEmpty()) {
                                Object remove = list3.remove(0);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(g0Var);
                                }
                                obj = remove;
                            } else {
                                throw new NoSuchElementException("List is empty.");
                            }
                            arrayList.add(new Pair(i0Var2, obj));
                            i4++;
                            recomposer = this;
                        }
                    }
                    nVar2.mo5805g(arrayList);
                    C19394m mVar = C19394m.f43287a;
                    C1385f.m2974o(i3);
                    m2548x(y);
                    recomposer = this;
                } catch (Throwable th) {
                    C1385f.m2974o(i3);
                    throw th;
                }
            } catch (Throwable th2) {
                m2548x(y);
                throw th2;
            }
        }
        return C19327t.m32660p1(hashMap.keySet());
    }

    /* renamed from: E */
    public final Object mo5574E(C19340c<? super C19394m> cVar) {
        Object i = C19697g.m33471i(cVar, this.f2772a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, (C19340c<? super Recomposer$runRecomposeAndApplyChanges$2>) null), C18263b.m30823R(cVar.getContext()), (C19340c<? super Recomposer$recompositionRunner$2>) null));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i != coroutineSingletons) {
            i = C19394m.f43287a;
        }
        return i == coroutineSingletons ? i : C19394m.f43287a;
    }

    /* renamed from: a */
    public final void mo5477a(C1349n nVar, ComposableLambdaImpl composableLambdaImpl) {
        C1379a y;
        C1385f i;
        C19383o.m32797g(nVar, "composition");
        boolean l = nVar.mo5811l();
        Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(nVar);
        Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(nVar, (C7731c<Object>) null);
        C1385f i2 = SnapshotKt.m2910i();
        C1379a aVar = i2 instanceof C1379a ? (C1379a) i2 : null;
        if (aVar == null || (y = aVar.mo5936y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            i = y.mo6001i();
            nVar.mo5806h(composableLambdaImpl);
            C19394m mVar = C19394m.f43287a;
            C1385f.m2974o(i);
            m2548x(y);
            if (!l) {
                SnapshotKt.m2910i().mo5933l();
            }
            synchronized (this.f2775d) {
                if (((State) this.f2788q.getValue()).compareTo(State.ShuttingDown) > 0 && !this.f2778g.contains(nVar)) {
                    this.f2778g.add(nVar);
                }
            }
            synchronized (this.f2775d) {
                ArrayList arrayList = this.f2782k;
                int size = arrayList.size();
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (C19383o.m32792b(((C1332i0) arrayList.get(i3)).f2917c, nVar)) {
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    C19394m mVar2 = C19394m.f43287a;
                    ArrayList arrayList2 = new ArrayList();
                    m2541C(arrayList2, this, nVar);
                    while (!arrayList2.isEmpty()) {
                        mo5573D(arrayList2, (C7731c<Object>) null);
                        m2541C(arrayList2, this, nVar);
                    }
                }
            }
            nVar.mo5810k();
            nVar.mo5801b();
            if (!l) {
                SnapshotKt.m2910i().mo5933l();
            }
        } catch (Throwable th) {
            m2548x(y);
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo5478b(C1332i0 i0Var) {
        synchronized (this.f2775d) {
            LinkedHashMap linkedHashMap = this.f2783l;
            C1325g0<Object> g0Var = i0Var.f2915a;
            Object obj = C1420w0.f3087a;
            C19383o.m32797g(linkedHashMap, "<this>");
            Object obj2 = linkedHashMap.get(g0Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(g0Var, obj2);
            }
            ((List) obj2).add(i0Var);
        }
    }

    /* renamed from: d */
    public final boolean mo5480d() {
        return false;
    }

    /* renamed from: f */
    public final int mo5482f() {
        return 1000;
    }

    /* renamed from: g */
    public final CoroutineContext mo5483g() {
        return this.f2774c;
    }

    /* renamed from: h */
    public final CoroutineContext mo5484h() {
        return EmptyCoroutineContext.INSTANCE;
    }

    /* renamed from: i */
    public final void mo5485i(C1332i0 i0Var) {
        C19747k<C19394m> z;
        synchronized (this.f2775d) {
            this.f2782k.add(i0Var);
            z = mo5576z();
        }
        if (z != null) {
            z.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }

    /* renamed from: j */
    public final void mo5486j(C1349n nVar) {
        C19747k<C19394m> kVar;
        C19383o.m32797g(nVar, "composition");
        synchronized (this.f2775d) {
            if (!this.f2780i.contains(nVar)) {
                this.f2780i.add(nVar);
                kVar = mo5576z();
            } else {
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.resumeWith(Result.m35480constructorimpl(C19394m.f43287a));
        }
    }

    /* renamed from: k */
    public final void mo5487k(C1332i0 i0Var, C1328h0 h0Var) {
        C19383o.m32797g(i0Var, "reference");
        synchronized (this.f2775d) {
            this.f2784m.put(i0Var, h0Var);
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: l */
    public final C1328h0 mo5488l(C1332i0 i0Var) {
        C1328h0 h0Var;
        C19383o.m32797g(i0Var, "reference");
        synchronized (this.f2775d) {
            h0Var = (C1328h0) this.f2784m.remove(i0Var);
        }
        return h0Var;
    }

    /* renamed from: m */
    public final void mo5489m(Set<C1413a> set) {
    }

    /* renamed from: q */
    public final void mo5493q(C1349n nVar) {
        C19383o.m32797g(nVar, "composition");
        synchronized (this.f2775d) {
            this.f2778g.remove(nVar);
            this.f2780i.remove(nVar);
            this.f2781j.remove(nVar);
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: y */
    public final void mo5575y() {
        synchronized (this.f2775d) {
            if (((State) this.f2788q.getValue()).compareTo(State.Idle) >= 0) {
                this.f2788q.setValue(State.ShuttingDown);
            }
            C19394m mVar = C19394m.f43287a;
        }
        this.f2773b.mo72134a((CancellationException) null);
    }

    /* renamed from: z */
    public final C19747k<C19394m> mo5576z() {
        State state;
        if (((State) this.f2788q.getValue()).compareTo(State.ShuttingDown) <= 0) {
            this.f2778g.clear();
            this.f2779h.clear();
            this.f2780i.clear();
            this.f2781j.clear();
            this.f2782k.clear();
            C19747k<? super C19394m> kVar = this.f2785n;
            if (kVar != null) {
                kVar.mo72495D((Throwable) null);
            }
            this.f2785n = null;
            return null;
        }
        if (this.f2776e == null) {
            this.f2779h.clear();
            this.f2780i.clear();
            state = this.f2772a.mo5382c() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = ((this.f2780i.isEmpty() ^ true) || (this.f2779h.isEmpty() ^ true) || (this.f2781j.isEmpty() ^ true) || (this.f2782k.isEmpty() ^ true) || this.f2786o > 0 || this.f2772a.mo5382c()) ? State.PendingWork : State.Idle;
        }
        this.f2788q.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        C19747k<? super C19394m> kVar2 = this.f2785n;
        this.f2785n = null;
        return kVar2;
    }
}
