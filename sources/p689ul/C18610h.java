package p689ul;

import com.google.android.gms.measurement.internal.C15026l6;
import java.util.concurrent.Executor;

/* renamed from: ul.h */
public final class C18610h implements C18612j {

    /* renamed from: a */
    public final Executor f41095a;

    /* renamed from: b */
    public final Object f41096b = new Object();

    /* renamed from: c */
    public final C18604b f41097c;

    public C18610h(Executor executor, C18604b bVar) {
        this.f41095a = executor;
        this.f41097c = bVar;
    }

    /* renamed from: a */
    public final void mo70122a(C18606d dVar) {
        if (!dVar.mo70121h()) {
            synchronized (this.f41096b) {
                if (this.f41097c != null) {
                    this.f41095a.execute(new C15026l6(this, dVar));
                }
            }
        }
    }
}
