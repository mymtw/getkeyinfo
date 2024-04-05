package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19846a;
import p759nq.C19920b;

/* renamed from: bo.app.f3 */
public final class C3667f3<T> implements C19920b {

    /* renamed from: a */
    private T f8417a;

    /* renamed from: bo.app.f3$a */
    public static final class C3668a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ T f8418b;

        /* renamed from: c */
        public final /* synthetic */ C19410j<?> f8419c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3668a(T t, C19410j<?> jVar) {
            super(0);
            this.f8418b = t;
            this.f8419c = jVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Cannot assign ");
            h.append(this.f8418b);
            h.append(" to only-set-once property ");
            h.append(this.f8419c.getName());
            return h.toString();
        }
    }

    public T getValue(Object obj, C19410j<?> jVar) {
        C19383o.m32797g(obj, "thisRef");
        C19383o.m32797g(jVar, "property");
        return this.f8417a;
    }

    public void setValue(Object obj, C19410j<?> jVar, T t) {
        C19383o.m32797g(obj, "thisRef");
        C19383o.m32797g(jVar, "property");
        T t2 = this.f8417a;
        if (t2 == null) {
            this.f8417a = t;
        } else if (!C19383o.m32792b(t2, t)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3668a(t, jVar), 7);
        }
    }
}
