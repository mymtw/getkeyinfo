package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.i4 */
public final class C3779i4 implements C3777i2 {

    /* renamed from: c */
    public static final C3780a f8595c = new C3780a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final BrazeConfigurationProvider f8596a;

    /* renamed from: b */
    public final SharedPreferences f8597b;

    /* renamed from: bo.app.i4$a */
    public static final class C3780a {
        private C3780a() {
        }

        public /* synthetic */ C3780a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bo.app.i4$b */
    public static final class C3781b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8598b;

        /* renamed from: c */
        public final /* synthetic */ int f8599c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3781b(int i, int i2) {
            super(0);
            this.f8598b = i;
            this.f8599c = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Stored push registration ID version code ");
            h.append(this.f8598b);
            h.append(" does not match live version code ");
            return C0071c.m191c(h, this.f8599c, ". Not returning saved registration ID.");
        }
    }

    /* renamed from: bo.app.i4$c */
    public static final class C3782c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3782c f8600b = new C3782c();

        public C3782c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public C3779i4(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        this.f8596a = brazeConfigurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f8597b = sharedPreferences;
    }

    /* renamed from: b */
    private final boolean m8824b() {
        return this.f8596a.isFirebaseCloudMessagingRegistrationEnabled() || this.f8596a.isAdmMessagingRegistrationEnabled();
    }

    /* renamed from: a */
    public synchronized String mo13439a() {
        int versionCode;
        int i;
        if (!m8824b() || !this.f8597b.contains("version_code") || (versionCode = this.f8596a.getVersionCode()) == (i = this.f8597b.getInt("version_code", Integer.MIN_VALUE))) {
            if (this.f8597b.contains("device_identifier")) {
                if (!C19383o.m32792b(C3958m0.f8891b.mo13710a(), this.f8597b.getString("device_identifier", ""))) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3782c.f8600b, 6);
                    return null;
                }
            }
            return this.f8597b.getString("registration_id", (String) null);
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3781b(i, versionCode), 6);
        return null;
    }

    /* renamed from: a */
    public synchronized void mo13440a(String str) {
        if (str != null) {
            this.f8597b.edit().putString("registration_id", str).putInt("version_code", this.f8596a.getVersionCode()).putString("device_identifier", C3958m0.f8891b.mo13710a()).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
