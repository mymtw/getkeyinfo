package com.etsy.android.p327ui.user.auth;

import androidx.activity.result.C0123f;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.ui.user.auth.f */
public final class C11478f implements C17555d<C0123f> {

    /* renamed from: a */
    public final C19011a<SignInActivity> f25328a;

    public C11478f(C19011a<SignInActivity> aVar) {
        this.f25328a = aVar;
    }

    public final Object get() {
        SignInActivity signInActivity = this.f25328a.get();
        C19383o.m32797g(signInActivity, "signInActivity");
        C0123f activityResultRegistry = signInActivity.getActivityResultRegistry();
        C19383o.m32796f(activityResultRegistry, "signInActivity.activityResultRegistry");
        return activityResultRegistry;
    }
}
