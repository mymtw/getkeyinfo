package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C0837b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

public final class LazyGridSpanLayoutProvider {

    /* renamed from: a */
    public final C0810l f1659a;

    /* renamed from: b */
    public final ArrayList<C0793a> f1660b;

    /* renamed from: c */
    public int f1661c;

    /* renamed from: d */
    public int f1662d;

    /* renamed from: e */
    public int f1663e;

    /* renamed from: f */
    public int f1664f = -1;

    /* renamed from: g */
    public final ArrayList f1665g = new ArrayList();

    /* renamed from: h */
    public List<C0801c> f1666h = EmptyList.INSTANCE;

    /* renamed from: i */
    public int f1667i;

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a */
    public static final class C0793a {

        /* renamed from: a */
        public final int f1668a;

        /* renamed from: b */
        public final int f1669b;

        public /* synthetic */ C0793a() {
            this(0, 0);
        }

        public C0793a(int i, int i2) {
            this.f1668a = i;
            this.f1669b = i2;
        }
    }

    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b */
    public static final class C0794b {

        /* renamed from: a */
        public final int f1670a;

        /* renamed from: b */
        public final List<C0801c> f1671b;

        public C0794b(int i, List<C0801c> list) {
            C19383o.m32797g(list, "spans");
            this.f1670a = i;
            this.f1671b = list;
        }
    }

    public LazyGridSpanLayoutProvider(C0810l lVar) {
        C19383o.m32797g(lVar, "itemsSnapshot");
        this.f1659a = lVar;
        ArrayList<C0793a> arrayList = new ArrayList<>();
        arrayList.add(new C0793a(0, 0));
        this.f1660b = arrayList;
    }

    /* renamed from: a */
    public final int mo4307a() {
        return ((int) Math.sqrt((((double) mo4310d()) * 1.0d) / ((double) this.f1667i))) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1 A[LOOP:1: B:45:0x00c1->B:90:0x00c1, LOOP_START, PHI: r3 r4 r5 
      PHI: (r3v6 int) = (r3v5 int), (r3v10 int) binds: [B:44:0x00bf, B:90:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:44:0x00bf, B:90:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v5 int) = (r5v4 int), (r5v9 int) binds: [B:44:0x00bf, B:90:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C0794b mo4308b(int r11) {
        /*
            r10 = this;
            androidx.compose.foundation.lazy.grid.l r0 = r10.f1659a
            boolean r0 = r0.f1708b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x003d
            int r0 = r10.f1667i
            int r11 = r11 * r0
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b r3 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b
            int r4 = r10.mo4310d()
            int r4 = r4 - r11
            if (r0 <= r4) goto L_0x0015
            r0 = r4
        L_0x0015:
            if (r0 >= 0) goto L_0x0018
            r0 = r2
        L_0x0018:
            java.util.List<androidx.compose.foundation.lazy.grid.c> r4 = r10.f1666h
            int r4 = r4.size()
            if (r0 != r4) goto L_0x0023
            java.util.List<androidx.compose.foundation.lazy.grid.c> r0 = r10.f1666h
            goto L_0x0039
        L_0x0023:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L_0x0028:
            if (r2 >= r0) goto L_0x0036
            long r5 = (long) r1
            androidx.compose.foundation.lazy.grid.c r7 = new androidx.compose.foundation.lazy.grid.c
            r7.<init>(r5)
            r4.add(r7)
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0036:
            r10.f1666h = r4
            r0 = r4
        L_0x0039:
            r3.<init>(r11, r0)
            return r3
        L_0x003d:
            int r0 = r10.mo4307a()
            int r0 = r11 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r3 = r10.f1660b
            int r3 = r3.size()
            int r3 = r3 - r1
            int r0 = java.lang.Math.min(r0, r3)
            int r3 = r10.mo4307a()
            int r3 = r3 * r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r4 = r10.f1660b
            java.lang.Object r4 = r4.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r4 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C0793a) r4
            int r4 = r4.f1668a
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r5 = r10.f1660b
            java.lang.Object r5 = r5.get(r0)
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r5 = (androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.C0793a) r5
            int r5 = r5.f1669b
            int r6 = r10.f1661c
            if (r3 > r6) goto L_0x006f
            if (r6 > r11) goto L_0x006f
            r7 = r1
            goto L_0x0070
        L_0x006f:
            r7 = r2
        L_0x0070:
            if (r7 == 0) goto L_0x0078
            int r4 = r10.f1662d
            int r5 = r10.f1663e
            r3 = r6
            goto L_0x0094
        L_0x0078:
            int r6 = r10.f1664f
            if (r0 != r6) goto L_0x0094
            int r6 = r11 - r3
            java.util.ArrayList r7 = r10.f1665g
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0094
            java.util.ArrayList r3 = r10.f1665g
            java.lang.Object r3 = r3.get(r6)
            java.lang.Number r3 = (java.lang.Number) r3
            int r4 = r3.intValue()
            r3 = r11
            r5 = r2
        L_0x0094:
            int r6 = r10.mo4307a()
            int r6 = r3 % r6
            if (r6 != 0) goto L_0x00ae
            int r6 = r10.mo4307a()
            int r7 = r11 - r3
            r8 = 2
            if (r8 > r7) goto L_0x00a9
            if (r7 >= r6) goto L_0x00a9
            r6 = r1
            goto L_0x00aa
        L_0x00a9:
            r6 = r2
        L_0x00aa:
            if (r6 == 0) goto L_0x00ae
            r6 = r1
            goto L_0x00af
        L_0x00ae:
            r6 = r2
        L_0x00af:
            if (r6 == 0) goto L_0x00b8
            r10.f1664f = r0
            java.util.ArrayList r0 = r10.f1665g
            r0.clear()
        L_0x00b8:
            if (r3 > r11) goto L_0x00bc
            r0 = r1
            goto L_0x00bd
        L_0x00bc:
            r0 = r2
        L_0x00bd:
            java.lang.String r7 = "Check failed."
            if (r0 == 0) goto L_0x015d
        L_0x00c1:
            r0 = 0
            if (r3 >= r11) goto L_0x0128
            int r8 = r10.mo4310d()
            if (r4 >= r8) goto L_0x0128
            if (r6 == 0) goto L_0x00d5
            java.util.ArrayList r8 = r10.f1665g
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r8.add(r9)
        L_0x00d5:
            r8 = r2
        L_0x00d6:
            int r9 = r10.f1667i
            if (r8 >= r9) goto L_0x00f0
            int r9 = r10.mo4310d()
            if (r4 >= r9) goto L_0x00f0
            if (r5 == 0) goto L_0x00ec
            int r8 = r8 + r5
            int r9 = r10.f1667i
            if (r8 <= r9) goto L_0x00e8
            goto L_0x00f0
        L_0x00e8:
            int r4 = r4 + 1
            r5 = r2
            goto L_0x00d6
        L_0x00ec:
            r10.mo4311e(r4)
            throw r0
        L_0x00f0:
            int r3 = r3 + 1
            int r0 = r10.mo4307a()
            int r0 = r3 % r0
            if (r0 != 0) goto L_0x00c1
            int r0 = r10.mo4310d()
            if (r4 >= r0) goto L_0x00c1
            int r0 = r10.mo4307a()
            int r0 = r3 / r0
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r8 = r10.f1660b
            int r8 = r8.size()
            if (r8 != r0) goto L_0x0110
            r0 = r1
            goto L_0x0111
        L_0x0110:
            r0 = r2
        L_0x0111:
            if (r0 == 0) goto L_0x011e
            java.util.ArrayList<androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a> r0 = r10.f1660b
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a r8 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$a
            r8.<init>(r4, r5)
            r0.add(r8)
            goto L_0x00c1
        L_0x011e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r11.<init>(r0)
            throw r11
        L_0x0128:
            r10.f1661c = r11
            r10.f1662d = r4
            r10.f1663e = r5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = r2
            r3 = r4
        L_0x0135:
            int r6 = r10.f1667i
            if (r1 >= r6) goto L_0x0157
            int r6 = r10.mo4310d()
            if (r3 >= r6) goto L_0x0157
            if (r5 == 0) goto L_0x0153
            int r1 = r1 + r5
            int r6 = r10.f1667i
            if (r1 > r6) goto L_0x0157
            int r3 = r3 + 1
            long r5 = (long) r5
            androidx.compose.foundation.lazy.grid.c r7 = new androidx.compose.foundation.lazy.grid.c
            r7.<init>(r5)
            r11.add(r7)
            r5 = r2
            goto L_0x0135
        L_0x0153:
            r10.mo4311e(r3)
            throw r0
        L_0x0157:
            androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b r0 = new androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b
            r0.<init>(r4, r11)
            return r0
        L_0x015d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = r7.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.mo4308b(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$b");
    }

    /* renamed from: c */
    public final int mo4309c(int i) {
        int i2;
        boolean z = false;
        if (mo4310d() <= 0) {
            return 0;
        }
        if (!(i < mo4310d())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!this.f1659a.f1708b) {
            return i / this.f1667i;
        } else {
            ArrayList<C0793a> arrayList = this.f1660b;
            LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 = new LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(i);
            int size = arrayList.size();
            C17782b.m29869i0(arrayList.size(), 0, size);
            int i3 = size - 1;
            int i4 = 0;
            while (true) {
                if (i4 > i3) {
                    i2 = -(i4 + 1);
                    break;
                }
                i2 = (i4 + i3) >>> 1;
                int intValue = ((Number) lazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1.invoke(arrayList.get(i2))).intValue();
                if (intValue >= 0) {
                    if (intValue <= 0) {
                        break;
                    }
                    i3 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            }
            if (i2 < 0) {
                i2 = (-i2) - 2;
            }
            mo4307a();
            int i5 = this.f1660b.get(i2).f1668a;
            if (i5 <= i) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (i5 < i) {
                mo4311e(i5);
                throw null;
            } else {
                mo4311e(i);
                throw null;
            }
        }
    }

    /* renamed from: d */
    public final int mo4310d() {
        return this.f1659a.f1707a.mo4382a();
    }

    /* renamed from: e */
    public final void mo4311e(int i) {
        C0810l lVar = this.f1659a;
        lVar.getClass();
        C0837b.C0838a<C0804f> aVar = lVar.f1707a.get(i);
        int i2 = aVar.f1793a;
        ((C0804f) aVar.f1795c).getClass();
        throw null;
    }
}
