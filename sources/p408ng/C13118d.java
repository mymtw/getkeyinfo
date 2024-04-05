package p408ng;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;

/* renamed from: ng.d */
public final class C13118d implements GraphRequest.C12195b {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f28843a;

    public C13118d(ArrayList arrayList) {
        this.f28843a = arrayList;
    }

    /* renamed from: a */
    public final void mo39238a(GraphResponse graphResponse) {
        JSONObject jSONObject;
        try {
            if (graphResponse.f27247d == null && (jSONObject = graphResponse.f27244a) != null && jSONObject.getBoolean("success")) {
                for (C13115a aVar : this.f28843a) {
                    C17782b.m29854T(aVar.f28838a);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
