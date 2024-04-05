package com.paypal.pyplcheckout.flavorauth;

import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p010a9.C0048b;
import p716xo.C18835g;

public final class ThirdPartyTrackingDelegate implements C18835g {
    private final String component = "authSdk";
    private final PEnums.StateName stateName = PEnums.StateName.CUSTOM_STATE_NAME.setStateName("authSdk");

    private final InstrumentationEvent.InstrumentationEventBuilder getInstrumentationEventBuilder(String str, String str2) {
        InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder = r0;
        InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder2 = new InstrumentationEvent.InstrumentationEventBuilder((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null);
        InstrumentationEvent.InstrumentationEventBuilder instrumentationEventBuilder3 = instrumentationEventBuilder;
        instrumentationEventBuilder3.component(this.component).authSdkVersion(str).appGuidInfo(str2);
        return instrumentationEventBuilder3;
    }

    public static /* synthetic */ InstrumentationEvent.InstrumentationEventBuilder getInstrumentationEventBuilder$default(ThirdPartyTrackingDelegate thirdPartyTrackingDelegate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return thirdPartyTrackingDelegate.getInstrumentationEventBuilder(str, str2);
    }

    private final void trackClick(TrackingEvent.Click click) {
        PLog.click$default(PEnums.TransitionName.CUSTOM_TRANSITION_NAME.setTransitionName(click.getEventName()), PEnums.Outcome.CUSTOM_OUTCOME.setOutcome(click.getOutcome()), PEnums.EventCode.E101.setEventString(this.component), this.stateName, click.getInfoMessage(), (String) null, (String) null, (String) null, getInstrumentationEventBuilder(click.getAuthSdkVersion(), click.getAppGuid()), 224, (Object) null);
    }

    private final void trackError(TrackingEvent.Error error) {
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E566.setEventString(this.component), error.getErrorMessage(), (String) null, (Throwable) null, PEnums.TransitionName.CUSTOM_TRANSITION_NAME.setTransitionName(error.getEventName()), PEnums.StateName.CUSTOM_STATE_NAME.setStateName(this.component), error.getInfoMessage(), (String) null, error.getCorrelationId(), getInstrumentationEventBuilder(error.getAuthSdkVersion(), error.getAppGuid()), 280, (Object) null);
    }

    private final void trackImpression(TrackingEvent.Impression impression) {
        PLog.impression$default(PEnums.TransitionName.CUSTOM_TRANSITION_NAME.setTransitionName(impression.getEventName()), PEnums.Outcome.CUSTOM_OUTCOME.setOutcome(impression.getOutcome()), PEnums.EventCode.E103.setEventString(this.component), this.stateName, impression.getInfoMessage(), (String) null, (String) null, (String) null, getInstrumentationEventBuilder(impression.getAuthSdkVersion(), impression.getAppGuid()), 224, (Object) null);
    }

    private final void trackUnknown(TrackingEvent trackingEvent) {
        PLog.w$default(this.component, C0048b.m163a("Log class: ", trackingEvent.getClass().getSimpleName(), " not currently supported"), 0, 4, (Object) null);
    }

    public String getTrackingId() {
        String orderId = SdkComponent.Companion.getInstance().getRepository().getOrderId();
        return orderId == null ? "ORDER_ID_NOT_SET" : orderId;
    }

    public void trackEvent(TrackingEvent trackingEvent) {
        C19383o.m32797g(trackingEvent, "event");
        if (trackingEvent instanceof TrackingEvent.Impression) {
            trackImpression((TrackingEvent.Impression) trackingEvent);
        } else if (trackingEvent instanceof TrackingEvent.Click) {
            trackClick((TrackingEvent.Click) trackingEvent);
        } else if (trackingEvent instanceof TrackingEvent.Error) {
            trackError((TrackingEvent.Error) trackingEvent);
        } else {
            trackUnknown(trackingEvent);
        }
    }
}
