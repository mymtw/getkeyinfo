package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.CancellationSignal;
import com.appboy.Constants;
import com.appboy.enums.LocationProviderName;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.receivers.BrazeActionReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.PermissionUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.EnumSet;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19757m0;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.C19834w0;
import p753kq.C19846a;
import p768rq.C20152a;

/* renamed from: bo.app.o */
public final class C4010o implements C3729h2 {

    /* renamed from: f */
    public static final C4012b f8971f = new C4012b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final long f8972g = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: a */
    private final Context f8973a;

    /* renamed from: b */
    private final C4274x1 f8974b;

    /* renamed from: c */
    private final BrazeConfigurationProvider f8975c;

    /* renamed from: d */
    private final LocationManager f8976d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EnumSet<LocationProviderName> f8977e;

    /* renamed from: bo.app.o$a */
    public static final class C4011a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4010o f8978b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4011a(C4010o oVar) {
            super(0);
            this.f8978b = oVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8978b.f8977e, "Using location providers: ");
        }
    }

    /* renamed from: bo.app.o$c */
    public static final class C4015c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4015c f8981b = new C4015c();

        public C4015c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location collection enabled via sdk configuration.";
        }
    }

    /* renamed from: bo.app.o$d */
    public static final class C4016d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4016d f8982b = new C4016d();

        public C4016d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Location collection disabled via sdk configuration.";
        }
    }

    /* renamed from: bo.app.o$e */
    public static final class C4017e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4017e f8983b = new C4017e();

        public C4017e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to log location recorded event.";
        }
    }

    /* renamed from: bo.app.o$f */
    public static final class C4018f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4018f f8984b = new C4018f();

        public C4018f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Location collection is disabled.";
        }
    }

    /* renamed from: bo.app.o$g */
    public static final class C4019g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4019g f8985b = new C4019g();

        public C4019g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not request single location update. Neither fine nor coarse location permissions found.";
        }
    }

    /* renamed from: bo.app.o$h */
    public static final class C4020h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Location f8986b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4020h(Location location) {
            super(0);
            this.f8986b = location;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8986b, "Setting user location to last known GPS location: ");
        }
    }

    /* renamed from: bo.app.o$i */
    public static final class C4021i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4021i f8987b = new C4021i();

        public C4021i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not request single location update. Could not find suitable location provider.";
        }
    }

    /* renamed from: bo.app.o$j */
    public static final class C4022j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8988b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4022j(String str) {
            super(0);
            this.f8988b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8988b, "Requesting single location update with provider: ");
        }
    }

    /* renamed from: bo.app.o$k */
    public static final class C4023k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Location f8989b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4023k(Location location) {
            super(0);
            this.f8989b = location;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8989b, "Location manager getCurrentLocation got location: ");
        }
    }

    /* renamed from: bo.app.o$l */
    public static final class C4024l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4024l f8990b = new C4024l();

        public C4024l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to security exception from insufficient permissions.";
        }
    }

    /* renamed from: bo.app.o$m */
    public static final class C4025m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4025m f8991b = new C4025m();

        public C4025m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request single location update due to exception.";
        }
    }

    public C4010o(Context context, C4274x1 x1Var, BrazeConfigurationProvider brazeConfigurationProvider) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(x1Var, "brazeManager");
        C19383o.m32797g(brazeConfigurationProvider, "appConfigurationProvider");
        this.f8973a = context;
        this.f8974b = x1Var;
        this.f8975c = brazeConfigurationProvider;
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            this.f8976d = (LocationManager) systemService;
            this.f8977e = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
            if (!brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
                this.f8977e = brazeConfigurationProvider.getCustomLocationProviderNames();
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4011a(this), 6);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    /* renamed from: c */
    private final boolean m9259c() {
        if (this.f8975c.isLocationCollectionEnabled()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4015c.f8981b, 6);
            return true;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4016d.f8982b, 6);
        return false;
    }

    /* renamed from: a */
    public boolean mo13379a(C4257w1 w1Var) {
        C19383o.m32797g(w1Var, "location");
        try {
            C4208t1 a = C3787j.f8608h.mo13461a(w1Var);
            if (a != null) {
                this.f8974b.mo13838a(a);
            }
            return true;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4017e.f8983b, 4);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo13378a() {
        Location a;
        if (!m9259c()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4018f.f8984b, 6);
            return false;
        }
        boolean a2 = PermissionUtils.m11331a(this.f8973a, "android.permission.ACCESS_FINE_LOCATION");
        boolean a3 = PermissionUtils.m11331a(this.f8973a, "android.permission.ACCESS_COARSE_LOCATION");
        if (!a3 && !a2) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, C4019g.f8985b, 6);
            return false;
        } else if (!a2 || (a = f8971f.mo13784a(this.f8976d)) == null) {
            C4012b bVar = f8971f;
            LocationManager locationManager = this.f8976d;
            EnumSet<LocationProviderName> enumSet = this.f8977e;
            C19383o.m32796f(enumSet, "allowedLocationProviders");
            String a4 = bVar.mo13785a(locationManager, enumSet, a2, a3);
            if (a4 == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, C4021i.f8987b, 7);
                return false;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4022j(a4), 7);
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    LocationManager locationManager2 = this.f8976d;
                    C20152a aVar = C19760n0.f43720b;
                    Executor executor = null;
                    C20152a aVar2 = aVar instanceof C19834w0 ? aVar : null;
                    if (aVar2 != null) {
                        executor = aVar2.mo72680E0();
                    }
                    if (executor == null) {
                        executor = new C19757m0(aVar);
                    }
                    locationManager2.getCurrentLocation(a4, (CancellationSignal) null, executor, new C3786i7(this));
                } else {
                    m9256a(a4);
                }
                return true;
            } catch (SecurityException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4024l.f8990b, 4);
                return false;
            } catch (Exception e2) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e2, C4025m.f8991b, 4);
                return false;
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4020h(a), 7);
            mo13379a((C4257w1) new C3969n(a));
            return true;
        }
    }

    /* renamed from: bo.app.o$b */
    public static final class C4012b {

        /* renamed from: bo.app.o$b$a */
        public static final class C4013a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ long f8979b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4013a(long j) {
                super(0);
                this.f8979b = j;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(Long.valueOf(this.f8979b), "Last known GPS location is too old and will not be used. Age ms: ");
            }
        }

        /* renamed from: bo.app.o$b$b */
        public static final class C4014b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Location f8980b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4014b(Location location) {
                super(0);
                this.f8980b = location;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f8980b, "Using last known GPS location: ");
            }
        }

        private C4012b() {
        }

        public /* synthetic */ C4012b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo13785a(LocationManager locationManager, EnumSet<LocationProviderName> enumSet, boolean z, boolean z2) {
            C19383o.m32797g(locationManager, "locationManager");
            C19383o.m32797g(enumSet, "allowedProviders");
            if (z && enumSet.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled("gps")) {
                return "gps";
            }
            if ((z2 || z) && enumSet.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled("network")) {
                return "network";
            }
            if (!z || !enumSet.contains(LocationProviderName.PASSIVE) || !locationManager.isProviderEnabled("passive")) {
                return null;
            }
            return "passive";
        }

        /* renamed from: a */
        public final Location mo13784a(LocationManager locationManager) {
            Location lastKnownLocation;
            LocationManager locationManager2 = locationManager;
            C19383o.m32797g(locationManager2, "locationManager");
            if (!locationManager2.isProviderEnabled("gps") || (lastKnownLocation = locationManager2.getLastKnownLocation("gps")) == null) {
                return null;
            }
            TimeZone timeZone = DateTimeUtils.f11946a;
            long currentTimeMillis = System.currentTimeMillis() - lastKnownLocation.getTime();
            if (currentTimeMillis > C4010o.f8972g) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4013a(currentTimeMillis), 6);
                return null;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4014b(lastKnownLocation), 7);
            return lastKnownLocation;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9255a(C4010o oVar, Location location) {
        C19383o.m32797g(oVar, "this$0");
        BrazeLogger.m11282d(BrazeLogger.f11932a, oVar, (BrazeLogger.Priority) null, (Throwable) null, new C4023k(location), 7);
        if (location != null) {
            oVar.mo13379a((C4257w1) new C3969n(location));
        }
    }

    /* renamed from: a */
    private final void m9256a(String str) {
        Intent intent = new Intent(Constants.APPBOY_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION).setClass(this.f8973a, BrazeActionReceiver.class);
        C19383o.m32796f(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        IntentUtils intentUtils = IntentUtils.f11948a;
        this.f8976d.requestSingleUpdate(str, PendingIntent.getBroadcast(this.f8973a, 0, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728));
    }
}
