package p365hg;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hg.f */
public final class C12861f {

    /* renamed from: g */
    public static C12861f f28350g;

    /* renamed from: h */
    public static final C12862a f28351h = new C12862a();

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f28352a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f28353b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f28354c;

    /* renamed from: d */
    public final String f28355d;

    /* renamed from: e */
    public final String f28356e;

    /* renamed from: f */
    public final String f28357f;

    /* renamed from: hg.f$a */
    public static final class C12862a {
        /* renamed from: b */
        public static C12861f m20537b() {
            return new C12861f((HashMap) null, C19294b0.m32561r0(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), C19294b0.m32561r0(new Pair(102, null), new Pair(190, null), new Pair(412, null)), (String) null, (String) null, (String) null);
        }

        /* renamed from: c */
        public static HashMap m20538c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray(ResponseConstants.ITEMS);
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optInt = optJSONObject.optInt(ResponseConstants.CODE)) == 0)) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final synchronized C12861f mo45639a() {
            C12861f fVar;
            try {
                if (C12861f.f28350g == null) {
                    C12861f.f28351h.getClass();
                    C12861f.f28350g = m20537b();
                }
                fVar = C12861f.f28350g;
                if (fVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th) {
                throw th;
            }
            return fVar;
        }
    }

    public C12861f(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.f28352a = hashMap;
        this.f28353b = hashMap2;
        this.f28354c = hashMap3;
        this.f28355d = str;
        this.f28356e = str2;
        this.f28357f = str3;
    }
}
