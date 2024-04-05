package p253u3;

import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: u3.s */
public final class C8155s {

    /* renamed from: b */
    public static String[] f17903b = {"city", "country", "dma", "ip_address", "lat_lng", "region"};

    /* renamed from: c */
    public static String[] f17904c = {"adid", "city", "ip_address", "lat_lng"};

    /* renamed from: a */
    public HashSet f17905a = new HashSet();

    /* renamed from: a */
    public final JSONObject mo20791a() {
        JSONObject jSONObject = new JSONObject();
        if (this.f17905a.isEmpty()) {
            return jSONObject;
        }
        String[] strArr = f17903b;
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (this.f17905a.contains(str)) {
                try {
                    jSONObject.put(str, false);
                } catch (JSONException e) {
                    C8149n.f17874c.mo20765a("u3.s", e.toString());
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final boolean mo20792b(String str) {
        return !this.f17905a.contains(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8155s.class == obj.getClass()) {
            return ((C8155s) obj).f17905a.equals(this.f17905a);
        }
        return false;
    }
}
