package p145io.reactivex.subjects;

import p145io.reactivex.Observer;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.subjects.b */
public final class C19256b<T> extends C19257c<T> implements C19237a.C19238a<Object> {

    /* renamed from: b */
    public final C19257c<T> f43115b;

    /* renamed from: c */
    public boolean f43116c;

    /* renamed from: d */
    public C19237a<Object> f43117d;

    /* renamed from: e */
    public volatile boolean f43118e;

    public C19256b(PublishSubject publishSubject) {
        this.f43115b = publishSubject;
    }

    /* renamed from: h */
    public final void mo20638h(Observer<? super T> observer) {
        this.f43115b.subscribe(observer);
    }

    public final void onComplete() {
        if (!this.f43118e) {
            synchronized (this) {
                if (!this.f43118e) {
                    this.f43118e = true;
                    if (this.f43116c) {
                        C19237a<Object> aVar = this.f43117d;
                        if (aVar == null) {
                            aVar = new C19237a<>();
                            this.f43117d = aVar;
                        }
                        aVar.mo71359b(NotificationLite.complete());
                        return;
                    }
                    this.f43116c = true;
                    this.f43115b.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0033, code lost:
        p736cq.C18981a.m32123b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r3.f43115b.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f43118e
            if (r0 == 0) goto L_0x0008
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f43118e     // Catch:{ all -> 0x002b }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            r3.f43118e = r1     // Catch:{ all -> 0x002b }
            boolean r0 = r3.f43116c     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            io.reactivex.internal.util.a<java.lang.Object> r0 = r3.f43117d     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r3.f43117d = r0     // Catch:{ all -> 0x002b }
        L_0x0021:
            java.lang.Object r4 = p145io.reactivex.internal.util.NotificationLite.error(r4)     // Catch:{ all -> 0x002b }
            java.lang.Object[] r0 = r0.f43033a     // Catch:{ all -> 0x002b }
            r0[r2] = r4     // Catch:{ all -> 0x002b }
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            goto L_0x003d
        L_0x002d:
            r3.f43116c = r1     // Catch:{ all -> 0x002b }
            r1 = r2
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0037
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0037:
            io.reactivex.subjects.c<T> r0 = r3.f43115b
            r0.onError(r4)
            return
        L_0x003d:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subjects.C19256b.onError(java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r1.f43115b.onNext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = r1.f43117d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r1.f43116c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        r1.f43117d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        r2.mo71360c(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r2) {
        /*
            r1 = this;
            boolean r0 = r1.f43118e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            boolean r0 = r1.f43118e     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            return
        L_0x000c:
            boolean r0 = r1.f43116c     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0024
            io.reactivex.internal.util.a<java.lang.Object> r0 = r1.f43117d     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x001b
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            r1.f43117d = r0     // Catch:{ all -> 0x0042 }
        L_0x001b:
            java.lang.Object r2 = p145io.reactivex.internal.util.NotificationLite.next(r2)     // Catch:{ all -> 0x0042 }
            r0.mo71359b(r2)     // Catch:{ all -> 0x0042 }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            return
        L_0x0024:
            r0 = 1
            r1.f43116c = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            io.reactivex.subjects.c<T> r0 = r1.f43115b
            r0.onNext(r2)
        L_0x002d:
            monitor-enter(r1)
            io.reactivex.internal.util.a<java.lang.Object> r2 = r1.f43117d     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0037
            r2 = 0
            r1.f43116c = r2     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            return
        L_0x0037:
            r0 = 0
            r1.f43117d = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            r2.mo71360c(r1)
            goto L_0x002d
        L_0x003f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0042:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subjects.C19256b.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(Disposable disposable) {
        C19237a<Object> aVar;
        boolean z = true;
        if (!this.f43118e) {
            synchronized (this) {
                if (!this.f43118e) {
                    if (this.f43116c) {
                        C19237a<Object> aVar2 = this.f43117d;
                        if (aVar2 == null) {
                            aVar2 = new C19237a<>();
                            this.f43117d = aVar2;
                        }
                        aVar2.mo71359b(NotificationLite.disposable(disposable));
                        return;
                    }
                    this.f43116c = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.dispose();
            return;
        }
        this.f43115b.onSubscribe(disposable);
        while (true) {
            synchronized (this) {
                aVar = this.f43117d;
                if (aVar == null) {
                    this.f43116c = false;
                    return;
                }
                this.f43117d = null;
            }
            aVar.mo71360c(this);
        }
        while (true) {
        }
    }

    public final boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f43115b);
    }
}
