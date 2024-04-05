package p147j0;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.C19394m;

/* renamed from: j0.a */
public final class C7097a<K, V> {

    /* renamed from: a */
    public final C15588c1 f15784a = new C15588c1();

    /* renamed from: b */
    public final HashMap<K, V> f15785b = new HashMap<>(0, 0.75f);

    /* renamed from: c */
    public final LinkedHashSet<K> f15786c = new LinkedHashSet<>();

    /* renamed from: d */
    public int f15787d;

    /* renamed from: e */
    public int f15788e;

    /* renamed from: f */
    public int f15789f;

    /* renamed from: a */
    public final V mo19418a(K k) {
        synchronized (this.f15784a) {
            V v = this.f15785b.get(k);
            if (v != null) {
                this.f15786c.remove(k);
                this.f15786c.add(k);
                this.f15788e++;
                return v;
            }
            this.f15789f++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo19419b(K r5, V r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x00b9
            if (r6 == 0) goto L_0x00b9
            com.google.android.play.core.assetpacks.c1 r1 = r4.f15784a
            monitor-enter(r1)
            int r2 = r4.mo19421d()     // Catch:{ all -> 0x00b6 }
            int r2 = r2 + 1
            r4.f15787d = r2     // Catch:{ all -> 0x00b6 }
            java.util.HashMap<K, V> r2 = r4.f15785b     // Catch:{ all -> 0x00b6 }
            java.lang.Object r6 = r2.put(r5, r6)     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x0020
            int r2 = r4.mo19421d()     // Catch:{ all -> 0x00b6 }
            int r2 = r2 + -1
            r4.f15787d = r2     // Catch:{ all -> 0x00b6 }
        L_0x0020:
            java.util.LinkedHashSet<K> r2 = r4.f15786c     // Catch:{ all -> 0x00b6 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x002d
            java.util.LinkedHashSet<K> r2 = r4.f15786c     // Catch:{ all -> 0x00b6 }
            r2.remove(r5)     // Catch:{ all -> 0x00b6 }
        L_0x002d:
            java.util.LinkedHashSet<K> r2 = r4.f15786c     // Catch:{ all -> 0x00b6 }
            r2.add(r5)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)
        L_0x0033:
            com.google.android.play.core.assetpacks.c1 r5 = r4.f15784a
            monitor-enter(r5)
            int r1 = r4.mo19421d()     // Catch:{ all -> 0x00b3 }
            if (r1 < 0) goto L_0x00ab
            java.util.HashMap<K, V> r1 = r4.f15785b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x004a
            int r1 = r4.mo19421d()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x00ab
        L_0x004a:
            java.util.HashMap<K, V> r1 = r4.f15785b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashSet<K> r2 = r4.f15786c     // Catch:{ all -> 0x00b3 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 != r2) goto L_0x00ab
            int r1 = r4.mo19421d()     // Catch:{ all -> 0x00b3 }
            r2 = 16
            if (r1 <= r2) goto L_0x009a
            java.util.HashMap<K, V> r1 = r4.f15785b     // Catch:{ all -> 0x00b3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00b3 }
            if (r1 != 0) goto L_0x009a
            java.util.LinkedHashSet<K> r1 = r4.f15786c     // Catch:{ all -> 0x00b3 }
            java.lang.Object r1 = kotlin.collections.C19327t.m32637S0(r1)     // Catch:{ all -> 0x00b3 }
            java.util.HashMap<K, V> r2 = r4.f15785b     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0092
            java.util.HashMap<K, V> r3 = r4.f15785b     // Catch:{ all -> 0x00b3 }
            kotlin.jvm.internal.C19389t.m32909c(r3)     // Catch:{ all -> 0x00b3 }
            r3.remove(r1)     // Catch:{ all -> 0x00b3 }
            java.util.LinkedHashSet<K> r3 = r4.f15786c     // Catch:{ all -> 0x00b3 }
            kotlin.jvm.internal.C19389t.m32907a(r3)     // Catch:{ all -> 0x00b3 }
            r3.remove(r1)     // Catch:{ all -> 0x00b3 }
            int r3 = r4.mo19421d()     // Catch:{ all -> 0x00b3 }
            kotlin.jvm.internal.C19383o.m32794d(r1)     // Catch:{ all -> 0x00b3 }
            int r3 = r3 + -1
            r4.f15787d = r3     // Catch:{ all -> 0x00b3 }
            goto L_0x009c
        L_0x0092:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "inconsistent state"
            r6.<init>(r0)     // Catch:{ all -> 0x00b3 }
            throw r6     // Catch:{ all -> 0x00b3 }
        L_0x009a:
            r1 = r0
            r2 = r1
        L_0x009c:
            kotlin.m r3 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00b3 }
            monitor-exit(r5)
            if (r1 != 0) goto L_0x00a4
            if (r2 != 0) goto L_0x00a4
            return r6
        L_0x00a4:
            kotlin.jvm.internal.C19383o.m32794d(r1)
            kotlin.jvm.internal.C19383o.m32794d(r2)
            goto L_0x0033
        L_0x00ab:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = "map/keySet size inconsistency"
            r6.<init>(r0)     // Catch:{ all -> 0x00b3 }
            throw r6     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x00b6:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L_0x00b9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147j0.C7097a.mo19419b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final V mo19420c(K k) {
        V remove;
        k.getClass();
        synchronized (this.f15784a) {
            remove = this.f15785b.remove(k);
            this.f15786c.remove(k);
            if (remove != null) {
                this.f15787d = mo19421d() - 1;
            }
            C19394m mVar = C19394m.f43287a;
        }
        return remove;
    }

    /* renamed from: d */
    public final int mo19421d() {
        int i;
        synchronized (this.f15784a) {
            i = this.f15787d;
        }
        return i;
    }

    public final String toString() {
        String str;
        synchronized (this.f15784a) {
            int i = this.f15788e;
            int i2 = this.f15789f + i;
            str = "LruCache[maxSize=" + 16 + ",hits=" + this.f15788e + ",misses=" + this.f15789f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
