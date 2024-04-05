package com.paypal.platform.authsdk;

import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authcommon.p531ui.AuthPresenter;
import kotlin.jvm.internal.C19383o;
import p716xo.C18833e;
import p716xo.C18835g;

@Keep
public final class AuthProviders {
    private final AuthPresenter authPresenter;
    private final C18833e riskDelegate;
    private final C18835g trackingDelegate;

    public AuthProviders(AuthPresenter authPresenter2, C18833e eVar, C18835g gVar) {
        C19383o.m32797g(authPresenter2, "authPresenter");
        C19383o.m32797g(eVar, "riskDelegate");
        C19383o.m32797g(gVar, "trackingDelegate");
        this.authPresenter = authPresenter2;
        this.riskDelegate = eVar;
        this.trackingDelegate = gVar;
    }

    public static /* synthetic */ AuthProviders copy$default(AuthProviders authProviders, AuthPresenter authPresenter2, C18833e eVar, C18835g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            authPresenter2 = authProviders.authPresenter;
        }
        if ((i & 2) != 0) {
            eVar = authProviders.riskDelegate;
        }
        if ((i & 4) != 0) {
            gVar = authProviders.trackingDelegate;
        }
        return authProviders.copy(authPresenter2, eVar, gVar);
    }

    public final AuthPresenter component1() {
        return this.authPresenter;
    }

    public final C18833e component2() {
        return this.riskDelegate;
    }

    public final C18835g component3() {
        return this.trackingDelegate;
    }

    public final AuthProviders copy(AuthPresenter authPresenter2, C18833e eVar, C18835g gVar) {
        C19383o.m32797g(authPresenter2, "authPresenter");
        C19383o.m32797g(eVar, "riskDelegate");
        C19383o.m32797g(gVar, "trackingDelegate");
        return new AuthProviders(authPresenter2, eVar, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthProviders)) {
            return false;
        }
        AuthProviders authProviders = (AuthProviders) obj;
        return C19383o.m32792b(this.authPresenter, authProviders.authPresenter) && C19383o.m32792b(this.riskDelegate, authProviders.riskDelegate) && C19383o.m32792b(this.trackingDelegate, authProviders.trackingDelegate);
    }

    public final AuthPresenter getAuthPresenter() {
        return this.authPresenter;
    }

    public final C18833e getRiskDelegate() {
        return this.riskDelegate;
    }

    public final C18835g getTrackingDelegate() {
        return this.trackingDelegate;
    }

    public int hashCode() {
        int hashCode = this.riskDelegate.hashCode();
        return this.trackingDelegate.hashCode() + ((hashCode + (this.authPresenter.hashCode() * 31)) * 31);
    }

    public String toString() {
        AuthPresenter authPresenter2 = this.authPresenter;
        C18833e eVar = this.riskDelegate;
        C18835g gVar = this.trackingDelegate;
        return "AuthProviders(authPresenter=" + authPresenter2 + ", riskDelegate=" + eVar + ", trackingDelegate=" + gVar + ")";
    }
}
