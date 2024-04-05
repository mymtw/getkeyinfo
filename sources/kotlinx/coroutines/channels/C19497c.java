package kotlinx.coroutines.channels;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.channels.c */
public final class C19497c<E> extends AbstractChannel<E> {

    /* renamed from: e */
    public final int f43439e;

    /* renamed from: f */
    public final BufferOverflow f43440f;

    /* renamed from: g */
    public final ReentrantLock f43441g;

    /* renamed from: h */
    public Object[] f43442h;

    /* renamed from: i */
    public int f43443i;
    private volatile /* synthetic */ int size;

    /* renamed from: kotlinx.coroutines.channels.c$a */
    public /* synthetic */ class C19498a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43444a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            f43444a = iArr;
        }
    }

    public C19497c(int i, BufferOverflow bufferOverflow, C19857l<? super E, C19394m> lVar) {
        super(lVar);
        this.f43439e = i;
        this.f43440f = bufferOverflow;
        if (i < 1 ? false : true) {
            this.f43441g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C19318k.m32610b1(objArr, C17782b.f38643n);
            this.f43442h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(C0069a.m175f("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: A */
    public final void mo72127A(boolean z) {
        C19857l<E, C19394m> lVar = this.f43435b;
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                Object obj = this.f43442h[this.f43443i];
                if (!(lVar == null || obj == C17782b.f38643n)) {
                    undeliveredElementException = OnUndeliveredElementKt.m33527b(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.f43442h;
                int i3 = this.f43443i;
                objArr[i3] = C17782b.f38643n;
                this.f43443i = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            super.mo72127A(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: H */
    public final Object mo72131H() {
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object f = mo72193f();
                if (f == null) {
                    f = C17782b.f38646q;
                }
                return f;
            }
            Object[] objArr = this.f43442h;
            int i2 = this.f43443i;
            Object obj = objArr[i2];
            C19518t tVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C17782b.f38646q;
            boolean z = false;
            if (i == this.f43439e) {
                C19518t tVar2 = null;
                while (true) {
                    C19518t n = mo72200n();
                    if (n == null) {
                        tVar = tVar2;
                        break;
                    } else if (n.mo72206I((LockFreeLinkedListNode.C19714c) null) != null) {
                        obj2 = n.mo72204G();
                        z = true;
                        tVar = n;
                        break;
                    } else {
                        n.mo72218K();
                        tVar2 = n;
                    }
                }
            }
            if (obj2 != C17782b.f38646q && !(obj2 instanceof C19509k)) {
                this.size = i;
                Object[] objArr2 = this.f43442h;
                objArr2[(this.f43443i + i) % objArr2.length] = obj2;
            }
            this.f43443i = (this.f43443i + 1) % this.f43442h.length;
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            if (z) {
                C19383o.m32794d(tVar);
                tVar.mo72203F();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r7 != kotlinx.coroutines.selects.C19806g.f43791b) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r8.size = r1;
        r8.f43442h[r8.f43443i] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if ((r7 instanceof kotlinx.coroutines.channels.C19509k) == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        r3 = true;
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.C19383o.m32802l(r7, "performAtomicTrySelect(describeTryOffer) returned ").toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo72132I(kotlinx.coroutines.selects.C19805f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f43441g
            r0.lock()
            int r1 = r8.size     // Catch:{ all -> 0x00b7 }
            if (r1 != 0) goto L_0x0015
            kotlinx.coroutines.channels.k r9 = r8.mo72193f()     // Catch:{ all -> 0x00b7 }
            if (r9 != 0) goto L_0x0011
            kotlinx.coroutines.internal.t r9 = p568fn.C17782b.f38646q     // Catch:{ all -> 0x00b7 }
        L_0x0011:
            r0.unlock()
            return r9
        L_0x0015:
            java.lang.Object[] r2 = r8.f43442h     // Catch:{ all -> 0x00b7 }
            int r3 = r8.f43443i     // Catch:{ all -> 0x00b7 }
            r4 = r2[r3]     // Catch:{ all -> 0x00b7 }
            r5 = 0
            r2[r3] = r5     // Catch:{ all -> 0x00b7 }
            int r2 = r1 + -1
            r8.size = r2     // Catch:{ all -> 0x00b7 }
            kotlinx.coroutines.internal.t r2 = p568fn.C17782b.f38646q     // Catch:{ all -> 0x00b7 }
            int r3 = r8.f43439e     // Catch:{ all -> 0x00b7 }
            r6 = 1
            if (r1 != r3) goto L_0x0075
        L_0x0029:
            kotlinx.coroutines.channels.AbstractChannel$g r3 = new kotlinx.coroutines.channels.AbstractChannel$g     // Catch:{ all -> 0x00b7 }
            kotlinx.coroutines.internal.i r7 = r8.f43436c     // Catch:{ all -> 0x00b7 }
            r3.<init>(r7)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r9.mo72637o(r3)     // Catch:{ all -> 0x00b7 }
            if (r7 != 0) goto L_0x0043
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r3.mo72439m()     // Catch:{ all -> 0x00b7 }
            r2 = r5
            kotlinx.coroutines.channels.t r2 = (kotlinx.coroutines.channels.C19518t) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.mo72204G()     // Catch:{ all -> 0x00b7 }
            r3 = r6
            goto L_0x0076
        L_0x0043:
            kotlinx.coroutines.internal.t r3 = p568fn.C17782b.f38646q     // Catch:{ all -> 0x00b7 }
            if (r7 != r3) goto L_0x0048
            goto L_0x0075
        L_0x0048:
            kotlinx.coroutines.internal.t r3 = kotlinx.coroutines.C19543e0.f43497j     // Catch:{ all -> 0x00b7 }
            if (r7 != r3) goto L_0x004d
            goto L_0x0029
        L_0x004d:
            kotlinx.coroutines.internal.t r2 = kotlinx.coroutines.selects.C19806g.f43791b     // Catch:{ all -> 0x00b7 }
            if (r7 != r2) goto L_0x005d
            r8.size = r1     // Catch:{ all -> 0x00b7 }
            java.lang.Object[] r9 = r8.f43442h     // Catch:{ all -> 0x00b7 }
            int r1 = r8.f43443i     // Catch:{ all -> 0x00b7 }
            r9[r1] = r4     // Catch:{ all -> 0x00b7 }
            r0.unlock()
            return r7
        L_0x005d:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.C19509k     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0065
            r3 = r6
            r2 = r7
            r5 = r2
            goto L_0x0076
        L_0x0065:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r1 = kotlin.jvm.internal.C19383o.m32802l(r7, r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b7 }
            r9.<init>(r1)     // Catch:{ all -> 0x00b7 }
            throw r9     // Catch:{ all -> 0x00b7 }
        L_0x0075:
            r3 = 0
        L_0x0076:
            kotlinx.coroutines.internal.t r7 = p568fn.C17782b.f38646q     // Catch:{ all -> 0x00b7 }
            if (r2 == r7) goto L_0x008a
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.C19509k     // Catch:{ all -> 0x00b7 }
            if (r7 != 0) goto L_0x008a
            r8.size = r1     // Catch:{ all -> 0x00b7 }
            java.lang.Object[] r9 = r8.f43442h     // Catch:{ all -> 0x00b7 }
            int r7 = r8.f43443i     // Catch:{ all -> 0x00b7 }
            int r7 = r7 + r1
            int r1 = r9.length     // Catch:{ all -> 0x00b7 }
            int r7 = r7 % r1
            r9[r7] = r2     // Catch:{ all -> 0x00b7 }
            goto L_0x009e
        L_0x008a:
            boolean r9 = r9.mo72634k()     // Catch:{ all -> 0x00b7 }
            if (r9 != 0) goto L_0x009e
            r8.size = r1     // Catch:{ all -> 0x00b7 }
            java.lang.Object[] r9 = r8.f43442h     // Catch:{ all -> 0x00b7 }
            int r1 = r8.f43443i     // Catch:{ all -> 0x00b7 }
            r9[r1] = r4     // Catch:{ all -> 0x00b7 }
            kotlinx.coroutines.internal.t r9 = kotlinx.coroutines.selects.C19806g.f43791b     // Catch:{ all -> 0x00b7 }
            r0.unlock()
            return r9
        L_0x009e:
            int r9 = r8.f43443i     // Catch:{ all -> 0x00b7 }
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f43442h     // Catch:{ all -> 0x00b7 }
            int r1 = r1.length     // Catch:{ all -> 0x00b7 }
            int r9 = r9 % r1
            r8.f43443i = r9     // Catch:{ all -> 0x00b7 }
            kotlin.m r9 = kotlin.C19394m.f43287a     // Catch:{ all -> 0x00b7 }
            r0.unlock()
            if (r3 == 0) goto L_0x00b6
            kotlin.jvm.internal.C19383o.m32794d(r5)
            kotlinx.coroutines.channels.t r5 = (kotlinx.coroutines.channels.C19518t) r5
            r5.mo72203F()
        L_0x00b6:
            return r4
        L_0x00b7:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C19497c.mo72132I(kotlinx.coroutines.selects.f):java.lang.Object");
    }

    /* renamed from: K */
    public final void mo72207K(int i, E e) {
        int i2 = this.f43439e;
        if (i < i2) {
            Object[] objArr = this.f43442h;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr3 = this.f43442h;
                    objArr2[i3] = objArr3[(this.f43443i + i3) % objArr3.length];
                }
                Arrays.fill(objArr2, i, min, C17782b.f38643n);
                this.f43442h = objArr2;
                this.f43443i = 0;
            }
            Object[] objArr4 = this.f43442h;
            objArr4[(this.f43443i + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.f43442h;
        int i4 = this.f43443i;
        objArr5[i4 % objArr5.length] = null;
        objArr5[(i + i4) % objArr5.length] = e;
        this.f43443i = (i4 + 1) % objArr5.length;
    }

    /* renamed from: d */
    public final Object mo72191d(C19521v vVar) {
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            return super.mo72191d(vVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public final String mo72192e() {
        StringBuilder h = C0072d.m201h("(buffer:capacity=");
        h.append(this.f43439e);
        h.append(",size=");
        return C0073e.m208h(h, this.size, ')');
    }

    /* renamed from: h */
    public final boolean mo72195h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo72196i() {
        return this.size == this.f43439e && this.f43440f == BufferOverflow.SUSPEND;
    }

    public final boolean isEmpty() {
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            return mo72147z();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: j */
    public final Object mo72197j(E e) {
        C19516r m;
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            int i = this.size;
            C19509k<?> f = mo72193f();
            if (f == null) {
                C19736t tVar = null;
                if (i < this.f43439e) {
                    this.size = i + 1;
                } else {
                    int i2 = C19498a.f43444a[this.f43440f.ordinal()];
                    if (i2 == 1) {
                        tVar = C17782b.f38645p;
                    } else if (i2 == 2) {
                        tVar = C17782b.f38644o;
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (tVar == null) {
                    if (i == 0) {
                        do {
                            m = mo72137m();
                            if (m != null) {
                                if (m instanceof C19509k) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return m;
                                }
                            }
                        } while (m.mo72151a(e) == null);
                        this.size = i;
                        C19394m mVar = C19394m.f43287a;
                        reentrantLock.unlock();
                        m.mo72152g(e);
                        return m.mo72216b();
                    }
                    mo72207K(i, e);
                    C19736t tVar2 = C17782b.f38644o;
                    reentrantLock.unlock();
                    return tVar2;
                }
                reentrantLock.unlock();
                return tVar;
            }
            reentrantLock.unlock();
            return f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: s */
    public final boolean mo72141s(C19514p<? super E> pVar) {
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            return super.mo72141s(pVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: u */
    public final boolean mo72142u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo72143v() {
        return this.size == 0;
    }

    /* renamed from: x */
    public final boolean mo72145x() {
        ReentrantLock reentrantLock = this.f43441g;
        reentrantLock.lock();
        try {
            return super.mo72145x();
        } finally {
            reentrantLock.unlock();
        }
    }
}
