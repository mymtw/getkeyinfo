package p521ck;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: ck.a */
public final class C14167a {
    /* renamed from: a */
    public static <T extends Parcelable> T m21954a(Bundle bundle, String str) {
        Class<C14167a> cls = C14167a.class;
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(cls.getClassLoader());
        return bundle2.getParcelable(str);
    }

    /* renamed from: b */
    public static void m21955b(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable a = m21954a(bundle, "MapOptions");
            if (a != null) {
                m21956c(bundle2, "MapOptions", a);
            }
            Parcelable a2 = m21954a(bundle, "StreetViewPanoramaOptions");
            if (a2 != null) {
                m21956c(bundle2, "StreetViewPanoramaOptions", a2);
            }
            Parcelable a3 = m21954a(bundle, "camera");
            if (a3 != null) {
                m21956c(bundle2, "camera", a3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    /* renamed from: c */
    public static void m21956c(Bundle bundle, String str, Parcelable parcelable) {
        Class<C14167a> cls = C14167a.class;
        bundle.setClassLoader(cls.getClassLoader());
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(cls.getClassLoader());
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
