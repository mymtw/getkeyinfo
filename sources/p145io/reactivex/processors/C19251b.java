package p145io.reactivex.processors;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.NotificationLite;
import p762or.C20024c;

/* renamed from: io.reactivex.processors.b */
public final class C19251b<T> extends C19250a<T> {

    /* renamed from: c */
    public final C19250a<T> f43058c;

    /* renamed from: d */
    public boolean f43059d;

    /* renamed from: e */
    public C19237a<Object> f43060e;

    /* renamed from: f */
    public volatile boolean f43061f;

    public C19251b(UnicastProcessor unicastProcessor) {
        this.f43058c = unicastProcessor;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f43058c.subscribe(cVar);
    }

    public final void onComplete() {
        if (!this.f43061f) {
            synchronized (this) {
                if (!this.f43061f) {
                    this.f43061f = true;
                    if (this.f43059d) {
                        C19237a<Object> aVar = this.f43060e;
                        if (aVar == null) {
                            aVar = new C19237a<>();
                            this.f43060e = aVar;
                        }
                        aVar.mo71359b(NotificationLite.complete());
                        return;
                    }
                    this.f43059d = true;
                    this.f43058c.onComplete();
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
        r3.f43058c.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f43061f
            if (r0 == 0) goto L_0x0008
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f43061f     // Catch:{ all -> 0x002b }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            r3.f43061f = r1     // Catch:{ all -> 0x002b }
            boolean r0 = r3.f43059d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            io.reactivex.internal.util.a<java.lang.Object> r0 = r3.f43060e     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r3.f43060e = r0     // Catch:{ all -> 0x002b }
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
            r3.f43059d = r1     // Catch:{ all -> 0x002b }
            r1 = r2
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0037
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0037:
            io.reactivex.processors.a<T> r0 = r3.f43058c
            r0.onError(r4)
            return
        L_0x003d:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.processors.C19251b.onError(java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        r1.f43058c.onNext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = r1.f43060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0030, code lost:
        if (r2 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        r1.f43059d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        r1.f43060e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        r2.mo71358a(r1.f43058c);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r2) {
        /*
            r1 = this;
            boolean r0 = r1.f43061f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            boolean r0 = r1.f43061f     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            return
        L_0x000c:
            boolean r0 = r1.f43059d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0024
            io.reactivex.internal.util.a<java.lang.Object> r0 = r1.f43060e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x001b
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0044 }
            r0.<init>()     // Catch:{ all -> 0x0044 }
            r1.f43060e = r0     // Catch:{ all -> 0x0044 }
        L_0x001b:
            java.lang.Object r2 = p145io.reactivex.internal.util.NotificationLite.next(r2)     // Catch:{ all -> 0x0044 }
            r0.mo71359b(r2)     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            return
        L_0x0024:
            r0 = 1
            r1.f43059d = r0     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            io.reactivex.processors.a<T> r0 = r1.f43058c
            r0.onNext(r2)
        L_0x002d:
            monitor-enter(r1)
            io.reactivex.internal.util.a<java.lang.Object> r2 = r1.f43060e     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0037
            r2 = 0
            r1.f43059d = r2     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            return
        L_0x0037:
            r0 = 0
            r1.f43060e = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            io.reactivex.processors.a<T> r0 = r1.f43058c
            r2.mo71358a(r0)
            goto L_0x002d
        L_0x0041:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r2
        L_0x0044:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.processors.C19251b.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(Subscription subscription) {
        C19237a<Object> aVar;
        boolean z = true;
        if (!this.f43061f) {
            synchronized (this) {
                if (!this.f43061f) {
                    if (this.f43059d) {
                        C19237a<Object> aVar2 = this.f43060e;
                        if (aVar2 == null) {
                            aVar2 = new C19237a<>();
                            this.f43060e = aVar2;
                        }
                        aVar2.mo71359b(NotificationLite.subscription(subscription));
                        return;
                    }
                    this.f43059d = true;
                    z = false;
                }
            }
        }
        if (z) {
            subscription.cancel();
            return;
        }
        this.f43058c.onSubscribe(subscription);
        while (true) {
            synchronized (this) {
                aVar = this.f43060e;
                if (aVar == null) {
                    this.f43059d = false;
                    return;
                }
                this.f43060e = null;
            }
            aVar.mo71358a(this.f43058c);
        }
        while (true) {
        }
    }
}
