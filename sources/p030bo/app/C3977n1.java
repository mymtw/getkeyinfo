package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzbh;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.zzal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.time.DateUtils;
import p003a2.C0023f;
import p005a4.C0034a;
import p506ak.C14015a;
import p506ak.C14016b;
import p506ak.C14017c;
import p703wj.C18700c;
import p703wj.C18701d;
import p703wj.C18702e;
import p703wj.C18715r;
import p703wj.C18716s;
import p753kq.C19846a;

/* renamed from: bo.app.n1 */
public final class C3977n1 {

    /* renamed from: a */
    public static final C3977n1 f8941a = new C3977n1();

    /* renamed from: bo.app.n1$a */
    public static final class C3978a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3978a f8942b = new C3978a();

        public C3978a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deleting registered geofence cache.";
        }
    }

    /* renamed from: bo.app.n1$b */
    public static final class C3979b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3979b f8943b = new C3979b();

        public C3979b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$c */
    public static final class C3980c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8944b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3980c(int i) {
            super(0);
            this.f8944b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8944b), "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
        }
    }

    /* renamed from: bo.app.n1$d */
    public static final class C3981d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8945b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3981d(int i) {
            super(0);
            this.f8945b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8945b), "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
        }
    }

    /* renamed from: bo.app.n1$e */
    public static final class C3982e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8946b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3982e(int i) {
            super(0);
            this.f8946b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8946b), "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
        }
    }

    /* renamed from: bo.app.n1$f */
    public static final class C3983f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3983f f8947b = new C3983f();

        public C3983f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence registration success code in failure block with Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$g */
    public static final class C3984g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8948b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3984g(int i) {
            super(0);
            this.f8948b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8948b), "Geofence pending result returned unknown status code: ");
        }
    }

    /* renamed from: bo.app.n1$h */
    public static final class C3985h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3985h f8949b = new C3985h();

        public C3985h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while adding geofences.";
        }
    }

    /* renamed from: bo.app.n1$i */
    public static final class C3986i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ List<String> f8950b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3986i(List<String> list) {
            super(0);
            this.f8950b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Un-registering ");
            h.append(this.f8950b.size());
            h.append(" obsolete geofences from Google Play Services.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.n1$j */
    public static final class C3987j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3987j f8951b = new C3987j();

        public C3987j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No obsolete geofences need to be unregistered from Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$k */
    public static final class C3988k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ List<C0034a> f8952b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3988k(List<C0034a> list) {
            super(0);
            this.f8952b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Registering ");
            h.append(this.f8952b.size());
            h.append(" new geofences with Google Play Services.");
            return h.toString();
        }
    }

    /* renamed from: bo.app.n1$l */
    public static final class C3989l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3989l f8953b = new C3989l();

        public C3989l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No new geofences need to be registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$m */
    public static final class C3990m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3990m f8954b = new C3990m();

        public C3990m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while adding geofences.";
        }
    }

    /* renamed from: bo.app.n1$n */
    public static final class C3991n extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8955b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3991n(String str) {
            super(0);
            this.f8955b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Geofence with id: "), this.f8955b, " removed from shared preferences.");
        }
    }

    /* renamed from: bo.app.n1$o */
    public static final class C3992o extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3992o f8956b = new C3992o();

        public C3992o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully un-registered with Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$p */
    public static final class C3993p extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8957b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3993p(int i) {
            super(0);
            this.f8957b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8957b), "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
        }
    }

    /* renamed from: bo.app.n1$q */
    public static final class C3994q extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8958b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3994q(int i) {
            super(0);
            this.f8958b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8958b), "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
        }
    }

    /* renamed from: bo.app.n1$r */
    public static final class C3995r extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8959b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3995r(int i) {
            super(0);
            this.f8959b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8959b), "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
        }
    }

    /* renamed from: bo.app.n1$s */
    public static final class C3996s extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3996s f8960b = new C3996s();

        public C3996s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence un-registration success code in failure block with Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$t */
    public static final class C3997t extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ int f8961b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3997t(int i) {
            super(0);
            this.f8961b = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(Integer.valueOf(this.f8961b), "Geofence pending result returned unknown status code: ");
        }
    }

    /* renamed from: bo.app.n1$u */
    public static final class C3998u extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3998u f8962b = new C3998u();

        public C3998u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while removing geofences.";
        }
    }

    /* renamed from: bo.app.n1$v */
    public static final class C3999v extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3999v f8963b = new C3999v();

        public C3999v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requesting single location update from Google Play Services.";
        }
    }

    /* renamed from: bo.app.n1$w */
    public static final class C4000w extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4000w f8964b = new C4000w();

        public C4000w() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Single location request from Google Play services was successful.";
        }
    }

    /* renamed from: bo.app.n1$x */
    public static final class C4001x extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4001x f8965b = new C4001x();

        public C4001x() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get single location update from Google Play services.";
        }
    }

    /* renamed from: bo.app.n1$y */
    public static final class C4002y extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4002y f8966b = new C4002y();

        public C4002y() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to request location update due to exception.";
        }
    }

    /* renamed from: bo.app.n1$z */
    public static final class C4003z extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C0034a f8967b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4003z(C0034a aVar) {
            super(0);
            this.f8967b = aVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Geofence with id: "), this.f8967b.f78c, " added to shared preferences.");
        }
    }

    private C3977n1() {
    }

    /* renamed from: a */
    public static final void m9196a(Context context, PendingIntent pendingIntent, C4243v1 v1Var) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        C19383o.m32797g(v1Var, "resultListener");
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, (BrazeLogger.Priority) null, (Throwable) null, C3999v.f8963b, 7);
            LocationRequest create = LocationRequest.create();
            C19383o.m32796f(create, "create()");
            create.setPriority(100);
            create.setNumUpdates(1);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            Api<Api.ApiOptions.NoOptions> api = LocationServices.f33200a;
            C14015a aVar = new C14015a(context);
            C18715r rVar = LocationServices.f33201b;
            GoogleApiClient asGoogleApiClient = aVar.asGoogleApiClient();
            rVar.getClass();
            PendingResultUtil.toVoidTask(asGoogleApiClient.execute(new C18716s(asGoogleApiClient, create, pendingIntent))).mo69659f(new C3653e7(v1Var, 0)).mo69671r(new C3673f7(v1Var, 0));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, e, C4002y.f8966b, 4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[SYNTHETIC, Splitter:B:25:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0022 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0069 A[EDGE_INSN: B:61:0x0069->B:24:0x0069 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m9205b(android.content.Context r11, java.util.List<p005a4.C0034a> r12, android.app.PendingIntent r13) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "geofenceList"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "geofenceRequestIntent"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            bo.app.n1 r0 = f8941a     // Catch:{ Exception -> 0x011d }
            android.content.SharedPreferences r0 = r0.m9203b((android.content.Context) r11)     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = p030bo.app.C3917l1.m9080a((android.content.SharedPreferences) r0)     // Catch:{ Exception -> 0x011d }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x011d }
            r1.<init>()     // Catch:{ Exception -> 0x011d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x011d }
        L_0x0022:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x011d }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r12.next()     // Catch:{ Exception -> 0x011d }
            r5 = r2
            a4.a r5 = (p005a4.C0034a) r5     // Catch:{ Exception -> 0x011d }
            boolean r6 = r0 instanceof java.util.Collection     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x003c
            boolean r6 = r0.isEmpty()     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x003c
            goto L_0x0068
        L_0x003c:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x011d }
        L_0x0040:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x011d }
            if (r7 == 0) goto L_0x0068
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x011d }
            a4.a r7 = (p005a4.C0034a) r7     // Catch:{ Exception -> 0x011d }
            java.lang.String r8 = r7.f78c     // Catch:{ Exception -> 0x011d }
            java.lang.String r9 = r5.f78c     // Catch:{ Exception -> 0x011d }
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r9)     // Catch:{ Exception -> 0x011d }
            if (r8 == 0) goto L_0x0064
            org.json.JSONObject r7 = r7.f77b     // Catch:{ Exception -> 0x005f }
            org.json.JSONObject r8 = r5.f77b     // Catch:{ Exception -> 0x005f }
            boolean r7 = com.braze.support.JsonUtils.m11310a(r7, r8)     // Catch:{ Exception -> 0x005f }
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0064
            r7 = r4
            goto L_0x0065
        L_0x0064:
            r7 = r3
        L_0x0065:
            if (r7 == 0) goto L_0x0040
            goto L_0x0069
        L_0x0068:
            r3 = r4
        L_0x0069:
            if (r3 == 0) goto L_0x0022
            r1.add(r2)     // Catch:{ Exception -> 0x011d }
            goto L_0x0022
        L_0x006f:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x011d }
            r12.<init>()     // Catch:{ Exception -> 0x011d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x011d }
        L_0x0078:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x011d }
            if (r2 == 0) goto L_0x00af
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x011d }
            r5 = r2
            a4.a r5 = (p005a4.C0034a) r5     // Catch:{ Exception -> 0x011d }
            boolean r6 = r1.isEmpty()     // Catch:{ Exception -> 0x011d }
            if (r6 == 0) goto L_0x008c
            goto L_0x00a8
        L_0x008c:
            java.util.Iterator r6 = r1.iterator()     // Catch:{ Exception -> 0x011d }
        L_0x0090:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x011d }
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x011d }
            a4.a r7 = (p005a4.C0034a) r7     // Catch:{ Exception -> 0x011d }
            java.lang.String r7 = r7.f78c     // Catch:{ Exception -> 0x011d }
            java.lang.String r8 = r5.f78c     // Catch:{ Exception -> 0x011d }
            boolean r7 = kotlin.jvm.internal.C19383o.m32792b(r7, r8)     // Catch:{ Exception -> 0x011d }
            if (r7 == 0) goto L_0x0090
            r5 = r3
            goto L_0x00a9
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            if (r5 == 0) goto L_0x0078
            r12.add(r2)     // Catch:{ Exception -> 0x011d }
            goto L_0x0078
        L_0x00af:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x011d }
            int r2 = kotlin.collections.C19322o.m32624F0(r12)     // Catch:{ Exception -> 0x011d }
            r0.<init>(r2)     // Catch:{ Exception -> 0x011d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x011d }
        L_0x00bc:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x011d }
            if (r2 == 0) goto L_0x00ce
            java.lang.Object r2 = r12.next()     // Catch:{ Exception -> 0x011d }
            a4.a r2 = (p005a4.C0034a) r2     // Catch:{ Exception -> 0x011d }
            java.lang.String r2 = r2.f78c     // Catch:{ Exception -> 0x011d }
            r0.add(r2)     // Catch:{ Exception -> 0x011d }
            goto L_0x00bc
        L_0x00ce:
            boolean r12 = r0.isEmpty()     // Catch:{ Exception -> 0x011d }
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x00e9
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x011d }
            bo.app.n1 r12 = f8941a     // Catch:{ Exception -> 0x011d }
            r7 = 0
            r8 = 0
            bo.app.n1$i r9 = new bo.app.n1$i     // Catch:{ Exception -> 0x011d }
            r9.<init>(r0)     // Catch:{ Exception -> 0x011d }
            r10 = 7
            r6 = r12
            com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x011d }
            r12.m9204b(r11, r0)     // Catch:{ Exception -> 0x011d }
            goto L_0x00f5
        L_0x00e9:
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x011d }
            bo.app.n1 r6 = f8941a     // Catch:{ Exception -> 0x011d }
            r7 = 0
            r8 = 0
            bo.app.n1$j r9 = p030bo.app.C3977n1.C3987j.f8951b     // Catch:{ Exception -> 0x011d }
            r10 = 7
            com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x011d }
        L_0x00f5:
            boolean r12 = r1.isEmpty()     // Catch:{ Exception -> 0x011d }
            r12 = r12 ^ r4
            if (r12 == 0) goto L_0x0110
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x011d }
            bo.app.n1 r12 = f8941a     // Catch:{ Exception -> 0x011d }
            r4 = 0
            r5 = 0
            bo.app.n1$k r6 = new bo.app.n1$k     // Catch:{ Exception -> 0x011d }
            r6.<init>(r1)     // Catch:{ Exception -> 0x011d }
            r7 = 7
            r3 = r12
            com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x011d }
            r12.m9198a((android.content.Context) r11, (java.util.List<p005a4.C0034a>) r1, (android.app.PendingIntent) r13)     // Catch:{ Exception -> 0x011d }
            goto L_0x012b
        L_0x0110:
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x011d }
            bo.app.n1 r1 = f8941a     // Catch:{ Exception -> 0x011d }
            r2 = 0
            r3 = 0
            bo.app.n1$l r4 = p030bo.app.C3977n1.C3989l.f8953b     // Catch:{ Exception -> 0x011d }
            r5 = 7
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x011d }
            goto L_0x012b
        L_0x011d:
            r11 = move-exception
            r3 = r11
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
            bo.app.n1 r1 = f8941a
            com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.E
            bo.app.n1$m r4 = p030bo.app.C3977n1.C3990m.f8954b
            r5 = 4
            com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3977n1.m9205b(android.content.Context, java.util.List, android.app.PendingIntent):void");
    }

    /* renamed from: c */
    private final void m9208c(Context context, List<C0034a> list) {
        SharedPreferences.Editor edit = m9203b(context).edit();
        for (C0034a next : list) {
            edit.putString(next.f78c, next.f77b.toString());
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4003z(next), 6);
        }
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9201a(C4243v1 v1Var, Void voidR) {
        C19383o.m32797g(v1Var, "$resultListener");
        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.V, (Throwable) null, C4000w.f8964b, 6);
        v1Var.mo13600a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9200a(C4243v1 v1Var, Exception exc) {
        C19383o.m32797g(v1Var, "$resultListener");
        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.E, exc, C4001x.f8965b, 4);
        v1Var.mo13600a(false);
    }

    /* renamed from: a */
    public static final void m9195a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        C3977n1 n1Var = f8941a;
        BrazeLogger.m11282d(brazeLogger, n1Var, (BrazeLogger.Priority) null, (Throwable) null, C3978a.f8942b, 7);
        n1Var.m9203b(context).edit().clear().apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9199a(Context context, List list, Void voidR) {
        C19383o.m32797g(context, "$context");
        C19383o.m32797g(list, "$newGeofencesToRegister");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        C3977n1 n1Var = f8941a;
        BrazeLogger.m11282d(brazeLogger, n1Var, (BrazeLogger.Priority) null, (Throwable) null, C3979b.f8943b, 7);
        n1Var.m9208c(context, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m9202a(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3982e(statusCode), 6);
                        return;
                    case DateUtils.SEMI_MONTH /*1001*/:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3980c(statusCode), 6);
                        return;
                    case CloseCodes.PROTOCOL_ERROR /*1002*/:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3981d(statusCode), 6);
                        return;
                    default:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3984g(statusCode), 6);
                        return;
                }
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, (BrazeLogger.Priority) null, (Throwable) null, C3983f.f8947b, 7);
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.E, exc, C3985h.f8949b, 4);
        }
    }

    /* renamed from: a */
    private final void m9197a(Context context, List<String> list) {
        SharedPreferences.Editor edit = m9203b(context).edit();
        for (String next : list) {
            edit.remove(next);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C3991n(next), 6);
        }
        edit.apply();
    }

    /* renamed from: b */
    private final void m9204b(Context context, List<String> list) {
        Api<Api.ApiOptions.NoOptions> api = LocationServices.f33200a;
        C14017c cVar = new C14017c(context);
        C18700c cVar2 = LocationServices.f33202c;
        GoogleApiClient asGoogleApiClient = cVar.asGoogleApiClient();
        cVar2.getClass();
        PendingResultUtil.toVoidTask(asGoogleApiClient.execute(new C18702e(asGoogleApiClient, zzal.zza(list)))).mo69659f(new C3694g7(context, list)).mo69671r(new C0073e());
    }

    /* renamed from: a */
    private final void m9198a(Context context, List<C0034a> list, PendingIntent pendingIntent) {
        Context context2 = context;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C0034a aVar : list) {
            String str = aVar.f78c;
            double d = aVar.f79d;
            double d2 = aVar.f80e;
            float f = (float) aVar.f81f;
            int i = aVar.f88m;
            boolean z = aVar.f86k;
            boolean z2 = aVar.f87l ? z | true : z;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (!z2) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if (z2 && true) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (i >= 0) {
                arrayList.add(new zzbh(str, z2 ? 1 : 0, 1, d, d2, f, -1, i, -1));
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14016b bVar = (C14016b) it.next();
                if (bVar != null) {
                    Preconditions.checkNotNull(bVar, "geofence can't be null.");
                    Preconditions.checkArgument(bVar instanceof zzbh, "Geofence must be created using Geofence.Builder.");
                    arrayList2.add((zzbh) bVar);
                }
            }
        }
        Preconditions.checkArgument(!arrayList2.isEmpty(), "No geofence has been added to this request.");
        GeofencingRequest geofencingRequest = new GeofencingRequest(arrayList2, 0, "");
        Api<Api.ApiOptions.NoOptions> api = LocationServices.f33200a;
        C14017c cVar = new C14017c(context2);
        C18700c cVar2 = LocationServices.f33202c;
        GoogleApiClient asGoogleApiClient = cVar.asGoogleApiClient();
        cVar2.getClass();
        PendingResultUtil.toVoidTask(asGoogleApiClient.execute(new C18701d(asGoogleApiClient, geofencingRequest, pendingIntent))).mo69659f(new C3767h7(context2, list)).mo69671r(new C0388a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m9206b(Context context, List list, Void voidR) {
        C19383o.m32797g(context, "$context");
        C19383o.m32797g(list, "$obsoleteGeofenceIds");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        C3977n1 n1Var = f8941a;
        BrazeLogger.m11282d(brazeLogger, n1Var, (BrazeLogger.Priority) null, (Throwable) null, C3992o.f8956b, 7);
        n1Var.m9197a(context, (List<String>) list);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m9207b(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3995r(statusCode), 6);
                        return;
                    case DateUtils.SEMI_MONTH /*1001*/:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3993p(statusCode), 6);
                        return;
                    case CloseCodes.PROTOCOL_ERROR /*1002*/:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3994q(statusCode), 6);
                        return;
                    default:
                        BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.W, (Throwable) null, new C3997t(statusCode), 6);
                        return;
                }
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, (BrazeLogger.Priority) null, (Throwable) null, C3996s.f8960b, 7);
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8941a, BrazeLogger.Priority.E, exc, C3998u.f8962b, 4);
        }
    }

    /* renamed from: b */
    private final SharedPreferences m9203b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.geofences", 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ON, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
