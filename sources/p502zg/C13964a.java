package p502zg;

import com.google.android.material.badge.BadgeDrawable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zg.a */
public abstract class C13964a {

    /* renamed from: a */
    public static final Map<String, String> f30708a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("*", "%2A");
        hashMap.put(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        hashMap.put("%7E", "~");
        f30708a = Collections.unmodifiableMap(hashMap);
    }
}
