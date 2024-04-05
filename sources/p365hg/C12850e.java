package p365hg;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.browser.customtabs.CustomTabsService;
import com.paypal.pyplcheckout.utils.BrowserPackages;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p401mg.C13080a;
import p453tf.C13418j;

/* renamed from: hg.e */
public final class C12850e {

    /* renamed from: a */
    public static final String[] f28341a = {BrowserPackages.CHROME_PACKAGE, "com.chrome.beta", "com.chrome.dev"};

    static {
        new C12850e();
    }

    /* renamed from: a */
    public static final String m20501a() {
        Class<C12850e> cls = C12850e.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            Context b = C13418j.m21106b();
            List<ResolveInfo> queryIntentServices = b.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices != null) {
                String[] strArr = f28341a;
                C19383o.m32797g(strArr, "<this>");
                HashSet hashSet = new HashSet(C19421p.m32930T(strArr.length));
                C19318k.m32619k1(hashSet, strArr);
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m20502b() {
        Class<C12850e> cls = C12850e.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            return "fbconnect://cct." + C13418j.m21106b().getPackageName();
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m20503c(String str) {
        Class<C12850e> cls = C12850e.class;
        if (C13080a.m20762b(cls)) {
            return null;
        }
        try {
            C19383o.m32797g(str, "developerDefinedRedirectURI");
            return C12879l0.m20597a(C13418j.m21106b(), str) ? str : C12879l0.m20597a(C13418j.m21106b(), m20502b()) ? m20502b() : "";
        } catch (Throwable th) {
            C13080a.m20761a(cls, th);
            return null;
        }
    }
}
