package p689ul;

import com.google.android.gms.measurement.internal.C14952d4;
import java.util.concurrent.Executor;

/* renamed from: ul.g */
public final class C18609g implements C18612j {

    /* renamed from: a */
    public final Executor f41092a;

    /* renamed from: b */
    public final Object f41093b = new Object();

    /* renamed from: c */
    public final C18603a f41094c;

    public C18609g(C18616n nVar, C18603a aVar) {
        this.f41092a = nVar;
        this.f41094c = aVar;
    }

    /* renamed from: a */
    public final void mo70122a(C18606d dVar) {
        synchronized (this.f41093b) {
            if (this.f41094c != null) {
                this.f41092a.execute(new C14952d4(2, this, dVar));
            }
        }
    }
}
