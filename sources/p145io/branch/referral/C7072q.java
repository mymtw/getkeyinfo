package p145io.branch.referral;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7074q0;

/* renamed from: io.branch.referral.q */
public final class C7072q {

    /* renamed from: a */
    public final C7073a f15748a = new C7073a();

    /* renamed from: b */
    public final Context f15749b;

    /* renamed from: io.branch.referral.q$a */
    public class C7073a extends C7074q0 {
    }

    public C7072q(Context context) {
        this.f15749b = context;
    }

    /* renamed from: c */
    public static C7072q m13663c() {
        Branch j = Branch.m13575j();
        if (j == null) {
            return null;
        }
        return j.f15577c;
    }

    /* renamed from: d */
    public static boolean m13664d(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo19308a() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f15749b
            if (r0 == 0) goto L_0x001a
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0014 }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = r0.versionName     // Catch:{ Exception -> 0x0014 }
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            java.lang.String r1 = "Error obtaining AppVersion"
            p145io.branch.referral.C7077r.m13676b(r1, r0)
        L_0x001a:
            java.lang.String r0 = ""
        L_0x001c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = "bnc_no_value"
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.branch.referral.C7072q.mo19308a():java.lang.String");
    }

    /* renamed from: b */
    public final C7074q0.C7076b mo19309b() {
        return new C7074q0.C7076b(this.f15749b);
    }

    /* renamed from: e */
    public final void mo19310e(ServerRequest serverRequest, JSONObject jSONObject) throws JSONException {
        Defines$RequestPath[] defines$RequestPathArr = ServerRequest.f15614i;
        int length = defines$RequestPathArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (defines$RequestPathArr[i].equals(serverRequest.f15616b)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            jSONObject.put(Defines$Jsonkey.CPUType.getKey(), System.getProperty("os.arch"));
            jSONObject.put(Defines$Jsonkey.DeviceBuildId.getKey(), Build.DISPLAY);
            jSONObject.put(Defines$Jsonkey.Locale.getKey(), Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
            jSONObject.put(Defines$Jsonkey.ConnectionType.getKey(), C7074q0.m13668a(this.f15749b));
            String key = Defines$Jsonkey.DeviceCarrier.getKey();
            TelephonyManager telephonyManager = (TelephonyManager) this.f15749b.getSystemService(ResponseConstants.PHONE);
            String str = null;
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    str = networkOperatorName;
                }
            }
            jSONObject.put(key, str);
            jSONObject.put(Defines$Jsonkey.OSVersionAndroid.getKey(), Build.VERSION.RELEASE);
        }
    }
}
