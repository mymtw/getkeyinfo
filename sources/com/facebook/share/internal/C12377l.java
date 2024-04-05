package com.facebook.share.internal;

import com.facebook.share.internal.C12378m;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.l */
public final class C12377l {
    /* renamed from: a */
    public static final Object m20212a(Object obj, C12378m.C12379a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        try {
            if (obj instanceof SharePhoto) {
                return aVar.mo39772a((SharePhoto) obj);
            }
            if (obj instanceof ShareOpenGraphObject) {
                ShareOpenGraphObject shareOpenGraphObject = (ShareOpenGraphObject) obj;
                JSONObject jSONObject = new JSONObject();
                for (String next : shareOpenGraphObject.keySet()) {
                    jSONObject.put(next, m20212a(shareOpenGraphObject.get(next), aVar));
                }
                return jSONObject;
            }
            if (obj instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object a : (List) obj) {
                    jSONArray.put(m20212a(a, aVar));
                }
                return jSONArray;
            }
            return null;
        } catch (Exception unused) {
        }
    }
}
