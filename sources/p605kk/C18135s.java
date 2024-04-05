package p605kk;

import com.google.android.gms.measurement.internal.C14944c5;
import java.util.concurrent.Executor;

/* renamed from: kk.s */
public final class C18135s<TResult> implements C18139w<TResult> {

    /* renamed from: b */
    public final Executor f39593b;

    /* renamed from: c */
    public final Object f39594c = new Object();

    /* renamed from: d */
    public C18120d f39595d;

    public C18135s(Executor executor, C18120d dVar) {
        this.f39593b = executor;
        this.f39595d = dVar;
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        if (!gVar.mo69668o() && !gVar.mo69666m()) {
            synchronized (this.f39594c) {
                if (this.f39595d != null) {
                    this.f39593b.execute(new C14944c5(1, (Object) this, (Object) gVar));
                }
            }
        }
    }
}
