package p079d3;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.C3382f;
import androidx.work.C3383g;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C3419a;
import java.util.UUID;
import p002a1.C0006a;
import p034c3.C4391o;
import p090e3.C6712a;
import p090e3.C6713b;

/* renamed from: d3.n */
public final class C6642n implements Runnable {

    /* renamed from: h */
    public static final String f14656h = C3422l.m8214e("WorkForegroundRunnable");

    /* renamed from: b */
    public final C3419a<Void> f14657b = new C3419a<>();

    /* renamed from: c */
    public final Context f14658c;

    /* renamed from: d */
    public final C4391o f14659d;

    /* renamed from: e */
    public final ListenableWorker f14660e;

    /* renamed from: f */
    public final C3383g f14661f;

    /* renamed from: g */
    public final C6712a f14662g;

    /* renamed from: d3.n$a */
    public class C6643a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C3419a f14663b;

        public C6643a(C3419a aVar) {
            this.f14663b = aVar;
        }

        public final void run() {
            this.f14663b.mo12919k(C6642n.this.f14660e.mo12811a());
        }
    }

    /* renamed from: d3.n$b */
    public class C6644b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C3419a f14665b;

        public C6644b(C3419a aVar) {
            this.f14665b = aVar;
        }

        public final void run() {
            try {
                C3382f fVar = (C3382f) this.f14665b.get();
                if (fVar != null) {
                    C3422l.m8213c().mo12926a(C6642n.f14656h, String.format("Updating notification for %s", new Object[]{C6642n.this.f14659d.f9646c}), new Throwable[0]);
                    C6642n nVar = C6642n.this;
                    ListenableWorker listenableWorker = nVar.f14660e;
                    listenableWorker.f7857f = true;
                    C3419a<Void> aVar = nVar.f14657b;
                    C3383g gVar = nVar.f14661f;
                    Context context = nVar.f14658c;
                    UUID uuid = listenableWorker.f7854c.f7862a;
                    C6646p pVar = (C6646p) gVar;
                    pVar.getClass();
                    C3419a aVar2 = new C3419a();
                    ((C6713b) pVar.f14672a).mo18901a(new C6645o(pVar, aVar2, uuid, fVar, context));
                    aVar.mo12919k(aVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C6642n.this.f14659d.f9646c}));
            } catch (Throwable th) {
                C6642n.this.f14657b.mo12918j(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public C6642n(Context context, C4391o oVar, ListenableWorker listenableWorker, C3383g gVar, C6712a aVar) {
        this.f14658c = context;
        this.f14659d = oVar;
        this.f14660e = listenableWorker;
        this.f14661f = gVar;
        this.f14662g = aVar;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f14659d.f9660q || C0006a.m80a()) {
            this.f14657b.mo12917i(null);
            return;
        }
        C3419a aVar = new C3419a();
        ((C6713b) this.f14662g).f14805c.execute(new C6643a(aVar));
        aVar.mo7981e(new C6644b(aVar), ((C6713b) this.f14662g).f14805c);
    }
}
