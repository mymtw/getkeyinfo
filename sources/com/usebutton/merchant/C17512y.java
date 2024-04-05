package com.usebutton.merchant;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.etsy.android.lib.models.ResponseConstants;
import com.usebutton.merchant.ApiRequest;
import com.usebutton.merchant.C17481e0;
import com.usebutton.merchant.exception.ButtonNetworkException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p623mm.C18248b;

/* renamed from: com.usebutton.merchant.y */
public final class C17512y extends C17484f0<C17481e0> {

    /* renamed from: c */
    public final C17474b f38298c;

    /* renamed from: d */
    public final C17508v f38299d;

    /* renamed from: e */
    public final C18248b f38300e;

    /* renamed from: f */
    public final String f38301f;

    public C17512y(C17474b bVar, C17509w wVar, C18248b bVar2, String str, C17493j jVar) {
        super(jVar);
        this.f38298c = bVar;
        this.f38299d = wVar;
        this.f38300e = bVar2;
        this.f38301f = str;
    }

    /* renamed from: a */
    public final Object mo68646a() throws Exception {
        String str;
        C17481e0.C17482a aVar = null;
        String a = this.f38300e.f40006a ? ((C17509w) this.f38299d).mo68686a() : null;
        C17474b bVar = this.f38298c;
        String str2 = this.f38301f;
        C17509w wVar = (C17509w) this.f38299d;
        wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("timezone", Calendar.getInstance().getTimeZone().getID());
        hashMap.put("os", "android");
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("device", String.format("%s %s", new Object[]{Build.MANUFACTURER, Build.MODEL}));
        WindowManager windowManager = (WindowManager) wVar.f38291a.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            str = String.format(Locale.US, "%dx%d", new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)});
        } else {
            str = "unknown";
        }
        hashMap.put("screen", str);
        hashMap.put("source", "button-merchant");
        Locale locale = Locale.getDefault();
        hashMap.put("country", locale.getCountry());
        hashMap.put("language", locale.getLanguage());
        C17476c cVar = (C17476c) bVar;
        cVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("application_id", str2);
            jSONObject.put("ifa", a);
            jSONObject.put("signals", new JSONObject(hashMap));
            ApiRequest.C17471a aVar2 = new ApiRequest.C17471a(ApiRequest.RequestMethod.POST, "/v1/app/deferred-deeplink");
            aVar2.f38218d = jSONObject;
            JSONObject optJSONObject = ((C17507u) cVar.f38234a).mo68683a(new ApiRequest(aVar2)).f38232b.optJSONObject(ResponseConstants.OBJECT);
            if (optJSONObject == null) {
                return null;
            }
            boolean z = optJSONObject.getBoolean("match");
            optJSONObject.getString("id");
            String string = optJSONObject.getString(ResponseConstants.ACTION);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("attribution");
            if (optJSONObject2 != null) {
                String string2 = optJSONObject2.getString("btn_ref");
                optJSONObject2.optString("utm_source", (String) null);
                aVar = new C17481e0.C17482a(string2);
            }
            return new C17481e0(z, string, aVar);
        } catch (JSONException e) {
            Log.e("c", "Error creating request body", e);
            throw new ButtonNetworkException((Exception) e);
        }
    }
}
