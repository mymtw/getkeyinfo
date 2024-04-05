package com.appsflyer.internal;

import android.content.Context;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.n */
public final class C5100n {
    public final Context values;

    public C5100n() {
    }

    public C5100n(Context context) {
        this.values = context.getApplicationContext();
    }

    public static Map<String, Object> AFInAppEventParameterName(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventParameterName((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventParameterName((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private static Object AFInAppEventType(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                for (Object AFInAppEventType : (Collection) obj) {
                    jSONArray.put(AFInAppEventType(AFInAppEventType));
                }
                return jSONArray;
            } else if (!obj.getClass().isArray()) {
                return obj instanceof Map ? AFKeystoreWrapper((Map) obj) : ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            } else {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < length; i++) {
                    jSONArray2.put(AFInAppEventType(Array.get(obj, i)));
                }
                return jSONArray2;
            }
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static JSONObject AFKeystoreWrapper(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), AFInAppEventType(next.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static List<Object> AFInAppEventParameterName(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = AFInAppEventParameterName((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = AFInAppEventParameterName((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
