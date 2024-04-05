package androidx.lifecycle;

/* renamed from: androidx.lifecycle.g */
public final class C2860g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C2862h f6487b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f6488c;

    public C2860g(C2862h hVar, Runnable runnable) {
        this.f6487b = hVar;
        this.f6488c = runnable;
    }

    public final void run() {
        C2862h hVar = this.f6487b;
        if (hVar.f6499d.offer(this.f6488c)) {
            hVar.mo10818a();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }
}
