package p145io.branch.referral;

import android.content.Context;
import androidx.appcompat.widget.C0326j;
import androidx.preference.C3039b;
import com.etsy.android.lib.models.ResponseConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.a0 */
public final class C7027a0 extends C7087w {
    public C7027a0(Context context, Branch.C7016e eVar, boolean z) {
        super(context, Defines$RequestPath.RegisterInstall, z);
        this.f15773k = eVar;
        try {
            mo19254n(new JSONObject());
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
        if (this.f15773k != null) {
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
        long k = this.f15617c.mo19321k("bnc_referrer_click_ts");
        long k2 = this.f15617c.mo19321k("bnc_install_begin_ts");
        if (k > 0) {
            try {
                this.f15615a.put(Defines$Jsonkey.ClickedReferrerTimeStamp.getKey(), k);
            } catch (JSONException unused) {
                return;
            }
        }
        if (k2 > 0) {
            this.f15615a.put(Defines$Jsonkey.InstallBeginTimeStamp.getKey(), k2);
        }
        if (!C3039b.f6917b.equals("bnc_no_value")) {
            this.f15615a.put(Defines$Jsonkey.LinkClickID.getKey(), C3039b.f6917b);
        }
    }

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        super.mo19252k(c0Var, branch);
        try {
            this.f15617c.mo19335y("bnc_user_url", c0Var.mo19274a().getString(Defines$Jsonkey.Link.getKey()));
            JSONObject a = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.Data;
            if (a.has(defines$Jsonkey.getKey())) {
                JSONObject jSONObject = new JSONObject(c0Var.mo19274a().getString(defines$Jsonkey.getKey()));
                Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Clicked_Branch_Link;
                if (jSONObject.has(defines$Jsonkey2.getKey()) && jSONObject.getBoolean(defines$Jsonkey2.getKey()) && this.f15617c.mo19328r("bnc_install_params").equals("bnc_no_value")) {
                    this.f15617c.mo19335y("bnc_install_params", c0Var.mo19274a().getString(defines$Jsonkey.getKey()));
                }
            }
            JSONObject a2 = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey3 = Defines$Jsonkey.LinkClickID;
            if (a2.has(defines$Jsonkey3.getKey())) {
                this.f15617c.mo19335y("bnc_link_click_id", c0Var.mo19274a().getString(defines$Jsonkey3.getKey()));
            } else {
                this.f15617c.mo19335y("bnc_link_click_id", "bnc_no_value");
            }
            if (c0Var.mo19274a().has(defines$Jsonkey.getKey())) {
                this.f15617c.mo19334x(c0Var.mo19274a().getString(defines$Jsonkey.getKey()));
            } else {
                this.f15617c.mo19334x("bnc_no_value");
            }
            Branch.C7016e eVar = this.f15773k;
            if (eVar != null) {
                eVar.mo19214a(branch.mo19197k(), (C7032d) null);
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
        return "install";
    }

    public C7027a0(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context, boolean z) {
        super(defines$RequestPath, jSONObject, context, z);
    }
}
