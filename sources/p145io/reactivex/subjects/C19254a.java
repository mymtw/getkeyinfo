package p145io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.ExceptionHelper;
import p145io.reactivex.internal.util.NotificationLite;
import p736cq.C18981a;

/* renamed from: io.reactivex.subjects.a */
public final class C19254a<T> extends C19257c<T> {

    /* renamed from: h */
    public static final Object[] f43098h = new Object[0];

    /* renamed from: i */
    public static final C19255a[] f43099i = new C19255a[0];

    /* renamed from: j */
    public static final C19255a[] f43100j = new C19255a[0];

    /* renamed from: b */
    public final AtomicReference<Object> f43101b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<C19255a<T>[]> f43102c = new AtomicReference<>(f43099i);

    /* renamed from: d */
    public final Lock f43103d;

    /* renamed from: e */
    public final Lock f43104e;

    /* renamed from: f */
    public final AtomicReference<Throwable> f43105f = new AtomicReference<>();

    /* renamed from: g */
    public long f43106g;

    /* renamed from: io.reactivex.subjects.a$a */
    public static final class C19255a<T> implements Disposable, C19237a.C19238a<Object> {

        /* renamed from: b */
        public final Observer<? super T> f43107b;

        /* renamed from: c */
        public final C19254a<T> f43108c;

        /* renamed from: d */
        public boolean f43109d;

        /* renamed from: e */
        public boolean f43110e;

        /* renamed from: f */
        public C19237a<Object> f43111f;

        /* renamed from: g */
        public boolean f43112g;

        /* renamed from: h */
        public volatile boolean f43113h;

        /* renamed from: i */
        public long f43114i;

        public C19255a(Observer<? super T> observer, C19254a<T> aVar) {
            this.f43107b = observer;
            this.f43108c = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
            r2.f43112g = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo71422a(java.lang.Object r3, long r4) {
            /*
                r2 = this;
                boolean r0 = r2.f43113h
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r2.f43112g
                if (r0 != 0) goto L_0x0036
                monitor-enter(r2)
                boolean r0 = r2.f43113h     // Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x0010:
                long r0 = r2.f43114i     // Catch:{ all -> 0x0033 }
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L_0x0018
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x0018:
                boolean r4 = r2.f43110e     // Catch:{ all -> 0x0033 }
                if (r4 == 0) goto L_0x002c
                io.reactivex.internal.util.a<java.lang.Object> r4 = r2.f43111f     // Catch:{ all -> 0x0033 }
                if (r4 != 0) goto L_0x0027
                io.reactivex.internal.util.a r4 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0033 }
                r4.<init>()     // Catch:{ all -> 0x0033 }
                r2.f43111f = r4     // Catch:{ all -> 0x0033 }
            L_0x0027:
                r4.mo71359b(r3)     // Catch:{ all -> 0x0033 }
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x002c:
                r4 = 1
                r2.f43109d = r4     // Catch:{ all -> 0x0033 }
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                r2.f43112g = r4
                goto L_0x0036
            L_0x0033:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                throw r3
            L_0x0036:
                r2.test(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subjects.C19254a.C19255a.mo71422a(java.lang.Object, long):void");
        }

        public final void dispose() {
            if (!this.f43113h) {
                this.f43113h = true;
                this.f43108c.mo71421n(this);
            }
        }

        public final boolean isDisposed() {
            return this.f43113h;
        }

        public final boolean test(Object obj) {
            return this.f43113h || NotificationLite.accept(obj, this.f43107b);
        }
    }

    public C19254a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f43103d = reentrantReadWriteLock.readLock();
        this.f43104e = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: l */
    public static <T> C19254a<T> m32516l(T t) {
        C19254a<T> aVar = new C19254a<>();
        AtomicReference<Object> atomicReference = aVar.f43101b;
        if (t != null) {
            atomicReference.lazySet(t);
            return aVar;
        }
        throw new NullPointerException("defaultValue is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        if (r0.test(r8) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (r0.f43113h == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0080, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8 = r0.f43111f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (r8 != null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0085, code lost:
        r0.f43110e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
        r0.f43111f = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008c, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        r8.mo71360c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20638h(p145io.reactivex.Observer<? super T> r8) {
        /*
            r7 = this;
            io.reactivex.subjects.a$a r0 = new io.reactivex.subjects.a$a
            r0.<init>(r8, r7)
            r8.onSubscribe(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.a$a<T>[]> r1 = r7.f43102c
            java.lang.Object r1 = r1.get()
            io.reactivex.subjects.a$a[] r1 = (p145io.reactivex.subjects.C19254a.C19255a[]) r1
            io.reactivex.subjects.a$a[] r2 = f43100j
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0018
            r1 = r3
            goto L_0x0036
        L_0x0018:
            int r2 = r1.length
            int r5 = r2 + 1
            io.reactivex.subjects.a$a[] r5 = new p145io.reactivex.subjects.C19254a.C19255a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.a$a<T>[]> r2 = r7.f43102c
        L_0x0024:
            boolean r6 = r2.compareAndSet(r1, r5)
            if (r6 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0033
        L_0x002c:
            java.lang.Object r6 = r2.get()
            if (r6 == r1) goto L_0x0024
            r1 = r3
        L_0x0033:
            if (r1 == 0) goto L_0x0008
            r1 = r4
        L_0x0036:
            if (r1 == 0) goto L_0x0097
            boolean r8 = r0.f43113h
            if (r8 == 0) goto L_0x0041
            r7.mo71421n(r0)
            goto L_0x00aa
        L_0x0041:
            boolean r8 = r0.f43113h
            if (r8 == 0) goto L_0x0047
            goto L_0x00aa
        L_0x0047:
            monitor-enter(r0)
            boolean r8 = r0.f43113h     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x004e
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x00aa
        L_0x004e:
            boolean r8 = r0.f43109d     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0054
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x00aa
        L_0x0054:
            io.reactivex.subjects.a<T> r8 = r0.f43108c     // Catch:{ all -> 0x0094 }
            java.util.concurrent.locks.Lock r1 = r8.f43103d     // Catch:{ all -> 0x0094 }
            r1.lock()     // Catch:{ all -> 0x0094 }
            long r5 = r8.f43106g     // Catch:{ all -> 0x0094 }
            r0.f43114i = r5     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r8 = r8.f43101b     // Catch:{ all -> 0x0094 }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x0094 }
            r1.unlock()     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x006c
            r1 = r4
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            r0.f43110e = r1     // Catch:{ all -> 0x0094 }
            r0.f43109d = r4     // Catch:{ all -> 0x0094 }
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x00aa
            boolean r8 = r0.test(r8)
            if (r8 == 0) goto L_0x007b
            goto L_0x00aa
        L_0x007b:
            boolean r8 = r0.f43113h
            if (r8 == 0) goto L_0x0080
            goto L_0x00aa
        L_0x0080:
            monitor-enter(r0)
            io.reactivex.internal.util.a<java.lang.Object> r8 = r0.f43111f     // Catch:{ all -> 0x0091 }
            if (r8 != 0) goto L_0x0089
            r0.f43110e = r3     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x00aa
        L_0x0089:
            r1 = 0
            r0.f43111f = r1     // Catch:{ all -> 0x0091 }
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            r8.mo71360c(r0)
            goto L_0x007b
        L_0x0091:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r8
        L_0x0094:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r8
        L_0x0097:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.f43105f
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = p145io.reactivex.internal.util.ExceptionHelper.f43031a
            if (r0 != r1) goto L_0x00a7
            r8.onComplete()
            goto L_0x00aa
        L_0x00a7:
            r8.onError(r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subjects.C19254a.mo20638h(io.reactivex.Observer):void");
    }

    /* renamed from: m */
    public final T mo71420m() {
        Object obj = this.f43101b.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return NotificationLite.getValue(obj);
    }

    /* renamed from: n */
    public final void mo71421n(C19255a<T> aVar) {
        boolean z;
        C19255a[] aVarArr;
        do {
            C19255a<T>[] aVarArr2 = (C19255a[]) this.f43102c.get();
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
                        aVarArr = f43099i;
                    } else {
                        C19255a[] aVarArr3 = new C19255a[(length - 1)];
                        System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr = aVarArr3;
                    }
                    AtomicReference<C19255a<T>[]> atomicReference = this.f43102c;
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

    public final void onComplete() {
        int i;
        boolean z;
        AtomicReference<Throwable> atomicReference = this.f43105f;
        Throwable th = ExceptionHelper.f43031a;
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, th)) {
                if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            Object complete = NotificationLite.complete();
            AtomicReference<C19255a<T>[]> atomicReference2 = this.f43102c;
            C19255a[] aVarArr = f43100j;
            C19255a[] aVarArr2 = (C19255a[]) atomicReference2.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                this.f43104e.lock();
                this.f43106g++;
                this.f43101b.lazySet(complete);
                this.f43104e.unlock();
            }
            for (C19255a a : aVarArr2) {
                a.mo71422a(complete, this.f43106g);
            }
        }
    }

    public final void onError(Throwable th) {
        int i;
        boolean z;
        if (th != null) {
            AtomicReference<Throwable> atomicReference = this.f43105f;
            while (true) {
                if (!atomicReference.compareAndSet((Object) null, th)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                C18981a.m32123b(th);
                return;
            }
            Object error = NotificationLite.error(th);
            AtomicReference<C19255a<T>[]> atomicReference2 = this.f43102c;
            C19255a[] aVarArr = f43100j;
            C19255a[] aVarArr2 = (C19255a[]) atomicReference2.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                this.f43104e.lock();
                this.f43106g++;
                this.f43101b.lazySet(error);
                this.f43104e.unlock();
            }
            for (C19255a a : aVarArr2) {
                a.mo71422a(error, this.f43106g);
            }
            return;
        }
        throw new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
    }

    public final void onNext(T t) {
        if (t == null) {
            throw new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (this.f43105f.get() == null) {
            Object next = NotificationLite.next(t);
            this.f43104e.lock();
            this.f43106g++;
            this.f43101b.lazySet(next);
            this.f43104e.unlock();
            for (C19255a a : (C19255a[]) this.f43102c.get()) {
                a.mo71422a(next, this.f43106g);
            }
        }
    }

    public final void onSubscribe(Disposable disposable) {
        if (this.f43105f.get() != null) {
            disposable.dispose();
        }
    }
}
