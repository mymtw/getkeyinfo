package com.braze.models.inappmessage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4274x1;

/* renamed from: com.braze.models.inappmessage.l */
public abstract class C5494l extends InAppMessageHtmlBase implements C5488f {

    /* renamed from: C */
    public String f11848C;

    public C5494l() {
    }

    /* renamed from: M */
    public final List<String> mo15958M() {
        ArrayList arrayList = new ArrayList();
        String str = this.f11848C;
        if (str != null && (!C19457k.m33020X0(str))) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: P */
    public JSONObject mo15961P() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.forJsonPut();
            try {
                jSONObject.putOpt("zipped_assets_url", this.f11848C);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: V */
    public final String mo16037V() {
        return this.f11848C;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5494l(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        String optString = jSONObject.optString("zipped_assets_url");
        C19383o.m32796f(optString, "it");
        if (!C19457k.m33020X0(optString)) {
            this.f11848C = optString;
        }
    }
}
