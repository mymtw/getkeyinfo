package p030bo.app;

import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.facebook.login.LoginFragment;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C19453g;
import p753kq.C19846a;

/* renamed from: bo.app.o0 */
public final class C4026o0 {

    /* renamed from: e */
    public static final C4027a f8992e = new C4027a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C4029b f8993a;

    /* renamed from: b */
    public final C4208t1 f8994b;

    /* renamed from: c */
    public final C3670f5 f8995c;

    /* renamed from: d */
    public final C4296y1 f8996d;

    /* renamed from: bo.app.o0$b */
    public enum C4029b {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENT,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    private C4026o0(C4029b bVar, C4208t1 t1Var, C3670f5 f5Var, C4296y1 y1Var) {
        this.f8993a = bVar;
        this.f8994b = t1Var;
        this.f8995c = f5Var;
        this.f8996d = y1Var;
    }

    /* renamed from: a */
    public final C4029b mo13799a() {
        return this.f8993a;
    }

    /* renamed from: b */
    public final C4208t1 mo13800b() {
        return this.f8994b;
    }

    /* renamed from: c */
    public final C3670f5 mo13801c() {
        return this.f8995c;
    }

    /* renamed from: d */
    public final C4296y1 mo13802d() {
        return this.f8996d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4026o0)) {
            return false;
        }
        C4026o0 o0Var = (C4026o0) obj;
        return this.f8993a == o0Var.f8993a && C19383o.m32792b(this.f8994b, o0Var.f8994b) && C19383o.m32792b(this.f8995c, o0Var.f8995c) && C19383o.m32792b(this.f8996d, o0Var.f8996d);
    }

    public int hashCode() {
        int hashCode = this.f8993a.hashCode() * 31;
        C4208t1 t1Var = this.f8994b;
        int i = 0;
        int hashCode2 = (hashCode + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        C3670f5 f5Var = this.f8995c;
        int hashCode3 = (hashCode2 + (f5Var == null ? 0 : f5Var.hashCode())) * 31;
        C4296y1 y1Var = this.f8996d;
        if (y1Var != null) {
            i = y1Var.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("\n            commandType = ");
        h.append(this.f8993a);
        h.append("\n            brazeEvent = ");
        h.append(this.f8994b);
        h.append("\n            sessionId = ");
        h.append(this.f8995c);
        h.append("\n            brazeRequest = ");
        h.append(this.f8996d);
        h.append("\n        ");
        return C19453g.m33013Q0(h.toString());
    }

    /* renamed from: bo.app.o0$a */
    public static final class C4027a {

        /* renamed from: bo.app.o0$a$a */
        public static final class C4028a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4028a f8997b = new C4028a();

            public C4028a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "There should be a session ID here";
            }
        }

        private C4027a() {
        }

        public /* synthetic */ C4027a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4026o0 mo13807a(C4208t1 t1Var) {
            C19383o.m32797g(t1Var, "event");
            return new C4026o0(C4029b.ADD_BRAZE_EVENT, t1Var, (C3670f5) null, (C4296y1) null, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C4026o0 mo13809b(C4208t1 t1Var) {
            C19383o.m32797g(t1Var, "event");
            return new C4026o0(C4029b.ADD_PENDING_BRAZE_EVENT, t1Var, (C3670f5) null, (C4296y1) null, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C4026o0 mo13806a(C3670f5 f5Var) {
            if (f5Var == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4028a.f8997b, 7);
            }
            return new C4026o0(C4029b.FLUSH_PENDING_BRAZE_EVENTS, (C4208t1) null, f5Var, (C4296y1) null, 10, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C4026o0 mo13808a(C4296y1 y1Var) {
            C19383o.m32797g(y1Var, LoginFragment.EXTRA_REQUEST);
            return new C4026o0(C4029b.ADD_REQUEST, (C4208t1) null, (C3670f5) null, y1Var, 6, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4026o0(C4029b bVar, C4208t1 t1Var, C3670f5 f5Var, C4296y1 y1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : t1Var, (i & 4) != 0 ? null : f5Var, (i & 8) != 0 ? null : y1Var);
    }
}
