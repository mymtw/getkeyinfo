package p030bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.o1 */
public final class C4030o1 {

    /* renamed from: a */
    public static final C4030o1 f9003a = new C4030o1();

    /* renamed from: bo.app.o1$a */
    public static final class C4031a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4031a f9004b = new C4031a();

        public C4031a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services Availability API not found. Google Play Services not enabled.";
        }
    }

    /* renamed from: bo.app.o1$b */
    public static final class C4032b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4032b f9005b = new C4032b();

        public C4032b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services is available.";
        }
    }

    /* renamed from: bo.app.o1$c */
    public static final class C4033c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f9006b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4033c(int i) {
            super(0);
            this.f9006b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f9006b), "Google Play Services is unavailable. Connection result: ");
        }
    }

    /* renamed from: bo.app.o1$d */
    public static final class C4034d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4034d f9007b = new C4034d();

        public C4034d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unexpected exception while checking for com.google.android.gsf";
        }
    }

    private C4030o1() {
    }

    /* renamed from: a */
    public static final boolean m9288a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f9003a, (BrazeLogger.Priority) null, (Throwable) null, C4032b.f9005b, 7);
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, f9003a, (BrazeLogger.Priority) null, (Throwable) null, new C4033c(isGooglePlayServicesAvailable), 7);
        return false;
    }

    /* renamed from: b */
    public static final boolean m9289b(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", PackageManager.PackageInfoFlags.of(0));
            } else {
                context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f9003a, BrazeLogger.Priority.W, e, C4034d.f9007b, 4);
            return false;
        }
    }
}
