package p378jg;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.InstrumentData;
import org.json.JSONException;
import org.json.JSONObject;
import p568fn.C17782b;

/* renamed from: jg.a */
public final class C12981a implements GraphRequest.C12195b {

    /* renamed from: a */
    public final /* synthetic */ InstrumentData f28592a;

    public C12981a(InstrumentData instrumentData) {
        this.f28592a = instrumentData;
    }

    /* renamed from: a */
    public final void mo39238a(GraphResponse graphResponse) {
        JSONObject jSONObject;
        try {
            if (graphResponse.f27247d == null && (jSONObject = graphResponse.f27244a) != null && jSONObject.getBoolean("success")) {
                C17782b.m29854T(this.f28592a.f27374a);
            }
        } catch (JSONException unused) {
        }
    }
}
