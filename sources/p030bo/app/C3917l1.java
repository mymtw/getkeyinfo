package p030bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.p013v4.media.C0072d;
import com.braze.receivers.BrazeActionReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19846a;

/* renamed from: bo.app.l1 */
public final class C3917l1 {

    /* renamed from: a */
    public static final C3917l1 f8822a = new C3917l1();

    /* renamed from: bo.app.l1$a */
    public static final class C3918a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3918a f8823b = new C3918a();

        public C3918a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled in server configuration.";
        }
    }

    /* renamed from: bo.app.l1$b */
    public static final class C3919b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3919b f8824b = new C3919b();

        public C3919b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences explicitly disabled via server configuration.";
        }
    }

    /* renamed from: bo.app.l1$c */
    public static final class C3920c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3920c f8825b = new C3920c();

        public C3920c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Geofences implicitly disabled via server configuration.";
        }
    }

    /* renamed from: bo.app.l1$d */
    public static final class C3921d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3921d f8826b = new C3921d();

        public C3921d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Did not find stored geofences.";
        }
    }

    /* renamed from: bo.app.l1$e */
    public static final class C3922e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C3922e f8827b = new C3922e();

        public C3922e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to find stored geofence keys.";
        }
    }

    /* renamed from: bo.app.l1$f */
    public static final class C3923f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8828b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3923f(String str) {
            super(0);
            this.f8828b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Received null or blank serialized geofence string for geofence id "), this.f8828b, " from shared preferences. Not parsing.");
        }
    }

    /* renamed from: bo.app.l1$g */
    public static final class C3924g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8829b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3924g(String str) {
            super(0);
            this.f8829b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8829b, "Encountered Json exception while parsing stored geofence: ");
        }
    }

    /* renamed from: bo.app.l1$h */
    public static final class C3925h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f8830b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3925h(String str) {
            super(0);
            this.f8830b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f8830b, "Encountered unexpected exception while parsing stored geofence: ");
        }
    }

    private C3917l1() {
    }

    /* renamed from: a */
    public static final PendingIntent m9079a(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE").setClass(context, BrazeActionReceiver.class);
        C19383o.m32796f(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        IntentUtils intentUtils = IntentUtils.f11948a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728);
        C19383o.m32796f(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    /* renamed from: b */
    public static final PendingIntent m9083b(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE").setClass(context, BrazeActionReceiver.class);
        C19383o.m32796f(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        IntentUtils intentUtils = IntentUtils.f11948a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728);
        C19383o.m32796f(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    /* renamed from: a */
    public static final boolean m9081a(C3551a5 a5Var) {
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        if (!a5Var.mo13094o()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8822a, BrazeLogger.Priority.I, (Throwable) null, C3920c.f8825b, 6);
        } else if (a5Var.mo13093n()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8822a, BrazeLogger.Priority.I, (Throwable) null, C3918a.f8823b, 6);
            return true;
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f8822a, BrazeLogger.Priority.I, (Throwable) null, C3919b.f8824b, 6);
        }
        return false;
    }

    /* renamed from: b */
    public static final int m9082b(C3551a5 a5Var) {
        C19383o.m32797g(a5Var, "serverConfigStorageProvider");
        if (a5Var.mo13085f() > 0) {
            return a5Var.mo13085f();
        }
        return 20;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c A[Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<p005a4.C0034a> m9080a(android.content.SharedPreferences r13) {
        /*
            java.lang.String r0 = "sharedPreferences"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r1 = r13.getAll()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r4 = r2
            goto L_0x001c
        L_0x001b:
            r4 = r3
        L_0x001c:
            if (r4 == 0) goto L_0x002b
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
            bo.app.l1 r6 = f8822a
            bo.app.l1$d r9 = p030bo.app.C3917l1.C3921d.f8826b
            r7 = 0
            r8 = 0
            r10 = 7
            com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x002b:
            java.util.Set r1 = r1.keySet()
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0043
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.f11932a
            bo.app.l1 r6 = f8822a
            com.braze.support.BrazeLogger$Priority r7 = com.braze.support.BrazeLogger.Priority.W
            bo.app.l1$e r9 = p030bo.app.C3917l1.C3922e.f8827b
            r8 = 0
            r10 = 6
            com.braze.support.BrazeLogger.m11282d(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0043:
            java.util.Iterator r1 = r1.iterator()
        L_0x0047:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            java.lang.String r5 = r13.getString(r4, r5)
            if (r5 == 0) goto L_0x0069
            boolean r6 = kotlin.text.C19457k.m33020X0(r5)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            if (r6 == 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            r6 = r2
            goto L_0x006a
        L_0x0063:
            r4 = move-exception
            r9 = r4
            goto L_0x008b
        L_0x0066:
            r4 = move-exception
            r9 = r4
            goto L_0x009b
        L_0x0069:
            r6 = r3
        L_0x006a:
            if (r6 == 0) goto L_0x007d
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.f11932a     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            bo.app.l1 r8 = f8822a     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r10 = 0
            bo.app.l1$f r11 = new bo.app.l1$f     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r11.<init>(r4)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r12 = 6
            com.braze.support.BrazeLogger.m11282d(r7, r8, r9, r10, r11, r12)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            goto L_0x0047
        L_0x007d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            a4.a r6 = new a4.a     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            r0.add(r6)     // Catch:{ JSONException -> 0x0066, Exception -> 0x0063 }
            goto L_0x0047
        L_0x008b:
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a
            bo.app.l1 r7 = f8822a
            com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.E
            bo.app.l1$h r10 = new bo.app.l1$h
            r10.<init>(r5)
            r11 = 4
            com.braze.support.BrazeLogger.m11282d(r6, r7, r8, r9, r10, r11)
            goto L_0x0047
        L_0x009b:
            com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a
            bo.app.l1 r7 = f8822a
            com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.E
            bo.app.l1$g r10 = new bo.app.l1$g
            r10.<init>(r5)
            r11 = 4
            com.braze.support.BrazeLogger.m11282d(r6, r7, r8, r9, r10, r11)
            goto L_0x0047
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C3917l1.m9080a(android.content.SharedPreferences):java.util.List");
    }
}
