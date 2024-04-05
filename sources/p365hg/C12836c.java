package p365hg;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hg.c */
public final class C12836c {

    /* renamed from: a */
    public static final HashMap f28332a;

    /* renamed from: hg.c$a */
    public static final class C12837a implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: hg.c$b */
    public static final class C12838b implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: hg.c$c */
    public static final class C12839c implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: hg.c$d */
    public static final class C12840d implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: hg.c$e */
    public static final class C12841e implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            jSONObject.put(str, obj);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: hg.c$f */
    public static final class C12842f implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONArray jSONArray = new JSONArray();
            for (String put : (String[]) obj) {
                jSONArray.put(put);
            }
            jSONObject.put(str, jSONArray);
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: hg.c$g */
    public static final class C12843g implements C12844h {
        /* renamed from: a */
        public final void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }

        /* renamed from: b */
        public final void mo45621b(Bundle bundle, Object obj, String str) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            int length = jSONArray.length();
            while (i < length) {
                Object obj2 = jSONArray.get(i);
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                    i++;
                } else {
                    StringBuilder h = C0072d.m201h("Unexpected type in an array: ");
                    h.append(obj2.getClass());
                    throw new IllegalArgumentException(h.toString());
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: hg.c$h */
    public interface C12844h {
        /* renamed from: a */
        void mo45620a(JSONObject jSONObject, String str, Object obj) throws JSONException;

        /* renamed from: b */
        void mo45621b(Bundle bundle, Object obj, String str) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f28332a = hashMap;
        hashMap.put(Boolean.class, new C12837a());
        hashMap.put(Integer.class, new C12838b());
        hashMap.put(Long.class, new C12839c());
        hashMap.put(Double.class, new C12840d());
        hashMap.put(String.class, new C12841e());
        hashMap.put(String[].class, new C12842f());
        hashMap.put(JSONArray.class, new C12843g());
    }

    /* renamed from: a */
    public static final Bundle m20473a(JSONObject jSONObject) throws JSONException {
        C19383o.m32797g(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m20473a((JSONObject) obj));
                } else {
                    C12844h hVar = (C12844h) f28332a.get(obj.getClass());
                    if (hVar != null) {
                        C19383o.m32796f(next, "key");
                        hVar.mo45621b(bundle, obj, next);
                    } else {
                        StringBuilder h = C0072d.m201h("Unsupported type: ");
                        h.append(obj.getClass());
                        throw new IllegalArgumentException(h.toString());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static final JSONObject m20474b(Bundle bundle) throws JSONException {
        C19383o.m32797g(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(next, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(next, m20474b((Bundle) obj));
                } else {
                    C12844h hVar = (C12844h) f28332a.get(obj.getClass());
                    if (hVar != null) {
                        C19383o.m32796f(next, "key");
                        hVar.mo45620a(jSONObject, next, obj);
                    } else {
                        StringBuilder h = C0072d.m201h("Unsupported type: ");
                        h.append(obj.getClass());
                        throw new IllegalArgumentException(h.toString());
                    }
                }
            }
        }
        return jSONObject;
    }
}
