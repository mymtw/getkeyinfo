package p030bo.app;

import android.content.Context;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p605kk.C18123g;
import p753kq.C19846a;

/* renamed from: bo.app.g1 */
public final class C3677g1 {

    /* renamed from: e */
    public static final C3678a f8430e = new C3678a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f8431a;

    /* renamed from: b */
    private final C3777i2 f8432b;

    /* renamed from: c */
    private final boolean f8433c;

    /* renamed from: d */
    private final boolean f8434d = C3856k4.m8981a("com.google.firebase.messaging.FirebaseMessaging", "getToken", (Class<?>[]) new Class[0]);

    /* renamed from: bo.app.g1$a */
    public static final class C3678a {
        private C3678a() {
        }

        public /* synthetic */ C3678a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.g1$b */
    public static final class C3679b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3679b f8435b = new C3679b();

        public C3679b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging requires the Google Play Store to be installed.";
        }
    }

    /* renamed from: bo.app.g1$c */
    public static final class C3680c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C18123g<String> f8436b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3680c(C18123g<String> gVar) {
            super(0);
            this.f8436b = gVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8436b.mo69663j(), "Fetching registration token failed using FirebaseMessaging instance with default Firebase installation with exception ");
        }
    }

    /* renamed from: bo.app.g1$d */
    public static final class C3681d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8437b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3681d(String str) {
            super(0);
            this.f8437b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8437b, "Automatically obtained Firebase Cloud Messaging token: ");
        }
    }

    /* renamed from: bo.app.g1$e */
    public static final class C3682e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3682e f8438b = new C3682e();

        public C3682e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to register for Firebase Cloud Messaging";
        }
    }

    /* renamed from: bo.app.g1$f */
    public static final class C3683f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8439b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3683f(String str) {
            super(0);
            this.f8439b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8439b, "Registering for Firebase Cloud Messaging token using sender id: ");
        }
    }

    /* renamed from: bo.app.g1$g */
    public static final class C3684g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3684g f8440b = new C3684g();

        public C3684g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'getInstance' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.g1$h */
    public static final class C3685h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3685h f8441b = new C3685h();

        public C3685h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'InstanceId' object could not be invoked. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.g1$i */
    public static final class C3686i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3686i f8442b = new C3686i();

        public C3686i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Firebase Cloud Messaging 'FirebaseInstanceId.getInstance().getToken()' method could not obtained. Not registering for Firebase Cloud Messaging.";
        }
    }

    /* renamed from: bo.app.g1$j */
    public static final class C3687j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Object f8443b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3687j(Object obj) {
            super(0);
            this.f8443b = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8443b, "Automatically obtained Firebase Cloud Messaging token: ");
        }
    }

    /* renamed from: bo.app.g1$k */
    public static final class C3688k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3688k f8444b = new C3688k();

        public C3688k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get push token via instance id";
        }
    }

    public C3677g1(Context context, C3777i2 i2Var) {
        Class<String> cls = String.class;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(i2Var, "registrationDataProvider");
        this.f8431a = context;
        this.f8432b = i2Var;
        this.f8433c = C3856k4.m8981a("com.google.firebase.iid.FirebaseInstanceId", "getToken", (Class<?>[]) new Class[]{cls, cls});
    }

    /* renamed from: b */
    private final void m8663b(String str) {
        Class<String> cls = String.class;
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C3683f(str), 6);
        try {
            Method b = C3856k4.m8982b("com.google.firebase.iid.FirebaseInstanceId", "getInstance", new Class[0]);
            if (b == null) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3684g.f8440b, 7);
                return;
            }
            Object a = C3856k4.m8979a((Object) null, b, new Object[0]);
            if (a == null) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3685h.f8441b, 7);
                return;
            }
            Method a2 = C3856k4.m8980a(a.getClass(), "getToken", (Class<?>[]) new Class[]{cls, cls});
            if (a2 == null) {
                BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3686i.f8442b, 7);
                return;
            }
            Object a3 = C3856k4.m8979a(a, a2, str, FirebaseMessaging.INSTANCE_ID_SCOPE);
            if (a3 instanceof String) {
                BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new C3687j(a3), 6);
                this.f8432b.mo13440a((String) a3);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3688k.f8444b, 4);
        }
    }

    /* renamed from: a */
    public final void mo13314a(String str) {
        C19383o.m32797g(str, "firebaseSenderId");
        try {
            if (this.f8434d) {
                FirebaseMessaging.getInstance().getToken().mo69656c(new C4237u6(this, 0));
            } else if (this.f8433c) {
                m8663b(str);
            }
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3682e.f8438b, 4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m8661a(C3677g1 g1Var, C18123g gVar) {
        C19383o.m32797g(g1Var, "this$0");
        C19383o.m32797g(gVar, "task");
        if (!gVar.mo69668o()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, g1Var, BrazeLogger.Priority.W, (Throwable) null, new C3680c(gVar), 6);
            return;
        }
        String str = (String) gVar.mo69664k();
        BrazeLogger.m11282d(BrazeLogger.f11932a, g1Var, BrazeLogger.Priority.V, (Throwable) null, new C3681d(str), 6);
        g1Var.f8432b.mo13440a(str);
    }

    /* renamed from: a */
    public final boolean mo13315a() {
        if (!C4030o1.m9289b(this.f8431a)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3679b.f8435b, 6);
            return false;
        } else if (this.f8433c || this.f8434d) {
            return true;
        } else {
            return false;
        }
    }
}
