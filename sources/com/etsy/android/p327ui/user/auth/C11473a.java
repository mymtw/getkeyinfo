package com.etsy.android.p327ui.user.auth;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import com.etsy.android.util.C12045h;
import com.etsy.android.util.C12049i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p386l9.C13002a;
import p386l9.C13004b;
import p425q9.C13252d;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.auth.a */
public final class C11473a extends C13004b {

    /* renamed from: c */
    public final C11477e f25319c;

    /* renamed from: d */
    public final C12049i f25320d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11473a(androidx.fragment.app.FragmentActivity r2, com.etsy.android.p327ui.user.auth.C11477e r3, com.etsy.android.lib.push.registration.C8837j r4, p425q9.C13252d r5, com.etsy.android.util.C12049i r6) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "signInActivityCallback"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            java.lang.String r0 = "pushRegistration"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "authManager"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            java.lang.String r0 = "afEventTrack"
            kotlin.jvm.internal.C19383o.m32797g(r6, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            r1.<init>(r2, r4, r5)
            r1.f25319c = r3
            r1.f25320d = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.auth.C11473a.<init>(androidx.fragment.app.FragmentActivity, com.etsy.android.ui.user.auth.e, com.etsy.android.lib.push.registration.j, q9.d, com.etsy.android.util.i):void");
    }

    /* renamed from: a */
    public final void mo37346a(C13002a.C13003a aVar) {
        User user = aVar.f28624b;
        EtsyId etsyId = null;
        EtsyId userId = user != null ? user.getUserId() : null;
        if (userId != null) {
            this.f25320d.mo38929b(new C12045h.C12047b(userId.getId()), EtsySignInAsHandler$trackAppsFlyerLoginEvent$1$1.INSTANCE, EtsySignInAsHandler$trackAppsFlyerLoginEvent$1$2.INSTANCE);
        }
        User user2 = aVar.f28624b;
        XAuthAccessToken xAuthAccessToken = aVar.f28623a;
        C19383o.m32797g(xAuthAccessToken, "xAuthAccessToken");
        C13252d dVar = this.f28626b;
        if (user2 != null) {
            etsyId = user2.getUserId();
        }
        dVar.mo45945b(String.valueOf(etsyId), xAuthAccessToken);
        this.f28626b.getClass();
        C18263b.f40057V.mo45961f(true);
        this.f28625a.mo30209c();
        List<String> list = C8591a.f18700r;
        C18263b.f40056T.mo21107e(EtsyApplication.get());
        this.f25319c.onFetchedUser();
    }
}
