package p358gg;

import android.annotation.TargetApi;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.ClassUtils;
import org.json.JSONObject;
import p365hg.C12869i0;
import p365hg.C12882n;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: gg.a */
public final class C12797a {

    /* renamed from: a */
    public static HashMap<String, NsdManager.RegistrationListener> f28269a = new HashMap<>();

    /* renamed from: gg.a$a */
    public static class C12798a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        public final /* synthetic */ String f28270a;

        /* renamed from: b */
        public final /* synthetic */ String f28271b;

        public C12798a(String str, String str2) {
            this.f28270a = str;
            this.f28271b = str2;
        }

        public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C12797a.m20437a(this.f28271b);
        }

        public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f28270a.equals(nsdServiceInfo.getServiceName())) {
                C12797a.m20437a(this.f28271b);
            }
        }

        public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static void m20437a(String str) {
        Class<C12797a> cls = C12797a.class;
        if (!C13080a.m20762b(cls)) {
            try {
                m20438b(str);
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    public static void m20438b(String str) {
        Class<C12797a> cls = C12797a.class;
        if (!C13080a.m20762b(cls)) {
            try {
                NsdManager.RegistrationListener registrationListener = f28269a.get(str);
                if (registrationListener != null) {
                    ((NsdManager) C13418j.m21106b().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    f28269a.remove(str);
                }
            } catch (IllegalArgumentException e) {
                C12869i0.m20550F("gg.a", e);
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }

    /* renamed from: c */
    public static String m20439c(Map<String, String> map) {
        Class<C12797a> cls = C12797a.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        if (map == null) {
            try {
                map = new HashMap<>();
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
                return null;
            }
        }
        map.put("device", Build.DEVICE);
        map.put("model", Build.MODEL);
        return new JSONObject(map).toString();
    }

    /* renamed from: d */
    public static boolean m20440d() {
        Class<C12797a> cls = C12797a.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            C12882n b = FetchedAppSettingsManager.m20104b(C13418j.m21107c());
            return b != null && b.f28401e.contains(SmartLoginOption.Enabled);
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }

    @TargetApi(16)
    /* renamed from: e */
    public static boolean m20441e(String str) {
        Class<C12797a> cls = C12797a.class;
        if (C13080a.m20762b(cls)) {
            return false;
        }
        try {
            if (f28269a.containsKey(str)) {
                return true;
            }
            String str2 = C13418j.f29381a;
            String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", "12.3.0".replace(ClassUtils.PACKAGE_SEPARATOR_CHAR, '|')}), str});
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(format);
            nsdServiceInfo.setPort(80);
            C12798a aVar = new C12798a(format, str);
            f28269a.put(str, aVar);
            ((NsdManager) C13418j.m21106b().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return false;
        }
    }
}
