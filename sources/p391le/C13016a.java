package p391le;

import com.etsy.android.lib.models.apiv3.filters.AttributeValue;
import com.etsy.android.lib.models.apiv3.filters.ValueFacet;
import com.etsy.android.p327ui.search.filters.refactor.C10798d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19456j;
import p753kq.C19857l;

/* renamed from: le.a */
public final class C13016a {

    /* renamed from: le.a$a */
    public static final class C13017a {
        /* renamed from: a */
        public static String m20733a(Map map) {
            C19383o.m32797g(map, "selectedDynamicFilters");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (!((Collection) entry.getValue()).isEmpty()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String Z0 = C19327t.m32644Z0((List) entry2.getValue(), "|", (String) null, (String) null, (C19857l) null, 62);
                arrayList.add(((String) entry2.getKey()) + ":{" + Z0 + '}');
            }
            return C19327t.m32644Z0(arrayList, ",", (String) null, (String) null, (C19857l) null, 62);
        }
    }

    /* renamed from: a */
    public static C10798d m20732a(String str, ValueFacet valueFacet, List list) {
        String id;
        AttributeValue attributeValue;
        String name;
        AttributeValue attributeValue2 = valueFacet.getAttributeValue();
        Integer num = null;
        if (attributeValue2 == null || (id = attributeValue2.getId()) == null || (attributeValue = valueFacet.getAttributeValue()) == null || (name = attributeValue.getName()) == null) {
            return null;
        }
        boolean contains = list.contains(id);
        String count = valueFacet.getCount();
        if (count != null) {
            num = C19456j.m33016T0(count);
        }
        boolean z = true;
        if (num != null && num.intValue() <= 0) {
            z = false;
        }
        return new C10798d(id, str, name, contains, z);
    }
}
