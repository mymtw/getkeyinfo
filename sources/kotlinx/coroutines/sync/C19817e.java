package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.sync.e */
public final class C19817e implements C19816d {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43807c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f43808d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43809e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f43810f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43811g;
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    public final int f43812a = 1;

    /* renamed from: b */
    public final C19857l<Throwable, C19394m> f43813b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    static {
        Class<Object> cls = Object.class;
        Class<C19817e> cls2 = C19817e.class;
        f43807c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f43808d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f43809e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f43810f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f43811g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public C19817e(int i) {
        if (i >= 0 && i <= 1) {
            C19819g gVar = new C19819g(0, (C19819g) null, 2);
            this.head = gVar;
            this.tail = gVar;
            this._availablePermits = 1 - i;
            this.f43813b = new SemaphoreImpl$onCancellationRelease$1(this);
            return;
        }
        throw new IllegalArgumentException(C19383o.m32802l(1, "The number of acquired permits should be in 0..").toString());
    }

    /* renamed from: a */
    public final int mo72652a() {
        return Math.max(this._availablePermits, 0);
    }

    /* renamed from: b */
    public final boolean mo72653b() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!f43811g.compareAndSet(this, i, i - 1));
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX WARNING: type inference failed for: r8v13, types: [kotlinx.coroutines.internal.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0079, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e1 A[EDGE_INSN: B:87:0x00e1->B:65:0x00e1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72654c(kotlin.coroutines.C19340c<? super kotlin.C19394m> r16) {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f43811g
            int r1 = r1.getAndDecrement(r15)
            if (r1 <= 0) goto L_0x000c
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x000c:
            kotlin.coroutines.c r1 = kotlin.jvm.internal.C19388s.m32873m0(r16)
            kotlinx.coroutines.l r1 = androidx.compose.foundation.layout.C0761x.m1717e0(r1)
        L_0x0014:
            java.lang.Object r2 = r0.tail
            kotlinx.coroutines.sync.g r2 = (kotlinx.coroutines.sync.C19819g) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f43810f
            long r3 = r3.getAndIncrement(r15)
            int r5 = kotlinx.coroutines.sync.C19818f.f43819f
            long r5 = (long) r5
            long r5 = r3 / r5
        L_0x0023:
            r7 = r2
        L_0x0024:
            long r8 = r7.f43685c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            r9 = 0
            if (r8 < 0) goto L_0x0031
            boolean r8 = r7.mo72448b()
            if (r8 == 0) goto L_0x003a
        L_0x0031:
            java.lang.Object r8 = kotlinx.coroutines.internal.C19720e.m33541a(r7)
            kotlinx.coroutines.internal.t r12 = com.google.android.play.core.assetpacks.C15588c1.f35093s
            if (r8 != r12) goto L_0x00f2
            r7 = r12
        L_0x003a:
            kotlinx.coroutines.internal.t r8 = com.google.android.play.core.assetpacks.C15588c1.f35093s
            if (r7 != r8) goto L_0x0040
            r8 = 1
            goto L_0x0041
        L_0x0040:
            r8 = 0
        L_0x0041:
            if (r8 != 0) goto L_0x0086
            kotlinx.coroutines.internal.r r8 = p568fn.C17782b.m29860Z(r7)
        L_0x0047:
            java.lang.Object r12 = r0.tail
            kotlinx.coroutines.internal.r r12 = (kotlinx.coroutines.internal.C19734r) r12
            long r13 = r12.f43685c
            long r10 = r8.f43685c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0054
            goto L_0x0078
        L_0x0054:
            boolean r10 = r8.mo72480g()
            if (r10 != 0) goto L_0x005c
            r8 = 0
            goto L_0x0079
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = f43809e
        L_0x005e:
            boolean r11 = r10.compareAndSet(r15, r12, r8)
            if (r11 == 0) goto L_0x0066
            r10 = 1
            goto L_0x006d
        L_0x0066:
            java.lang.Object r11 = r10.get(r15)
            if (r11 == r12) goto L_0x005e
            r10 = 0
        L_0x006d:
            if (r10 == 0) goto L_0x007c
            boolean r8 = r12.mo72478e()
            if (r8 == 0) goto L_0x0078
            r12.mo72450d()
        L_0x0078:
            r8 = 1
        L_0x0079:
            if (r8 == 0) goto L_0x0023
            goto L_0x0086
        L_0x007c:
            boolean r10 = r8.mo72478e()
            if (r10 == 0) goto L_0x0047
            r8.mo72450d()
            goto L_0x0047
        L_0x0086:
            kotlinx.coroutines.internal.r r2 = p568fn.C17782b.m29860Z(r7)
            r10 = r2
            kotlinx.coroutines.sync.g r10 = (kotlinx.coroutines.sync.C19819g) r10
            int r2 = kotlinx.coroutines.sync.C19818f.f43819f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r11 = (int) r3
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r10.f43820e
        L_0x0094:
            boolean r2 = r12.compareAndSet(r11, r9, r1)
            if (r2 == 0) goto L_0x009c
            r2 = 1
            goto L_0x00a3
        L_0x009c:
            java.lang.Object r2 = r12.get(r11)
            if (r2 == 0) goto L_0x0094
            r2 = 0
        L_0x00a3:
            if (r2 == 0) goto L_0x00ae
            kotlinx.coroutines.sync.a r2 = new kotlinx.coroutines.sync.a
            r2.<init>(r10, r11)
            r1.mo72497O(r2)
            goto L_0x00cc
        L_0x00ae:
            kotlinx.coroutines.internal.t r2 = kotlinx.coroutines.sync.C19818f.f43815b
            kotlinx.coroutines.internal.t r3 = kotlinx.coroutines.sync.C19818f.f43816c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r10.f43820e
        L_0x00b4:
            boolean r5 = r4.compareAndSet(r11, r2, r3)
            if (r5 == 0) goto L_0x00bc
            r2 = 1
            goto L_0x00c3
        L_0x00bc:
            java.lang.Object r5 = r4.get(r11)
            if (r5 == r2) goto L_0x00b4
            r2 = 0
        L_0x00c3:
            if (r2 == 0) goto L_0x00ce
            kotlin.m r2 = kotlin.C19394m.f43287a
            kq.l<java.lang.Throwable, kotlin.m> r3 = r0.f43813b
            r1.mo72503v(r3, r2)
        L_0x00cc:
            r10 = 1
            goto L_0x00cf
        L_0x00ce:
            r10 = 0
        L_0x00cf:
            if (r10 == 0) goto L_0x00d2
            goto L_0x00e1
        L_0x00d2:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f43811g
            int r2 = r2.getAndDecrement(r15)
            if (r2 <= 0) goto L_0x0014
            kotlin.m r2 = kotlin.C19394m.f43287a
            kq.l<java.lang.Throwable, kotlin.m> r3 = r0.f43813b
            r1.mo72503v(r3, r2)
        L_0x00e1:
            java.lang.Object r1 = r1.mo72547l()
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r1 != r2) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            kotlin.m r1 = kotlin.C19394m.f43287a
        L_0x00ec:
            if (r1 != r2) goto L_0x00ef
            return r1
        L_0x00ef:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        L_0x00f2:
            kotlinx.coroutines.internal.e r8 = (kotlinx.coroutines.internal.C19720e) r8
            kotlinx.coroutines.internal.r r8 = (kotlinx.coroutines.internal.C19734r) r8
            if (r8 == 0) goto L_0x00fb
            r7 = r8
            goto L_0x0024
        L_0x00fb:
            long r10 = r7.f43685c
            r12 = 1
            long r10 = r10 + r12
            r8 = r7
            kotlinx.coroutines.sync.g r8 = (kotlinx.coroutines.sync.C19819g) r8
            kotlinx.coroutines.sync.g r12 = new kotlinx.coroutines.sync.g
            r13 = 0
            r12.<init>(r10, r8, r13)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.internal.C19720e.f43659a
        L_0x010b:
            boolean r10 = r8.compareAndSet(r7, r9, r12)
            if (r10 == 0) goto L_0x0113
            r10 = 1
            goto L_0x011a
        L_0x0113:
            java.lang.Object r10 = r8.get(r7)
            if (r10 == 0) goto L_0x010b
            r10 = r13
        L_0x011a:
            if (r10 == 0) goto L_0x0024
            boolean r8 = r7.mo72448b()
            if (r8 == 0) goto L_0x0125
            r7.mo72450d()
        L_0x0125:
            r7 = r12
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C19817e.mo72654c(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.sync.g} */
    /* JADX WARNING: type inference failed for: r8v13, types: [kotlinx.coroutines.internal.r] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x007f, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void release() {
        /*
            r15 = this;
        L_0x0000:
            int r0 = r15._availablePermits
            int r1 = r15.f43812a
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x000a
            r4 = r3
            goto L_0x000b
        L_0x000a:
            r4 = r2
        L_0x000b:
            if (r4 == 0) goto L_0x0123
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = f43811g
            boolean r1 = r4.compareAndSet(r15, r0, r1)
            if (r1 == 0) goto L_0x0000
            if (r0 < 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.Object r0 = r15.head
            kotlinx.coroutines.sync.g r0 = (kotlinx.coroutines.sync.C19819g) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f43808d
            long r4 = r1.getAndIncrement(r15)
            int r1 = kotlinx.coroutines.sync.C19818f.f43819f
            long r6 = (long) r1
            long r6 = r4 / r6
        L_0x0029:
            r1 = r0
        L_0x002a:
            long r8 = r1.f43685c
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r9 = 0
            if (r8 < 0) goto L_0x0037
            boolean r8 = r1.mo72448b()
            if (r8 == 0) goto L_0x0040
        L_0x0037:
            java.lang.Object r8 = kotlinx.coroutines.internal.C19720e.m33541a(r1)
            kotlinx.coroutines.internal.t r10 = com.google.android.play.core.assetpacks.C15588c1.f35093s
            if (r8 != r10) goto L_0x00ee
            r1 = r10
        L_0x0040:
            kotlinx.coroutines.internal.t r8 = com.google.android.play.core.assetpacks.C15588c1.f35093s
            if (r1 != r8) goto L_0x0046
            r8 = r3
            goto L_0x0047
        L_0x0046:
            r8 = r2
        L_0x0047:
            if (r8 != 0) goto L_0x008c
            kotlinx.coroutines.internal.r r8 = p568fn.C17782b.m29860Z(r1)
        L_0x004d:
            java.lang.Object r10 = r15.head
            kotlinx.coroutines.internal.r r10 = (kotlinx.coroutines.internal.C19734r) r10
            long r11 = r10.f43685c
            long r13 = r8.f43685c
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x005a
            goto L_0x007e
        L_0x005a:
            boolean r11 = r8.mo72480g()
            if (r11 != 0) goto L_0x0062
            r8 = r2
            goto L_0x007f
        L_0x0062:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f43807c
        L_0x0064:
            boolean r12 = r11.compareAndSet(r15, r10, r8)
            if (r12 == 0) goto L_0x006c
            r11 = r3
            goto L_0x0073
        L_0x006c:
            java.lang.Object r12 = r11.get(r15)
            if (r12 == r10) goto L_0x0064
            r11 = r2
        L_0x0073:
            if (r11 == 0) goto L_0x0082
            boolean r8 = r10.mo72478e()
            if (r8 == 0) goto L_0x007e
            r10.mo72450d()
        L_0x007e:
            r8 = r3
        L_0x007f:
            if (r8 == 0) goto L_0x0029
            goto L_0x008c
        L_0x0082:
            boolean r10 = r8.mo72478e()
            if (r10 == 0) goto L_0x004d
            r8.mo72450d()
            goto L_0x004d
        L_0x008c:
            kotlinx.coroutines.internal.r r0 = p568fn.C17782b.m29860Z(r1)
            kotlinx.coroutines.sync.g r0 = (kotlinx.coroutines.sync.C19819g) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C19720e.f43660b
            r1.lazySet(r0, r9)
            long r10 = r0.f43685c
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x009e
            goto L_0x00eb
        L_0x009e:
            int r1 = kotlinx.coroutines.sync.C19818f.f43819f
            long r6 = (long) r1
            long r4 = r4 % r6
            int r1 = (int) r4
            kotlinx.coroutines.internal.t r4 = kotlinx.coroutines.sync.C19818f.f43815b
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.f43820e
            java.lang.Object r4 = r5.getAndSet(r1, r4)
            if (r4 != 0) goto L_0x00d5
            int r4 = kotlinx.coroutines.sync.C19818f.f43814a
            r5 = r2
        L_0x00b0:
            if (r5 >= r4) goto L_0x00bf
            int r5 = r5 + 1
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r0.f43820e
            java.lang.Object r6 = r6.get(r1)
            kotlinx.coroutines.internal.t r7 = kotlinx.coroutines.sync.C19818f.f43816c
            if (r6 != r7) goto L_0x00b0
            goto L_0x00ea
        L_0x00bf:
            kotlinx.coroutines.internal.t r5 = kotlinx.coroutines.sync.C19818f.f43815b
            kotlinx.coroutines.internal.t r6 = kotlinx.coroutines.sync.C19818f.f43817d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.f43820e
        L_0x00c5:
            boolean r4 = r0.compareAndSet(r1, r5, r6)
            if (r4 == 0) goto L_0x00cd
            r2 = r3
            goto L_0x00d3
        L_0x00cd:
            java.lang.Object r4 = r0.get(r1)
            if (r4 == r5) goto L_0x00c5
        L_0x00d3:
            r2 = r2 ^ r3
            goto L_0x00eb
        L_0x00d5:
            kotlinx.coroutines.internal.t r0 = kotlinx.coroutines.sync.C19818f.f43818e
            if (r4 != r0) goto L_0x00da
            goto L_0x00eb
        L_0x00da:
            kotlinx.coroutines.k r4 = (kotlinx.coroutines.C19747k) r4
            kotlin.m r0 = kotlin.C19394m.f43287a
            kq.l<java.lang.Throwable, kotlin.m> r1 = r15.f43813b
            kotlinx.coroutines.internal.t r0 = r4.mo72496J(r0, r9, r1)
            if (r0 != 0) goto L_0x00e7
            goto L_0x00eb
        L_0x00e7:
            r4.mo72501m()
        L_0x00ea:
            r2 = r3
        L_0x00eb:
            if (r2 == 0) goto L_0x0000
            return
        L_0x00ee:
            kotlinx.coroutines.internal.e r8 = (kotlinx.coroutines.internal.C19720e) r8
            kotlinx.coroutines.internal.r r8 = (kotlinx.coroutines.internal.C19734r) r8
            if (r8 == 0) goto L_0x00f7
            r1 = r8
            goto L_0x002a
        L_0x00f7:
            long r10 = r1.f43685c
            r12 = 1
            long r10 = r10 + r12
            r8 = r1
            kotlinx.coroutines.sync.g r8 = (kotlinx.coroutines.sync.C19819g) r8
            kotlinx.coroutines.sync.g r12 = new kotlinx.coroutines.sync.g
            r12.<init>(r10, r8, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.internal.C19720e.f43659a
        L_0x0106:
            boolean r10 = r8.compareAndSet(r1, r9, r12)
            if (r10 == 0) goto L_0x010e
            r8 = r3
            goto L_0x0115
        L_0x010e:
            java.lang.Object r10 = r8.get(r1)
            if (r10 == 0) goto L_0x0106
            r8 = r2
        L_0x0115:
            if (r8 == 0) goto L_0x002a
            boolean r8 = r1.mo72448b()
            if (r8 == 0) goto L_0x0120
            r1.mo72450d()
        L_0x0120:
            r1 = r12
            goto L_0x002a
        L_0x0123:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "The number of released permits cannot be greater than "
            java.lang.String r0 = kotlin.jvm.internal.C19383o.m32802l(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.C19817e.release():void");
    }
}
