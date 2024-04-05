package p079d3;

import android.content.Context;
import androidx.work.C3382f;
import androidx.work.WorkInfo$State;
import androidx.work.impl.foreground.C3409a;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.C3419a;
import java.util.UUID;
import p034c3.C4394q;
import p252u2.C8121c;

/* renamed from: d3.o */
public final class C6645o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C3419a f14667b;

    /* renamed from: c */
    public final /* synthetic */ UUID f14668c;

    /* renamed from: d */
    public final /* synthetic */ C3382f f14669d;

    /* renamed from: e */
    public final /* synthetic */ Context f14670e;

    /* renamed from: f */
    public final /* synthetic */ C6646p f14671f;

    public C6645o(C6646p pVar, C3419a aVar, UUID uuid, C3382f fVar, Context context) {
        this.f14671f = pVar;
        this.f14667b = aVar;
        this.f14668c = uuid;
        this.f14669d = fVar;
        this.f14670e = context;
    }

    public final void run() {
        try {
            if (!(this.f14667b.f7992b instanceof AbstractFuture.C3413b)) {
                String uuid = this.f14668c.toString();
                WorkInfo$State f = ((C4394q) this.f14671f.f14674c).mo14330f(uuid);
                if (f == null || f.isFinished()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((C8121c) this.f14671f.f14673b).mo20716d(uuid, this.f14669d);
                this.f14670e.startService(C3409a.m8170a(this.f14670e, uuid, this.f14669d));
            }
            this.f14667b.mo12917i(null);
        } catch (Throwable th) {
            this.f14667b.mo12918j(th);
        }
    }
}
