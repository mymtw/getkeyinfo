package p101f3;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C3419a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collections;
import p034c3.C4391o;
import p034c3.C4394q;
import p252u2.C8129j;
import p290y2.C8369d;

/* renamed from: f3.a */
public final class C6781a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ConstraintTrackingWorker f14919b;

    public C6781a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f14919b = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.f14919b;
        Object obj = constraintTrackingWorker.f7854c.f7863b.f7899a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String str = obj instanceof String ? (String) obj : null;
        if (TextUtils.isEmpty(str)) {
            C3422l.m8213c().mo12927b(ConstraintTrackingWorker.f8015l, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3368a());
            return;
        }
        ListenableWorker a = constraintTrackingWorker.f7854c.f7867f.mo12968a(constraintTrackingWorker.f7853b, str, constraintTrackingWorker.f8016g);
        constraintTrackingWorker.f8020k = a;
        if (a == null) {
            C3422l.m8213c().mo12926a(ConstraintTrackingWorker.f8015l, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3368a());
            return;
        }
        C4391o i = ((C4394q) C8129j.m16345e(constraintTrackingWorker.f7853b).f17763c.mo12857t()).mo14333i(constraintTrackingWorker.f7854c.f7862a.toString());
        if (i == null) {
            constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3368a());
            return;
        }
        Context context = constraintTrackingWorker.f7853b;
        C8369d dVar = new C8369d(context, C8129j.m16345e(context).f17764d, constraintTrackingWorker);
        dVar.mo20960b(Collections.singletonList(i));
        if (dVar.mo20959a(constraintTrackingWorker.f7854c.f7862a.toString())) {
            C3422l.m8213c().mo12926a(ConstraintTrackingWorker.f8015l, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
            try {
                C3419a f = constraintTrackingWorker.f8020k.mo12813f();
                f.mo7981e(new C6782b(constraintTrackingWorker, f), constraintTrackingWorker.f7854c.f7865d);
            } catch (Throwable th) {
                C3422l c = C3422l.m8213c();
                String str2 = ConstraintTrackingWorker.f8015l;
                c.mo12926a(str2, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th);
                synchronized (constraintTrackingWorker.f8017h) {
                    if (constraintTrackingWorker.f8018i) {
                        C3422l.m8213c().mo12926a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3369b());
                    } else {
                        constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3368a());
                    }
                }
            }
        } else {
            C3422l.m8213c().mo12926a(ConstraintTrackingWorker.f8015l, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
            constraintTrackingWorker.f8019j.mo12917i(new ListenableWorker.C3367a.C3369b());
        }
    }
}
