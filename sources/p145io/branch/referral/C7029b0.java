package p145io.branch.referral;

import android.content.Context;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.b0 */
public final class C7029b0 extends C7087w {
    public C7029b0(Context context, Branch.C7016e eVar, boolean z) {
        super(context, Defines$RequestPath.RegisterOpen, z);
        this.f15773k = eVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), this.f15617c.mo19323m());
            jSONObject.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), this.f15617c.mo19322l());
            mo19254n(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f15621g = true;
        }
    }

    /* renamed from: b */
    public final void mo19245b() {
        this.f15773k = null;
    }

    /* renamed from: g */
    public final void mo19248g(int i, String str) {
        if (this.f15773k != null && !Branch.m13575j().mo19199n()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ResponseConstants.ERROR_MESSAGE, "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f15773k.mo19214a(jSONObject, new C7032d(C0326j.m864i("Trouble initializing Branch. ", str), i));
        }
    }

    /* renamed from: h */
    public final void mo19249h() {
    }

    /* renamed from: j */
    public final void mo19251j() {
        super.mo19251j();
        if (Branch.m13575j().f15594t) {
            Branch.C7016e eVar = this.f15773k;
            if (eVar != null) {
                eVar.mo19214a(Branch.m13575j().mo19197k(), (C7032d) null);
            }
            Branch.m13575j().mo19193a(Defines$Jsonkey.InstantDeepLinkSession.getKey(), "true");
            Branch.m13575j().f15594t = false;
        }
    }

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        super.mo19252k(c0Var, branch);
        try {
            JSONObject a = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.LinkClickID;
            if (a.has(defines$Jsonkey.getKey())) {
                this.f15617c.mo19335y("bnc_link_click_id", c0Var.mo19274a().getString(defines$Jsonkey.getKey()));
            } else {
                this.f15617c.mo19335y("bnc_link_click_id", "bnc_no_value");
            }
            JSONObject a2 = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Data;
            if (a2.has(defines$Jsonkey2.getKey())) {
                this.f15617c.mo19334x(c0Var.mo19274a().getString(defines$Jsonkey2.getKey()));
            } else {
                this.f15617c.mo19334x("bnc_no_value");
            }
            if (this.f15773k != null && !Branch.m13575j().mo19199n()) {
                this.f15773k.mo19214a(branch.mo19197k(), (C7032d) null);
            }
            this.f15617c.mo19335y("bnc_app_version", C7072q.m13663c().mo19308a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        C7087w.m13722u(branch);
    }

    /* renamed from: o */
    public final boolean mo19255o() {
        return true;
    }

    /* renamed from: s */
    public final String mo19265s() {
        return "open";
    }

    public C7029b0(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context, boolean z) {
        super(defines$RequestPath, jSONObject, context, z);
    }
}
