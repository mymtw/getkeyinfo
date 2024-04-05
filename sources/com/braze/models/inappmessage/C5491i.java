package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4274x1;

/* renamed from: com.braze.models.inappmessage.i */
public final class C5491i extends C5494l {
    public C5491i() {
    }

    /* renamed from: P */
    public final JSONObject mo15961P() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.mo15961P();
            try {
                jSONObject.put("type", MessageType.HTML_FULL.name());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: R */
    public final MessageType mo16002R() {
        return MessageType.HTML_FULL;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5491i(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
    }
}
