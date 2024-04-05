package p030bo.app;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p030bo.app.C3821j0;
import p753kq.C19846a;

/* renamed from: bo.app.l0 */
public final class C3910l0 implements C3581b2 {

    /* renamed from: g */
    public static final C3911a f8810g = new C3911a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private Context f8811a;

    /* renamed from: b */
    private final BrazeConfigurationProvider f8812b;

    /* renamed from: c */
    private final C3602c2 f8813c;

    /* renamed from: d */
    private final C3846k0 f8814d;

    /* renamed from: e */
    private final String f8815e;

    /* renamed from: f */
    public final SharedPreferences f8816f;

    /* renamed from: bo.app.l0$b */
    public static final class C3912b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3912b f8817b = new C3912b();

        public C3912b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to read notifications enabled state from NotificationManagerCompat.";
        }
    }

    /* renamed from: bo.app.l0$c */
    public static final class C3913c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3913c f8818b = new C3913c();

        public C3913c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "App version code could not be read. Returning null";
        }
    }

    /* renamed from: bo.app.l0$d */
    public static final class C3914d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3914d f8819b = new C3914d();

        public C3914d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to collect background restriction information from Activity Manager";
        }
    }

    /* renamed from: bo.app.l0$e */
    public static final class C3915e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8820b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3915e(String str) {
            super(0);
            this.f8820b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Unable to inspect package [");
            h.append(this.f8820b);
            h.append(']');
            return h.toString();
        }
    }

    /* renamed from: bo.app.l0$f */
    public static final class C3916f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3916f f8821b = new C3916f();

        public C3916f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while reading the phone carrier name.";
        }
    }

    public C3910l0(Context context, BrazeConfigurationProvider brazeConfigurationProvider, C3602c2 c2Var, C3846k0 k0Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        C19383o.m32797g(c2Var, "deviceIdProvider");
        C19383o.m32797g(k0Var, "deviceCache");
        this.f8811a = context;
        this.f8812b = brazeConfigurationProvider;
        this.f8813c = c2Var;
        this.f8814d = k0Var;
        PackageInfo g = m9056g();
        this.f8815e = g == null ? null : g.versionName;
        SharedPreferences sharedPreferences = this.f8811a.getSharedPreferences("com.appboy.managers.device_data_provider", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.f8816f = sharedPreferences;
    }

    /* renamed from: g */
    private final PackageInfo m9056g() {
        String packageName = this.f8811a.getPackageName();
        try {
            return Build.VERSION.SDK_INT >= 33 ? this.f8811a.getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0)) : this.f8811a.getPackageManager().getPackageInfo(packageName, 0);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new C3915e(packageName), 4);
            ApplicationInfo applicationInfo = this.f8811a.getApplicationInfo();
            return Build.VERSION.SDK_INT >= 33 ? this.f8811a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, PackageManager.PackageInfoFlags.of(0)) : this.f8811a.getPackageManager().getPackageArchiveInfo(applicationInfo.sourceDir, 0);
        }
    }

    /* renamed from: i */
    private final boolean m9057i() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Object systemService = this.f8811a.getSystemService("activity");
                if (systemService != null) {
                    return ((ActivityManager) systemService).isBackgroundRestricted();
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3914d.f8819b, 4);
            }
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m9058j() {
        return this.f8811a.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: k */
    private final String m9059k() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: l */
    private final String m9060l() {
        try {
            Object systemService = this.f8811a.getSystemService(ResponseConstants.PHONE);
            if (systemService != null) {
                return ((TelephonyManager) systemService).getNetworkOperatorName();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C3916f.f8821b, 4);
            return null;
        }
    }

    /* renamed from: m */
    private final Locale m9061m() {
        Locale locale = Locale.getDefault();
        C19383o.m32796f(locale, "getDefault()");
        return locale;
    }

    /* renamed from: n */
    private final TimeZone m9062n() {
        TimeZone timeZone = TimeZone.getDefault();
        C19383o.m32796f(timeZone, "getDefault()");
        return timeZone;
    }

    /* renamed from: a */
    public String mo13133a() {
        long j;
        PackageInfo g = m9056g();
        if (g != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                j = g.getLongVersionCode();
            } else if (i >= 28) {
                j = g.getLongVersionCode();
            } else {
                j = (long) g.versionCode;
            }
            return j + ".0.0.0";
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3913c.f8818b, 7);
        return null;
    }

    /* renamed from: b */
    public C3821j0 mo13136b() {
        this.f8814d.mo13557a(mo13640d());
        return (C3821j0) this.f8814d.mo13005a();
    }

    /* renamed from: c */
    public String mo13137c() {
        return this.f8815e;
    }

    /* renamed from: d */
    public C3821j0 mo13640d() {
        C3821j0.C3822a e = new C3821j0.C3822a(this.f8812b).mo13526a(m9059k()).mo13529b(m9060l()).mo13533e(Build.MODEL);
        C3911a aVar = f8810g;
        return e.mo13532d(aVar.mo13645a(m9061m())).mo13535g(m9062n().getID()).mo13534f(aVar.mo13644a(this.f8811a, m9058j())).mo13530c(Boolean.valueOf(mo13642f())).mo13528b(Boolean.valueOf(m9057i())).mo13531c(mo13641e()).mo13525a(mo13643h()).mo13527a();
    }

    /* renamed from: e */
    public final String mo13641e() {
        return this.f8816f.getString("google_ad_id", (String) null);
    }

    /* renamed from: f */
    public final boolean mo13642f() {
        Object systemService = this.f8811a.getSystemService("notification");
        if (systemService != null) {
            return ((NotificationManager) systemService).areNotificationsEnabled();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public String getDeviceId() {
        return this.f8813c.getDeviceId();
    }

    /* renamed from: h */
    public final Boolean mo13643h() {
        if (!this.f8816f.contains("ad_tracking_enabled")) {
            return null;
        }
        return Boolean.valueOf(this.f8816f.getBoolean("ad_tracking_enabled", true));
    }

    /* renamed from: a */
    public void mo13134a(String str) {
        C19383o.m32797g(str, "googleAdvertisingId");
        this.f8816f.edit().putString("google_ad_id", str).apply();
    }

    /* renamed from: a */
    public void mo13135a(boolean z) {
        this.f8816f.edit().putBoolean("ad_tracking_enabled", !z).apply();
    }

    /* renamed from: bo.app.l0$a */
    public static final class C3911a {
        private C3911a() {
        }

        public /* synthetic */ C3911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo13644a(Context context, boolean z) {
            int i;
            int i2;
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                WindowManager windowManager = (WindowManager) systemService;
                if (Build.VERSION.SDK_INT >= 30) {
                    Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                    C19383o.m32796f(bounds, "windowManager.currentWindowMetrics.bounds");
                    i2 = bounds.width();
                    i = bounds.height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    int i3 = displayMetrics.widthPixels;
                    int i4 = displayMetrics.heightPixels;
                    i2 = i3;
                    i = i4;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append('x');
                    sb.append(i2);
                    return sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i2);
                sb2.append('x');
                sb2.append(i);
                return sb2.toString();
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }

        /* renamed from: a */
        public final String mo13645a(Locale locale) {
            C19383o.m32797g(locale, "locale");
            String locale2 = locale.toString();
            C19383o.m32796f(locale2, "locale.toString()");
            return locale2;
        }
    }
}
