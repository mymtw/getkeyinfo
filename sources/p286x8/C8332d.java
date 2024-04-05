package p286x8;

import java.util.concurrent.Callable;

/* renamed from: x8.d */
public final class C8332d implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ C8327a f18287b;

    /* renamed from: c */
    public final /* synthetic */ C8329c f18288c;

    public C8332d(C8329c cVar, C8327a aVar) {
        this.f18288c = cVar;
        this.f18287b = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() throws Exception {
        this.f18288c.f18284a.mo11974c();
        try {
            this.f18288c.f18285b.mo12038e(this.f18287b);
            this.f18288c.f18284a.mo11984m();
            this.f18288c.f18284a.mo11980i();
            return null;
        } catch (Throwable th) {
            this.f18288c.f18284a.mo11980i();
            throw th;
        }
    }
}
