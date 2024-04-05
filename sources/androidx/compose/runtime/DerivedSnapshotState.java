package androidx.compose.runtime;

import android.support.p013v4.media.C0072d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1318h;
import androidx.compose.runtime.snapshots.C1385f;
import androidx.compose.runtime.snapshots.C1406w;
import androidx.compose.runtime.snapshots.C1407x;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p228s.C7791c;
import p753kq.C19846a;
import p753kq.C19857l;

public final class DerivedSnapshotState<T> implements C1406w, C1354p<T> {

    /* renamed from: b */
    public final C19846a<T> f2763b;

    /* renamed from: c */
    public C1281a<T> f2764c = new C1281a<>();

    /* renamed from: androidx.compose.runtime.DerivedSnapshotState$a */
    public static final class C1281a<T> extends C1407x {

        /* renamed from: f */
        public static final Object f2765f = new Object();

        /* renamed from: c */
        public HashSet<C1406w> f2766c;

        /* renamed from: d */
        public Object f2767d = f2765f;

        /* renamed from: e */
        public int f2768e;

        /* renamed from: a */
        public final void mo5542a(C1407x xVar) {
            C19383o.m32797g(xVar, "value");
            C1281a aVar = (C1281a) xVar;
            this.f2766c = aVar.f2766c;
            this.f2767d = aVar.f2767d;
            this.f2768e = aVar.f2768e;
        }

        /* renamed from: b */
        public final C1407x mo5543b() {
            return new C1281a();
        }

        /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        public final int mo5544c(androidx.compose.runtime.C1354p<?> r8, androidx.compose.runtime.snapshots.C1385f r9) {
            /*
                r7 = this;
                java.lang.String r0 = "derivedState"
                kotlin.jvm.internal.C19383o.m32797g(r8, r0)
                java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotKt.f2989c
                monitor-enter(r0)
                java.util.HashSet<androidx.compose.runtime.snapshots.w> r1 = r7.f2766c     // Catch:{ all -> 0x008e }
                monitor-exit(r0)
                r0 = 7
                if (r1 == 0) goto L_0x008d
                androidx.compose.runtime.j1 r2 = androidx.compose.runtime.C1326g1.f2887a
                java.lang.Object r2 = r2.mo5886c()
                s.c r2 = (p228s.C7791c) r2
                if (r2 != 0) goto L_0x001a
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.h r2 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C1318h.f2880c
            L_0x001a:
                int r3 = r2.size()
                r4 = 0
                r5 = r4
            L_0x0020:
                if (r5 >= r3) goto L_0x0034
                java.lang.Object r6 = r2.get(r5)
                kotlin.Pair r6 = (kotlin.Pair) r6
                java.lang.Object r6 = r6.component1()
                kq.l r6 = (p753kq.C19857l) r6
                r6.invoke(r8)
                int r5 = r5 + 1
                goto L_0x0020
            L_0x0034:
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0073 }
            L_0x0038:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0073 }
                if (r3 == 0) goto L_0x0059
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0073 }
                androidx.compose.runtime.snapshots.w r3 = (androidx.compose.runtime.snapshots.C1406w) r3     // Catch:{ all -> 0x0073 }
                androidx.compose.runtime.snapshots.x r5 = r3.getFirstStateRecord()     // Catch:{ all -> 0x0073 }
                androidx.compose.runtime.snapshots.x r3 = androidx.compose.runtime.snapshots.SnapshotKt.m2919r(r5, r3, r9)     // Catch:{ all -> 0x0073 }
                int r0 = r0 * 31
                int r5 = java.lang.System.identityHashCode(r3)     // Catch:{ all -> 0x0073 }
                int r0 = r0 + r5
                int r0 = r0 * 31
                int r3 = r3.f3056a     // Catch:{ all -> 0x0073 }
                int r0 = r0 + r3
                goto L_0x0038
            L_0x0059:
                kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0073 }
                int r9 = r2.size()
            L_0x005f:
                if (r4 >= r9) goto L_0x008d
                java.lang.Object r1 = r2.get(r4)
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.component2()
                kq.l r1 = (p753kq.C19857l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x005f
            L_0x0073:
                r9 = move-exception
                int r0 = r2.size()
            L_0x0078:
                if (r4 >= r0) goto L_0x008c
                java.lang.Object r1 = r2.get(r4)
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.component2()
                kq.l r1 = (p753kq.C19857l) r1
                r1.invoke(r8)
                int r4 = r4 + 1
                goto L_0x0078
            L_0x008c:
                throw r9
            L_0x008d:
                return r0
            L_0x008e:
                r8 = move-exception
                monitor-exit(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedSnapshotState.C1281a.mo5544c(androidx.compose.runtime.p, androidx.compose.runtime.snapshots.f):int");
        }
    }

    public DerivedSnapshotState(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "calculation");
        this.f2763b = aVar;
    }

    /* renamed from: b */
    public final T mo5536b() {
        return mo5538d((C1281a) SnapshotKt.m2909h(this.f2764c, SnapshotKt.m2910i()), SnapshotKt.m2910i(), this.f2763b).f2767d;
    }

    /* renamed from: c */
    public final Set<C1406w> mo5537c() {
        HashSet<C1406w> hashSet = mo5538d((C1281a) SnapshotKt.m2909h(this.f2764c, SnapshotKt.m2910i()), SnapshotKt.m2910i(), this.f2763b).f2766c;
        return hashSet != null ? hashSet : EmptySet.INSTANCE;
    }

    /* renamed from: d */
    public final C1281a<T> mo5538d(C1281a<T> aVar, C1385f fVar, C19846a<? extends T> aVar2) {
        C1281a<T> aVar3;
        int i = 0;
        if (aVar.f2767d != C1281a.f2765f && aVar.f2768e == aVar.mo5544c(this, fVar)) {
            return aVar;
        }
        Boolean bool = (Boolean) C1326g1.f2888b.mo5886c();
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        HashSet<C1406w> hashSet = new HashSet<>();
        List list = (C7791c) C1326g1.f2887a.mo5886c();
        if (list == null) {
            list = C1318h.f2880c;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C19857l) ((Pair) list.get(i2)).component1()).invoke(this);
        }
        if (!booleanValue) {
            try {
                C1326g1.f2888b.mo5887d(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = list.size();
                while (i < size2) {
                    ((C19857l) ((Pair) list.get(i)).component2()).invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object a = C1385f.C1386a.m2992a(aVar2, new DerivedSnapshotState$currentRecord$result$1$result$1(this, hashSet));
        if (!booleanValue) {
            C1326g1.f2888b.mo5887d(Boolean.FALSE);
        }
        int size3 = list.size();
        while (i < size3) {
            ((C19857l) ((Pair) list.get(i)).component2()).invoke(this);
            i++;
        }
        synchronized (SnapshotKt.f2989c) {
            C1385f i3 = SnapshotKt.m2910i();
            aVar3 = (C1281a) SnapshotKt.m2913l(this.f2764c, this, i3);
            aVar3.f2766c = hashSet;
            aVar3.f2768e = aVar3.mo5544c(this, i3);
            aVar3.f2767d = a;
        }
        if (!booleanValue) {
            SnapshotKt.m2910i().mo5933l();
        }
        return aVar3;
    }

    public final C1407x getFirstStateRecord() {
        return this.f2764c;
    }

    public final T getValue() {
        C19857l<Object, C19394m> f = SnapshotKt.m2910i().mo5939f();
        if (f != null) {
            f.invoke(this);
        }
        return mo5536b();
    }

    public final void prependStateRecord(C1407x xVar) {
        this.f2764c = (C1281a) xVar;
    }

    public final String toString() {
        C1281a aVar = (C1281a) SnapshotKt.m2909h(this.f2764c, SnapshotKt.m2910i());
        StringBuilder h = C0072d.m201h("DerivedState(value=");
        C1281a aVar2 = (C1281a) SnapshotKt.m2909h(this.f2764c, SnapshotKt.m2910i());
        h.append(aVar2.f2767d != C1281a.f2765f && aVar2.f2768e == aVar2.mo5544c(this, SnapshotKt.m2910i()) ? String.valueOf(aVar2.f2767d) : "<Not calculated>");
        h.append(")@");
        h.append(hashCode());
        return h.toString();
    }
}
