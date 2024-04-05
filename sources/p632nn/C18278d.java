package p632nn;

import android.os.Bundle;
import com.google.android.gms.common.util.BiConsumer;
import java.util.Map;
import org.json.JSONObject;
import p549dk.C17573c;
import p607km.C18144a;
import p641on.C18327e;
import p722ym.C18895a;

/* renamed from: nn.d */
public final /* synthetic */ class C18278d implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C17573c f40120a;

    public /* synthetic */ C18278d(C17573c cVar) {
        this.f40120a = cVar;
    }

    public final void accept(Object obj, Object obj2) {
        JSONObject optJSONObject;
        C17573c cVar = this.f40120a;
        String str = (String) obj;
        C18327e eVar = (C18327e) obj2;
        C18144a aVar = (C18144a) ((C18895a) cVar.f38443a).get();
        if (aVar != null) {
            JSONObject jSONObject = eVar.f40236e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = eVar.f40233b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (((Map) cVar.f38444b)) {
                            if (!optString.equals(((Map) cVar.f38444b).get(str))) {
                                ((Map) cVar.f38444b).put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", jSONObject2.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.mo69690b("fp", bundle, "personalization_assignment");
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.mo69690b("fp", bundle2, "_fpc");
                            }
                        }
                    }
                }
            }
        }
    }
}
