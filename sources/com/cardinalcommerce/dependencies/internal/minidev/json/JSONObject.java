package com.cardinalcommerce.dependencies.internal.minidev.json;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p027b8.C3485d;
import p305z7.C8458a;
import p305z7.C8459b;
import p305z7.C8461d;
import p305z7.C8462e;
import p305z7.C8465g;
import p504ai.C13983i;

public class JSONObject extends HashMap<String, Object> implements C8458a, C8459b, C8461d {
    private static final long serialVersionUID = -503443796854799292L;

    public JSONObject() {
    }

    public JSONObject(Map<String, ?> map) {
        super(map);
    }

    /* renamed from: a */
    public static JSONArray m12446a(JSONArray jSONArray, Object obj) {
        if (obj == null) {
            return jSONArray;
        }
        if (jSONArray instanceof JSONArray) {
            jSONArray.addAll((JSONArray) obj);
            return jSONArray;
        }
        jSONArray.add(obj);
        return jSONArray;
    }

    public static String escape(String str) {
        C8462e eVar = C8465g.f18488a;
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        eVar.f18486d.mo21035a(sb, str);
        return sb.toString();
    }

    public static String toJSONString(Map<String, ? extends Object> map) {
        return toJSONString(map, C8465g.f18488a);
    }

    public static String toJSONString(Map<String, ? extends Object> map, C8462e eVar) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSON(map, sb, eVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable) {
        writeJSON(map, appendable, C8465g.f18488a);
    }

    public static void writeJSON(Map<String, ? extends Object> map, Appendable appendable, C8462e eVar) {
        if (map == null) {
            appendable.append("null");
        } else {
            C3485d.f8112i.mo12997a(map, appendable, eVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeJSONKV(java.lang.String r2, java.lang.Object r3, java.lang.Appendable r4, p305z7.C8462e r5) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x000d
        L_0x0005:
            z7.h$f r0 = r5.f18484b
            boolean r0 = r0.mo21036a(r2)
            if (r0 != 0) goto L_0x0011
        L_0x000d:
            r4.append(r2)
            goto L_0x0020
        L_0x0011:
            r0 = 34
            r4.append(r0)
            z7.e r1 = p305z7.C8465g.f18488a
            z7.h$g r1 = r5.f18486d
            r1.mo21035a(r4, r2)
            r4.append(r0)
        L_0x0020:
            r2 = 58
            r4.append(r2)
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L_0x002f
            java.lang.String r3 = (java.lang.String) r3
            r5.mo21034b(r4, r3)
            goto L_0x0032
        L_0x002f:
            p305z7.C8465g.m16900a(r3, r4, r5)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject.writeJSONKV(java.lang.String, java.lang.Object, java.lang.Appendable, z7.e):void");
    }

    public JSONObject appendField(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public Number getAsNumber(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Number ? (Number) obj : Long.valueOf(obj.toString());
    }

    public String getAsString(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public void merge(Object obj) {
        m12447a(this, obj);
    }

    public String toJSONString() {
        return toJSONString(this, C8465g.f18488a);
    }

    public String toJSONString(C8462e eVar) {
        return toJSONString(this, eVar);
    }

    public String toString() {
        return toJSONString(this, C8465g.f18488a);
    }

    public String toString(C8462e eVar) {
        return toJSONString(this, eVar);
    }

    public void writeJSONString(Appendable appendable) {
        writeJSON(this, appendable, C8465g.f18488a);
    }

    public void writeJSONString(Appendable appendable, C8462e eVar) {
        writeJSON(this, appendable, eVar);
    }

    /* renamed from: a */
    public static JSONObject m12447a(JSONObject jSONObject, Object obj) {
        Object obj2;
        if (obj == null) {
            return jSONObject;
        }
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (String str : jSONObject.keySet()) {
                Object obj3 = jSONObject.get(str);
                Object obj4 = jSONObject2.get(str);
                if (obj4 != null) {
                    if (obj3 instanceof JSONArray) {
                        obj2 = m12446a((JSONArray) obj3, obj4);
                    } else if (obj3 instanceof JSONObject) {
                        obj2 = m12447a((JSONObject) obj3, obj4);
                    } else if (!obj3.equals(obj4)) {
                        if (obj3.getClass().equals(obj4.getClass())) {
                            throw new RuntimeException(C13983i.m21493l(obj3, new StringBuilder("JSON merge can not merge two "), " Object together"));
                        }
                        throw new RuntimeException("JSON merge can not merge " + obj3.getClass().getName() + " with " + obj4.getClass().getName());
                    }
                    jSONObject.put(str, obj2);
                }
            }
            for (String str2 : jSONObject2.keySet()) {
                if (!jSONObject.containsKey(str2)) {
                    jSONObject.put(str2, jSONObject2.get(str2));
                }
            }
            return jSONObject;
        }
        throw new RuntimeException("JSON megre can not merge JSONObject with " + obj.getClass());
    }
}
