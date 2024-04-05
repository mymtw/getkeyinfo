package p689ul;

import com.google.android.gms.measurement.internal.C15128x4;
import java.util.concurrent.Executor;

/* renamed from: ul.i */
public final class C18611i implements C18612j {

    /* renamed from: a */
    public final Executor f41098a;

    /* renamed from: b */
    public final Object f41099b = new Object();

    /* renamed from: c */
    public final C18605c f41100c;

    public C18611i(Executor executor, C18605c cVar) {
        this.f41098a = executor;
        this.f41100c = cVar;
    }

    /* renamed from: a */
    public final void mo70122a(C18606d dVar) {
        if (dVar.mo70121h()) {
            synchronized (this.f41099b) {
                if (this.f41100c != null) {
                    this.f41098a.execute(new C15128x4(4, (Object) this, (Object) dVar));
                }
            }
        }
    }
}
