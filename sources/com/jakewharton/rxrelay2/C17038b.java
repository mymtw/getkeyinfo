package com.jakewharton.rxrelay2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p287xp.C8340h;

/* renamed from: com.jakewharton.rxrelay2.b */
public final class C17038b<T> extends C17040c<T> {

    /* renamed from: g */
    public static final Object[] f37399g = new Object[0];

    /* renamed from: h */
    public static final C17039a[] f37400h = new C17039a[0];

    /* renamed from: b */
    public final AtomicReference<T> f37401b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<C17039a<T>[]> f37402c = new AtomicReference<>(f37400h);

    /* renamed from: d */
    public final Lock f37403d;

    /* renamed from: e */
    public final Lock f37404e;

    /* renamed from: f */
    public long f37405f;

    /* renamed from: com.jakewharton.rxrelay2.b$a */
    public static final class C17039a<T> implements Disposable, C8340h {

        /* renamed from: b */
        public final Observer<? super T> f37406b;

        /* renamed from: c */
        public final C17038b<T> f37407c;

        /* renamed from: d */
        public boolean f37408d;

        /* renamed from: e */
        public boolean f37409e;

        /* renamed from: f */
        public C17037a<T> f37410f;

        /* renamed from: g */
        public boolean f37411g;

        /* renamed from: h */
        public volatile boolean f37412h;

        /* renamed from: i */
        public long f37413i;

        public C17039a(Observer<? super T> observer, C17038b<T> bVar) {
            this.f37406b = observer;
            this.f37407c = bVar;
        }

        public final void dispose() {
            if (!this.f37412h) {
                this.f37412h = true;
                this.f37407c.mo60300l(this);
            }
        }

        public final boolean isDisposed() {
            return this.f37412h;
        }

        public final boolean test(T t) {
            if (this.f37412h) {
                return false;
            }
            this.f37406b.onNext(t);
            return false;
        }
    }

    public C17038b() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f37403d = reentrantReadWriteLock.readLock();
        this.f37404e = reentrantReadWriteLock.writeLock();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(T r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x007a
            java.util.concurrent.locks.Lock r0 = r9.f37404e
            r0.lock()
            long r0 = r9.f37405f
            r2 = 1
            long r0 = r0 + r2
            r9.f37405f = r0
            java.util.concurrent.atomic.AtomicReference<T> r0 = r9.f37401b
            r0.lazySet(r10)
            java.util.concurrent.locks.Lock r0 = r9.f37404e
            r0.unlock()
            java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.b$a<T>[]> r0 = r9.f37402c
            java.lang.Object r0 = r0.get()
            com.jakewharton.rxrelay2.b$a[] r0 = (com.jakewharton.rxrelay2.C17038b.C17039a[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0023:
            if (r3 >= r1) goto L_0x0079
            r4 = r0[r3]
            long r5 = r9.f37405f
            boolean r7 = r4.f37412h
            if (r7 == 0) goto L_0x002e
            goto L_0x0076
        L_0x002e:
            boolean r7 = r4.f37411g
            if (r7 != 0) goto L_0x0073
            monitor-enter(r4)
            boolean r7 = r4.f37412h     // Catch:{ all -> 0x0070 }
            if (r7 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0039:
            long r7 = r4.f37413i     // Catch:{ all -> 0x0070 }
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0041
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0041:
            boolean r5 = r4.f37409e     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0069
            com.jakewharton.rxrelay2.a<T> r5 = r4.f37410f     // Catch:{ all -> 0x0070 }
            r6 = 4
            if (r5 != 0) goto L_0x0051
            com.jakewharton.rxrelay2.a r5 = new com.jakewharton.rxrelay2.a     // Catch:{ all -> 0x0070 }
            r5.<init>()     // Catch:{ all -> 0x0070 }
            r4.f37410f = r5     // Catch:{ all -> 0x0070 }
        L_0x0051:
            int r7 = r5.f37398c     // Catch:{ all -> 0x0070 }
            if (r7 != r6) goto L_0x005f
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0070 }
            java.lang.Object[] r8 = r5.f37397b     // Catch:{ all -> 0x0070 }
            r8[r6] = r7     // Catch:{ all -> 0x0070 }
            r5.f37397b = r7     // Catch:{ all -> 0x0070 }
            r7 = r2
        L_0x005f:
            java.lang.Object[] r6 = r5.f37397b     // Catch:{ all -> 0x0070 }
            r6[r7] = r10     // Catch:{ all -> 0x0070 }
            int r7 = r7 + 1
            r5.f37398c = r7     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            goto L_0x0076
        L_0x0069:
            r5 = 1
            r4.f37408d = r5     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            r4.f37411g = r5
            goto L_0x0073
        L_0x0070:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0070 }
            throw r10
        L_0x0073:
            r4.test(r10)
        L_0x0076:
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0079:
            return
        L_0x007a:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "value == null"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay2.C17038b.accept(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        r0.test(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (r0.f37412h == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r9 = r0.f37410f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r9 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        r0.f37409e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007b, code lost:
        r0.f37410f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007e, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007f, code lost:
        r9 = r9.f37396a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        if (r9 == null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0085, code lost:
        if (r2 >= 4) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0087, code lost:
        r4 = r9[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0089, code lost:
        if (r4 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        r0.test(r4);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0092, code lost:
        r9 = r9[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20638h(p145io.reactivex.Observer<? super T> r9) {
        /*
            r8 = this;
            com.jakewharton.rxrelay2.b$a r0 = new com.jakewharton.rxrelay2.b$a
            r0.<init>(r9, r8)
            r9.onSubscribe(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.b$a<T>[]> r9 = r8.f37402c
            java.lang.Object r9 = r9.get()
            com.jakewharton.rxrelay2.b$a[] r9 = (com.jakewharton.rxrelay2.C17038b.C17039a[]) r9
            int r1 = r9.length
            int r2 = r1 + 1
            com.jakewharton.rxrelay2.b$a[] r2 = new com.jakewharton.rxrelay2.C17038b.C17039a[r2]
            r3 = 0
            java.lang.System.arraycopy(r9, r3, r2, r3, r1)
            r2[r1] = r0
            java.util.concurrent.atomic.AtomicReference<com.jakewharton.rxrelay2.b$a<T>[]> r1 = r8.f37402c
        L_0x001d:
            boolean r4 = r1.compareAndSet(r9, r2)
            r5 = 1
            if (r4 == 0) goto L_0x0026
            r9 = r5
            goto L_0x002d
        L_0x0026:
            java.lang.Object r4 = r1.get()
            if (r4 == r9) goto L_0x001d
            r9 = r3
        L_0x002d:
            if (r9 == 0) goto L_0x0008
            boolean r9 = r0.f37412h
            if (r9 == 0) goto L_0x0038
            r8.mo60300l(r0)
            goto L_0x009a
        L_0x0038:
            boolean r9 = r0.f37412h
            if (r9 == 0) goto L_0x003d
            goto L_0x009a
        L_0x003d:
            monitor-enter(r0)
            boolean r9 = r0.f37412h     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            goto L_0x009a
        L_0x0044:
            boolean r9 = r0.f37408d     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x004a
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            goto L_0x009a
        L_0x004a:
            com.jakewharton.rxrelay2.b<T> r9 = r0.f37407c     // Catch:{ all -> 0x009b }
            java.util.concurrent.locks.Lock r1 = r9.f37403d     // Catch:{ all -> 0x009b }
            r1.lock()     // Catch:{ all -> 0x009b }
            long r6 = r9.f37405f     // Catch:{ all -> 0x009b }
            r0.f37413i = r6     // Catch:{ all -> 0x009b }
            java.util.concurrent.atomic.AtomicReference<T> r9 = r9.f37401b     // Catch:{ all -> 0x009b }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x009b }
            r1.unlock()     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x0062
            r1 = r5
            goto L_0x0063
        L_0x0062:
            r1 = r3
        L_0x0063:
            r0.f37409e = r1     // Catch:{ all -> 0x009b }
            r0.f37408d = r5     // Catch:{ all -> 0x009b }
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            if (r9 == 0) goto L_0x009a
            r0.test(r9)
        L_0x006d:
            boolean r9 = r0.f37412h
            if (r9 == 0) goto L_0x0072
            goto L_0x009a
        L_0x0072:
            monitor-enter(r0)
            com.jakewharton.rxrelay2.a<T> r9 = r0.f37410f     // Catch:{ all -> 0x0097 }
            if (r9 != 0) goto L_0x007b
            r0.f37409e = r3     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            goto L_0x009a
        L_0x007b:
            r1 = 0
            r0.f37410f = r1     // Catch:{ all -> 0x0097 }
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            java.lang.Object[] r9 = r9.f37396a
            r1 = 4
        L_0x0082:
            if (r9 == 0) goto L_0x006d
            r2 = r3
        L_0x0085:
            if (r2 >= r1) goto L_0x0092
            r4 = r9[r2]
            if (r4 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            r0.test(r4)
            int r2 = r2 + 1
            goto L_0x0085
        L_0x0092:
            r9 = r9[r1]
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            goto L_0x0082
        L_0x0097:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0097 }
            throw r9
        L_0x009a:
            return
        L_0x009b:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009b }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jakewharton.rxrelay2.C17038b.mo20638h(io.reactivex.Observer):void");
    }

    /* renamed from: l */
    public final void mo60300l(C17039a<T> aVar) {
        boolean z;
        C17039a[] aVarArr;
        do {
            C17039a<T>[] aVarArr2 = (C17039a[]) this.f37402c.get();
            int length = aVarArr2.length;
            if (length != 0) {
                int i = -1;
                z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr2[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr = f37400h;
                    } else {
                        C17039a[] aVarArr3 = new C17039a[(length - 1)];
                        System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr = aVarArr3;
                    }
                    AtomicReference<C17039a<T>[]> atomicReference = this.f37402c;
                    while (true) {
                        if (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                            if (atomicReference.get() != aVarArr2) {
                                continue;
                                break;
                            }
                        } else {
                            z = true;
                            continue;
                            break;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!z);
    }
}
