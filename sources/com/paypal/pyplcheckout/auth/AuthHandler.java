package com.paypal.pyplcheckout.auth;

import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.data.repositories.AuthRepository;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.ReturnToProviderOperationType;
import com.paypal.pyplcheckout.utils.RunOnceDelegateKt;
import com.paypal.pyplcheckout.utils.StringExtensionsKt;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p753kq.C19857l;

public final class AuthHandler implements AuthListener {
    private final AuthRepository authRepository;
    public C19857l<? super AuthenticationSuccess, C19394m> doAfterAuth;
    private final C19285c onAuthFailure$delegate = RunOnceDelegateKt.runOnce(new AuthHandler$onAuthFailure$2(this));
    private final C19285c onAuthSuccess$delegate = RunOnceDelegateKt.runOnce(new AuthHandler$onAuthSuccess$2(this));
    private final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;
    private final String tag;
    private final String viewName;

    public AuthHandler(Repository repository2, AuthRepository authRepository2, PYPLCheckoutUtils pYPLCheckoutUtils) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(authRepository2, "authRepository");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        this.repository = repository2;
        this.authRepository = authRepository2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        String c = C19386q.m32807a(AuthHandler.class).mo71919c();
        C19383o.m32794d(c);
        this.tag = c;
        this.viewName = c;
    }

    private final C19857l<AuthenticationFailure, C19394m> getOnAuthFailure() {
        return (C19857l) this.onAuthFailure$delegate.getValue();
    }

    private final C19857l<AuthenticationSuccess, C19394m> getOnAuthSuccess() {
        return (C19857l) this.onAuthSuccess$delegate.getValue();
    }

    private static /* synthetic */ void getViewName$annotations() {
    }

    private final boolean getWasCancelled(String str) {
        String lowercase = StringExtensionsKt.lowercase(str);
        return C19383o.m32792b(lowercase, "user cancelled flow") || C19383o.m32792b(lowercase, "consent denied") || C19383o.m32792b(lowercase, "user cancelled");
    }

    /* access modifiers changed from: private */
    public final void handleAuthFailure(AuthenticationFailure authenticationFailure) {
        PEnums.TransitionName transitionName = PEnums.TransitionName.NATIVE_XO_AUTH_RESPONSE;
        PEnums.Outcome outcome = PEnums.Outcome.FAILURE;
        PEnums.EventCode eventCode = PEnums.EventCode.E214;
        PEnums.StateName stateName = PEnums.StateName.REVIEW;
        PLog.decision$default(transitionName, outcome, eventCode, stateName, this.viewName, (String) null, authenticationFailure.getError(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        if (!getWasCancelled(authenticationFailure.getError())) {
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E301, "Third party auth failure", authenticationFailure.toLog(), authenticationFailure.getException(), transitionName, stateName, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
            this.pyplCheckoutUtils.fallBack("authFailure", PEnums.FallbackReason.NON_USER_CANCELLED_FLOW, PEnums.FallbackCategory.AUTH, authenticationFailure.toLog(), (PEnums.TransitionName) null, ErrorReason.AUTHENTICATION_ERROR, authenticationFailure.getException());
            return;
        }
        this.pyplCheckoutUtils.returnToProvider(this.repository.getCancelUrl() == null ? "" : this.repository.getCancelUrl(), ReturnToProviderOperationType.Cancel.INSTANCE, "user cancelled flow");
    }

    /* access modifiers changed from: private */
    public final void handleAuthSuccess(AuthenticationSuccess authenticationSuccess) {
        PLog.d$default(this.tag, "authentication was successful", 0, 4, (Object) null);
        PLog.decision$default(PEnums.TransitionName.NATIVE_XO_AUTH_RESPONSE, PEnums.Outcome.SUCCESS, PEnums.EventCode.E213, PEnums.StateName.REVIEW, this.viewName, (String) null, authenticationSuccess.toLog(), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        this.repository.setStage(PEnums.Stage.AUTH_SHOWN);
        String accessToken = authenticationSuccess.getAccessToken();
        this.pyplCheckoutUtils.setAccessToken(accessToken);
        this.authRepository.setAccessToken(accessToken);
        AuthenticatedApiFactory.Companion.initializeFactories(accessToken);
        RealTimeDB.Companion.setAccessToken(accessToken);
        getDoAfterAuth().invoke(authenticationSuccess);
    }

    public void authFailure(AuthenticationFailure authenticationFailure) {
        C19383o.m32797g(authenticationFailure, "authenticationFailure");
        getOnAuthFailure().invoke(authenticationFailure);
    }

    public void authSuccess(AuthenticationSuccess authenticationSuccess) {
        C19383o.m32797g(authenticationSuccess, "authenticationSuccess");
        getOnAuthSuccess().invoke(authenticationSuccess);
    }

    public final C19857l<AuthenticationSuccess, C19394m> getDoAfterAuth() {
        C19857l<? super AuthenticationSuccess, C19394m> lVar = this.doAfterAuth;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("doAfterAuth");
        throw null;
    }

    public final void setDoAfterAuth(C19857l<? super AuthenticationSuccess, C19394m> lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.doAfterAuth = lVar;
    }
}
