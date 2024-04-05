package p145io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.x */
public final class C7088x extends ServerRequest {
    public C7088x(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
        super(defines$RequestPath, jSONObject, context);
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
        try {
            this.f15617c.mo19335y("bnc_session_id", c0Var.mo19274a().getString(Defines$Jsonkey.SessionID.getKey()));
            this.f15617c.mo19335y("bnc_randomized_bundle_token", c0Var.mo19274a().getString(Defines$Jsonkey.RandomizedBundleToken.getKey()));
            this.f15617c.mo19335y("bnc_user_url", c0Var.mo19274a().getString(Defines$Jsonkey.Link.getKey()));
            this.f15617c.mo19335y("bnc_install_params", "bnc_no_value");
            this.f15617c.mo19334x("bnc_no_value");
            this.f15617c.mo19335y("bnc_identity", "bnc_no_value");
            this.f15617c.mo19314c();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
