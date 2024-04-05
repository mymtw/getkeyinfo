package p461uf;

import android.content.Context;
import android.os.Bundle;
import p453tf.C13418j;
import p453tf.C13442y;

/* renamed from: uf.m */
public final class C13519m {

    /* renamed from: a */
    public final C13511h f29576a;

    /* renamed from: uf.m$a */
    public static final class C13520a {
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce A[Catch:{ all -> 0x0131, all -> 0x0136 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00cc A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m21292a(java.util.HashMap r12) {
            /*
                java.lang.String r0 = p461uf.C13523p.f29584a
                java.lang.Class<uf.p> r0 = p461uf.C13523p.class
                boolean r1 = p401mg.C13080a.m20762b(r0)
                if (r1 == 0) goto L_0x000c
                goto L_0x013a
            L_0x000c:
                java.util.concurrent.atomic.AtomicBoolean r1 = p461uf.C13523p.f29586c     // Catch:{ all -> 0x0136 }
                boolean r1 = r1.get()     // Catch:{ all -> 0x0136 }
                if (r1 != 0) goto L_0x0019
                uf.p r1 = p461uf.C13523p.f29589f     // Catch:{ all -> 0x0136 }
                r1.mo46183b()     // Catch:{ all -> 0x0136 }
            L_0x0019:
                java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x0136 }
                java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0136 }
            L_0x0021:
                boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0136 }
                if (r1 == 0) goto L_0x0112
                java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0136 }
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0136 }
                java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0136 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0136 }
                java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0136 }
                uf.p r3 = p461uf.C13523p.f29589f     // Catch:{ all -> 0x0136 }
                int r4 = r1.length()     // Catch:{ all -> 0x0136 }
                r5 = 1
                int r4 = r4 - r5
                r6 = 0
                r7 = r6
                r8 = r7
            L_0x0044:
                if (r7 > r4) goto L_0x0069
                if (r8 != 0) goto L_0x004a
                r9 = r7
                goto L_0x004b
            L_0x004a:
                r9 = r4
            L_0x004b:
                char r9 = r1.charAt(r9)     // Catch:{ all -> 0x0136 }
                r10 = 32
                int r9 = kotlin.jvm.internal.C19383o.m32799i(r9, r10)     // Catch:{ all -> 0x0136 }
                if (r9 > 0) goto L_0x0059
                r9 = r5
                goto L_0x005a
            L_0x0059:
                r9 = r6
            L_0x005a:
                if (r8 != 0) goto L_0x0063
                if (r9 != 0) goto L_0x0060
                r8 = r5
                goto L_0x0044
            L_0x0060:
                int r7 = r7 + 1
                goto L_0x0044
            L_0x0063:
                if (r9 != 0) goto L_0x0066
                goto L_0x0069
            L_0x0066:
                int r4 = r4 + -1
                goto L_0x0044
            L_0x0069:
                int r4 = r4 + 1
                java.lang.CharSequence r1 = r1.subSequence(r7, r4)     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = r3.mo46184c(r2, r1)     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = p365hg.C12869i0.m20560P(r1)     // Catch:{ all -> 0x0136 }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = p461uf.C13523p.f29588e     // Catch:{ all -> 0x0136 }
                boolean r4 = r3.containsKey(r2)     // Catch:{ all -> 0x0136 }
                if (r4 == 0) goto L_0x010d
                java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0136 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0136 }
                java.lang.String r4 = ","
                if (r3 == 0) goto L_0x00ab
                kotlin.text.Regex r7 = new kotlin.text.Regex     // Catch:{ all -> 0x0136 }
                r7.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0136 }
                java.util.List r7 = r7.split(r3, r6)     // Catch:{ all -> 0x0136 }
                if (r7 == 0) goto L_0x00ab
                java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x0136 }
                java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ all -> 0x0136 }
                if (r7 == 0) goto L_0x00a3
                java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0136 }
                goto L_0x00ad
            L_0x00a3:
                java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r12.<init>(r1)     // Catch:{ all -> 0x0136 }
                throw r12     // Catch:{ all -> 0x0136 }
            L_0x00ab:
                java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x0136 }
            L_0x00ad:
                int r8 = r7.length     // Catch:{ all -> 0x0136 }
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r7, r8)     // Catch:{ all -> 0x0136 }
                java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x0136 }
                java.lang.String r9 = "elements"
                kotlin.jvm.internal.C19383o.m32797g(r8, r9)     // Catch:{ all -> 0x0136 }
                java.util.LinkedHashSet r9 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0136 }
                int r10 = r8.length     // Catch:{ all -> 0x0136 }
                int r10 = kotlin.reflect.C19421p.m32930T(r10)     // Catch:{ all -> 0x0136 }
                r9.<init>(r10)     // Catch:{ all -> 0x0136 }
                kotlin.collections.C19318k.m32619k1(r9, r8)     // Catch:{ all -> 0x0136 }
                boolean r8 = r9.contains(r1)     // Catch:{ all -> 0x0136 }
                if (r8 == 0) goto L_0x00ce
                goto L_0x013a
            L_0x00ce:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
                r8.<init>()     // Catch:{ all -> 0x0136 }
                int r10 = r7.length     // Catch:{ all -> 0x0136 }
                if (r10 != 0) goto L_0x00d8
                r10 = r5
                goto L_0x00d9
            L_0x00d8:
                r10 = r6
            L_0x00d9:
                if (r10 == 0) goto L_0x00df
                r8.append(r1)     // Catch:{ all -> 0x0136 }
                goto L_0x0102
            L_0x00df:
                int r10 = r7.length     // Catch:{ all -> 0x0136 }
                r11 = 5
                if (r10 >= r11) goto L_0x00ed
                r8.append(r3)     // Catch:{ all -> 0x0136 }
                r8.append(r4)     // Catch:{ all -> 0x0136 }
                r8.append(r1)     // Catch:{ all -> 0x0136 }
                goto L_0x0102
            L_0x00ed:
                if (r5 >= r11) goto L_0x00fa
                r3 = r7[r5]     // Catch:{ all -> 0x0136 }
                r8.append(r3)     // Catch:{ all -> 0x0136 }
                r8.append(r4)     // Catch:{ all -> 0x0136 }
                int r5 = r5 + 1
                goto L_0x00ed
            L_0x00fa:
                r8.append(r1)     // Catch:{ all -> 0x0136 }
                r1 = r7[r6]     // Catch:{ all -> 0x0136 }
                r9.remove(r1)     // Catch:{ all -> 0x0136 }
            L_0x0102:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = p461uf.C13523p.f29588e     // Catch:{ all -> 0x0136 }
                java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x0136 }
                r1.put(r2, r3)     // Catch:{ all -> 0x0136 }
                goto L_0x0021
            L_0x010d:
                r3.put(r2, r1)     // Catch:{ all -> 0x0136 }
                goto L_0x0021
            L_0x0112:
                uf.p r12 = p461uf.C13523p.f29589f     // Catch:{ all -> 0x0136 }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = p461uf.C13523p.f29588e     // Catch:{ all -> 0x0136 }
                java.lang.String r1 = p365hg.C12869i0.m20552H(r1)     // Catch:{ all -> 0x0136 }
                r12.getClass()     // Catch:{ all -> 0x0136 }
                boolean r2 = p401mg.C13080a.m20762b(r12)     // Catch:{ all -> 0x0136 }
                if (r2 == 0) goto L_0x0124
                goto L_0x013a
            L_0x0124:
                java.util.concurrent.Executor r2 = p453tf.C13418j.m21108d()     // Catch:{ all -> 0x0131 }
                uf.o r3 = new uf.o     // Catch:{ all -> 0x0131 }
                r3.<init>(r1)     // Catch:{ all -> 0x0131 }
                r2.execute(r3)     // Catch:{ all -> 0x0131 }
                goto L_0x013a
            L_0x0131:
                r1 = move-exception
                p401mg.C13080a.m20761a(r12, r1)     // Catch:{ all -> 0x0136 }
                goto L_0x013a
            L_0x0136:
                r12 = move-exception
                p401mg.C13080a.m20761a(r0, r12)
            L_0x013a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p461uf.C13519m.C13520a.m21292a(java.util.HashMap):void");
        }
    }

    public C13519m(Context context) {
        this.f29576a = new C13511h(context, (String) null);
    }

    /* renamed from: a */
    public final void mo46174a(Bundle bundle, String str) {
        String str2 = C13418j.f29381a;
        if (C13442y.m21140c()) {
            this.f29576a.mo46170f(str, bundle);
        }
    }

    /* renamed from: b */
    public final void mo46175b(String str, Bundle bundle) {
        String str2 = C13418j.f29381a;
        if (C13442y.m21140c()) {
            this.f29576a.mo46170f(str, bundle);
        }
    }

    public C13519m(Context context, String str) {
        this.f29576a = new C13511h(context, str);
    }
}
