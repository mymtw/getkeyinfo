package com.paypal.pyplcheckout.addcard;

import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.flavorfirebasedb.RealTimeDB;
import com.paypal.pyplcheckout.services.api.factory.AuthenticatedApiFactory;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import com.paypal.pyplcheckout.utils.RunOnceDelegateKt;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

public final class UpgradeAccessTokenListenerImpl implements UpgradeAccessTokenListener {
    private final C19285c onAuthFailure$delegate;
    private final C19285c onAuthSuccess$delegate;
    private final C19857l<Exception, C19394m> onError;
    private final C19846a<C19394m> onSuccess;
    private final PYPLCheckoutUtils pyplCheckoutUtils;

    public UpgradeAccessTokenListenerImpl(C19846a<C19394m> aVar, C19857l<? super Exception, C19394m> lVar, PYPLCheckoutUtils pYPLCheckoutUtils) {
        C19383o.m32797g(aVar, "onSuccess");
        C19383o.m32797g(lVar, "onError");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        this.onSuccess = aVar;
        this.onError = lVar;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        this.onAuthSuccess$delegate = RunOnceDelegateKt.runOnce(new UpgradeAccessTokenListenerImpl$onAuthSuccess$2(this));
        this.onAuthFailure$delegate = RunOnceDelegateKt.runOnce(new UpgradeAccessTokenListenerImpl$onAuthFailure$2(this));
    }

    private final C19861p<Exception, String, C19394m> getOnAuthFailure() {
        return (C19861p) this.onAuthFailure$delegate.getValue();
    }

    private final C19857l<String, C19394m> getOnAuthSuccess() {
        return (C19857l) this.onAuthSuccess$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleFailure(Exception exc, String str) {
        PEnums.ErrorType errorType = PEnums.ErrorType.FATAL;
        PEnums.EventCode eventCode = PEnums.EventCode.E599;
        String message = exc.getMessage();
        if (message == null) {
            message = "upgrade access token exception";
        }
        PLog.error$default(errorType, eventCode, message, str, exc, PEnums.TransitionName.UPGRADE_ACCESS_TOKEN_RESPONSE, (PEnums.StateName) null, "upgrade access token failure", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1856, (Object) null);
        this.onError.invoke(exc);
    }

    /* access modifiers changed from: private */
    public final void handleSuccess(String str) {
        this.pyplCheckoutUtils.setAccessToken(str);
        RealTimeDB.Companion.setAccessToken(str);
        AuthenticatedApiFactory.Companion.initializeFactories(str);
        PLog.decision$default(PEnums.TransitionName.UPGRADE_ACCESS_TOKEN_RESPONSE, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, "upgrade access token succeeded", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
        this.onSuccess.invoke();
    }

    public void onFailure(Exception exc, String str) {
        C19383o.m32797g(exc, "exception");
        C19383o.m32797g(str, "failureMessage");
        getOnAuthFailure().invoke(exc, str);
    }

    public void onSuccess(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        getOnAuthSuccess().invoke(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpgradeAccessTokenListenerImpl(C19846a aVar, C19857l lVar, PYPLCheckoutUtils pYPLCheckoutUtils, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, lVar, (i & 4) != 0 ? PYPLCheckoutUtils.Companion.getInstance() : pYPLCheckoutUtils);
    }
}
