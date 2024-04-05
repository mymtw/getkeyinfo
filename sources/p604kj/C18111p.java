package p604kj;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p605kk.C18117a0;

/* renamed from: kj.p */
public final class C18111p {

    /* renamed from: e */
    public static C18111p f39547e;

    /* renamed from: a */
    public final Context f39548a;

    /* renamed from: b */
    public final ScheduledExecutorService f39549b;

    /* renamed from: c */
    public C18106k f39550c = new C18106k(this);

    /* renamed from: d */
    public int f39551d = 1;

    public C18111p(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f39549b = scheduledExecutorService;
        this.f39548a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C18111p m30565a(Context context) {
        C18111p pVar;
        synchronized (C18111p.class) {
            if (f39547e == null) {
                f39547e = new C18111p(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            pVar = f39547e;
        }
        return pVar;
    }

    /* renamed from: b */
    public final synchronized C18117a0 mo69650b(C18109n nVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(nVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f39550c.mo69642d(nVar)) {
            C18106k kVar = new C18106k(this);
            this.f39550c = kVar;
            kVar.mo69642d(nVar);
        }
        return nVar.f39544b.f39566a;
    }
}
