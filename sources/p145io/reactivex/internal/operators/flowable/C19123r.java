package p145io.reactivex.internal.operators.flowable;

/* renamed from: io.reactivex.internal.operators.flowable.r */
public final class C19123r implements Runnable {

    /* renamed from: b */
    public final C19122q f42691b;

    /* renamed from: c */
    public final long f42692c;

    public C19123r(long j, C19122q qVar) {
        this.f42692c = j;
        this.f42691b = qVar;
    }

    public final void run() {
        this.f42691b.onTimeout(this.f42692c);
    }
}
