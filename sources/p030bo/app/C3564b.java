package p030bo.app;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.b */
public final class C3564b {

    /* renamed from: c */
    public static final C3565a f8221c = new C3565a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f8222a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3777i2 f8223b;

    /* renamed from: bo.app.b$a */
    public static final class C3565a {

        /* renamed from: bo.app.b$a$a */
        public static final class C3566a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C3566a f8224b = new C3566a();

            public C3566a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "com.amazon.device.messaging.ADM not found";
            }
        }

        /* renamed from: bo.app.b$a$b */
        public static final class C3567b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Exception f8225b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3567b(Exception exc) {
                super(0);
                this.f8225b = exc;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f8225b, "Manifest not authored properly to support ADM. ADM manifest exception: ");
            }
        }

        private C3565a() {
        }

        public /* synthetic */ C3565a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m8450b(Context context) {
            try {
                ADMManifest.checkManifestAuthoredProperly(context);
                return true;
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3567b(e), 6);
                return false;
            }
        }

        /* renamed from: a */
        public final boolean mo13109a(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            return m8449a() && m8450b(context);
        }

        /* renamed from: a */
        private final boolean m8449a() {
            try {
                Class.forName("com.amazon.device.messaging.ADM");
                return true;
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3566a.f8224b, 6);
                return false;
            }
        }
    }

    /* renamed from: bo.app.b$b */
    public static final class C3568b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3564b f8226b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3568b(C3564b bVar) {
            super(0);
            this.f8226b = bVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8226b.f8223b.mo13439a(), "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: ");
        }
    }

    /* renamed from: bo.app.b$c */
    public static final class C3569c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3569c f8227b = new C3569c();

        public C3569c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Registering with ADM server...";
        }
    }

    public C3564b(Context context, C3777i2 i2Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(i2Var, "admRegistrationDataProvider");
        this.f8222a = context;
        this.f8223b = i2Var;
    }

    /* renamed from: a */
    public final void mo13108a() {
        if (this.f8223b.mo13439a() != null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C3568b(this), 6);
            C3777i2 i2Var = this.f8223b;
            i2Var.mo13440a(i2Var.mo13439a());
            return;
        }
        ADM adm = new ADM(this.f8222a);
        if (adm.isSupported()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3569c.f8227b, 6);
            adm.startRegister();
        }
    }
}
