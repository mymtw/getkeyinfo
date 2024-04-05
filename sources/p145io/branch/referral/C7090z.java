package p145io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.z */
public final class C7090z extends ServerRequest {
    public C7090z(Context context) {
        super(context, Defines$RequestPath.RegisterClose);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), this.f15617c.mo19323m());
            jSONObject.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), this.f15617c.mo19322l());
            jSONObject.put(Defines$Jsonkey.SessionID.getKey(), this.f15617c.mo19327q());
            if (!this.f15617c.mo19320j().equals("bnc_no_value")) {
                jSONObject.put(Defines$Jsonkey.LinkClickID.getKey(), this.f15617c.mo19320j());
            }
            if (C7072q.m13663c() != null) {
                jSONObject.put(Defines$Jsonkey.AppVersion.getKey(), C7072q.m13663c().mo19308a());
            }
            mo19254n(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f15621g = true;
        }
    }

    /* renamed from: b */
    public final void mo19245b() {
    }

    /* renamed from: g */
    public final void mo19248g(int i, String str) {
    }

    /* renamed from: h */
    public final void mo19249h() {
    }

    /* renamed from: i */
    public final boolean mo19250i() {
        return false;
    }

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        this.f15617c.mo19334x("bnc_no_value");
    }

    public C7090z(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
        super(defines$RequestPath, jSONObject, context);
    }
}
