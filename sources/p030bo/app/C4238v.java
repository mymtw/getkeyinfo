package p030bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.support.p013v4.media.C0072d;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: bo.app.v */
public final class C4238v {

    /* renamed from: a */
    public static final C4238v f9386a = new C4238v();

    /* renamed from: bo.app.v$a */
    public static final class C4239a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ NetworkCapabilities f9387b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4239a(NetworkCapabilities networkCapabilities) {
            super(0);
            this.f9387b = networkCapabilities;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9387b, "Capabilities changed. ");
        }
    }

    /* renamed from: bo.app.v$b */
    public static final class C4240b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9388b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4240b(String str) {
            super(0);
            this.f9388b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Unexpected system broadcast received [");
            h.append(this.f9388b);
            h.append(']');
            return h.toString();
        }
    }

    /* renamed from: bo.app.v$c */
    public static final class C4241c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C4241c f9389b = new C4241c();

        public C4241c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private C4238v() {
    }

    /* renamed from: a */
    public static final C4103q3 m9715a(Intent intent, ConnectivityManager connectivityManager) {
        C19383o.m32797g(intent, "intent");
        C19383o.m32797g(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (C19383o.m32792b("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo == null || booleanExtra) {
                    return C4103q3.NONE;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 3) {
                        return C4103q3.GOOD;
                    }
                    if (subtype == 13 || subtype == 20) {
                        return C4103q3.GREAT;
                    }
                    return C4103q3.BAD;
                } else if (type == 1 || type == 6) {
                    return C4103q3.GREAT;
                } else {
                    if (type != 9) {
                        return C4103q3.NONE;
                    }
                    return C4103q3.GOOD;
                }
            } catch (SecurityException e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f9386a, BrazeLogger.Priority.E, e, C4241c.f9389b, 4);
                return C4103q3.NONE;
            }
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f9386a, BrazeLogger.Priority.W, (Throwable) null, new C4240b(action), 6);
            return C4103q3.NONE;
        }
    }

    /* renamed from: a */
    public static final C4103q3 m9716a(NetworkCapabilities networkCapabilities) {
        BrazeLogger.m11282d(BrazeLogger.f11932a, f9386a, BrazeLogger.Priority.V, (Throwable) null, new C4239a(networkCapabilities), 6);
        if (networkCapabilities == null) {
            return C4103q3.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return C4103q3.GREAT;
        }
        if (min > 4000) {
            return C4103q3.GOOD;
        }
        return C4103q3.BAD;
    }
}
