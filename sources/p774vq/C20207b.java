package p774vq;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.network.utils.AuthHeaderBuilderKt;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.network.C19874j;
import org.json.JSONObject;
import p770sq.C20169c;
import p773uq.C20205a;
import p775wq.C20218a;

/* renamed from: vq.b */
public final class C20207b extends C20211f {

    /* renamed from: b */
    public JSONObject f44795b;

    /* renamed from: c */
    public int f44796c;

    /* renamed from: d */
    public HashMap f44797d = new HashMap();

    /* renamed from: e */
    public Handler f44798e;

    /* renamed from: f */
    public C20206a f44799f;

    /* renamed from: g */
    public C20169c f44800g;

    public C20207b(JSONObject jSONObject, C20169c cVar, C19874j jVar) {
        this.f44796c = cVar.f44672a;
        this.f44795b = jSONObject;
        this.f44798e = jVar;
        this.f44800g = cVar;
        this.f44799f = new C20206a();
    }

    /* renamed from: b */
    public final void mo74451b() {
        this.f44797d.put("User-Agent", String.format("%s/%s/%s/%s/Android", new Object[]{this.f44795b.optString("app_id"), this.f44795b.optString("app_version"), this.f44795b.optString("app_version"), this.f44795b.optString(EventsNameKt.APP_GUID)}));
        this.f44797d.put("Accept-Language", "en-us");
    }

    public final void run() {
        if (this.f44798e != null) {
            try {
                mo74451b();
                StringBuilder sb = new StringBuilder("https://b.stats.paypal.com/counter.cgi");
                sb.append("?p=");
                sb.append(this.f44795b.optString(AuthHeaderBuilderKt.PAIRING_ID));
                sb.append("&i=");
                sb.append(this.f44795b.optString("ip_addrs"));
                sb.append("&t=");
                sb.append(String.valueOf(System.currentTimeMillis() / 1000));
                if (this.f44796c == -1) {
                    sb.append("&s=");
                    sb.append(this.f44795b.optString("app_id"));
                } else {
                    sb.append("&a=");
                    sb.append(this.f44796c);
                }
                Handler handler = this.f44798e;
                if (handler != null) {
                    handler.sendMessage(Message.obtain(handler, 20, sb));
                }
                this.f44799f.getClass();
                C20218a a = C20206a.m34556a("GET");
                a.mo74456c(this.f44797d);
                a.mo74457d(Uri.parse(sb.toString()));
                C20205a.m34554a("Sending BeaconRequest : " + sb.toString(), 0, C20207b.class);
                int a2 = a.mo74454a((byte[]) null);
                if (a2 == 200) {
                    String str = new String(a.mo74458e(), "UTF-8");
                    C20205a.m34554a("BeaconRequest returned HTTP" + a2 + " ,responseString: " + str, 0, C20207b.class);
                    Handler handler2 = this.f44798e;
                    if (handler2 != null) {
                        handler2.sendMessage(Message.obtain(handler2, 22, str));
                        return;
                    }
                    return;
                }
                Handler handler3 = this.f44798e;
                if (handler3 != null) {
                    handler3.sendMessage(Message.obtain(handler3, 21, "Beacon return non-200 status code : " + a2));
                }
                C20205a.m34554a("BeaconRequest returned HTTP" + a2, 3, C20207b.class);
            } catch (Exception e) {
                C20205a.m34555b(e, C20207b.class);
                Handler handler4 = this.f44798e;
                if (handler4 != null) {
                    handler4.sendMessage(Message.obtain(handler4, 21, "Beacon return non-200 status code : " + e));
                }
            }
        }
    }
}
