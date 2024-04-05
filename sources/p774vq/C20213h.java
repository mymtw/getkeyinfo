package p774vq;

import android.content.Context;
import android.os.Handler;
import java.io.File;
import lib.android.paypal.com.magnessdk.network.C19874j;
import org.json.JSONException;
import org.json.JSONObject;
import p770sq.C20169c;
import p772tq.C20204b;
import p773uq.C20205a;

/* renamed from: vq.h */
public final class C20213h {

    /* renamed from: a */
    public Context f44819a;

    /* renamed from: b */
    public Handler f44820b;

    /* renamed from: c */
    public C20169c f44821c;

    /* renamed from: d */
    public JSONObject f44822d;

    public C20213h(C20169c cVar, C19874j jVar) {
        JSONObject jSONObject;
        Class<C20213h> cls = C20213h.class;
        this.f44819a = cVar.f44673b;
        this.f44821c = cVar;
        this.f44820b = jVar;
        try {
            jSONObject = mo74460b();
            if (jSONObject == null) {
                new C20214i(this, this.f44821c, this.f44820b).mo74459a();
                jSONObject = m34571c();
            } else {
                Context context = this.f44819a;
                C20205a.m34554a("Loading loadCachedConfigTime", 0, cls);
                if (System.currentTimeMillis() > (jSONObject.optLong("conf_refresh_time_interval", 0) * 1000) + Long.parseLong(C20204b.m34551a(new File(context.getFilesDir(), "RAMP_CONFIG_TIME")))) {
                    C20205a.m34554a("Cached config used while fetching.", 0, cls);
                    new C20214i(this, this.f44821c, this.f44820b).mo74459a();
                }
            }
        } catch (Exception e) {
            C20205a.m34555b(e, cls);
            jSONObject = m34571c();
        }
        this.f44822d = jSONObject;
        try {
            C20205a.m34554a(jSONObject.toString(2), 0, cls);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m34570a(Context context, String str) {
        C20205a.m34554a("entering saveConfigData", 0, C20213h.class);
        File file = new File(context.getFilesDir(), "RAMP_CONFIG_DATA");
        File file2 = new File(context.getFilesDir(), "RAMP_CONFIG_TIME");
        C20204b.m34552b(file, str);
        C20204b.m34552b(file2, String.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static JSONObject m34571c() {
        Class<C20213h> cls = C20213h.class;
        C20205a.m34554a("entering getDefaultConfig", 0, cls);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hw", 0);
            jSONObject.put("conf_refresh_time_interval", 7200);
        } catch (JSONException e) {
            C20205a.m34555b(e, cls);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final JSONObject mo74460b() {
        Class<C20213h> cls = C20213h.class;
        C20205a.m34554a("entering getCachedConfig", 0, cls);
        try {
            Context context = this.f44819a;
            C20205a.m34554a("Loading loadCachedConfigData", 0, cls);
            String a = C20204b.m34551a(new File(context.getFilesDir(), "RAMP_CONFIG_DATA"));
            if (!a.isEmpty()) {
                C20205a.m34554a("leaving getCachedConfig,cached config loadsuccessfully", 0, cls);
                return new JSONObject(a);
            }
            C20205a.m34554a("leaving getCachedConfig,cached config loaded empty", 0, cls);
            return null;
        } catch (Exception e) {
            C20205a.m34555b(e, cls);
        }
    }
}
