package p030bo.app;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.e1 */
public final class C3634e1 implements C4318z1 {

    /* renamed from: bo.app.e1$a */
    public static final class C3635a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8361b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3635a(String str) {
            super(0);
            this.f8361b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8361b, "Cannot create card control event for Feed card. Returning null. Card id: ");
        }
    }

    /* renamed from: bo.app.e1$b */
    public static final class C3636b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8362b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3636b(String str) {
            super(0);
            this.f8362b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8362b, "Cannot create card dismissed event for Feed card. Returning null. Card id: ");
        }
    }

    /* renamed from: a */
    public C4208t1 mo13238a(String str) {
        C19383o.m32797g(str, "cardId");
        return C3787j.f8608h.mo13481e(str);
    }

    /* renamed from: b */
    public C4208t1 mo13239b(String str) {
        C19383o.m32797g(str, "cardId");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3635a(str), 6);
        return null;
    }

    /* renamed from: c */
    public C4208t1 mo13240c(String str) {
        C19383o.m32797g(str, "cardId");
        return C3787j.f8608h.mo13483f(str);
    }

    /* renamed from: d */
    public C4208t1 mo13241d(String str) {
        C19383o.m32797g(str, "cardId");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C3636b(str), 6);
        return null;
    }
}
