package com.cardinalcommerce.dependencies.internal.nimbusds.jwt;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONArray;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.facebook.AuthenticationTokenClaims;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p010a9.C0048b;

public final class JWTClaimsSet implements Serializable {

    /* renamed from: c */
    public static final Set<String> f13725c;

    /* renamed from: b */
    private final Map<String, Object> f13726b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_ISS);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_SUB);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_AUD);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_EXP);
        hashSet.add("nbf");
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_IAT);
        hashSet.add(AuthenticationTokenClaims.JSON_KEY_JIT);
        f13725c = Collections.unmodifiableSet(hashSet);
    }

    public JWTClaimsSet() {
        throw null;
    }

    public JWTClaimsSet(Map map, C6257a aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13726b = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    /* renamed from: d */
    public static JWTClaimsSet m12552d(String str) {
        return m12551a(C19382n.m32751i(str));
    }

    /* renamed from: a */
    public JSONObject mo17753a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : this.f13726b.entrySet()) {
            if (next.getValue() instanceof Date) {
                jSONObject.put(next.getKey(), Long.valueOf(((Date) next.getValue()).getTime() / 1000));
            } else if (AuthenticationTokenClaims.JSON_KEY_AUD.equals(next.getKey())) {
                List<String> a = mo17755a();
                if (a == null || a.isEmpty()) {
                    if (z) {
                        jSONObject.put(AuthenticationTokenClaims.JSON_KEY_AUD, (Object) null);
                    }
                } else if (a.size() == 1) {
                    jSONObject.put(AuthenticationTokenClaims.JSON_KEY_AUD, a.get(0));
                } else {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.addAll(a);
                    jSONObject.put(AuthenticationTokenClaims.JSON_KEY_AUD, jSONArray);
                }
            } else if (next.getValue() != null) {
                jSONObject.put(next.getKey(), next.getValue());
            } else if (z) {
                jSONObject.put(next.getKey(), (Object) null);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public Object mo17754a(String str) {
        return this.f13726b.get(str);
    }

    /* renamed from: a */
    public List<String> mo17755a() {
        Object a = mo17754a(AuthenticationTokenClaims.JSON_KEY_AUD);
        if (a instanceof String) {
            return Collections.singletonList((String) a);
        }
        try {
            List<String> c = mo17758c(AuthenticationTokenClaims.JSON_KEY_AUD);
            return c != null ? Collections.unmodifiableList(c) : Collections.emptyList();
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public JSONObject mo17756b() {
        return mo17753a(false);
    }

    /* renamed from: b */
    public String[] mo17757b(String str) {
        if (mo17754a(str) == null) {
            return null;
        }
        try {
            List list = (List) mo17754a(str);
            int size = list.size();
            String[] strArr = new String[size];
            int i = 0;
            while (i < size) {
                try {
                    strArr[i] = (String) list.get(i);
                    i++;
                } catch (ClassCastException unused) {
                    throw new ParseException(C0048b.m163a("The \"", str, "\" claim is not a list / JSON array of strings"), 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException(C0048b.m163a("The \"", str, "\" claim is not a list / JSON array"), 0);
        }
    }

    /* renamed from: c */
    public List<String> mo17758c(String str) {
        String[] b = mo17757b(str);
        if (b == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWTClaimsSet)) {
            return false;
        }
        return Objects.equals(this.f13726b, ((JWTClaimsSet) obj).f13726b);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f13726b});
    }

    public String toString() {
        return mo17756b().toJSONString();
    }

    /* renamed from: a */
    public static JWTClaimsSet m12551a(JSONObject jSONObject) {
        ArrayList arrayList;
        Class<String> cls = String.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : jSONObject.keySet()) {
            if (str.equals(AuthenticationTokenClaims.JSON_KEY_ISS)) {
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_ISS, (String) C19382n.m32756l(jSONObject, AuthenticationTokenClaims.JSON_KEY_ISS, cls));
            } else if (str.equals(AuthenticationTokenClaims.JSON_KEY_SUB)) {
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_SUB, (String) C19382n.m32756l(jSONObject, AuthenticationTokenClaims.JSON_KEY_SUB, cls));
            } else if (str.equals(AuthenticationTokenClaims.JSON_KEY_AUD)) {
                Object obj = jSONObject.get(AuthenticationTokenClaims.JSON_KEY_AUD);
                if (obj instanceof String) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add((String) C19382n.m32756l(jSONObject, AuthenticationTokenClaims.JSON_KEY_AUD, cls));
                    arrayList = arrayList2;
                } else if (obj instanceof List) {
                    arrayList = C19382n.m32750h0(jSONObject, AuthenticationTokenClaims.JSON_KEY_AUD);
                } else if (obj == null) {
                    linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_AUD, (Object) null);
                }
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_AUD, arrayList);
            } else if (str.equals(AuthenticationTokenClaims.JSON_KEY_EXP)) {
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_EXP, new Date(C19382n.m32719L(jSONObject, AuthenticationTokenClaims.JSON_KEY_EXP) * 1000));
            } else if (str.equals("nbf")) {
                linkedHashMap.put("nbf", new Date(C19382n.m32719L(jSONObject, "nbf") * 1000));
            } else if (str.equals(AuthenticationTokenClaims.JSON_KEY_IAT)) {
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_IAT, new Date(C19382n.m32719L(jSONObject, AuthenticationTokenClaims.JSON_KEY_IAT) * 1000));
            } else if (str.equals(AuthenticationTokenClaims.JSON_KEY_JIT)) {
                linkedHashMap.put(AuthenticationTokenClaims.JSON_KEY_JIT, (String) C19382n.m32756l(jSONObject, AuthenticationTokenClaims.JSON_KEY_JIT, cls));
            } else {
                linkedHashMap.put(str, jSONObject.get(str));
            }
        }
        return new JWTClaimsSet(linkedHashMap, (C6257a) null);
    }
}
