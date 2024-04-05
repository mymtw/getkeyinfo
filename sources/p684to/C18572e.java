package p684to;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p568fn.C17782b;

/* renamed from: to.e */
public final class C18572e {
    /* renamed from: a */
    public static Map m31324a(HashMap hashMap, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            C17782b.m29840F(str, "additional parameter keys cannot be null");
            C17782b.m29840F(str2, "additional parameter values cannot be null");
            Object[] objArr = {str};
            if (!set.contains(str)) {
                linkedHashMap.put(str, str2);
            } else {
                throw new IllegalArgumentException(String.format("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
