package p334da;

import com.etsy.android.lib.config.C8618c;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.C19383o;
import p366ia.C12920a;

/* renamed from: da.d */
public final class C12633d {

    /* renamed from: a */
    public final C12639h f27860a;

    /* renamed from: b */
    public final C12920a f27861b;

    /* renamed from: c */
    public final C8618c f27862c;

    /* renamed from: d */
    public Timer f27863d;

    /* renamed from: da.d$a */
    public static final class C12634a extends TimerTask {

        /* renamed from: b */
        public final C12639h f27864b;

        public C12634a(C12639h hVar) {
            C19383o.m32797g(hVar, "analyticsUploader");
            this.f27864b = hVar;
        }

        public final void run() {
            this.f27864b.mo45423a();
        }
    }

    public C12633d(C12639h hVar, C12920a aVar, C8618c cVar) {
        C19383o.m32797g(hVar, "analyticsUploader");
        C19383o.m32797g(aVar, "loggingEligibility");
        C19383o.m32797g(cVar, "configMap");
        this.f27860a = hVar;
        this.f27861b = aVar;
        this.f27862c = cVar;
    }
}
