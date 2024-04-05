package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.zzal;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.collections.C19323p;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.ClassUtils;
import p005a4.C0034a;
import p030bo.app.C3787j;
import p506ak.C14017c;
import p703wj.C18700c;
import p703wj.C18702e;
import p753kq.C19846a;

/* renamed from: bo.app.l */
public final class C3879l implements C4243v1 {

    /* renamed from: n */
    public static final C3880a f8766n = new C3880a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C4274x1 f8767a;

    /* renamed from: b */
    private final BrazeConfigurationProvider f8768b;

    /* renamed from: c */
    private final C3551a5 f8769c;

    /* renamed from: d */
    private final Context f8770d;

    /* renamed from: e */
    private final ReentrantLock f8771e = new ReentrantLock();

    /* renamed from: f */
    public final SharedPreferences f8772f;

    /* renamed from: g */
    public final List<C0034a> f8773g;

    /* renamed from: h */
    public final PendingIntent f8774h;

    /* renamed from: i */
    public final PendingIntent f8775i;

    /* renamed from: j */
    public C3939m f8776j;

    /* renamed from: k */
    public C4257w1 f8777k;

    /* renamed from: l */
    public boolean f8778l;

    /* renamed from: m */
    public int f8779m;

    /* renamed from: bo.app.l$a */
    public static final class C3880a {
        private C3880a() {
        }

        public /* synthetic */ C3880a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo13609a(String str) {
            C19383o.m32797g(str, "apiKey");
            return C19383o.m32802l(str, "com.appboy.managers.geofences.storage.");
        }

        /* renamed from: a */
        public final boolean mo13610a(BrazeConfigurationProvider brazeConfigurationProvider) {
            C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
            return brazeConfigurationProvider.isGeofencesEnabled();
        }
    }

    /* renamed from: bo.app.l$a0 */
    public static final class C3881a0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3881a0 f8780b = new C3881a0();

        public C3881a0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    /* renamed from: bo.app.l$b */
    public static final class C3882b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f8781b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3882b(boolean z) {
            super(0);
            this.f8781b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofences enabled server config value ");
            h.append(this.f8781b);
            h.append(" received.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.l$b0 */
    public static final class C3883b0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3883b0 f8782b = new C3883b0();

        public C3883b0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting locally stored geofences.";
        }
    }

    /* renamed from: bo.app.l$c */
    public static final class C3884c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3879l f8783b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3884c(C3879l lVar) {
            super(0);
            this.f8783b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofences enabled status newly set to ");
            h.append(this.f8783b.f8778l);
            h.append(" during server config update.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.l$c0 */
    public static final class C3885c0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3885c0 f8784b = new C3885c0();

        public C3885c0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not un-registering geofences.";
        }
    }

    /* renamed from: bo.app.l$d */
    public static final class C3886d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ boolean f8785b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3886d(boolean z) {
            super(0);
            this.f8785b = z;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Geofences enabled status ");
            h.append(this.f8785b);
            h.append(" unchanged during server config update.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.l$d0 */
    public static final class C3887d0 extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3887d0 f8786b = new C3887d0();

        public C3887d0() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Tearing down all geofences.";
        }
    }

    /* renamed from: bo.app.l$e */
    public static final class C3888e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3879l f8787b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3888e(C3879l lVar) {
            super(0);
            this.f8787b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0071c.m191c(C0072d.m201h("Max number to register newly set to "), this.f8787b.f8779m, " via server config.");
        }
    }

    /* renamed from: bo.app.l$f */
    public static final class C3889f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3889f f8788b = new C3889f();

        public C3889f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Request to set up geofences received.";
        }
    }

    /* renamed from: bo.app.l$g */
    public static final class C3890g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3890g f8789b = new C3890g();

        public C3890g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not automatically requesting Geofences on initialization due to configuration.";
        }
    }

    /* renamed from: bo.app.l$h */
    public static final class C3891h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3891h f8790b = new C3891h();

        public C3891h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$i */
    public static final class C3892i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3892i f8791b = new C3892i();

        public C3892i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Fine grained location permissions not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$j */
    public static final class C3893j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3893j f8792b = new C3893j();

        public C3893j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Background location access permission not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$k */
    public static final class C3894k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3894k f8793b = new C3894k();

        public C3894k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services not available. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$l */
    public static final class C3895l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3895l f8794b = new C3895l();

        public C3895l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Google Play Services Location API not found. Geofences not enabled.";
        }
    }

    /* renamed from: bo.app.l$m */
    public static final class C3896m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3896m f8795b = new C3896m();

        public C3896m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    /* renamed from: bo.app.l$n */
    public static final class C3897n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3897n f8796b = new C3897n();

        public C3897n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request was successful, storing last updated time.";
        }
    }

    /* renamed from: bo.app.l$o */
    public static final class C3898o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3898o f8797b = new C3898o();

        public C3898o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    /* renamed from: bo.app.l$p */
    public static final class C3899p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3899p f8798b = new C3899p();

        public C3899p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not posting geofence report.";
        }
    }

    /* renamed from: bo.app.l$q */
    public static final class C3900q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8799b;

        /* renamed from: c */
        public final /* synthetic */ C3853k1 f8800c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3900q(String str, C3853k1 k1Var) {
            super(0);
            this.f8799b = str;
            this.f8800c = k1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Failed to record geofence ");
            h.append(this.f8799b);
            h.append(" transition with transition type ");
            h.append(this.f8800c);
            h.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            return h.toString();
        }
    }

    /* renamed from: bo.app.l$r */
    public static final class C3901r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3901r f8801b = new C3901r();

        public C3901r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    /* renamed from: bo.app.l$s */
    public static final class C3902s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ List<C0034a> f8802b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3902s(List<C0034a> list) {
            super(0);
            this.f8802b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8802b.size()), "Received new geofence list of size: ");
        }
    }

    /* renamed from: bo.app.l$t */
    public static final class C3903t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3879l f8803b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3903t(C3879l lVar) {
            super(0);
            this.f8803b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8803b.f8779m), "Reached maximum number of new geofences: ");
        }
    }

    /* renamed from: bo.app.l$u */
    public static final class C3904u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C0034a f8804b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3904u(C0034a aVar) {
            super(0);
            this.f8804b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8804b, "Adding new geofence to local storage: ");
        }
    }

    /* renamed from: bo.app.l$v */
    public static final class C3905v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C3879l f8805b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3905v(C3879l lVar) {
            super(0);
            this.f8805b = lVar;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Added ");
            h.append(this.f8805b.f8773g.size());
            h.append(" new geofences to local storage.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.l$w */
    public static final class C3906w extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3906w f8806b = new C3906w();

        public C3906w() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* renamed from: bo.app.l$x */
    public static final class C3907x extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3907x f8807b = new C3907x();

        public C3907x() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    /* renamed from: bo.app.l$y */
    public static final class C3908y extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3908y f8808b = new C3908y();

        public C3908y() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    /* renamed from: bo.app.l$z */
    public static final class C3909z extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3909z f8809b = new C3909z();

        public C3909z() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    public C3879l(Context context, String str, C4274x1 x1Var, BrazeConfigurationProvider brazeConfigurationProvider, C3551a5 a5Var, C3666f2 f2Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "apiKey");
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(brazeConfigurationProvider, "configurationProvider");
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        C19383o.m32797g(f2Var, "internalIEventMessenger");
        this.f8767a = x1Var;
        this.f8768b = brazeConfigurationProvider;
        this.f8769c = a5Var;
        boolean z = true;
        mo13608c(true);
        this.f8770d = context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(f8766n.mo13609a(str), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.f8772f = sharedPreferences;
        this.f8773g = C19327t.m32661q1(C3917l1.m9080a(sharedPreferences));
        this.f8774h = C3917l1.m9083b(context);
        this.f8775i = C3917l1.m9079a(context);
        this.f8776j = new C3939m(context, str, a5Var, f2Var);
        this.f8778l = (!C3917l1.m9081a(a5Var) || !mo13601a(context)) ? false : z;
        this.f8779m = C3917l1.m9082b(a5Var);
    }

    /* renamed from: a */
    public final C4274x1 mo13594a() {
        return this.f8767a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13603b() {
        /*
            r7 = this;
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a
            bo.app.l$f r4 = p030bo.app.C3879l.C3889f.f8788b
            r2 = 0
            r3 = 0
            r5 = 7
            r0 = r6
            r1 = r7
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            bo.app.a5 r0 = r7.f8769c
            boolean r0 = p030bo.app.C3917l1.m9081a((p030bo.app.C3551a5) r0)
            r1 = 1
            if (r0 == 0) goto L_0x0024
            android.content.Context r0 = r7.f8770d
            java.lang.String r2 = "applicationContext"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            boolean r0 = r7.mo13601a((android.content.Context) r0)
            if (r0 == 0) goto L_0x0024
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r7.f8778l = r0
            com.braze.configuration.BrazeConfigurationProvider r0 = r7.f8768b
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L_0x0033
            r7.mo13606b((boolean) r1)
            goto L_0x003d
        L_0x0033:
            bo.app.l$g r4 = p030bo.app.C3879l.C3890g.f8789b
            r2 = 0
            r3 = 0
            r5 = 7
            r0 = r6
            r1 = r7
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3879l.mo13603b():void");
    }

    /* renamed from: c */
    public final void mo13608c(boolean z) {
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3908y.f8808b, 7);
        } else if (z) {
            ReentrantLock reentrantLock = this.f8771e;
            reentrantLock.lock();
            try {
                mo13599a(this.f8773g, this.f8774h);
                C19394m mVar = C19394m.f43287a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo13601a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        if (!f8766n.mo13610a(this.f8768b)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3891h.f8790b, 7);
            return false;
        } else if (!PermissionUtils.m11331a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3892i.f8791b, 6);
            return false;
        } else if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.m11331a(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C3893j.f8792b, 6);
            return false;
        } else if (!C4030o1.m9288a(context)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3894k.f8793b, 7);
            return false;
        } else {
            try {
                Class.forName("com.google.android.gms.location.LocationServices", false, C3879l.class.getClassLoader());
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3896m.f8795b, 7);
                return true;
            } catch (Exception unused) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3895l.f8794b, 7);
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo13604b(PendingIntent pendingIntent) {
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3909z.f8809b, 7);
        if (pendingIntent != null) {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3881a0.f8780b, 7);
            Context context = this.f8770d;
            Api<Api.ApiOptions.NoOptions> api = LocationServices.f33200a;
            C14017c cVar = new C14017c(context);
            C18700c cVar2 = LocationServices.f33202c;
            GoogleApiClient asGoogleApiClient = cVar.asGoogleApiClient();
            cVar2.getClass();
            PendingResultUtil.toVoidTask(asGoogleApiClient.execute(new C18702e(asGoogleApiClient, zzal.zza(pendingIntent))));
        }
        ReentrantLock reentrantLock = this.f8771e;
        reentrantLock.lock();
        try {
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C3883b0.f8782b, 7);
            this.f8772f.edit().clear().apply();
            this.f8773g.clear();
            C19394m mVar = C19394m.f43287a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: c */
    public void mo13607c() {
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3885c0.f8784b, 7);
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3887d0.f8786b, 7);
        mo13604b(this.f8774h);
    }

    /* renamed from: a */
    public final boolean mo13602a(String str, C3853k1 k1Var) {
        C19383o.m32797g(str, "geofenceId");
        C19383o.m32797g(k1Var, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.f8771e;
        reentrantLock.lock();
        try {
            C0034a a = mo13593a(str);
            if (a != null) {
                if (k1Var == C3853k1.ENTER) {
                    return a.f84i;
                }
                if (k1Var == C3853k1.EXIT) {
                    boolean z = a.f85j;
                    reentrantLock.unlock();
                    return z;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public void mo13605b(String str, C3853k1 k1Var) {
        C19394m mVar;
        C19383o.m32797g(str, "geofenceId");
        C19383o.m32797g(k1Var, "transitionType");
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3899p.f8798b, 6);
            return;
        }
        C3787j.C3788a aVar = C3787j.f8608h;
        String str2 = k1Var.toString();
        Locale locale = Locale.US;
        C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
        String lowerCase = str2.toLowerCase(locale);
        C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        C4208t1 c = aVar.mo13478c(str, lowerCase);
        if (c == null) {
            mVar = null;
        } else {
            if (mo13602a(str, k1Var)) {
                mo13594a().mo13838a(c);
            }
            C0034a a = mo13593a(str);
            boolean z = true;
            if (a == null || !this.f8776j.mo13691a(DateTimeUtils.m11302d(), a, k1Var)) {
                z = false;
            }
            if (z) {
                mo13594a().mo13840b(c);
            }
            mVar = C19394m.f43287a;
        }
        if (mVar == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, (Throwable) null, new C3900q(str, k1Var), 6);
        }
    }

    /* renamed from: a */
    public final C0034a mo13593a(String str) {
        T t;
        C19383o.m32797g(str, "geofenceId");
        ReentrantLock reentrantLock = this.f8771e;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.f8773g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C19383o.m32792b(((C0034a) t).f78c, str)) {
                    break;
                }
            }
            return (C0034a) t;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void mo13596a(C4257w1 w1Var) {
        C19383o.m32797g(w1Var, "location");
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3906w.f8806b, 7);
            return;
        }
        this.f8777k = w1Var;
        mo13594a().mo13831a(w1Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13597a(p030bo.app.C4299y4 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "serverConfig"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            boolean r0 = r11.mo14230f()
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.f11932a
            bo.app.l$b r5 = new bo.app.l$b
            r5.<init>(r0)
            r3 = 0
            r4 = 0
            r6 = 7
            r1 = r7
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L_0x002b
            android.content.Context r0 = r10.f8770d
            java.lang.String r1 = "applicationContext"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            boolean r0 = r10.mo13601a((android.content.Context) r0)
            if (r0 == 0) goto L_0x002b
            r0 = r8
            goto L_0x002c
        L_0x002b:
            r0 = r9
        L_0x002c:
            boolean r1 = r10.f8778l
            if (r0 == r1) goto L_0x0059
            r10.f8778l = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            bo.app.l$c r5 = new bo.app.l$c
            r5.<init>(r10)
            r4 = 0
            r6 = 6
            r1 = r7
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.f8778l
            if (r0 == 0) goto L_0x0053
            r10.mo13608c(r9)
            com.braze.configuration.BrazeConfigurationProvider r0 = r10.f8768b
            boolean r0 = r0.isAutomaticGeofenceRequestsEnabled()
            if (r0 == 0) goto L_0x0066
            r10.mo13606b((boolean) r8)
            goto L_0x0066
        L_0x0053:
            android.app.PendingIntent r0 = r10.f8774h
            r10.mo13604b((android.app.PendingIntent) r0)
            goto L_0x0066
        L_0x0059:
            bo.app.l$d r5 = new bo.app.l$d
            r5.<init>(r0)
            r3 = 0
            r4 = 0
            r6 = 7
            r1 = r7
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
        L_0x0066:
            int r0 = r11.mo14232h()
            if (r0 < 0) goto L_0x007c
            r10.f8779m = r0
            com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
            bo.app.l$e r5 = new bo.app.l$e
            r5.<init>(r10)
            r4 = 0
            r6 = 6
            r1 = r7
            r2 = r10
            com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
        L_0x007c:
            bo.app.m r0 = r10.f8776j
            r0.mo13689a((p030bo.app.C4299y4) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3879l.mo13597a(bo.app.y4):void");
    }

    /* renamed from: b */
    public void mo13606b(boolean z) {
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3907x.f8807b, 7);
        } else if (this.f8776j.mo13692a(z, DateTimeUtils.m11302d())) {
            mo13595a(this.f8775i);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo13598a(List<C0034a> list) {
        C19383o.m32797g(list, "geofenceList");
        ArrayList q1 = C19327t.m32661q1(list);
        if (!this.f8778l) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, C3901r.f8801b, 6);
            return;
        }
        if (this.f8777k != null) {
            Iterator it = q1.iterator();
            while (it.hasNext()) {
                C0034a aVar = (C0034a) it.next();
                C4257w1 w1Var = this.f8777k;
                if (w1Var != null) {
                    aVar.f89n = C3778i3.m8823a(w1Var.getLatitude(), w1Var.getLongitude(), aVar.f79d, aVar.f80e);
                }
            }
            C19323p.m32626H0(q1);
        }
        ReentrantLock reentrantLock = this.f8771e;
        reentrantLock.lock();
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3902s(q1), 7);
            SharedPreferences.Editor edit = this.f8772f.edit();
            edit.clear();
            this.f8773g.clear();
            int i = 0;
            Iterator it2 = q1.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0034a aVar2 = (C0034a) it2.next();
                if (i == this.f8779m) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3903t(this), 7);
                    break;
                }
                this.f8773g.add(aVar2);
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3904u(aVar2), 7);
                edit.putString(aVar2.f78c, aVar2.f77b.toString());
                i++;
            }
            edit.apply();
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C3905v(this), 7);
            C19394m mVar = C19394m.f43287a;
            reentrantLock.unlock();
            this.f8776j.mo13690a((List<C0034a>) q1);
            mo13608c(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo13600a(boolean z) {
        if (z) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3897n.f8796b, 7);
            this.f8776j.mo13688a(DateTimeUtils.m11302d());
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C3898o.f8797b, 7);
    }

    /* renamed from: a */
    public final void mo13595a(PendingIntent pendingIntent) {
        C19383o.m32797g(pendingIntent, "geofenceRequestIntent");
        Context context = this.f8770d;
        C19383o.m32796f(context, "applicationContext");
        C3977n1.m9196a(context, pendingIntent, (C4243v1) this);
    }

    /* renamed from: a */
    public final void mo13599a(List<C0034a> list, PendingIntent pendingIntent) {
        C19383o.m32797g(list, "geofenceList");
        C19383o.m32797g(pendingIntent, "geofenceRequestIntent");
        Context context = this.f8770d;
        C19383o.m32796f(context, "applicationContext");
        C3977n1.m9205b(context, list, pendingIntent);
    }
}
