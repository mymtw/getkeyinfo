package p145io.branch.referral;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.etsy.android.lib.models.apiv3.search.QueryReformulation;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: io.branch.referral.q0 */
public abstract class C7074q0 {

    /* renamed from: a */
    public String f15750a = null;

    /* renamed from: b */
    public int f15751b = 0;

    /* renamed from: c */
    public String f15752c;

    /* renamed from: io.branch.referral.q0$a */
    public interface C7075a {
    }

    /* renamed from: io.branch.referral.q0$b */
    public static class C7076b {

        /* renamed from: a */
        public String f15753a = "bnc_no_value";

        /* renamed from: b */
        public boolean f15754b = true;

        @SuppressLint({"HardwareIds"})
        public C7076b(Context context) {
            String string = (context == null || (true ^ TextUtils.isEmpty(C7072q.m13663c().f15748a.f15750a))) ? null : Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                String r = C7077r.m13677h(context).mo19328r("bnc_randomly_generated_uuid");
                if (TextUtils.isEmpty(r) || r.equals("bnc_no_value")) {
                    r = UUID.randomUUID().toString();
                    C7077r.m13677h(context).mo19335y("bnc_randomly_generated_uuid", r);
                }
                this.f15754b = false;
            }
            this.f15753a = string;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7076b.class != obj.getClass()) {
                return false;
            }
            C7076b bVar = (C7076b) obj;
            return this.f15753a.equals(bVar.f15753a) && this.f15754b == bVar.f15754b;
        }

        public final int hashCode() {
            int i = ((this.f15754b ? 1 : 0) + true) * 31;
            String str = this.f15753a;
            return i + (str == null ? 0 : str.hashCode());
        }
    }

    /* renamed from: a */
    public static String m13668a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return activeNetworkInfo.getType() == 1 ? "wifi" : "mobile";
    }

    /* renamed from: b */
    public static String m13669b() {
        String str = "";
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator<T> it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: c */
    public static String m13670c(Context context) {
        return Build.MANUFACTURER.equalsIgnoreCase("amazon") ? context == null ? Build.MODEL.contains("AFT") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : "Android";
    }

    /* renamed from: d */
    public static DisplayMetrics m13671d(Context context) {
        DisplayManager displayManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = null;
        if (!(context == null || (displayManager = (DisplayManager) context.getSystemService(QueryReformulation.DISPLAY)) == null)) {
            display = displayManager.getDisplay(0);
        }
        if (display != null) {
            display.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: e */
    public static String m13672e(Context context) {
        UiModeManager uiModeManager;
        String str;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception unused) {
                return "UI_MODE_TYPE_UNDEFINED";
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager == null) {
            return "UI_MODE_TYPE_UNDEFINED";
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 1:
                str = "UI_MODE_TYPE_NORMAL";
                break;
            case 2:
                str = "UI_MODE_TYPE_DESK";
                break;
            case 3:
                str = "UI_MODE_TYPE_CAR";
                break;
            case 4:
                str = "UI_MODE_TYPE_TELEVISION";
                break;
            case 5:
                str = "UI_MODE_TYPE_APPLIANCE";
                break;
            case 6:
                str = "UI_MODE_TYPE_WATCH";
                break;
            default:
                return "UI_MODE_TYPE_UNDEFINED";
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13673f(android.content.Context r7) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.Class<com.google.android.gms.common.GoogleApiAvailability> r0 = com.google.android.gms.common.GoogleApiAvailability.class
            int r3 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ Exception -> 0x0041 }
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x0041 }
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.String r4 = "isGooglePlayServicesAvailable"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0041 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0041 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0041 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0041 }
            r4[r2] = r7     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r7 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x0041 }
            boolean r0 = r7 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0041 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0041 }
            if (r7 != 0) goto L_0x0041
            r7 = r1
            goto L_0x0042
        L_0x0041:
            r7 = r2
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r1 = r2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7074q0.m13673f(android.content.Context):boolean");
    }

    /* renamed from: g */
    public final boolean mo19311g(Context context, C7075a aVar) {
        this.f15752c = C7077r.m13677h(context).mo19327q();
        if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
            if (context != null) {
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    this.f15751b = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    this.f15750a = string;
                    if (TextUtils.isEmpty(string) || this.f15750a.equals("00000000-0000-0000-0000-000000000000") || this.f15751b == 1) {
                        this.f15750a = null;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                }
            }
            if (aVar != null) {
                ((Branch) aVar).mo19200q();
            }
            return false;
        } else if (m13673f(context)) {
            new HuaweiOAIDFetchTask(context, aVar).executeTask(new Void[0]);
            return true;
        } else {
            new GAdsPrefetchTask(context, aVar).executeTask(new Void[0]);
            return true;
        }
    }
}
