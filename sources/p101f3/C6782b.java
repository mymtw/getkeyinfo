package p101f3;

import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.C16388l;

/* renamed from: f3.b */
public final class C6782b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C16388l f14920b;

    /* renamed from: c */
    public final /* synthetic */ ConstraintTrackingWorker f14921c;

    public C6782b(ConstraintTrackingWorker constraintTrackingWorker, C16388l lVar) {
        this.f14921c = constraintTrackingWorker;
        this.f14920b = lVar;
    }

    public final void run() {
        synchronized (this.f14921c.f8017h) {
            if (this.f14921c.f8018i) {
                this.f14921c.f8019j.mo12917i(new ListenableWorker.C3367a.C3369b());
            } else {
                this.f14921c.f8019j.mo12919k(this.f14920b);
            }
        }
    }
}
