package com.etsy.android.push.onboarding;

import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.util.C8890e0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.push.onboarding.b */
public final class C8946b {

    /* renamed from: a */
    public final C8945a f19736a;

    /* renamed from: b */
    public final C8672b f19737b;

    /* renamed from: c */
    public final C8890e0 f19738c;

    public C8946b(C8945a aVar, C8672b bVar, C8890e0 e0Var) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(e0Var, "systemTime");
        this.f19736a = aVar;
        this.f19737b = bVar;
        this.f19738c = e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (((java.lang.Boolean) r1.f19732a.f19713d.getValue()).booleanValue() == false) goto L_0x007b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30559a(java.lang.ref.WeakReference<android.app.Activity> r11, androidx.activity.result.C0120c<java.lang.String> r12) {
        /*
            r10 = this;
            java.lang.String r0 = "activityResultLauncher"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.Object r11 = r11.get()
            android.app.Activity r11 = (android.app.Activity) r11
            if (r11 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r0 = "android.permission.POST_NOTIFICATIONS"
            int r1 = p260v0.C8184a.m16458a(r11, r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001a
            r1 = r2
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            if (r1 != 0) goto L_0x00e4
            com.etsy.android.push.onboarding.a r1 = r10.f19736a
            r1.getClass()
            com.etsy.android.lib.config.BuildTarget$a r4 = com.etsy.android.lib.config.BuildTarget.Companion
            boolean r4 = androidx.appcompat.widget.C0326j.m869n(r4)
            java.lang.String r5 = "push_onboarding_last_prompt"
            if (r4 == 0) goto L_0x003b
            za.a r4 = r1.f19734c
            android.content.SharedPreferences r4 = r4.mo46761a()
            java.lang.String r6 = "push_onboarding_override_time_required"
            boolean r4 = r4.getBoolean(r6, r3)
            if (r4 == 0) goto L_0x003b
            goto L_0x007b
        L_0x003b:
            com.etsy.android.lib.util.e0 r4 = r1.f19735d
            r4.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            za.a r4 = r1.f19734c
            android.content.SharedPreferences r4 = r4.mo46761a()
            r8 = 0
            long r8 = r4.getLong(r5, r8)
            long r6 = r6 - r8
            r8 = 604800000(0x240c8400, double:2.988109026E-315)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0059
            goto L_0x0073
        L_0x0059:
            r8 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0075
            com.etsy.android.push.PushOptInFatigue r1 = r1.f19732a
            kotlin.c r1 = r1.f19713d
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0073
            goto L_0x007b
        L_0x0073:
            r2 = r3
            goto L_0x007b
        L_0x0075:
            com.etsy.android.push.PushOptInFatigue r1 = r1.f19732a
            boolean r2 = r1.mo30551a()
        L_0x007b:
            if (r2 != 0) goto L_0x007e
            goto L_0x00e4
        L_0x007e:
            boolean r1 = r11.shouldShowRequestPermissionRationale(r0)
            if (r1 == 0) goto L_0x00c0
            com.etsy.android.push.onboarding.a r1 = r10.f19736a
            com.etsy.android.lib.logger.b r1 = r1.f19733b
            com.etsy.android.lib.config.bucketing.NativeConfig$a r2 = com.etsy.android.lib.config.bucketing.C8617e.f18934c
            com.etsy.android.lib.config.bucketing.c r1 = r1.mo21331a(r2)
            boolean r1 = r1.f18927b
            if (r1 == 0) goto L_0x00c0
            com.etsy.android.ui.navigation.keys.dialogfragmentkeys.PushOptInOnboardingKey r12 = new com.etsy.android.ui.navigation.keys.dialogfragmentkeys.PushOptInOnboardingKey
            java.lang.String r0 = kotlin.reflect.C19421p.m32935c0(r11)
            r12.<init>(r0)
            p356ge.C12788a.m20424c(r11, r12)
            com.etsy.android.push.onboarding.a r11 = r10.f19736a
            com.etsy.android.lib.util.e0 r12 = r10.f19738c
            r12.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            za.a r12 = r11.f19734c
            android.content.SharedPreferences r12 = r12.mo46761a()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putLong(r5, r0)
            r12.apply()
            com.etsy.android.push.PushOptInFatigue r11 = r11.f19732a
            r11.mo30552b()
            goto L_0x00e4
        L_0x00c0:
            r12.mo1157b(r0)
            com.etsy.android.push.onboarding.a r11 = r10.f19736a
            com.etsy.android.lib.util.e0 r12 = r10.f19738c
            r12.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            za.a r12 = r11.f19734c
            android.content.SharedPreferences r12 = r12.mo46761a()
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putLong(r5, r0)
            r12.apply()
            com.etsy.android.push.PushOptInFatigue r11 = r11.f19732a
            r11.mo30552b()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.push.onboarding.C8946b.mo30559a(java.lang.ref.WeakReference, androidx.activity.result.c):void");
    }
}
