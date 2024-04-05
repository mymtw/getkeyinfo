package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C1339j1;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SnapshotKt {

    /* renamed from: a */
    public static final C19857l<SnapshotIdSet, C19394m> f2987a = SnapshotKt$emptyLambda$1.INSTANCE;

    /* renamed from: b */
    public static final C1339j1 f2988b = new C1339j1();

    /* renamed from: c */
    public static final Object f2989c = new Object();

    /* renamed from: d */
    public static SnapshotIdSet f2990d;

    /* renamed from: e */
    public static int f2991e;

    /* renamed from: f */
    public static final C1390h f2992f = new C1390h();

    /* renamed from: g */
    public static final ArrayList f2993g = new ArrayList();

    /* renamed from: h */
    public static final ArrayList f2994h = new ArrayList();

    /* renamed from: i */
    public static final AtomicReference<GlobalSnapshot> f2995i;

    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f2982f;
        f2990d = snapshotIdSet;
        f2991e = 1;
        int i = f2991e;
        f2991e = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, snapshotIdSet);
        f2990d = f2990d.mo5949l(globalSnapshot.f3027b);
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f2995i = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        C19383o.m32796f(globalSnapshot2, "currentGlobalSnapshot.get()");
        C1385f fVar = globalSnapshot2;
    }

    /* renamed from: a */
    public static final void m2902a() {
        m2907f(SnapshotKt$advanceGlobalSnapshot$2.INSTANCE);
    }

    /* renamed from: b */
    public static final C19857l m2903b(C19857l lVar, C19857l lVar2) {
        return (lVar == null || lVar2 == null || C19383o.m32792b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
    }

    /* renamed from: c */
    public static final HashMap m2904c(C1379a aVar, C1379a aVar2, SnapshotIdSet snapshotIdSet) {
        C1407x p;
        Set<C1406w> u = aVar2.mo5991u();
        int d = aVar.mo5996d();
        if (u == null) {
            return null;
        }
        SnapshotIdSet g = aVar2.mo5997e().mo5949l(aVar2.mo5996d()).mo5947g(aVar2.f3013h);
        HashMap hashMap = null;
        for (C1406w next : u) {
            C1407x firstStateRecord = next.getFirstStateRecord();
            C1407x p2 = m2917p(firstStateRecord, d, snapshotIdSet);
            if (!(p2 == null || (p = m2917p(firstStateRecord, d, g)) == null || C19383o.m32792b(p2, p))) {
                C1407x p3 = m2917p(firstStateRecord, aVar2.mo5996d(), aVar2.mo5997e());
                if (p3 != null) {
                    C1407x mergeRecords = next.mergeRecords(p, p2, p3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(p2, mergeRecords);
                } else {
                    m2916o();
                    throw null;
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static final void m2905d(C1385f fVar) {
        if (!f2990d.mo5946e(fVar.mo5996d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* renamed from: e */
    public static final SnapshotIdSet m2906e(int i, int i2, SnapshotIdSet snapshotIdSet) {
        C19383o.m32797g(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.mo5949l(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* renamed from: f */
    public static final <T> T m2907f(C19857l<? super SnapshotIdSet, ? extends T> lVar) {
        T t;
        ArrayList q1;
        GlobalSnapshot globalSnapshot = f2995i.get();
        Object obj = f2989c;
        synchronized (obj) {
            C19383o.m32796f(globalSnapshot, "previousGlobalSnapshot");
            t = m2921t(globalSnapshot, lVar);
        }
        Set<C1406w> set = globalSnapshot.f3012g;
        if (set != null) {
            synchronized (obj) {
                q1 = C19327t.m32661q1(f2993g);
            }
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                ((C19861p) q1.get(i)).invoke(set, globalSnapshot);
            }
        }
        return t;
    }

    /* renamed from: g */
    public static final C1385f m2908g(C1385f fVar, C19857l<Object, C19394m> lVar, boolean z) {
        boolean z2 = fVar instanceof C1379a;
        if (!z2 && fVar != null) {
            return new C1380a0(fVar, lVar, z);
        }
        return new C1410z(z2 ? (C1379a) fVar : null, lVar, (C19857l<Object, C19394m>) null, false, z);
    }

    /* renamed from: h */
    public static final <T extends C1407x> T m2909h(T t, C1385f fVar) {
        C19383o.m32797g(t, "r");
        T p = m2917p(t, fVar.mo5996d(), fVar.mo5997e());
        if (p != null) {
            return p;
        }
        m2916o();
        throw null;
    }

    /* renamed from: i */
    public static final C1385f m2910i() {
        C1385f fVar = (C1385f) f2988b.mo5886c();
        if (fVar != null) {
            return fVar;
        }
        GlobalSnapshot globalSnapshot = f2995i.get();
        C19383o.m32796f(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    /* renamed from: j */
    public static final C19857l<Object, C19394m> m2911j(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || C19383o.m32792b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r5 == false) goto L_0x0054;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends androidx.compose.runtime.snapshots.C1407x> T m2912k(T r12, androidx.compose.runtime.snapshots.C1406w r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "state"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            androidx.compose.runtime.snapshots.x r0 = r13.getFirstStateRecord()
            androidx.compose.runtime.snapshots.h r1 = f2992f
            int r2 = f2991e
            int r3 = r1.f3031a
            r4 = 0
            if (r3 <= 0) goto L_0x001b
            int[] r1 = r1.f3032b
            r2 = r1[r4]
        L_0x001b:
            int r2 = r2 + -1
            r1 = 0
            r3 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0067
            int r5 = r0.f3056a
            if (r5 != 0) goto L_0x0026
            goto L_0x0060
        L_0x0026:
            r6 = 1
            if (r5 == 0) goto L_0x0053
            if (r5 > r2) goto L_0x0053
            int r5 = r5 + 0
            r7 = 1
            r9 = 64
            r10 = 0
            if (r5 < 0) goto L_0x0041
            if (r5 >= r9) goto L_0x0041
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
        L_0x003d:
            r5 = r6
            goto L_0x0050
        L_0x003f:
            r5 = r4
            goto L_0x0050
        L_0x0041:
            if (r5 < r9) goto L_0x003f
            r9 = 128(0x80, float:1.794E-43)
            if (r5 >= r9) goto L_0x003f
            int r5 = r5 + -64
            long r7 = r7 << r5
            long r7 = r7 & r10
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x003d
        L_0x0050:
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r6 = r4
        L_0x0054:
            if (r6 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x005a
            r3 = r0
            goto L_0x0064
        L_0x005a:
            int r1 = r0.f3056a
            int r2 = r3.f3056a
            if (r1 >= r2) goto L_0x0062
        L_0x0060:
            r1 = r0
            goto L_0x0067
        L_0x0062:
            r1 = r3
            goto L_0x0067
        L_0x0064:
            androidx.compose.runtime.snapshots.x r0 = r0.f3057b
            goto L_0x001f
        L_0x0067:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x006f
            r1.f3056a = r0
            goto L_0x007e
        L_0x006f:
            androidx.compose.runtime.snapshots.x r1 = r12.mo5543b()
            r1.f3056a = r0
            androidx.compose.runtime.snapshots.x r12 = r13.getFirstStateRecord()
            r1.f3057b = r12
            r13.prependStateRecord(r1)
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotKt.m2912k(androidx.compose.runtime.snapshots.x, androidx.compose.runtime.snapshots.w):androidx.compose.runtime.snapshots.x");
    }

    /* renamed from: l */
    public static final <T extends C1407x> T m2913l(T t, C1406w wVar, C1385f fVar) {
        C19383o.m32797g(t, "<this>");
        C19383o.m32797g(wVar, "state");
        T k = m2912k(t, wVar);
        k.mo5542a(t);
        k.f3056a = fVar.mo5996d();
        return k;
    }

    /* renamed from: m */
    public static final void m2914m(C1385f fVar, C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        C19857l<Object, C19394m> h = fVar.mo5941h();
        if (h != null) {
            h.invoke(wVar);
        }
    }

    /* renamed from: n */
    public static final C1407x m2915n(SnapshotMutableStateImpl.C1288a aVar, C1406w wVar, C1385f fVar, SnapshotMutableStateImpl.C1288a aVar2) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(wVar, "state");
        if (fVar.mo5940g()) {
            fVar.mo5942m(wVar);
        }
        int d = fVar.mo5996d();
        if (aVar2.f3056a == d) {
            return aVar2;
        }
        C1407x k = m2912k(aVar, wVar);
        k.f3056a = d;
        fVar.mo5942m(wVar);
        return k;
    }

    /* renamed from: o */
    public static final void m2916o() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: p */
    public static final <T extends C1407x> T m2917p(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            int i2 = t.f3056a;
            if ((i2 != 0 && i2 <= i && !snapshotIdSet.mo5946e(i2)) && (t2 == null || t2.f3056a < t.f3056a)) {
                t2 = t;
            }
            t = t.f3057b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    /* renamed from: q */
    public static final <T extends C1407x> T m2918q(T t, C1406w wVar) {
        C19383o.m32797g(t, "<this>");
        C19383o.m32797g(wVar, "state");
        return m2919r(t, wVar, m2910i());
    }

    /* renamed from: r */
    public static final <T extends C1407x> T m2919r(T t, C1406w wVar, C1385f fVar) {
        C19383o.m32797g(t, "<this>");
        C19383o.m32797g(wVar, "state");
        C19857l<Object, C19394m> f = fVar.mo5939f();
        if (f != null) {
            f.invoke(wVar);
        }
        T p = m2917p(t, fVar.mo5996d(), fVar.mo5997e());
        if (p != null) {
            return p;
        }
        m2916o();
        throw null;
    }

    /* renamed from: s */
    public static final void m2920s(int i) {
        int i2;
        C1390h hVar = f2992f;
        int i3 = hVar.f3034d[i];
        hVar.mo6005b(i3, hVar.f3031a - 1);
        hVar.f3031a--;
        int[] iArr = hVar.f3032b;
        int i4 = iArr[i3];
        int i5 = i3;
        while (i5 > 0) {
            int i6 = ((i5 + 1) >> 1) - 1;
            if (iArr[i6] <= i4) {
                break;
            }
            hVar.mo6005b(i6, i5);
            i5 = i6;
        }
        int[] iArr2 = hVar.f3032b;
        int i7 = hVar.f3031a >> 1;
        while (i3 < i7) {
            int i8 = (i3 + 1) << 1;
            int i9 = i8 - 1;
            if (i8 < hVar.f3031a && (i2 = iArr2[i8]) < iArr2[i9]) {
                if (i2 >= iArr2[i3]) {
                    break;
                }
                hVar.mo6005b(i8, i3);
                i3 = i8;
            } else if (iArr2[i9] >= iArr2[i3]) {
                break;
            } else {
                hVar.mo6005b(i9, i3);
                i3 = i9;
            }
        }
        hVar.f3034d[i] = hVar.f3035e;
        hVar.f3035e = i;
    }

    /* renamed from: t */
    public static final Object m2921t(GlobalSnapshot globalSnapshot, C19857l lVar) {
        Object invoke = lVar.invoke(f2990d.mo5945c(globalSnapshot.f3027b));
        synchronized (f2989c) {
            int i = f2991e;
            f2991e = i + 1;
            SnapshotIdSet c = f2990d.mo5945c(globalSnapshot.f3027b);
            f2990d = c;
            f2995i.set(new GlobalSnapshot(i, c));
            globalSnapshot.mo5930c();
            f2990d = f2990d.mo5949l(i);
            C19394m mVar = C19394m.f43287a;
        }
        return invoke;
    }

    /* renamed from: u */
    public static final <T extends C1407x> T m2922u(T t, C1406w wVar, C1385f fVar) {
        C19383o.m32797g(t, "<this>");
        C19383o.m32797g(wVar, "state");
        if (fVar.mo5940g()) {
            fVar.mo5942m(wVar);
        }
        T p = m2917p(t, fVar.mo5996d(), fVar.mo5997e());
        if (p == null) {
            m2916o();
            throw null;
        } else if (p.f3056a == fVar.mo5996d()) {
            return p;
        } else {
            T l = m2913l(p, wVar, fVar);
            fVar.mo5942m(wVar);
            return l;
        }
    }
}
