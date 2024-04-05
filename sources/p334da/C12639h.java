package p334da;

import androidx.work.BackoffPolicy;
import androidx.work.C3376c;
import androidx.work.C3380e;
import androidx.work.C3424m;
import androidx.work.C3437q;
import androidx.work.C3438r;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.analytics.AnalyticsUploadWorker;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;

/* renamed from: da.h */
public final class C12639h {

    /* renamed from: a */
    public final C8618c f27878a;

    /* renamed from: b */
    public final C3437q f27879b;

    public C12639h(C8618c cVar, C3437q qVar) {
        C19383o.m32797g(cVar, "configMap");
        C19383o.m32797g(qVar, "workManager");
        this.f27878a = cVar;
        this.f27879b = qVar;
    }

    /* renamed from: a */
    public final void mo45423a() {
        C3424m.C3425a aVar = new C3424m.C3425a(AnalyticsUploadWorker.class);
        C3376c.C3377a aVar2 = new C3376c.C3377a();
        aVar2.f7890a = NetworkType.CONNECTED;
        C3424m.C3425a aVar3 = (C3424m.C3425a) ((C3424m.C3425a) aVar.mo12966e(new C3376c(aVar2))).mo12965d(BackoffPolicy.EXPONENTIAL, TimeUnit.SECONDS);
        int i = 0;
        Pair[] pairArr = {new Pair("should_drain_queue", Boolean.FALSE)};
        C3380e.C3381a aVar4 = new C3380e.C3381a();
        while (i < 1) {
            Pair pair = pairArr[i];
            i++;
            aVar4.mo12847b(pair.getSecond(), (String) pair.getFirst());
        }
        aVar3.f8043c.f9648e = aVar4.mo12846a();
        C3438r a = aVar3.mo12964a();
        C19383o.m32796f(a, "OneTimeWorkRequestBuilde…   )\n            .build()");
        C3437q qVar = this.f27879b;
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        qVar.getClass();
        qVar.mo12960a("analytics_one_time", existingWorkPolicy, Collections.singletonList((C3424m) a)).mo20725M();
    }
}
