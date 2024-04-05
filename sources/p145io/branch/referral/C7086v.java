package p145io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.v */
public final class C7086v extends ServerRequest {
    public C7086v(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
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

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        try {
            this.f15617c.mo19335y("bnc_randomized_bundle_token", c0Var.mo19274a().getString(Defines$Jsonkey.RandomizedBundleToken.getKey()));
            this.f15617c.mo19335y("bnc_user_url", c0Var.mo19274a().getString(Defines$Jsonkey.Link.getKey()));
            JSONObject a = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.ReferringData;
            if (a.has(defines$Jsonkey.getKey())) {
                this.f15617c.mo19335y("bnc_install_params", c0Var.mo19274a().getString(defines$Jsonkey.getKey()));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public final boolean mo19255o() {
        return true;
    }
}
