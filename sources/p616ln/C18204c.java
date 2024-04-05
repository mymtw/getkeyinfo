package p616ln;

import android.content.Context;
import com.google.firebase.perf.config.C16594a;
import com.google.firebase.perf.config.C16597d;
import com.google.firebase.perf.config.C16598e;
import com.google.firebase.perf.config.C16609p;
import com.google.firebase.perf.config.C16610q;
import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.SessionVerbosity;
import com.google.firebase.perf.util.C16625a;
import com.google.firebase.perf.util.C16627c;
import com.google.firebase.perf.util.C16628d;
import com.google.firebase.perf.util.C16630e;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.C16935v;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p568fn.C17781a;

/* renamed from: ln.c */
public final class C18204c {

    /* renamed from: a */
    public final C16594a f39858a;

    /* renamed from: b */
    public final float f39859b;

    /* renamed from: c */
    public C18205a f39860c = null;

    /* renamed from: d */
    public C18205a f39861d = null;

    /* renamed from: e */
    public boolean f39862e;

    /* renamed from: ln.c$a */
    public static class C18205a {

        /* renamed from: k */
        public static final C17781a f39863k = C17781a.m29823d();

        /* renamed from: l */
        public static final long f39864l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final C16625a f39865a;

        /* renamed from: b */
        public final boolean f39866b;

        /* renamed from: c */
        public Timer f39867c;

        /* renamed from: d */
        public C16628d f39868d;

        /* renamed from: e */
        public long f39869e = 500;

        /* renamed from: f */
        public long f39870f;

        /* renamed from: g */
        public C16628d f39871g;

        /* renamed from: h */
        public C16628d f39872h;

        /* renamed from: i */
        public long f39873i;

        /* renamed from: j */
        public long f39874j;

        public C18205a(C16628d dVar, C16625a aVar, C16594a aVar2, String str, boolean z) {
            long j;
            long j2;
            C16597d dVar2;
            C16609p pVar;
            C16598e eVar;
            C16610q qVar;
            C16594a aVar3 = aVar2;
            String str2 = str;
            boolean z2 = z;
            this.f39865a = aVar;
            this.f39868d = dVar;
            this.f39870f = 500;
            this.f39867c = new Timer();
            long j3 = str2 == "Trace" ? aVar2.mo59256j() : aVar2.mo59256j();
            if (str2 == "Trace") {
                synchronized (C16610q.class) {
                    if (C16610q.f36847e == null) {
                        C16610q.f36847e = new C16610q();
                    }
                    qVar = C16610q.f36847e;
                }
                C16627c<Long> k = aVar3.mo59257k(qVar);
                if (!k.mo59369b() || !C16594a.m27424l(k.mo59368a().longValue())) {
                    C16627c<Long> c = aVar3.mo59250c(qVar);
                    if (!c.mo59369b() || !C16594a.m27424l(c.mo59368a().longValue())) {
                        Long l = 300L;
                        j = l.longValue();
                    } else {
                        j = c.mo59368a().longValue();
                    }
                } else {
                    aVar3.f36831c.mo59261c(k.mo59368a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    j = k.mo59368a().longValue();
                }
            } else {
                synchronized (C16598e.class) {
                    if (C16598e.f36835e == null) {
                        C16598e.f36835e = new C16598e();
                    }
                    eVar = C16598e.f36835e;
                }
                C16627c<Long> k2 = aVar3.mo59257k(eVar);
                if (!k2.mo59369b() || !C16594a.m27424l(k2.mo59368a().longValue())) {
                    C16627c<Long> c2 = aVar3.mo59250c(eVar);
                    if (!c2.mo59369b() || !C16594a.m27424l(c2.mo59368a().longValue())) {
                        Long l2 = 700L;
                        j = l2.longValue();
                    } else {
                        j = c2.mo59368a().longValue();
                    }
                } else {
                    aVar3.f36831c.mo59261c(k2.mo59368a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    j = k2.mo59368a().longValue();
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C16628d dVar3 = new C16628d(j, j3, timeUnit);
            this.f39871g = dVar3;
            this.f39873i = j;
            if (z2) {
                f39863k.mo69015b("Foreground %s logging rate:%f, burst capacity:%d", str2, dVar3, Long.valueOf(j));
            }
            long j4 = str2 == "Trace" ? aVar2.mo59256j() : aVar2.mo59256j();
            if (str2 == "Trace") {
                synchronized (C16609p.class) {
                    if (C16609p.f36846e == null) {
                        C16609p.f36846e = new C16609p();
                    }
                    pVar = C16609p.f36846e;
                }
                C16627c<Long> k3 = aVar3.mo59257k(pVar);
                if (!k3.mo59369b() || !C16594a.m27424l(k3.mo59368a().longValue())) {
                    C16627c<Long> c3 = aVar3.mo59250c(pVar);
                    if (!c3.mo59369b() || !C16594a.m27424l(c3.mo59368a().longValue())) {
                        Long l3 = 30L;
                        j2 = l3.longValue();
                    } else {
                        j2 = c3.mo59368a().longValue();
                    }
                } else {
                    aVar3.f36831c.mo59261c(k3.mo59368a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    j2 = k3.mo59368a().longValue();
                }
            } else {
                synchronized (C16597d.class) {
                    if (C16597d.f36834e == null) {
                        C16597d.f36834e = new C16597d();
                    }
                    dVar2 = C16597d.f36834e;
                }
                C16627c<Long> k4 = aVar3.mo59257k(dVar2);
                if (!k4.mo59369b() || !C16594a.m27424l(k4.mo59368a().longValue())) {
                    C16627c<Long> c4 = aVar3.mo59250c(dVar2);
                    if (!c4.mo59369b() || !C16594a.m27424l(c4.mo59368a().longValue())) {
                        Long l4 = 70L;
                        j2 = l4.longValue();
                    } else {
                        j2 = c4.mo59368a().longValue();
                    }
                } else {
                    aVar3.f36831c.mo59261c(k4.mo59368a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    j2 = k4.mo59368a().longValue();
                }
            }
            C16628d dVar4 = new C16628d(j2, j4, timeUnit);
            this.f39872h = dVar4;
            this.f39874j = j2;
            if (z2) {
                f39863k.mo69015b("Background %s logging rate:%f, capacity:%d", str2, dVar4, Long.valueOf(j2));
            }
            this.f39866b = z2;
        }

        /* renamed from: a */
        public final synchronized boolean mo69734a() {
            this.f39865a.getClass();
            double durationMicros = ((double) this.f39867c.getDurationMicros(new Timer())) * this.f39868d.mo59370a();
            long j = f39864l;
            long max = Math.max(0, (long) (durationMicros / ((double) j)));
            this.f39870f = Math.min(this.f39870f + max, this.f39869e);
            if (max > 0) {
                this.f39867c = new Timer(this.f39867c.getMicros() + ((long) (((double) (max * j)) / this.f39868d.mo59370a())));
            }
            long j2 = this.f39870f;
            if (j2 > 0) {
                this.f39870f = j2 - 1;
                return true;
            }
            if (this.f39866b) {
                f39863k.mo69018f("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public C18204c(Context context, C16628d dVar) {
        C16625a aVar = new C16625a();
        float nextFloat = new Random().nextFloat();
        C16594a e = C16594a.m27423e();
        boolean z = false;
        this.f39862e = false;
        if (0.0f <= nextFloat && nextFloat < 1.0f) {
            z = true;
        }
        if (z) {
            this.f39859b = nextFloat;
            this.f39858a = e;
            C16628d dVar2 = dVar;
            C16625a aVar2 = aVar;
            C16594a aVar3 = e;
            this.f39860c = new C18205a(dVar2, aVar2, aVar3, "Trace", this.f39862e);
            this.f39861d = new C18205a(dVar2, aVar2, aVar3, "Network", this.f39862e);
            this.f39862e = C16630e.m27495a(context);
            return;
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0f, 1.0f).");
    }

    /* renamed from: a */
    public static boolean m30703a(C16935v.C16942f fVar) {
        return fVar.size() > 0 && ((C16672h) fVar.get(0)).mo59412C() > 0 && ((C16672h) fVar.get(0)).mo59411B() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }
}
