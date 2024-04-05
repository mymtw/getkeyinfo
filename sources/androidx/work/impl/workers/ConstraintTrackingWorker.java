package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.C3419a;
import java.util.ArrayList;
import java.util.List;
import p101f3.C6781a;
import p290y2.C8368c;

public class ConstraintTrackingWorker extends ListenableWorker implements C8368c {

    /* renamed from: l */
    public static final String f8015l = C3422l.m8214e("ConstraintTrkngWrkr");

    /* renamed from: g */
    public WorkerParameters f8016g;

    /* renamed from: h */
    public final Object f8017h = new Object();

    /* renamed from: i */
    public volatile boolean f8018i = false;

    /* renamed from: j */
    public C3419a<ListenableWorker.C3367a> f8019j = new C3419a<>();

    /* renamed from: k */
    public ListenableWorker f8020k;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f8016g = workerParameters;
    }

    /* renamed from: b */
    public final void mo12868b(ArrayList arrayList) {
        C3422l.m8213c().mo12926a(f8015l, String.format("Constraints changed for %s", new Object[]{arrayList}), new Throwable[0]);
        synchronized (this.f8017h) {
            this.f8018i = true;
        }
    }

    /* renamed from: c */
    public final boolean mo12822c() {
        ListenableWorker listenableWorker = this.f8020k;
        return listenableWorker != null && listenableWorker.mo12822c();
    }

    /* renamed from: d */
    public final void mo12812d() {
        ListenableWorker listenableWorker = this.f8020k;
        if (listenableWorker != null && !listenableWorker.f7855d) {
            this.f8020k.mo12823g();
        }
    }

    /* renamed from: e */
    public final void mo12871e(List<String> list) {
    }

    /* renamed from: f */
    public final C3419a mo12813f() {
        this.f7854c.f7865d.execute(new C6781a(this));
        return this.f8019j;
    }
}
