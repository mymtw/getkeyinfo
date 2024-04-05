package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.p327ui.favorites.add.C9787v;
import com.google.gson.C16708i;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.Data;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.pojo.UserAddress;
import com.paypal.pyplcheckout.pojo.UserCheckoutResponse;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.io.StringReader;
import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

public final class UserAndCheckoutCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "UserAndCheckoutCallback";
    private final CoroutineContext coroutineContext;
    /* access modifiers changed from: private */
    public final GetLocaleMetadataUseCase getLocaleMetadataUseCase;
    private final C16708i gson;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserAndCheckoutCallback get() {
            return new UserAndCheckoutCallback((CoroutineContext) null, (GetLocaleMetadataUseCase) null, (C16708i) null, 7, (DefaultConstructorMarker) null);
        }
    }

    public UserAndCheckoutCallback() {
        this((CoroutineContext) null, (GetLocaleMetadataUseCase) null, (C16708i) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UserAndCheckoutCallback(kotlin.coroutines.CoroutineContext r1, com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase r2, com.google.gson.C16708i r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0010
            kotlinx.coroutines.i1 r1 = androidx.compose.p015ui.text.input.C1993m.m4368l()
            rq.b r5 = kotlinx.coroutines.C19760n0.f43719a
            kotlinx.coroutines.o1 r5 = kotlinx.coroutines.internal.C19729m.f43681a
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r5)
        L_0x0010:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x001e
            com.paypal.pyplcheckout.di.SdkComponent$Companion r2 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion
            com.paypal.pyplcheckout.di.SdkComponent r2 = r2.getInstance()
            com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase r2 = r2.getGetLocaleMetadataUseCase()
        L_0x001e:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0027
            com.google.gson.i r3 = new com.google.gson.i
            r3.<init>()
        L_0x0027:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.callbacks.UserAndCheckoutCallback.<init>(kotlin.coroutines.CoroutineContext, com.paypal.pyplcheckout.domain.usecase.address.GetLocaleMetadataUseCase, com.google.gson.i, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static final UserAndCheckoutCallback get() {
        return Companion.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-1  reason: not valid java name */
    public static final void m35432onApiSuccess$lambda1(UserAndCheckoutCallback userAndCheckoutCallback, UserCheckoutResponse userCheckoutResponse) {
        C19383o.m32797g(userAndCheckoutCallback, "this$0");
        userAndCheckoutCallback.getEvents().fire(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, new Success(userCheckoutResponse));
    }

    private final void userAndCheckoutFailProtocol(String str, Exception exc, String str2, PEnums.FallbackCategory fallbackCategory, PEnums.EventCode eventCode) {
        PLog.error$default(PEnums.ErrorType.WARNING, eventCode == null ? PEnums.EventCode.E573 : eventCode, str, exc == null ? null : exc.getMessage(), exc, PEnums.TransitionName.GRAPH_QL_PAYLOAD, PEnums.StateName.STARTUP, str2, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1792, (Object) null);
        getEvents().fire(PayPalEventTypes.FINISHED_USER_CHECKOUT_RESPONSE, new Error(str));
        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "UserCheckoutCallback fail protocol", PEnums.FallbackReason.USER_CHECKOUT_FAIL_PAYLOAD_SERVICE, fallbackCategory, str, (PEnums.TransitionName) null, ErrorReason.USER_AND_CHECKOUT_ERROR, exc, 16, (Object) null);
    }

    public static /* synthetic */ void userAndCheckoutFailProtocol$default(UserAndCheckoutCallback userAndCheckoutCallback, String str, Exception exc, String str2, PEnums.FallbackCategory fallbackCategory, PEnums.EventCode eventCode, int i, Object obj) {
        userAndCheckoutCallback.userAndCheckoutFailProtocol(str, exc, (i & 4) != 0 ? null : str2, fallbackCategory, (i & 16) != 0 ? null : eventCode);
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        Exception exc2 = exc;
        userAndCheckoutFailProtocol(C0326j.m864i("error fetching user and checkout response: ", exc.getMessage()), exc2, "onApiError", PEnums.FallbackCategory.CHECKOUT_ERRORS, PEnums.EventCode.E573);
    }

    public void onApiSuccess(String str) {
        String str2 = str;
        C19383o.m32797g(str2, "result");
        try {
            UserCheckoutResponse userCheckoutResponse = (UserCheckoutResponse) this.gson.mo59457d(new StringReader(str2), UserCheckoutResponse.class);
            int i = 0;
            if (userCheckoutResponse != null) {
                Data data = userCheckoutResponse.getData();
                if (data != null) {
                    User user = data.getUser();
                    if (user != null) {
                        List<UserAddress> addresses = user.getAddresses();
                        if (addresses != null) {
                            i = addresses.size();
                        }
                    }
                }
            }
            PEnums.TransitionName transitionName = PEnums.TransitionName.FINISH_FETCHING_CHECKOUT_SESSION;
            PEnums.Outcome outcome = PEnums.Outcome.SUCCESS;
            PEnums.EventCode eventCode = PEnums.EventCode.E629;
            PEnums.StateName stateName = PEnums.StateName.READY;
            PLog.transition$default(transitionName, outcome, eventCode, stateName, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "User address list size is: " + i, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15344, (Object) null);
            Data data2 = userCheckoutResponse.getData();
            if (data2 != null) {
                User user2 = data2.getUser();
                if (user2 != null) {
                    String country = user2.getCountry();
                    if (country != null) {
                        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new UserAndCheckoutCallback$onApiSuccess$1$1(this, country, (C19340c<? super UserAndCheckoutCallback$onApiSuccess$1$1>) null), 3);
                    }
                }
            }
            runOnUiThread(new C9787v(2, this, userCheckoutResponse));
        } catch (Exception e) {
            Exception exc = e;
            userAndCheckoutFailProtocol(C0326j.m864i("error parsing checkout response: ", exc.getMessage()), exc, "onApiSuccess: JSON Parse catch", PEnums.FallbackCategory.DATA_PARSING_ERROR, PEnums.EventCode.E572);
        }
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return InternalCorrelationIds.copy$default(internalCorrelationIds, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, 111, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserAndCheckoutCallback(CoroutineContext coroutineContext2, GetLocaleMetadataUseCase getLocaleMetadataUseCase2, C16708i iVar) {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        C19383o.m32797g(coroutineContext2, "coroutineContext");
        C19383o.m32797g(getLocaleMetadataUseCase2, "getLocaleMetadataUseCase");
        C19383o.m32797g(iVar, "gson");
        this.coroutineContext = coroutineContext2;
        this.getLocaleMetadataUseCase = getLocaleMetadataUseCase2;
        this.gson = iVar;
        SdkComponentKt.inject((BaseCallback) this);
    }
}
