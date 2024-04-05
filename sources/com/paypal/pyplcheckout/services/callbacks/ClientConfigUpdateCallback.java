package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClientConfigUpdateCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "ClientConfigUpdateCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientConfigUpdateCallback get() {
            return new ClientConfigUpdateCallback();
        }
    }

    public ClientConfigUpdateCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        SdkComponentKt.inject((BaseCallback) this);
    }

    private final void clientConfigUpdateFailProtocol(String str) {
        PLog.decision$default(PEnums.TransitionName.CLIENT_CONFIG_UPDATE, PEnums.Outcome.FAILURE, PEnums.EventCode.E216, PEnums.StateName.REVIEW, (String) null, (String) null, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "ClientConfigUpdateCallback fail protocol", PEnums.FallbackReason.CLIENT_CONFIG_ERROR, PEnums.FallbackCategory.AUTH, str, (PEnums.TransitionName) null, ErrorReason.CLIENT_CONFIG_UPDATE_ERROR, (Exception) null, 80, (Object) null);
    }

    public static final ClientConfigUpdateCallback get() {
        return Companion.get();
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String message = exc.getMessage();
        if (message == null) {
            message = "unknown ClientConfigUpdate error";
        }
        clientConfigUpdateFailProtocol(message);
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        PLog.decision$default(PEnums.TransitionName.CLIENT_CONFIG_UPDATE, PEnums.Outcome.UPDATED, PEnums.EventCode.E216, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2016, (Object) null);
        getEvents().fire(PayPalEventTypes.FINISHED_CLIENT_CONFIG_UPDATE, new Success(null));
    }

    public InternalCorrelationIds onSaveCorrelationId(String str, InternalCorrelationIds internalCorrelationIds) {
        C19383o.m32797g(str, "correlationId");
        C19383o.m32797g(internalCorrelationIds, "internalCorrelationIds");
        return InternalCorrelationIds.copy$default(internalCorrelationIds, (String) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, 123, (Object) null);
    }
}
