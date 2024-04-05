package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C19726k<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43673e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f43674f;

    /* renamed from: g */
    public static final C19736t f43675g = new C19736t("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f43676a;

    /* renamed from: b */
    public final boolean f43677b;

    /* renamed from: c */
    public final int f43678c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f43679d;

    /* renamed from: kotlinx.coroutines.internal.k$a */
    public static final class C19727a {

        /* renamed from: a */
        public final int f43680a;

        public C19727a(int i) {
            this.f43680a = i;
        }
    }

    static {
        Class<C19726k> cls = C19726k.class;
        f43673e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f43674f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C19726k(int i, boolean z) {
        this.f43676a = i;
        this.f43677b = z;
        int i2 = i - 1;
        this.f43678c = i2;
        this.f43679d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final int mo72466a(E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f43678c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f43677b || this.f43679d.get(i2 & i3) == null) {
                if (f43674f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f43679d.set(i2 & i3, e);
                    C19726k kVar = this;
                    while ((kVar._state & 1152921504606846976L) != 0) {
                        kVar = kVar.mo72470e();
                        Object obj = kVar.f43679d.get(kVar.f43678c & i2);
                        if (!(obj instanceof C19727a) || ((C19727a) obj).f43680a != i2) {
                            kVar = null;
                            continue;
                        } else {
                            kVar.f43679d.set(kVar.f43678c & i2, e);
                            continue;
                        }
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f43676a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo72467b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f43674f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int mo72468c() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: d */
    public final boolean mo72469d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:3: B:16:0x0067->B:19:0x0072, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.internal.C19726k<E> mo72470e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f43674f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C19726k) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f43673e
            r1 = 0
            kotlinx.coroutines.internal.k r4 = new kotlinx.coroutines.internal.k
            int r5 = r10.f43676a
            int r5 = r5 * 2
            boolean r6 = r10.f43677b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
        L_0x0040:
            int r7 = r10.f43678c
            r8 = r5 & r7
            r7 = r7 & r6
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f43679d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            kotlinx.coroutines.internal.k$a r7 = new kotlinx.coroutines.internal.k$a
            r7.<init>(r5)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f43679d
            int r9 = r4.f43678c
            r9 = r9 & r5
            r8.set(r9, r7)
            int r5 = r5 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
        L_0x0067:
            boolean r5 = r0.compareAndSet(r10, r1, r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r5 = r0.get(r10)
            if (r5 == 0) goto L_0x0067
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C19726k.mo72470e():kotlinx.coroutines.internal.k");
    }

    /* renamed from: f */
    public final Object mo72471f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f43675g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f43678c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f43679d.get(i4);
            if (obj == null) {
                if (this.f43677b) {
                    return null;
                }
            } else if (obj instanceof C19727a) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f43674f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f43679d.set(this.f43678c & i, (Object) null);
                    return obj2;
                } else if (this.f43677b) {
                    C19726k kVar = this;
                    while (true) {
                        long j3 = kVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            kVar = kVar.mo72470e();
                        } else {
                            if (f43674f.compareAndSet(kVar, j3, (j3 & -1073741824) | j2)) {
                                kVar.f43679d.set(kVar.f43678c & i5, (Object) null);
                                kVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
