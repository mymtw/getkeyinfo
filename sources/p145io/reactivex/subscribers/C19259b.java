package p145io.reactivex.subscribers;

import org.reactivestreams.Subscription;
import p145io.reactivex.internal.subscriptions.SubscriptionHelper;
import p145io.reactivex.internal.util.C19237a;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8056i;
import p762or.C20024c;

/* renamed from: io.reactivex.subscribers.b */
public final class C19259b<T> implements C8056i<T>, Subscription {

    /* renamed from: b */
    public final C20024c<? super T> f43120b;

    /* renamed from: c */
    public Subscription f43121c;

    /* renamed from: d */
    public boolean f43122d;

    /* renamed from: e */
    public C19237a<Object> f43123e;

    /* renamed from: f */
    public volatile boolean f43124f;

    public C19259b(C20024c<? super T> cVar) {
        this.f43120b = cVar;
    }

    public final void cancel() {
        this.f43121c.cancel();
    }

    public final void onComplete() {
        if (!this.f43124f) {
            synchronized (this) {
                if (!this.f43124f) {
                    if (this.f43122d) {
                        C19237a<Object> aVar = this.f43123e;
                        if (aVar == null) {
                            aVar = new C19237a<>();
                            this.f43123e = aVar;
                        }
                        aVar.mo71359b(NotificationLite.complete());
                        return;
                    }
                    this.f43124f = true;
                    this.f43122d = true;
                    this.f43120b.onComplete();
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
        r3.f43120b.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f43124f
            if (r0 == 0) goto L_0x0008
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f43124f     // Catch:{ all -> 0x002b }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            goto L_0x0032
        L_0x0010:
            boolean r0 = r3.f43122d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            r3.f43124f = r1     // Catch:{ all -> 0x002b }
            io.reactivex.internal.util.a<java.lang.Object> r0 = r3.f43123e     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x002b }
            r0.<init>()     // Catch:{ all -> 0x002b }
            r3.f43123e = r0     // Catch:{ all -> 0x002b }
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
            r3.f43124f = r1     // Catch:{ all -> 0x002b }
            r3.f43122d = r1     // Catch:{ all -> 0x002b }
            r1 = r2
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0039
            p736cq.C18981a.m32123b(r4)
            return
        L_0x0039:
            or.c<? super T> r0 = r3.f43120b
            r0.onError(r4)
            return
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subscribers.C19259b.onError(java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r1.f43120b.onNext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2 = r1.f43123e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        r1.f43122d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r1.f43123e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        if (r2.mo71358a(r1.f43120b) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNext(T r2) {
        /*
            r1 = this;
            boolean r0 = r1.f43124f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r2 != 0) goto L_0x0017
            org.reactivestreams.Subscription r2 = r1.f43121c
            r2.cancel()
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r2.<init>(r0)
            r1.onError(r2)
            return
        L_0x0017:
            monitor-enter(r1)
            boolean r0 = r1.f43124f     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return
        L_0x001e:
            boolean r0 = r1.f43122d     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0036
            io.reactivex.internal.util.a<java.lang.Object> r0 = r1.f43123e     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x002d
            io.reactivex.internal.util.a r0 = new io.reactivex.internal.util.a     // Catch:{ all -> 0x0059 }
            r0.<init>()     // Catch:{ all -> 0x0059 }
            r1.f43123e = r0     // Catch:{ all -> 0x0059 }
        L_0x002d:
            java.lang.Object r2 = p145io.reactivex.internal.util.NotificationLite.next(r2)     // Catch:{ all -> 0x0059 }
            r0.mo71359b(r2)     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return
        L_0x0036:
            r0 = 1
            r1.f43122d = r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            or.c<? super T> r0 = r1.f43120b
            r0.onNext(r2)
        L_0x003f:
            monitor-enter(r1)
            io.reactivex.internal.util.a<java.lang.Object> r2 = r1.f43123e     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0049
            r2 = 0
            r1.f43122d = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0055
        L_0x0049:
            r0 = 0
            r1.f43123e = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            or.c<? super T> r0 = r1.f43120b
            boolean r2 = r2.mo71358a(r0)
            if (r2 == 0) goto L_0x003f
        L_0x0055:
            return
        L_0x0056:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0056 }
            throw r2
        L_0x0059:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.subscribers.C19259b.onNext(java.lang.Object):void");
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f43121c, subscription)) {
            this.f43121c = subscription;
            this.f43120b.onSubscribe(this);
        }
    }

    public final void request(long j) {
        this.f43121c.request(j);
    }
}
