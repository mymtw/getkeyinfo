package com.braze.models.inappmessage;

import com.braze.enums.inappmessage.MessageType;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import org.json.JSONException;
import org.json.JSONObject;
import p030bo.app.C4274x1;

/* renamed from: com.braze.models.inappmessage.h */
public final class C5490h extends InAppMessageHtmlBase {

    /* renamed from: C */
    public Map<String, String> f11842C = C19294b0.m32559p0();

    /* renamed from: D */
    public List<String> f11843D;

    public C5490h() {
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f11843D = emptyList;
        new JSONObject();
        this.f11843D = emptyList;
    }

    /* renamed from: G */
    public final void mo15954G(Map<String, String> map) {
        C19383o.m32797g(map, "remotePathToLocalAssetMap");
        this.f11842C = map;
    }

    /* renamed from: M */
    public final List<String> mo15958M() {
        return this.f11843D;
    }

    /* renamed from: P */
    public final JSONObject mo15961P() {
        JSONObject jSONObject = this.f11772w;
        if (jSONObject == null) {
            jSONObject = super.forJsonPut();
            try {
                jSONObject.put("type", MessageType.HTML.name());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: R */
    public final MessageType mo16002R() {
        return MessageType.HTML;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5490h(JSONObject jSONObject, C4274x1 x1Var) {
        super(jSONObject, x1Var);
        C19383o.m32797g(jSONObject, "jsonObject");
        C19383o.m32797g(x1Var, "brazeManager");
        jSONObject.optJSONObject("message_fields");
        ArrayList c = JsonUtils.m11312c(jSONObject.optJSONArray("asset_urls"));
        EmptyList emptyList = EmptyList.INSTANCE;
        this.f11843D = c;
    }
}
