package androidx.work;

import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p034c3.C4391o;

/* renamed from: androidx.work.r */
public abstract class C3438r {

    /* renamed from: a */
    public UUID f8038a;

    /* renamed from: b */
    public C4391o f8039b;

    /* renamed from: c */
    public Set<String> f8040c;

    /* renamed from: androidx.work.r$a */
    public static abstract class C3439a<B extends C3439a<?, ?>, W extends C3438r> {

        /* renamed from: a */
        public boolean f8041a = false;

        /* renamed from: b */
        public UUID f8042b = UUID.randomUUID();

        /* renamed from: c */
        public C4391o f8043c;

        /* renamed from: d */
        public HashSet f8044d = new HashSet();

        public C3439a(Class<? extends ListenableWorker> cls) {
            this.f8043c = new C4391o(this.f8042b.toString(), cls.getName());
            this.f8044d.add(cls.getName());
            mo12931c();
        }

        /* renamed from: a */
        public final W mo12964a() {
            W b = mo12930b();
            C3376c cVar = this.f8043c.f9653j;
            boolean z = true;
            if (!(cVar.f7889h.f7894a.size() > 0) && !cVar.f7885d && !cVar.f7883b && !cVar.f7884c) {
                z = false;
            }
            C4391o oVar = this.f8043c;
            if (oVar.f9660q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (oVar.f9650g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f8042b = UUID.randomUUID();
            C4391o oVar2 = new C4391o(this.f8043c);
            this.f8043c = oVar2;
            oVar2.f9644a = this.f8042b.toString();
            return b;
        }

        /* renamed from: b */
        public abstract W mo12930b();

        /* renamed from: c */
        public abstract B mo12931c();

        /* renamed from: d */
        public final C3439a mo12965d(BackoffPolicy backoffPolicy, TimeUnit timeUnit) {
            this.f8041a = true;
            C4391o oVar = this.f8043c;
            oVar.f9655l = backoffPolicy;
            long millis = timeUnit.toMillis(10);
            if (millis > 18000000) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
                millis = 18000000;
            }
            if (millis < NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, "Backoff delay duration less than minimum value", new Throwable[0]);
                millis = 10000;
            }
            oVar.f9656m = millis;
            return mo12931c();
        }

        /* renamed from: e */
        public final B mo12966e(C3376c cVar) {
            this.f8043c.f9653j = cVar;
            return mo12931c();
        }
    }

    public C3438r(UUID uuid, C4391o oVar, HashSet hashSet) {
        this.f8038a = uuid;
        this.f8039b = oVar;
        this.f8040c = hashSet;
    }
}
