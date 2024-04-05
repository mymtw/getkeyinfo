package p145io.reactivex.observers;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.disposables.DisposableHelper;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.observers.d */
public final class C19249d<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final Observer<? super T> f43042b;

    /* renamed from: c */
    public Disposable f43043c;

    /* renamed from: d */
    public boolean f43044d;

    /* renamed from: e */
    public C19237a<Object> f43045e;

    /* renamed from: f */
    public volatile boolean f43046f;

    public C19249d(Observer<? super T> observer) {
        this.f43042b = observer;
    }

    public final void dispose() {
        this.f43043c.dispose();
    }

    public final boolean isDisposed() {
        return this.f43043c.isDisposed();
    }

    public final void onComplete() {
        if (!this.f43046f) {
            synchronized (this) {
                if (!this.f43046f) {
                    if (this.f43044d) {
                        C19237a<Object> aVar = this.f43045e;
                        if (aVar == null) {
                            aVar = new C19237a<>();
                            this.f43045e = aVar;
                        }
                        aVar.mo71359b(NotificationLite.complete());
                        return;
                    }
                    this.f43046f = true;
                    this.f43044d = true;
                    this.f43042b.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        if (r1 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        p736cq.C18981a.m32123b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r3.f43042b.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f43046f
            if (r0 == 0) goto L_0x0008
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f43046f     // Catch:{ all -> 0x002b }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            goto L_0x0032
        L_0x0010:
            boolean r0 = r3.f43044d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            r3.f43046f = r1     // Catch:{ all -> 0x002b }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r3.f43045e     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r3.f43045e = r0     // Catch:{ all -> 0x002b }
        L_0x0021:
            java.lang.Object r4 = p145io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x002b }
            java.lang.Object[] r0 = r0.f43033a     // Catch:{ all -> 0x002b }
            r0[r2] = r4     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            goto L_0x003f
        L_0x002d:
            r3.f43046f = r1     // Catch:{ all -> 0x002b }
            r3.f43044d = r1     // Catch:{ all -> 0x002b }
            r1 = r2
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0039
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0039:
            io.reactivex.Observer<? super T> r0 = r3.f43042b
            r0.onError(r4)
            return
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.observers.C19249d.onError(java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r6.f43042b.onNext(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = r6.f43045e;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r7 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        r6.f43044d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r6.f43045e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        r2 = r6.f43042b;
        r7 = r7.f43033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0052, code lost:
        if (r7 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0055, code lost:
        if (r4 >= 4) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0057, code lost:
        r5 = r7[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0059, code lost:
        if (r5 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0060, code lost:
        if (p145io.reactivex.internal.util.NotificationLite.acceptFull((java.lang.Object) r5, r2) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r7 = r7[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        if (r1 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f43046f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r7 != 0) goto L_0x0017
            io.reactivex.disposables.Disposable r7 = r6.f43043c
            r7.dispose()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.onError(r7)
            return
        L_0x0017:
            monitor-enter(r6)
            boolean r0 = r6.f43046f     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return
        L_0x001e:
            boolean r0 = r6.f43044d     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0036
            io.reactivex.internal.util.a<java.lang.Object> r0 = r6.f43045e     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x002d
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0072 }
            r0.<init>()     // Catch:{ all -> 0x0072 }
            r6.f43045e = r0     // Catch:{ all -> 0x0072 }
        L_0x002d:
            java.lang.Object r7 = p145io.reactivex.internal.util.NotificationLite.next(r7)     // Catch:{ all -> 0x0072 }
            r0.mo71359b(r7)     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            return
        L_0x0036:
            r0 = 1
            r6.f43044d = r0     // Catch:{ all -> 0x0072 }
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            io.reactivex.Observer<? super T> r1 = r6.f43042b
            r1.onNext(r7)
        L_0x003f:
            monitor-enter(r6)
            io.reactivex.internal.util.a<java.lang.Object> r7 = r6.f43045e     // Catch:{ all -> 0x006f }
            r1 = 0
            if (r7 != 0) goto L_0x0049
            r6.f43044d = r1     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x006e
        L_0x0049:
            r2 = 0
            r6.f43045e = r2     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            io.reactivex.Observer<? super T> r2 = r6.f43042b
            java.lang.Object[] r7 = r7.f43033a
            r3 = 4
        L_0x0052:
            if (r7 == 0) goto L_0x006c
            r4 = r1
        L_0x0055:
            if (r4 >= r3) goto L_0x0067
            r5 = r7[r4]
            if (r5 != 0) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            boolean r5 = p145io.reactivex.internal.util.NotificationLite.acceptFull((java.lang.Object) r5, r2)
            if (r5 == 0) goto L_0x0064
            r1 = r0
            goto L_0x006c
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0055
        L_0x0067:
            r7 = r7[r3]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L_0x0052
        L_0x006c:
            if (r1 == 0) goto L_0x003f
        L_0x006e:
            return
        L_0x006f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            throw r7
        L_0x0072:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0072 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.observers.C19249d.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f43043c, disposable)) {
            this.f43043c = disposable;
            this.f43042b.onSubscribe(this);
        }
    }
}
