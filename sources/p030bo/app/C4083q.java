package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.q */
public final class C4083q {

    /* renamed from: e */
    public static final C4084a f9091e = new C4084a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C3666f2 f9092a;

    /* renamed from: b */
    private final C3551a5 f9093b;

    /* renamed from: c */
    public final SharedPreferences f9094c;

    /* renamed from: d */
    public boolean f9095d;

    /* renamed from: bo.app.q$a */
    public static final class C4084a {
        private C4084a() {
        }

        public /* synthetic */ C4084a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.q$b */
    public static final class C4085b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9096b;

        /* renamed from: c */
        public final /* synthetic */ long f9097c;

        /* renamed from: d */
        public final /* synthetic */ long f9098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4085b(long j, long j2, long j3) {
            super(0);
            this.f9096b = j;
            this.f9097c = j2;
            this.f9098d = j3;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Messaging session timeout: ");
            h.append(this.f9096b);
            h.append(", current diff: ");
            h.append(this.f9097c - this.f9098d);
            return h.toString();
        }
    }

    /* renamed from: bo.app.q$c */
    public static final class C4086c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4086c f9099b = new C4086c();

        public C4086c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Publishing new messaging session event.";
        }
    }

    /* renamed from: bo.app.q$d */
    public static final class C4087d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4087d f9100b = new C4087d();

        public C4087d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Messaging session not started.";
        }
    }

    /* renamed from: bo.app.q$e */
    public static final class C4088e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ long f9101b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4088e(long j) {
            super(0);
            this.f9101b = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Long.valueOf(this.f9101b), "Messaging session stopped. Adding new messaging session timestamp: ");
        }
    }

    public C4083q(Context context, C3666f2 f2Var, C3551a5 a5Var) {
        C19383o.m32797g(context, "applicationContext");
        C19383o.m32797g(f2Var, "eventPublisher");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        this.f9092a = f2Var;
        this.f9093b = a5Var;
        this.f9094c = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    /* renamed from: a */
    public final boolean mo13885a() {
        long g = this.f9093b.mo13086g();
        if (g != -1 && !this.f9095d) {
            long j = this.f9094c.getLong("messaging_session_timestamp", -1);
            long d = DateTimeUtils.m11302d();
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4085b(g, d, j), 7);
            if (j + g < d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo13886b() {
        if (mo13885a()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4086c.f9099b, 7);
            this.f9092a.mo13286a(C3962m3.f8895b, C3962m3.class);
            this.f9095d = true;
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4087d.f9100b, 7);
    }

    /* renamed from: c */
    public final void mo13887c() {
        long d = DateTimeUtils.m11302d();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4088e(d), 7);
        this.f9094c.edit().putLong("messaging_session_timestamp", d).apply();
        this.f9095d = false;
    }
}
