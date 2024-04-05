package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.snapshots.C1387g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.snapshots.a */
public class C1379a extends C1385f {

    /* renamed from: e */
    public final C19857l<Object, C19394m> f3010e;

    /* renamed from: f */
    public final C19857l<Object, C19394m> f3011f;

    /* renamed from: g */
    public Set<C1406w> f3012g;

    /* renamed from: h */
    public SnapshotIdSet f3013h = SnapshotIdSet.f2982f;

    /* renamed from: i */
    public int[] f3014i = new int[0];

    /* renamed from: j */
    public int f3015j = 1;

    /* renamed from: k */
    public boolean f3016k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1379a(int i, SnapshotIdSet snapshotIdSet, C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        super(i, snapshotIdSet);
        C19383o.m32797g(snapshotIdSet, "invalid");
        this.f3010e = lVar;
        this.f3011f = lVar2;
    }

    /* renamed from: b */
    public final void mo5988b() {
        SnapshotKt.f2990d = SnapshotKt.f2990d.mo5945c(mo5996d()).mo5944a(this.f3013h);
    }

    /* renamed from: c */
    public void mo5930c() {
        if (!this.f3028c) {
            super.mo5930c();
            mo5932k(this);
        }
    }

    /* renamed from: f */
    public final C19857l<Object, C19394m> mo5939f() {
        return this.f3010e;
    }

    /* renamed from: g */
    public boolean mo5940g() {
        return false;
    }

    /* renamed from: h */
    public final C19857l<Object, C19394m> mo5941h() {
        return this.f3011f;
    }

    /* renamed from: j */
    public void mo5931j(C1385f fVar) {
        C19383o.m32797g(fVar, "snapshot");
        this.f3015j++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (kotlin.collections.C19327t.m32634P0(java.lang.Integer.valueOf(r3), r5.f3013h) != false) goto L_0x0053;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5932k(androidx.compose.runtime.snapshots.C1385f r6) {
        /*
            r5 = this;
            java.lang.String r0 = "snapshot"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            int r6 = r5.f3015j
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L_0x000d
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 == 0) goto L_0x0068
            int r6 = r6 + -1
            r5.f3015j = r6
            if (r6 != 0) goto L_0x0067
            boolean r6 = r5.f3016k
            if (r6 != 0) goto L_0x0067
            java.util.Set r6 = r5.mo5991u()
            if (r6 == 0) goto L_0x0064
            boolean r2 = r5.f3016k
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r5.mo5994x(r0)
            int r0 = r5.mo5996d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0031:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r6.next()
            androidx.compose.runtime.snapshots.w r2 = (androidx.compose.runtime.snapshots.C1406w) r2
            androidx.compose.runtime.snapshots.x r2 = r2.getFirstStateRecord()
        L_0x0041:
            if (r2 == 0) goto L_0x0031
            int r3 = r2.f3056a
            if (r3 == r0) goto L_0x0053
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r5.f3013h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = kotlin.collections.C19327t.m32634P0(r3, r4)
            if (r3 == 0) goto L_0x0055
        L_0x0053:
            r2.f3056a = r1
        L_0x0055:
            androidx.compose.runtime.snapshots.x r2 = r2.f3057b
            goto L_0x0041
        L_0x0058:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unsupported operation on a snapshot that has been applied"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0064:
            r5.mo6000a()
        L_0x0067:
            return
        L_0x0068:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1379a.mo5932k(androidx.compose.runtime.snapshots.f):void");
    }

    /* renamed from: l */
    public void mo5933l() {
        if (!this.f3016k && !this.f3028c) {
            mo5990s();
        }
    }

    /* renamed from: m */
    public void mo5942m(C1406w wVar) {
        C19383o.m32797g(wVar, "state");
        Set<C1406w> u = mo5991u();
        HashSet hashSet = u;
        if (u == null) {
            HashSet hashSet2 = new HashSet();
            mo5994x(hashSet2);
            hashSet = hashSet2;
        }
        hashSet.add(wVar);
    }

    /* renamed from: n */
    public final void mo5989n() {
        for (int s : this.f3014i) {
            SnapshotKt.m2920s(s);
        }
        int i = this.f3029d;
        if (i >= 0) {
            SnapshotKt.m2920s(i);
            this.f3029d = -1;
        }
    }

    /* renamed from: r */
    public C1385f mo5934r(C19857l<Object, C19394m> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (!this.f3028c) {
            mo5995z();
            int d = mo5996d();
            mo5993w(mo5996d());
            Object obj = SnapshotKt.f2989c;
            synchronized (obj) {
                int i = SnapshotKt.f2991e;
                SnapshotKt.f2991e = i + 1;
                SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(i);
                nestedReadonlySnapshot = new NestedReadonlySnapshot(i, SnapshotKt.m2906e(d + 1, i, mo5997e()), lVar, this);
            }
            if (!this.f3016k && !this.f3028c) {
                int d2 = mo5996d();
                synchronized (obj) {
                    int i2 = SnapshotKt.f2991e;
                    SnapshotKt.f2991e = i2 + 1;
                    mo6002p(i2);
                    SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(mo5996d());
                    C19394m mVar = C19394m.f43287a;
                }
                mo6003q(SnapshotKt.m2906e(d2 + 1, mo5996d(), mo5997e()));
            }
            return nestedReadonlySnapshot;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    /* renamed from: s */
    public final void mo5990s() {
        mo5993w(mo5996d());
        C19394m mVar = C19394m.f43287a;
        if (!this.f3016k && !this.f3028c) {
            int d = mo5996d();
            synchronized (SnapshotKt.f2989c) {
                int i = SnapshotKt.f2991e;
                SnapshotKt.f2991e = i + 1;
                mo6002p(i);
                SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(mo5996d());
            }
            mo6003q(SnapshotKt.m2906e(d + 1, mo5996d(), mo5997e()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a7, code lost:
        r1 = (java.util.List) r5.component1();
        r2 = (java.util.Set) r5.component2();
        r9.f3016k = true;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r2 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if ((!r2.isEmpty()) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        r5 = r1.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        if (r6 >= r5) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        ((p753kq.C19861p) r1.get(r6)).invoke(r2, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        if (r0 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00db, code lost:
        r2 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        if (r3 >= r2) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e1, code lost:
        ((p753kq.C19861p) r1.get(r3)).invoke(r0, r9);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ed, code lost:
        r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        mo5989n();
        r1 = kotlin.C19394m.f43287a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f5, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f8, code lost:
        return androidx.compose.runtime.snapshots.C1387g.C1389b.f3030a;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.C1387g mo5935t() {
        /*
            r9 = this;
            java.util.Set r0 = r9.mo5991u()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r2 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i
            java.lang.Object r3 = r2.get()
            java.lang.String r4 = "currentGlobalSnapshot.get()"
            kotlin.jvm.internal.C19383o.m32796f(r3, r4)
            androidx.compose.runtime.snapshots.a r3 = (androidx.compose.runtime.snapshots.C1379a) r3
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = androidx.compose.runtime.snapshots.SnapshotKt.f2990d
            java.lang.Object r2 = r2.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2
            int r2 = r2.f3027b
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r4.mo5945c(r2)
            java.util.HashMap r2 = androidx.compose.runtime.snapshots.SnapshotKt.m2904c(r3, r9, r2)
            goto L_0x0028
        L_0x0027:
            r2 = r1
        L_0x0028:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m2905d(r9)     // Catch:{ all -> 0x00fc }
            r4 = 1
            if (r0 == 0) goto L_0x0073
            int r5 = r0.size()     // Catch:{ all -> 0x00fc }
            if (r5 != 0) goto L_0x0038
            goto L_0x0073
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r5 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i     // Catch:{ all -> 0x00fc }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x00fc }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.f2991e     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.f2990d     // Catch:{ all -> 0x00fc }
            int r8 = r5.f3027b     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.mo5945c(r8)     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.g r2 = r9.mo5992v(r6, r2, r7)     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.g$b r6 = androidx.compose.runtime.snapshots.C1387g.C1389b.f3030a     // Catch:{ all -> 0x00fc }
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r2, r6)     // Catch:{ all -> 0x00fc }
            if (r6 != 0) goto L_0x0058
            monitor-exit(r3)
            return r2
        L_0x0058:
            r9.mo5988b()     // Catch:{ all -> 0x00fc }
            kq.l<androidx.compose.runtime.snapshots.SnapshotIdSet, kotlin.m> r2 = androidx.compose.runtime.snapshots.SnapshotKt.f2987a     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.SnapshotKt.m2921t(r5, r2)     // Catch:{ all -> 0x00fc }
            java.util.Set<androidx.compose.runtime.snapshots.w> r2 = r5.f3012g     // Catch:{ all -> 0x00fc }
            r9.mo5994x(r1)     // Catch:{ all -> 0x00fc }
            r5.f3012g = r1     // Catch:{ all -> 0x00fc }
            java.util.ArrayList r1 = androidx.compose.runtime.snapshots.SnapshotKt.f2993g     // Catch:{ all -> 0x00fc }
            java.util.ArrayList r1 = kotlin.collections.C19327t.m32661q1(r1)     // Catch:{ all -> 0x00fc }
            kotlin.Pair r5 = new kotlin.Pair     // Catch:{ all -> 0x00fc }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x00fc }
            goto L_0x00a6
        L_0x0073:
            r9.mo5988b()     // Catch:{ all -> 0x00fc }
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r2 = androidx.compose.runtime.snapshots.SnapshotKt.f2995i     // Catch:{ all -> 0x00fc }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = "previousGlobalSnapshot"
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)     // Catch:{ all -> 0x00fc }
            kq.l<androidx.compose.runtime.snapshots.SnapshotIdSet, kotlin.m> r5 = androidx.compose.runtime.snapshots.SnapshotKt.f2987a     // Catch:{ all -> 0x00fc }
            androidx.compose.runtime.snapshots.SnapshotKt.m2921t(r2, r5)     // Catch:{ all -> 0x00fc }
            java.util.Set<androidx.compose.runtime.snapshots.w> r2 = r2.f3012g     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x009f
            boolean r5 = r2.isEmpty()     // Catch:{ all -> 0x00fc }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x009f
            java.util.ArrayList r1 = androidx.compose.runtime.snapshots.SnapshotKt.f2993g     // Catch:{ all -> 0x00fc }
            java.util.ArrayList r1 = kotlin.collections.C19327t.m32661q1(r1)     // Catch:{ all -> 0x00fc }
            kotlin.Pair r5 = new kotlin.Pair     // Catch:{ all -> 0x00fc }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x00fc }
            goto L_0x00a6
        L_0x009f:
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE     // Catch:{ all -> 0x00fc }
            kotlin.Pair r5 = new kotlin.Pair     // Catch:{ all -> 0x00fc }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x00fc }
        L_0x00a6:
            monitor-exit(r3)
            java.lang.Object r1 = r5.component1()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r5.component2()
            java.util.Set r2 = (java.util.Set) r2
            r9.f3016k = r4
            r3 = 0
            if (r2 == 0) goto L_0x00d2
            boolean r5 = r2.isEmpty()
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00d2
            int r5 = r1.size()
            r6 = r3
        L_0x00c4:
            if (r6 >= r5) goto L_0x00d2
            java.lang.Object r7 = r1.get(r6)
            kq.p r7 = (p753kq.C19861p) r7
            r7.invoke(r2, r9)
            int r6 = r6 + 1
            goto L_0x00c4
        L_0x00d2:
            if (r0 == 0) goto L_0x00ed
            boolean r2 = r0.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x00ed
            int r2 = r1.size()
        L_0x00df:
            if (r3 >= r2) goto L_0x00ed
            java.lang.Object r4 = r1.get(r3)
            kq.p r4 = (p753kq.C19861p) r4
            r4.invoke(r0, r9)
            int r3 = r3 + 1
            goto L_0x00df
        L_0x00ed:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
            monitor-enter(r0)
            r9.mo5989n()     // Catch:{ all -> 0x00f9 }
            kotlin.m r1 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00f9 }
            monitor-exit(r0)
            androidx.compose.runtime.snapshots.g$b r0 = androidx.compose.runtime.snapshots.C1387g.C1389b.f3030a
            return r0
        L_0x00f9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00fc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1379a.mo5935t():androidx.compose.runtime.snapshots.g");
    }

    /* renamed from: u */
    public Set<C1406w> mo5991u() {
        return this.f3012g;
    }

    /* renamed from: v */
    public final C1387g mo5992v(int i, HashMap hashMap, SnapshotIdSet snapshotIdSet) {
        C1407x p;
        C1407x xVar;
        C19383o.m32797g(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet g = mo5997e().mo5949l(mo5996d()).mo5947g(this.f3013h);
        Set<C1406w> u = mo5991u();
        C19383o.m32794d(u);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (C1406w next : u) {
            C1407x firstStateRecord = next.getFirstStateRecord();
            C1407x p2 = SnapshotKt.m2917p(firstStateRecord, i, snapshotIdSet);
            if (!(p2 == null || (p = SnapshotKt.m2917p(firstStateRecord, mo5996d(), g)) == null || C19383o.m32792b(p2, p))) {
                C1407x p3 = SnapshotKt.m2917p(firstStateRecord, mo5996d(), mo5997e());
                if (p3 != null) {
                    if (hashMap == null || (xVar = (C1407x) hashMap.get(p2)) == null) {
                        xVar = next.mergeRecords(p, p2, p3);
                    }
                    if (xVar == null) {
                        return new C1387g.C1388a(this);
                    }
                    if (!C19383o.m32792b(xVar, p3)) {
                        if (C19383o.m32792b(xVar, p2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(new Pair(next, p2.mo5543b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(!C19383o.m32792b(xVar, p) ? new Pair(next, xVar) : new Pair(next, p.mo5543b()));
                        }
                    }
                } else {
                    SnapshotKt.m2916o();
                    throw null;
                }
            }
        }
        if (arrayList != null) {
            mo5990s();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) arrayList.get(i2);
                C1406w wVar = (C1406w) pair.component1();
                C1407x xVar2 = (C1407x) pair.component2();
                xVar2.f3056a = mo5996d();
                synchronized (SnapshotKt.f2989c) {
                    xVar2.f3057b = wVar.getFirstStateRecord();
                    wVar.prependStateRecord(xVar2);
                    C19394m mVar = C19394m.f43287a;
                }
            }
        }
        if (arrayList2 != null) {
            u.removeAll(arrayList2);
        }
        return C1387g.C1389b.f3030a;
    }

    /* renamed from: w */
    public final void mo5993w(int i) {
        synchronized (SnapshotKt.f2989c) {
            this.f3013h = this.f3013h.mo5949l(i);
            C19394m mVar = C19394m.f43287a;
        }
    }

    /* renamed from: x */
    public void mo5994x(HashSet hashSet) {
        this.f3012g = hashSet;
    }

    /* renamed from: y */
    public C1379a mo5936y(C19857l<Object, C19394m> lVar, C19857l<Object, C19394m> lVar2) {
        C1381b bVar;
        if (!this.f3028c) {
            mo5995z();
            mo5993w(mo5996d());
            Object obj = SnapshotKt.f2989c;
            synchronized (obj) {
                int i = SnapshotKt.f2991e;
                SnapshotKt.f2991e = i + 1;
                SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(i);
                SnapshotIdSet e = mo5997e();
                mo6003q(e.mo5949l(i));
                bVar = new C1381b(i, SnapshotKt.m2906e(mo5996d() + 1, i, e), SnapshotKt.m2911j(lVar, this.f3010e, true), SnapshotKt.m2903b(lVar2, this.f3011f), this);
            }
            if (!this.f3016k && !this.f3028c) {
                int d = mo5996d();
                synchronized (obj) {
                    int i2 = SnapshotKt.f2991e;
                    SnapshotKt.f2991e = i2 + 1;
                    mo6002p(i2);
                    SnapshotKt.f2990d = SnapshotKt.f2990d.mo5949l(mo5996d());
                    C19394m mVar = C19394m.f43287a;
                }
                mo6003q(SnapshotKt.m2906e(d + 1, mo5996d(), mo5997e()));
            }
            return bVar;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if ((r3.f3029d >= 0) != false) goto L_0x000f;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5995z() {
        /*
            r3 = this;
            boolean r0 = r3.f3016k
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            int r0 = r3.f3029d
            if (r0 < 0) goto L_0x000c
            r0 = r2
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r1 = r2
        L_0x0010:
            if (r1 == 0) goto L_0x0013
            return
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unsupported operation on a disposed or applied snapshot"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C1379a.mo5995z():void");
    }
}
