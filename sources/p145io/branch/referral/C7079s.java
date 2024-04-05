package p145io.branch.referral;

import android.app.Activity;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.C7063o;
import p145io.branch.referral.util.BRANCH_STANDARD_EVENT;

/* renamed from: io.branch.referral.s */
public final class C7079s extends ServerRequest {

    /* renamed from: j */
    public final C7063o.C7066c f15763j = null;

    public C7079s(Context context, String str, JSONObject jSONObject) {
        super(context, Defines$RequestPath.CompletedAction);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(Defines$Jsonkey.RandomizedBundleToken.getKey(), this.f15617c.mo19322l());
            jSONObject2.put(Defines$Jsonkey.RandomizedDeviceToken.getKey(), this.f15617c.mo19323m());
            jSONObject2.put(Defines$Jsonkey.SessionID.getKey(), this.f15617c.mo19327q());
            if (!this.f15617c.mo19320j().equals("bnc_no_value")) {
                jSONObject2.put(Defines$Jsonkey.LinkClickID.getKey(), this.f15617c.mo19320j());
            }
            jSONObject2.put(Defines$Jsonkey.Event.getKey(), str);
            jSONObject2.put(Defines$Jsonkey.Metadata.getKey(), jSONObject);
            mo19258r(jSONObject2);
            mo19254n(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f15621g = true;
        }
        if (str != null && str.equalsIgnoreCase(BRANCH_STANDARD_EVENT.PURCHASE.getName())) {
            C7077r.m13675a("Warning: You are sending a purchase event with our non-dedicated purchase function. Please see function sendCommerceEvent");
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

    /* renamed from: k */
    public final void mo19252k(C7031c0 c0Var, Branch branch) {
        if (c0Var.mo19274a() != null) {
            JSONObject a = c0Var.mo19274a();
            Defines$Jsonkey defines$Jsonkey = Defines$Jsonkey.BranchViewData;
            if (a.has(defines$Jsonkey.getKey()) && Branch.m13575j().mo19196i() != null) {
                String str = "";
                try {
                    JSONObject jSONObject = this.f15615a;
                    if (jSONObject != null) {
                        Defines$Jsonkey defines$Jsonkey2 = Defines$Jsonkey.Event;
                        if (jSONObject.has(defines$Jsonkey2.getKey())) {
                            str = jSONObject.getString(defines$Jsonkey2.getKey());
                        }
                    }
                    Activity i = Branch.m13575j().mo19196i();
                    JSONObject jSONObject2 = c0Var.mo19274a().getJSONObject(defines$Jsonkey.getKey());
                    C7063o b = C7063o.m13656b();
                    C7063o.C7066c cVar = this.f15763j;
                    b.getClass();
                    b.mo19299d(new C7063o.C7065b(jSONObject2, str), i, cVar);
                } catch (JSONException unused) {
                    C7063o.C7066c cVar2 = this.f15763j;
                    if (cVar2 != null) {
                        ((Branch) cVar2).mo19201r(str);
                    }
                }
            }
        }
    }

    public C7079s(Defines$RequestPath defines$RequestPath, JSONObject jSONObject, Context context) {
        super(defines$RequestPath, jSONObject, context);
    }
}
