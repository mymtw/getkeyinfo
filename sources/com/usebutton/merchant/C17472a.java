package com.usebutton.merchant;

import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import com.usebutton.merchant.ApiRequest;
import com.usebutton.merchant.exception.ButtonNetworkException;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p623mm.C18248b;

/* renamed from: com.usebutton.merchant.a */
public final class C17472a extends C17484f0<Void> {

    /* renamed from: c */
    public final C17474b f38224c;

    /* renamed from: d */
    public final C17508v f38225d;

    /* renamed from: e */
    public final C18248b f38226e;

    /* renamed from: f */
    public final String f38227f = null;

    /* renamed from: g */
    public final List<C17498m> f38228g = null;

    /* renamed from: h */
    public final String f38229h;

    public C17472a(C17474b bVar, C17508v vVar, C18248b bVar2, String str, C17500o oVar) {
        super(oVar);
        this.f38224c = bVar;
        this.f38225d = vVar;
        this.f38226e = bVar2;
        this.f38229h = str;
    }

    /* renamed from: a */
    public final Object mo68646a() throws Exception {
        String a = this.f38226e.f40006a ? ((C17509w) this.f38225d).mo68686a() : null;
        C17474b bVar = this.f38224c;
        String str = this.f38227f;
        List<C17498m> list = this.f38228g;
        String str2 = this.f38229h;
        C17476c cVar = (C17476c) bVar;
        cVar.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("ifa", a);
            jSONObject.put("btn_ref", str2);
            jSONObject2.put("name", str);
            if (!list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < list.size(); i++) {
                    C17498m mVar = list.get(i);
                    List<String> a2 = mVar.mo68667a();
                    Map<String, String> attributes = mVar.getAttributes();
                    JSONObject jSONObject3 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    if (a2 != null) {
                        for (int i2 = 0; i2 < a2.size(); i2++) {
                            jSONArray2.put(i2, a2.get(i2));
                        }
                        jSONObject3.put("categories", jSONArray2);
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    if (attributes != null) {
                        for (Map.Entry next : attributes.entrySet()) {
                            jSONObject4.putOpt((String) next.getKey(), next.getValue());
                        }
                        jSONObject3.put(ResponseConstants.ATTRIBUTES, jSONObject4);
                    }
                    jSONObject3.put("id", mVar.getId());
                    jSONObject3.put("upc", mVar.mo68669c());
                    jSONObject3.put("name", mVar.getName());
                    jSONObject3.put("currency", mVar.mo68668b());
                    jSONObject3.put("value", mVar.getValue());
                    jSONObject3.put(ResponseConstants.QUANTITY, mVar.getQuantity());
                    jSONObject3.put("url", mVar.getUrl());
                    jSONArray.put(i, jSONObject3);
                }
                jSONObject2.put("products", jSONArray);
            }
            jSONObject.put("activity_data", jSONObject2);
            ApiRequest.C17471a aVar = new ApiRequest.C17471a(ApiRequest.RequestMethod.POST, "/v1/app/activity");
            aVar.f38218d = jSONObject;
            ((C17507u) cVar.f38234a).mo68683a(new ApiRequest(aVar));
            return null;
        } catch (JSONException e) {
            Log.e("c", "Error creating request body", e);
            throw new ButtonNetworkException((Exception) e);
        }
    }
}
