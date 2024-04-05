package p253u3;

import android.app.Activity;
import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u3.t */
public final class C8156t {
    /* renamed from: a */
    public static boolean m16410a(Context context, String str) {
        try {
            return Integer.parseInt(Activity.class.getMethod("checkSelfPermission", new Class[]{String.class}).invoke(context, new Object[]{str}).toString()) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static JSONObject m16411b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            C8149n.f17874c.mo20765a("u3.t", e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            C8149n.f17874c.mo20765a("u3.t", e2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m16412c(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: d */
    public static String m16413d(String str) {
        if (m16412c(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }
}
