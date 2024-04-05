package com.etsy.android.push.onboarding;

import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.util.C8890e0;
import com.etsy.android.push.PushOptInFatigue;
import kotlin.jvm.internal.C19383o;
import p496za.C13943a;

/* renamed from: com.etsy.android.push.onboarding.a */
public final class C8945a {

    /* renamed from: a */
    public final PushOptInFatigue f19732a;

    /* renamed from: b */
    public final C8672b f19733b;

    /* renamed from: c */
    public final C13943a f19734c;

    /* renamed from: d */
    public final C8890e0 f19735d;

    public C8945a(PushOptInFatigue pushOptInFatigue, C8672b bVar, C13943a aVar, C8890e0 e0Var) {
        C19383o.m32797g(pushOptInFatigue, "fatigue");
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(aVar, "sharedPrefsProvider");
        C19383o.m32797g(e0Var, "systemTime");
        this.f19732a = pushOptInFatigue;
        this.f19733b = bVar;
        this.f19734c = aVar;
        this.f19735d = e0Var;
    }
}
