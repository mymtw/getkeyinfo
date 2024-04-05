package com.etsy.android.lib.network.oauth2.signin;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0118a;
import com.etsy.android.lib.network.oauth2.AccessTokens;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.push.onboarding.PushOptInOnboardingDialogFragment;
import kotlin.jvm.internal.C19383o;
import p248tp.C8072t;

/* renamed from: com.etsy.android.lib.network.oauth2.signin.c */
public final /* synthetic */ class C8774c implements C0118a {

    /* renamed from: b */
    public final /* synthetic */ int f19312b;

    /* renamed from: c */
    public final /* synthetic */ Object f19313c;

    public /* synthetic */ C8774c(Object obj, int i) {
        this.f19312b = i;
        this.f19313c = obj;
    }

    /* renamed from: a */
    public final void mo413a(Object obj) {
        switch (this.f19312b) {
            case 0:
                C8072t tVar = (C8072t) this.f19313c;
                C19383o.m32797g(tVar, "$emitter");
                Intent data = ((ActivityResult) obj).getData();
                AccessTokens accessTokens = data != null ? (AccessTokens) data.getParcelableExtra("token_result") : null;
                if (accessTokens != null) {
                    tVar.onSuccess(accessTokens);
                    return;
                } else {
                    tVar.tryOnError(SignInError.AuthenticationServiceFailed.INSTANCE);
                    return;
                }
            default:
                PushOptInOnboardingDialogFragment.m34878permissionLauncher$lambda0((PushOptInOnboardingDialogFragment) this.f19313c, (Boolean) obj);
                return;
        }
    }
}
