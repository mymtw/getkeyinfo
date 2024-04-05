package com.usebutton.merchant;

import android.util.Log;
import com.usebutton.merchant.ApiRequest;
import com.usebutton.merchant.exception.ButtonNetworkException;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p623mm.C18248b;

/* renamed from: com.usebutton.merchant.x */
public final class C17511x extends C17484f0<Void> {

    /* renamed from: c */
    public final C17474b f38294c;

    /* renamed from: d */
    public final List<Event> f38295d;

    /* renamed from: e */
    public final C17508v f38296e;

    /* renamed from: f */
    public final C18248b f38297f;

    public C17511x(C17474b bVar, C17509w wVar, C18248b bVar2, List list, C17501p pVar) {
        super(pVar);
        this.f38294c = bVar;
        this.f38296e = wVar;
        this.f38297f = bVar2;
        this.f38295d = list;
    }

    /* renamed from: a */
    public final Object mo68646a() throws Exception {
        String a = this.f38297f.f40006a ? ((C17509w) this.f38296e).mo68686a() : null;
        C17474b bVar = this.f38294c;
        List<Event> list = this.f38295d;
        C17476c cVar = (C17476c) bVar;
        cVar.getClass();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                jSONArray.put(i, list.get(i).mo68643a());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ifa", a);
            jSONObject.put("current_time", C17505s.f38281a.format(new Date()));
            jSONObject.put("events", jSONArray);
            ApiRequest.C17471a aVar = new ApiRequest.C17471a(ApiRequest.RequestMethod.POST, "/v1/app/events");
            aVar.f38218d = jSONObject;
            ((C17507u) cVar.f38234a).mo68683a(new ApiRequest(aVar));
            return null;
        } catch (JSONException e) {
            Log.e("c", "Error creating request body", e);
            throw new ButtonNetworkException((Exception) e);
        }
    }
}
