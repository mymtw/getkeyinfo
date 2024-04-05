package p145io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8066r;
import p738dq.C18999b;

/* renamed from: io.reactivex.internal.operators.observable.ObservableReplay$SizeAndTimeBoundReplayBuffer */
final class ObservableReplay$SizeAndTimeBoundReplayBuffer<T> extends ObservableReplay$BoundedReplayBuffer<T> {
    private static final long serialVersionUID = 3457957419649567404L;
    public final int limit;
    public final long maxAge;
    public final C8066r scheduler;
    public final TimeUnit unit;

    public ObservableReplay$SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, C8066r rVar) {
        this.scheduler = rVar;
        this.limit = i;
        this.maxAge = j;
        this.unit = timeUnit;
    }

    public Object enterTransform(Object obj) {
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        return new C18999b(obj, C8066r.m16244a(timeUnit), this.unit);
    }

    public ObservableReplay$Node getHead() {
        ObservableReplay$Node observableReplay$Node;
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        long a = C8066r.m16244a(timeUnit) - this.maxAge;
        ObservableReplay$Node observableReplay$Node2 = (ObservableReplay$Node) get();
        Object obj = observableReplay$Node2.get();
        while (true) {
            ObservableReplay$Node observableReplay$Node3 = (ObservableReplay$Node) obj;
            observableReplay$Node = observableReplay$Node2;
            observableReplay$Node2 = observableReplay$Node3;
            if (observableReplay$Node2 != null) {
                C18999b bVar = (C18999b) observableReplay$Node2.value;
                if (NotificationLite.isComplete(bVar.f42338a) || NotificationLite.isError(bVar.f42338a) || bVar.f42339b > a) {
                    break;
                }
                obj = observableReplay$Node2.get();
            } else {
                break;
            }
        }
        return observableReplay$Node;
    }

    public Object leaveTransform(Object obj) {
        return ((C18999b) obj).f42338a;
    }

    public void truncate() {
        ObservableReplay$Node observableReplay$Node;
        C8066r rVar = this.scheduler;
        TimeUnit timeUnit = this.unit;
        rVar.getClass();
        long a = C8066r.m16244a(timeUnit) - this.maxAge;
        ObservableReplay$Node observableReplay$Node2 = (ObservableReplay$Node) get();
        ObservableReplay$Node observableReplay$Node3 = (ObservableReplay$Node) observableReplay$Node2.get();
        int i = 0;
        while (true) {
            ObservableReplay$Node observableReplay$Node4 = observableReplay$Node3;
            observableReplay$Node = observableReplay$Node2;
            observableReplay$Node2 = observableReplay$Node4;
            if (observableReplay$Node2 == null) {
                break;
            }
            int i2 = this.size;
            if (i2 <= this.limit || i2 <= 1) {
                if (((C18999b) observableReplay$Node2.value).f42339b > a) {
                    break;
                }
                i++;
                this.size = i2 - 1;
                observableReplay$Node3 = (ObservableReplay$Node) observableReplay$Node2.get();
            } else {
                i++;
                this.size = i2 - 1;
                observableReplay$Node3 = (ObservableReplay$Node) observableReplay$Node2.get();
            }
        }
        if (i != 0) {
            setFirst(observableReplay$Node);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void truncateFinal() {
        /*
            r9 = this;
            tp.r r0 = r9.scheduler
            java.util.concurrent.TimeUnit r1 = r9.unit
            r0.getClass()
            long r0 = p248tp.C8066r.m16244a(r1)
            long r2 = r9.maxAge
            long r0 = r0 - r2
            java.lang.Object r2 = r9.get()
            io.reactivex.internal.operators.observable.ObservableReplay$Node r2 = (p145io.reactivex.internal.operators.observable.ObservableReplay$Node) r2
            java.lang.Object r3 = r2.get()
            io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (p145io.reactivex.internal.operators.observable.ObservableReplay$Node) r3
            r4 = 0
        L_0x001b:
            r8 = r3
            r3 = r2
            r2 = r8
            if (r2 == 0) goto L_0x003c
            int r5 = r9.size
            r6 = 1
            if (r5 <= r6) goto L_0x003c
            java.lang.Object r6 = r2.value
            dq.b r6 = (p738dq.C18999b) r6
            long r6 = r6.f42339b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x003c
            int r4 = r4 + 1
            int r5 = r5 + -1
            r9.size = r5
            java.lang.Object r3 = r2.get()
            io.reactivex.internal.operators.observable.ObservableReplay$Node r3 = (p145io.reactivex.internal.operators.observable.ObservableReplay$Node) r3
            goto L_0x001b
        L_0x003c:
            if (r4 == 0) goto L_0x0041
            r9.setFirst(r3)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.internal.operators.observable.ObservableReplay$SizeAndTimeBoundReplayBuffer.truncateFinal():void");
    }
}
