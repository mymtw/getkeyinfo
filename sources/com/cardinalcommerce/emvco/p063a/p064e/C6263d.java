package com.cardinalcommerce.emvco.p063a.p064e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import com.etsy.android.lib.requests.EtsyRequest;
import org.json.JSONException;
import org.json.JSONObject;
import p192n8.C7492a;
import p257u8.C8171a;
import p257u8.C8177f;

/* renamed from: com.cardinalcommerce.emvco.a.e.d */
public class C6263d extends C6270a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private final Context f13740a;

    /* renamed from: b */
    private final C7492a f13741b = C7492a.m14431g();

    public C6263d(Context context) {
        this.f13740a = context;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkrefID", C8171a.f17935h);
        } catch (JSONException e) {
            C7492a aVar = this.f13741b;
            StringBuilder h = C0072d.m201h("Unable to get DSConfiguration ");
            h.append(e.getLocalizedMessage());
            aVar.mo19849i("EMVCoInitialize", h.toString());
        }
        super.mo17766a("https://dznhtt1ebe.execute-api.us-east-2.amazonaws.com/default/MobileSDKDynamicConfiguration?operation=getkeys", jSONObject.toString(), (int) EtsyRequest.DEFAULT_TIMEOUT);
    }

    /* renamed from: b */
    private boolean m12599b(String str) {
        return str.contains("dsConfigurations");
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        super.mo17212a(exc, aVar);
        C7492a aVar2 = this.f13741b;
        StringBuilder h = C0072d.m201h("Unable to get DSConfiguration ");
        h.append(exc.getLocalizedMessage());
        aVar2.mo19849i("EMVCoInitialize", h.toString());
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        if (m12599b(str)) {
            C8177f.m16444a(this.f13740a).mo20808c("dsConfigurationString", str);
        } else {
            this.f13741b.mo19849i("EMVCoInitialize", "Invalid dynamic configurations received");
        }
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        super.mo17214a(str, i);
        C7492a aVar = this.f13741b;
        aVar.getClass();
        aVar.mo19849i(String.valueOf(i), "Unable to get DSConfiguration " + str);
    }
}
