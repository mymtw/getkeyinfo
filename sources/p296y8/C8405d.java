package p296y8;

import java.util.concurrent.Callable;

/* renamed from: y8.d */
public final class C8405d implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ C8400a f18420b;

    /* renamed from: c */
    public final /* synthetic */ C8402c f18421c;

    public C8405d(C8402c cVar, C8400a aVar) {
        this.f18421c = cVar;
        this.f18420b = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() throws Exception {
        this.f18421c.f18417a.mo11974c();
        try {
            this.f18421c.f18418b.mo12038e(this.f18420b);
            this.f18421c.f18417a.mo11984m();
            this.f18421c.f18417a.mo11980i();
            return null;
        } catch (Throwable th) {
            this.f18421c.f18417a.mo11980i();
            throw th;
        }
    }
}
