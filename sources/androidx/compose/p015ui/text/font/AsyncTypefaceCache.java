package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import p147j0.C7097a;
import p147j0.C7098b;

/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache */
public final class AsyncTypefaceCache {

    /* renamed from: a */
    public final C7097a<C1939b, C1938a> f4385a = new C7097a<>();

    /* renamed from: b */
    public final C7098b<C1939b, C1938a> f4386b = new C7098b<>(0);

    /* renamed from: c */
    public final C15588c1 f4387c = new C15588c1();

    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$a */
    public static final class C1938a {

        /* renamed from: a */
        public final Object f4388a;

        public /* synthetic */ C1938a(Object obj) {
            this.f4388a = obj;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C1938a) && C19383o.m32792b(this.f4388a, ((C1938a) obj).f4388a);
        }

        public final int hashCode() {
            Object obj = this.f4388a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            Object obj = this.f4388a;
            return "AsyncTypefaceResult(result=" + obj + ')';
        }
    }

    /* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$b */
    public static final class C1939b {

        /* renamed from: a */
        public final C1950f f4389a;

        /* renamed from: b */
        public final Object f4390b;

        public C1939b(C1950f fVar, Object obj) {
            C19383o.m32797g(fVar, "font");
            this.f4389a = fVar;
            this.f4390b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1939b)) {
                return false;
            }
            C1939b bVar = (C1939b) obj;
            return C19383o.m32792b(this.f4389a, bVar.f4389a) && C19383o.m32792b(this.f4390b, bVar.f4390b);
        }

        public final int hashCode() {
            int hashCode = this.f4389a.hashCode() * 31;
            Object obj = this.f4390b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Key(font=");
            h.append(this.f4389a);
            h.append(", loaderKey=");
            return C0073e.m209i(h, this.f4390b, ')');
        }
    }

    /* renamed from: a */
    public static void m4261a(AsyncTypefaceCache asyncTypefaceCache, C1950f fVar, C1963q qVar, Object obj) {
        asyncTypefaceCache.getClass();
        C19383o.m32797g(qVar, "platformFontLoader");
        qVar.mo7528b();
        C1939b bVar = new C1939b(fVar, (Object) null);
        synchronized (asyncTypefaceCache.f4387c) {
            if (obj == null) {
                try {
                    C1938a aVar = (C1938a) asyncTypefaceCache.f4386b.mo19426d(bVar, new C1938a((Object) null));
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                C1938a b = asyncTypefaceCache.f4385a.mo19419b(bVar, new C1938a(obj));
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
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    public final java.lang.Object mo7505b(androidx.compose.p015ui.text.font.C1950f r7, androidx.compose.p015ui.text.font.C1963q r8, boolean r9, p753kq.C19857l<? super kotlin.coroutines.C19340c<java.lang.Object>, ? extends java.lang.Object> r10, kotlin.coroutines.C19340c<java.lang.Object> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.compose.p015ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            boolean r9 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r7 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1939b) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r8 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache) r8
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            goto L_0x0076
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r11)
            androidx.compose.ui.text.font.AsyncTypefaceCache$b r11 = new androidx.compose.ui.text.font.AsyncTypefaceCache$b
            r8.mo7528b()
            r11.<init>(r7, r4)
            com.google.android.play.core.assetpacks.c1 r7 = r6.f4387c
            monitor-enter(r7)
            j0.a<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r6.f4385a     // Catch:{ all -> 0x00a5 }
            java.lang.Object r8 = r8.mo19418a(r11)     // Catch:{ all -> 0x00a5 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r8     // Catch:{ all -> 0x00a5 }
            if (r8 != 0) goto L_0x005a
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r6.f4386b     // Catch:{ all -> 0x00a5 }
            java.lang.Object r8 = r8.mo19423a(r11)     // Catch:{ all -> 0x00a5 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r8 = (androidx.compose.p015ui.text.font.AsyncTypefaceCache.C1938a) r8     // Catch:{ all -> 0x00a5 }
        L_0x005a:
            if (r8 == 0) goto L_0x0060
            java.lang.Object r8 = r8.f4388a     // Catch:{ all -> 0x00a5 }
            monitor-exit(r7)
            return r8
        L_0x0060:
            kotlin.m r8 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00a5 }
            monitor-exit(r7)
            r0.L$0 = r6
            r0.L$1 = r11
            r0.Z$0 = r9
            r0.label = r3
            java.lang.Object r7 = r10.invoke(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r8 = r6
            r5 = r11
            r11 = r7
            r7 = r5
        L_0x0076:
            com.google.android.play.core.assetpacks.c1 r10 = r8.f4387c
            monitor-enter(r10)
            if (r11 != 0) goto L_0x0088
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r8.f4386b     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch:{ all -> 0x0086 }
            r9.<init>(r4)     // Catch:{ all -> 0x0086 }
            r8.mo19426d(r7, r9)     // Catch:{ all -> 0x0086 }
            goto L_0x009f
        L_0x0086:
            r7 = move-exception
            goto L_0x00a3
        L_0x0088:
            if (r9 == 0) goto L_0x0095
            j0.b<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r8.f4386b     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch:{ all -> 0x0086 }
            r9.<init>(r11)     // Catch:{ all -> 0x0086 }
            r8.mo19426d(r7, r9)     // Catch:{ all -> 0x0086 }
            goto L_0x009f
        L_0x0095:
            j0.a<androidx.compose.ui.text.font.AsyncTypefaceCache$b, androidx.compose.ui.text.font.AsyncTypefaceCache$a> r8 = r8.f4385a     // Catch:{ all -> 0x0086 }
            androidx.compose.ui.text.font.AsyncTypefaceCache$a r9 = new androidx.compose.ui.text.font.AsyncTypefaceCache$a     // Catch:{ all -> 0x0086 }
            r9.<init>(r11)     // Catch:{ all -> 0x0086 }
            r8.mo19419b(r7, r9)     // Catch:{ all -> 0x0086 }
        L_0x009f:
            kotlin.m r7 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x0086 }
            monitor-exit(r10)
            return r11
        L_0x00a3:
            monitor-exit(r10)
            throw r7
        L_0x00a5:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.font.AsyncTypefaceCache.mo7505b(androidx.compose.ui.text.font.f, androidx.compose.ui.text.font.q, boolean, kq.l, kotlin.coroutines.c):java.lang.Object");
    }
}
