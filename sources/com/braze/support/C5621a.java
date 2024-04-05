package com.braze.support;

import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: com.braze.support.a */
public final class C5621a {
    /* renamed from: a */
    public static final LinkedHashMap m11379a(Map map) {
        C19383o.m32797g(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, map, BrazeLogger.Priority.W, (Throwable) null, MapUtils$a.f11966b, 6);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (entry2.getKey() instanceof String) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C19421p.m32930T(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Object key = entry3.getKey();
            Object value = entry3.getValue();
            if (value instanceof Date) {
                value = DateTimeUtils.m11300b((Date) value, BrazeDateFormat.LONG);
            } else if (value instanceof Map) {
                value = m11379a((Map) value);
            }
            linkedHashMap3.put(key, value);
        }
        return linkedHashMap3;
    }
}
