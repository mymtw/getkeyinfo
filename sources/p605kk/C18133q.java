package p605kk;

import com.google.android.gms.measurement.internal.C15088s5;
import java.util.concurrent.Executor;

/* renamed from: kk.q */
public final class C18133q<TResult> implements C18139w<TResult> {

    /* renamed from: b */
    public final Executor f39587b;

    /* renamed from: c */
    public final Object f39588c = new Object();

    /* renamed from: d */
    public C18118b f39589d;

    public C18133q(Executor executor, C18118b bVar) {
        this.f39587b = executor;
        this.f39589d = bVar;
    }

    /* renamed from: c */
    public final void mo69682c(C18123g<TResult> gVar) {
        if (gVar.mo69666m()) {
            synchronized (this.f39588c) {
                if (this.f39589d != null) {
                    this.f39587b.execute(new C15088s5(this, 1));
                }
            }
        }
    }
}
