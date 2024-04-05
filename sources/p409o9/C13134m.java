package p409o9;

import com.etsy.android.lib.logger.C8677e;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.ClassUtils;
import p409o9.C13122d;

/* renamed from: o9.m */
public final class C13134m {

    /* renamed from: a */
    public final LinkedHashMap f28884a = new LinkedHashMap();

    /* renamed from: a */
    public final void mo45847a(String str, JsonNode jsonNode) {
        C13132l lVar;
        Iterator<JsonNode> it;
        String str2 = str;
        JsonNode jsonNode2 = jsonNode;
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        C19383o.m32796f(fields, "fieldValue.fields()");
        while (fields.hasNext()) {
            Map.Entry next = fields.next();
            if (((JsonNode) next.getValue()).getNodeType() == JsonNodeType.OBJECT) {
                String str3 = str2 + ClassUtils.PACKAGE_SEPARATOR_CHAR + ((String) next.getKey());
                Object value = next.getValue();
                C19383o.m32796f(value, "it.value");
                mo45847a(str3, (JsonNode) value);
            } else if (!C19383o.m32792b(next.getKey(), "is_in_experiment") && !C19383o.m32792b(next.getKey(), "is_operational") && !C19383o.m32792b(next.getKey(), "is_in_current_pe") && !C19383o.m32792b(next.getKey(), "should_clean_up") && !C19383o.m32792b(next.getKey(), "variants") && !C19383o.m32792b(next.getKey(), "team") && !C19383o.m32792b(next.getKey(), ResponseConstants.OWNER) && !C19383o.m32792b(next.getKey(), ResponseConstants.ENABLED) && !C19383o.m32792b(next.getKey(), "test_name") && !C19383o.m32792b(next.getKey(), "selector") && !C19383o.m32792b(next.getKey(), "config_hash") && !C19383o.m32792b(next.getKey(), str2)) {
                String str4 = str2 + ClassUtils.PACKAGE_SEPARATOR_CHAR + ((String) next.getKey());
                Object value2 = next.getValue();
                C19383o.m32796f(value2, "it.value");
                mo45848b(str4, (JsonNode) value2);
            }
        }
        String asText = jsonNode2.get(ResponseConstants.ENABLED) != null ? jsonNode2.get(ResponseConstants.ENABLED).asText() : "";
        String asText2 = jsonNode2.hasNonNull("config_hash") ? jsonNode2.get("config_hash").asText() : null;
        LinkedHashMap linkedHashMap = this.f28884a;
        if (!jsonNode2.hasNonNull("test_name") || !jsonNode2.hasNonNull("selector")) {
            C19383o.m32796f(asText, "enabledValue");
            lVar = new C13132l(str, asText, (String) null, (String) null, C13122d.C13123a.m20789a(jsonNode), asText2, 28);
        } else {
            String asText3 = jsonNode2.get("test_name").asText();
            String asText4 = jsonNode2.get("selector").asText();
            ArrayList arrayList = new ArrayList();
            if (jsonNode2.hasNonNull("pes")) {
                JsonNode jsonNode3 = jsonNode2.get("pes");
                if (jsonNode3.isArray()) {
                    Iterator<JsonNode> it2 = jsonNode3.iterator();
                    while (it2.hasNext()) {
                        JsonNode next2 = it2.next();
                        if (!next2.hasNonNull("test_name") || !next2.hasNonNull(ResponseConstants.ENABLED) || !next2.hasNonNull("selector")) {
                            it = it2;
                        } else {
                            String asText5 = next2.get("test_name").asText();
                            String asText6 = next2.get(ResponseConstants.ENABLED).asText();
                            String asText7 = next2.get("selector").asText();
                            String asText8 = next2.hasNonNull("config_hash") ? next2.get("config_hash").asText() : null;
                            it = it2;
                            C19383o.m32796f(asText5, "peTestName");
                            C19383o.m32796f(asText6, "peEnabledValue");
                            arrayList.add(new C13132l(asText5, asText6, asText5, asText7, C13122d.C13123a.m20789a(jsonNode), asText8, 16));
                        }
                        JsonNode jsonNode4 = jsonNode;
                        it2 = it;
                    }
                }
            }
            C19383o.m32796f(asText, "enabledValue");
            lVar = new C13132l(str, asText, asText3, asText4, (List<? extends C8677e.C8678a>) arrayList, C13122d.C13123a.m20789a(jsonNode), asText2);
        }
        linkedHashMap.put(str2, lVar);
    }

    /* renamed from: b */
    public final void mo45848b(String str, JsonNode jsonNode) {
        jsonNode.toString();
        LinkedHashMap linkedHashMap = this.f28884a;
        String asText = jsonNode.asText();
        C19383o.m32796f(asText, "fieldValue.asText()");
        linkedHashMap.put(str, new C13132l(str, asText, (String) null, (String) null, (C13122d) null, (String) null, 124));
    }
}
