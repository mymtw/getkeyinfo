package p145io.branch.referral;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.i */
public final class C7043i extends C7055m<C7043i> {
    public C7043i(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19281b(Branch.C7012b bVar) {
        if (this.f15700i != null) {
            Context context = this.f15702k;
            String str = this.f15697f;
            int i = this.f15698g;
            ArrayList<String> arrayList = this.f15699h;
            String str2 = this.f15693b;
            String str3 = this.f15694c;
            String str4 = this.f15695d;
            String str5 = this.f15696e;
            JSONObject jSONObject = this.f15692a;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            try {
                jSONObject2.put("source", "android");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f15700i.mo19195g(new C7082t(context, str, i, arrayList, str2, str3, str4, str5, jSONObject2, bVar, true, this.f15701j));
            return;
        }
        if (bVar != null) {
            ((C7033d0) bVar).mo19276a((String) null, new C7032d("session has not been initialized", -101));
        }
        C7077r.m13675a("Warning: User session has not been initialized");
    }

    /* renamed from: c */
    public final String mo19282c() {
        if (this.f15700i == null) {
            return null;
        }
        Context context = this.f15702k;
        String str = this.f15697f;
        int i = this.f15698g;
        ArrayList<String> arrayList = this.f15699h;
        String str2 = this.f15693b;
        String str3 = this.f15694c;
        String str4 = this.f15695d;
        String str5 = this.f15696e;
        JSONObject jSONObject = this.f15692a;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject;
        try {
            jSONObject2.put("source", "android");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this.f15700i.mo19195g(new C7082t(context, str, i, arrayList, str2, str3, str4, str5, jSONObject2, (Branch.C7012b) null, false, this.f15701j));
    }
}
