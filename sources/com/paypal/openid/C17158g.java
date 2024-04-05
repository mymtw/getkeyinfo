package com.paypal.openid;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010a9.C0048b;
import p568fn.C17782b;

/* renamed from: com.paypal.openid.g */
public final class C17158g {

    /* renamed from: com.paypal.openid.g$a */
    public static abstract class C17159a<T> {

        /* renamed from: a */
        public final String f37630a;

        /* renamed from: b */
        public final T f37631b;

        public C17159a(String str, Boolean bool) {
            this.f37630a = str;
            this.f37631b = bool;
        }
    }

    /* renamed from: com.paypal.openid.g$b */
    public static final class C17160b extends C17159a<Uri> {
        public C17160b(String str) {
            super(str, (Boolean) null);
        }
    }

    /* renamed from: a */
    public static Long m28619a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("json must not be null");
        } else if (!jSONObject.has(str)) {
            return null;
        } else {
            return Long.valueOf(jSONObject.getLong(str));
        }
    }

    /* renamed from: b */
    public static String m28620b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("json must not be null");
        } else if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException(C0048b.m163a("field \"", str, "\" is mapped to a null value"));
        } else {
            throw new JSONException(C0048b.m163a("field \"", str, "\" not found in json object"));
        }
    }

    /* renamed from: c */
    public static String m28621c(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("json must not be null");
        } else if (!jSONObject.has(str)) {
            return null;
        } else {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            throw new JSONException(C0048b.m163a("field \"", str, "\" is mapped to a null value"));
        }
    }

    /* renamed from: d */
    public static ArrayList m28622d(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                obj.getClass();
                arrayList.add(obj.toString());
            }
            return arrayList;
        }
        throw new JSONException(C0048b.m163a("field \"", str, "\" is mapped to a null value"));
    }

    /* renamed from: e */
    public static LinkedHashMap m28623e(String str, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject == null) {
            throw new NullPointerException("json must not be null");
        } else if (!jSONObject.has(str)) {
            return linkedHashMap;
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                C17782b.m29840F(string, "additional parameter values must not be null");
                linkedHashMap.put(next, string);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: f */
    public static Uri m28624f(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return Uri.parse(string);
            }
            throw new JSONException(C0048b.m163a("field \"", str, "\" is mapped to a null value"));
        }
        throw new NullPointerException("json must not be null");
    }

    /* renamed from: g */
    public static Uri m28625g(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException("json must not be null");
        } else if (!jSONObject.has(str)) {
            return null;
        } else {
            String string = jSONObject.getString(str);
            if (string != null) {
                return Uri.parse(string);
            }
            throw new JSONException(C0048b.m163a("field \"", str, "\" is mapped to a null value"));
        }
    }

    /* renamed from: h */
    public static JSONObject m28626h(Map<String, String> map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            C17782b.m29840F((String) next.getKey(), "map entries must not have null keys");
            C17782b.m29840F((String) next.getValue(), "map entries must not have null values");
            m28628j((String) next.getKey(), (String) next.getValue(), jSONObject);
        }
        return jSONObject;
    }

    /* renamed from: i */
    public static void m28627i(int i, String str, JSONObject jSONObject) {
        C17782b.m29840F(Integer.valueOf(i), "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    /* renamed from: j */
    public static void m28628j(String str, String str2, JSONObject jSONObject) {
        if (str == null) {
            throw new NullPointerException("field must not be null");
        } else if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        } else {
            throw new NullPointerException("value must not be null");
        }
    }

    /* renamed from: k */
    public static void m28629k(JSONObject jSONObject, String str, JSONArray jSONArray) {
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    /* renamed from: l */
    public static void m28630l(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                jSONObject.put(str, jSONObject2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        } else {
            throw new NullPointerException("value must not be null");
        }
    }

    /* renamed from: m */
    public static void m28631m(Long l, String str, JSONObject jSONObject) {
        if (l != null) {
            try {
                jSONObject.put(str, l);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: n */
    public static void m28632n(String str, String str2, JSONObject jSONObject) {
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: o */
    public static void m28633o(JSONObject jSONObject, String str, Uri uri) {
        if (uri != null) {
            try {
                jSONObject.put(str, uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: p */
    public static JSONArray m28634p(List list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : list) {
                jSONArray.put(obj.toString());
            }
            return jSONArray;
        }
        throw new NullPointerException("objects cannot be null");
    }
}
