package p425q9;

import android.app.Application;
import android.content.Context;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6573i;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.android.gms.internal.measurement.C14777q0;
import com.google.firebase.analytics.FirebaseAnalytics;
import p120gh.C6898a;
import p248tp.C8072t;
import p248tp.C8074v;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;

/* renamed from: q9.o */
public final /* synthetic */ class C13264o implements C8074v, C6898a.C6899a {

    /* renamed from: b */
    public final /* synthetic */ Object f29133b;

    /* renamed from: c */
    public final /* synthetic */ Object f29134c;

    public /* synthetic */ C13264o(Object obj, Object obj2) {
        this.f29133b = obj;
        this.f29134c = obj2;
    }

    /* renamed from: e */
    public final Object mo12018e() {
        return Boolean.valueOf(((C6573i) this.f29133b).f14521c.mo18780P((C6556p) this.f29134c));
    }

    /* renamed from: f */
    public final void mo11996f(C8072t tVar) {
        C13265p pVar = (C13265p) this.f29133b;
        Boolean bool = (Boolean) this.f29134c;
        pVar.getClass();
        boolean booleanValue = bool.booleanValue();
        String str = C13418j.f29381a;
        String str2 = C13442y.f29447a;
        Class<C13442y> cls = C13442y.class;
        if (!C13080a.m20762b(cls)) {
            try {
                C13442y.C13443a aVar = C13442y.f29451e;
                aVar.f29457a = Boolean.valueOf(booleanValue);
                aVar.f29458b = System.currentTimeMillis();
                if (C13442y.f29448b.get()) {
                    C13442y.f29456j.mo46130k(aVar);
                } else {
                    C13442y.f29456j.mo46124e();
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
        if (booleanValue) {
            Context b = C13418j.m21106b();
            if (b != null) {
                ActivityLifecycleTracker.m20068b((Application) b, C13418j.m21107c());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(pVar.f29138d);
        boolean booleanValue2 = bool.booleanValue();
        C14726m1 m1Var = instance.f36720a;
        Boolean valueOf = Boolean.valueOf(booleanValue2);
        m1Var.getClass();
        m1Var.mo50666b(new C14777q0(m1Var, valueOf));
        tVar.onSuccess(bool);
    }
}
