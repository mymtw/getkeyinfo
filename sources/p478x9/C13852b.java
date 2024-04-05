package p478x9;

import com.etsy.android.lib.deeplinks.DeepLinkHost;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: x9.b */
public final class C13852b implements C13860g {
    /* renamed from: c */
    public static boolean m21386c(String str, String str2) {
        C19383o.m32797g(str2, "parentDomain");
        String str3 = ClassUtils.PACKAGE_SEPARATOR_CHAR + str2;
        int length = str3.length();
        return C19457k.m33021Y0(str.length() - length, 0, length, str, str3, true);
    }

    /* renamed from: a */
    public final boolean mo46684a(String str) {
        DeepLinkHost deepLinkHost = DeepLinkHost.WEB;
        if (C19457k.m33019W0(deepLinkHost.getHostName(), str, true) || m21386c(str, deepLinkHost.getHostName())) {
            return true;
        }
        DeepLinkHost deepLinkHost2 = DeepLinkHost.WEB_ALT;
        return deepLinkHost2.getHostName().equals(str) || m21386c(str, deepLinkHost2.getHostName());
    }

    /* renamed from: b */
    public final boolean mo46685b(String str) {
        DeepLinkHost deepLinkHost = DeepLinkHost.WEB_BUTTON;
        return C19457k.m33019W0(deepLinkHost.getHostName(), str, true) || m21386c(str, deepLinkHost.getHostName());
    }
}
