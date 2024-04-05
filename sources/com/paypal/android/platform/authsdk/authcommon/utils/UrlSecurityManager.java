package com.paypal.android.platform.authsdk.authcommon.utils;

import android.webkit.URLUtil;
import kotlin.jvm.internal.C19383o;

public final class UrlSecurityManager {
    private final boolean isDebuggable;

    public UrlSecurityManager(boolean z) {
        this.isDebuggable = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean containsInternalDomain(java.lang.String r9) {
        /*
            r8 = this;
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r0 = 0
            if (r9 != 0) goto L_0x0009
            goto L_0x0088
        L_0x0009:
            java.lang.String r9 = r9.getHost()
            if (r9 != 0) goto L_0x0011
            goto L_0x0088
        L_0x0011:
            int r1 = r9.length()
            r2 = 1
            if (r1 != 0) goto L_0x001a
            r1 = r2
            goto L_0x001b
        L_0x001a:
            r1 = r0
        L_0x001b:
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r9 = r9.toLowerCase()
            java.lang.String r1 = "this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C19383o.m32796f(r9, r1)
            boolean r3 = r8.isDebuggable
            r4 = 2
            if (r3 == 0) goto L_0x004b
            com.paypal.android.platform.authsdk.authcommon.utils.UrlUtils$Companion r3 = com.paypal.android.platform.authsdk.authcommon.utils.UrlUtils.Companion
            java.util.List[] r4 = new java.util.List[r4]
            java.util.List r5 = r3.getSTAGE_PAYPAL_DOMAINS$auth_sdk_thirdPartyRelease()
            java.lang.String r6 = "UrlUtils.STAGE_PAYPAL_DOMAINS"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r4[r0] = r5
            java.util.List r5 = r3.getLIVE_PAYPAL_DOMAINS$auth_sdk_thirdPartyRelease()
            java.lang.String r6 = "UrlUtils.LIVE_PAYPAL_DOMAINS"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r4[r2] = r5
            java.util.List r3 = r3.asList$auth_sdk_thirdPartyRelease(r4)
            goto L_0x0051
        L_0x004b:
            com.paypal.android.platform.authsdk.authcommon.utils.UrlUtils$Companion r3 = com.paypal.android.platform.authsdk.authcommon.utils.UrlUtils.Companion
            java.util.List r3 = r3.getLIVE_PAYPAL_DOMAINS$auth_sdk_thirdPartyRelease()
        L_0x0051:
            java.util.Iterator r3 = r3.iterator()
        L_0x0055:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r4.toLowerCase()
            kotlin.jvm.internal.C19383o.m32796f(r5, r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "."
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            boolean r5 = kotlin.text.C19457k.m33018V0(r9, r5)
            if (r5 != 0) goto L_0x0085
            boolean r4 = kotlin.text.C19457k.m33019W0(r9, r4, r2)
            if (r4 == 0) goto L_0x0055
        L_0x0085:
            return r2
        L_0x0086:
            kotlin.m r9 = kotlin.C19394m.f43287a
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.utils.UrlSecurityManager.containsInternalDomain(java.lang.String):boolean");
    }

    public final boolean isInternalSecureUrl$auth_sdk_thirdPartyRelease(String str) {
        C19383o.m32797g(str, "url");
        return containsInternalDomain(str) && URLUtil.isHttpsUrl(str);
    }

    public final boolean isUrlAllowedForLoading$auth_sdk_thirdPartyRelease(String str) {
        C19383o.m32797g(str, "url");
        return this.isDebuggable || isInternalSecureUrl$auth_sdk_thirdPartyRelease(str);
    }
}
