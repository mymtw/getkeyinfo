package androidx.work;

import androidx.work.C3438r;
import java.util.concurrent.TimeUnit;
import p034c3.C4391o;

/* renamed from: androidx.work.o */
public final class C3434o extends C3438r {

    /* renamed from: androidx.work.o$a */
    public static final class C3435a extends C3438r.C3439a<C3435a, C3434o> {
        public C3435a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            C4391o oVar = this.f8043c;
            long millis = timeUnit.toMillis(j);
            oVar.getClass();
            long j2 = 900000;
            if (millis < 900000) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
                millis = 900000;
            }
            if (millis < 900000) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            } else {
                j2 = millis;
            }
            if (millis < 300000) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{300000L}), new Throwable[0]);
                millis = 300000;
            }
            if (millis > j2) {
                C3422l.m8213c().mo12929f(C4391o.f9643s, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j2)}), new Throwable[0]);
                millis = j2;
            }
            oVar.f9651h = j2;
            oVar.f9652i = millis;
        }

        /* renamed from: b */
        public final C3438r mo12930b() {
            if (this.f8041a && this.f8043c.f9653j.f7884c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            } else if (!this.f8043c.f9660q) {
                return new C3434o(this);
            } else {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
        }

        /* renamed from: c */
        public final C3438r.C3439a mo12931c() {
            return this;
        }
    }

    public C3434o(C3435a aVar) {
        super(aVar.f8042b, aVar.f8043c, aVar.f8044d);
    }
}
