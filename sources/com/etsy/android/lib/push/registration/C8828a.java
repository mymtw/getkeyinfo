package com.etsy.android.lib.push.registration;

import p248tp.C8048a;
import p248tp.C8061n;
import p771sr.C20179b;
import p771sr.C20180c;
import p771sr.C20182e;
import p771sr.C20192o;
import p771sr.C20196s;

/* renamed from: com.etsy.android.lib.push.registration.a */
public interface C8828a {
    @C20192o("/etsyapps/v3/bespoke/member/device")
    @C20182e
    /* renamed from: a */
    C8061n<TokenRegistrationResult> mo30228a(@C20180c("notification_token") String str, @C20180c("device_type") String str2, @C20180c("environment_id") int i, @C20180c("app_identifier") String str3, @C20180c("device_udid") String str4, @C20180c("version") String str5, @C20180c("multiple_account_login_enabled") boolean z);

    @C20179b("/etsyapps/v3/bespoke/member/device/{device_udid}")
    /* renamed from: b */
    C8048a mo30229b(@C20196s("device_udid") String str);
}
