package androidx.work;

/* renamed from: androidx.work.s */
public final class C3440s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Worker f8045b;

    public C3440s(Worker worker) {
        this.f8045b = worker;
    }

    public final void run() {
        try {
            this.f8045b.f7861g.mo12917i(this.f8045b.mo12834h());
        } catch (Throwable th) {
            this.f8045b.f7861g.mo12918j(th);
        }
    }
}
