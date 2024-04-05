package p614ll;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C15032m3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ll.a */
public final class C18199a {

    /* renamed from: a */
    public static final HashMap f39844a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C15032m3("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m30698a(String str) {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (C18199a.class) {
            HashMap hashMap = f39844a;
            if (!hashMap.containsKey(str)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("java", 11003);
                hashMap.put(str, hashMap2);
            }
            map = (Map) hashMap.get(str);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
