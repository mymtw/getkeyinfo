package p774vq;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lib.android.paypal.com.magnessdk.Environment;
import lib.android.paypal.com.magnessdk.network.C19874j;
import org.json.JSONObject;
import p770sq.C20168b;
import p770sq.C20169c;
import p773uq.C20205a;
import p775wq.C20218a;

/* renamed from: vq.c */
public final class C20208c extends C20211f {

    /* renamed from: b */
    public HashMap<String, String> f44801b = new HashMap<>();

    /* renamed from: c */
    public HashMap f44802c = new HashMap();

    /* renamed from: d */
    public Handler f44803d;

    /* renamed from: e */
    public JSONObject f44804e;

    /* renamed from: f */
    public C20206a f44805f = new C20206a();

    /* renamed from: g */
    public C20169c f44806g;

    public C20208c(JSONObject jSONObject, C20169c cVar, C19874j jVar) {
        cVar.getClass();
        this.f44803d = jVar;
        this.f44806g = cVar;
        this.f44804e = jSONObject;
        this.f44801b.put("appGuid", jSONObject.optString(EventsNameKt.APP_GUID));
        this.f44801b.put("libraryVersion", String.format(Locale.US, "Dyson/%S (%S %S)", new Object[]{jSONObject.optString("comp_version"), jSONObject.optString("os_type"), Build.VERSION.RELEASE}));
        this.f44801b.put("additionalData", jSONObject.toString());
    }

    /* renamed from: b */
    public static String m34558b(HashMap hashMap) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        StringBuilder h = C0072d.m201h("encoded device info payload : ");
        h.append(sb.toString());
        C20205a.m34554a(h.toString(), 0, C20208c.class);
        return sb.toString();
    }

    public final void run() {
        if (this.f44803d != null) {
            this.f44802c.put("X-PAYPAL-RESPONSE-DATA-FORMAT", "NV");
            this.f44802c.put("X-PAYPAL-REQUEST-DATA-FORMAT", "NV");
            this.f44802c.put("X-PAYPAL-SERVICE-VERSION", "1.0.0");
            this.f44802c.put("Content-Type", "application/x-www-form-urlencoded");
            JSONObject jSONObject = this.f44804e;
            if (jSONObject != null) {
                this.f44802c.put("os-type", jSONObject.optString("os_type", "Android"));
                this.f44802c.put("os-version", this.f44804e.optString("os_version", Build.VERSION.RELEASE));
                this.f44802c.put("device-model", this.f44804e.optString("device_model", Build.MODEL));
                this.f44802c.put("app-id", this.f44804e.optString("app_id", "Unknown"));
                this.f44802c.put("app-version", this.f44804e.optString("app_version", "Unknown"));
                this.f44802c.put("comp-version", this.f44804e.optString("comp_version", "4.1.2.release"));
            }
            try {
                this.f44805f.getClass();
                C20218a a = C20206a.m34556a("POST");
                Handler handler = this.f44803d;
                String str = "https://c.paypal.com/r/v1/device/client-metadata";
                if (handler != null) {
                    if (this.f44806g.f44674c == Environment.LIVE) {
                        String optString = C20168b.m34473c().f44666a.f44829c.optString("endpoint_url", str);
                        str = optString;
                        handler = this.f44803d;
                    } else {
                        str = "https://c.sandbox.paypal.com/r/v1/device/client-metadata";
                    }
                    handler.sendMessage(Message.obtain(handler, 0, str));
                }
                a.mo74457d(Uri.parse(str));
                a.mo74456c(this.f44802c);
                int a2 = a.mo74454a(m34558b(this.f44801b).getBytes("UTF-8"));
                Log.d("****MAGNES DEBUGGING MESSAGE****", "DeviceInfoRequest returned PayPal-Debug-Id: " + a.mo74455b());
                if (a2 == 200) {
                    String str2 = new String(a.mo74458e(), "UTF-8");
                    Handler handler2 = this.f44803d;
                    if (handler2 != null) {
                        handler2.sendMessage(Message.obtain(handler2, 2, str2));
                    }
                    C20205a.m34554a("DeviceInfoRequest returned HTTP" + a2 + " ,responseString: " + str2, 0, C20208c.class);
                    return;
                }
                Handler handler3 = this.f44803d;
                if (handler3 != null) {
                    handler3.sendMessage(Message.obtain(handler3, 1, Integer.valueOf(a2)));
                }
                C20205a.m34554a("DeviceInfoRequest returned HTTP" + a2, 3, C20208c.class);
            } catch (Exception e) {
                C20205a.m34555b(e, C20208c.class);
                Handler handler4 = this.f44803d;
                if (handler4 != null) {
                    handler4.sendMessage(Message.obtain(handler4, 1, e));
                }
            }
        }
    }
}
