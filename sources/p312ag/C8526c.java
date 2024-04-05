package p312ag;

import android.content.Context;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.jvm.internal.C19383o;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: ag.c */
public final class C8526c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ long f18566b;

    /* renamed from: c */
    public final /* synthetic */ String f18567c;

    /* renamed from: d */
    public final /* synthetic */ Context f18568d;

    public C8526c(Context context, String str, long j) {
        this.f18566b = j;
        this.f18567c = str;
        this.f18568d = context;
    }

    public final void run() {
        C8532h hVar;
        if (!C13080a.m20762b(this)) {
            try {
                ActivityLifecycleTracker activityLifecycleTracker = ActivityLifecycleTracker.f27304l;
                C8532h hVar2 = ActivityLifecycleTracker.f27298f;
                Long l = hVar2 != null ? hVar2.f18587e : null;
                if (ActivityLifecycleTracker.f27298f == null) {
                    ActivityLifecycleTracker.f27298f = new C8532h(Long.valueOf(this.f18566b), (Long) null);
                    String str = this.f18567c;
                    String str2 = ActivityLifecycleTracker.f27300h;
                    Context context = this.f18568d;
                    C19383o.m32796f(context, "appContext");
                    C8534i.m16940b(str, str2, context);
                } else if (l != null) {
                    long longValue = this.f18566b - l.longValue();
                    activityLifecycleTracker.getClass();
                    C12882n b = FetchedAppSettingsManager.m20104b(C13418j.m21107c());
                    if (longValue > ((long) ((b != null ? b.f28400d : 60) * 1000))) {
                        C8534i.m16941c(this.f18567c, ActivityLifecycleTracker.f27298f, ActivityLifecycleTracker.f27300h);
                        String str3 = this.f18567c;
                        String str4 = ActivityLifecycleTracker.f27300h;
                        Context context2 = this.f18568d;
                        C19383o.m32796f(context2, "appContext");
                        C8534i.m16940b(str3, str4, context2);
                        ActivityLifecycleTracker.f27298f = new C8532h(Long.valueOf(this.f18566b), (Long) null);
                    } else if (longValue > 1000 && (hVar = ActivityLifecycleTracker.f27298f) != null) {
                        hVar.f18583a++;
                    }
                }
                C8532h hVar3 = ActivityLifecycleTracker.f27298f;
                if (hVar3 != null) {
                    hVar3.f18587e = Long.valueOf(this.f18566b);
                }
                C8532h hVar4 = ActivityLifecycleTracker.f27298f;
                if (hVar4 != null) {
                    hVar4.mo21059a();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
