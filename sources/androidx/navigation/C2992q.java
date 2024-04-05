package androidx.navigation;

import android.annotation.SuppressLint;
import android.support.p013v4.media.C0072d;
import androidx.navigation.C2990p;
import java.util.HashMap;
import p010a9.C0048b;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: androidx.navigation.q */
public final class C2992q {

    /* renamed from: b */
    public static final HashMap<Class<?>, String> f6773b = new HashMap<>();

    /* renamed from: a */
    public final HashMap<String, C2990p<? extends C2964h>> f6774a = new HashMap<>();

    /* renamed from: b */
    public static String m7001b(Class<? extends C2990p> cls) {
        HashMap<Class<?>, String> hashMap = f6773b;
        String str = hashMap.get(cls);
        if (str == null) {
            C2990p.C2991a aVar = (C2990p.C2991a) cls.getAnnotation(C2990p.C2991a.class);
            str = aVar != null ? aVar.value() : null;
            if (str != null && !str.isEmpty()) {
                hashMap.put(cls, str);
            } else {
                StringBuilder h = C0072d.m201h("No @Navigator.Name annotation found for ");
                h.append(cls.getSimpleName());
                throw new IllegalArgumentException(h.toString());
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void mo10997a(C2990p pVar) {
        String b = m7001b(pVar.getClass());
        if (b != null && !b.isEmpty()) {
            C2990p put = this.f6774a.put(b, pVar);
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: c */
    public final <T extends C2990p<?>> T mo10998c(String str) {
        if (str != null && !str.isEmpty()) {
            T t = (C2990p) this.f6774a.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(C0048b.m163a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
