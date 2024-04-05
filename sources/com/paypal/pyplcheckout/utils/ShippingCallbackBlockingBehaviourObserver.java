package com.paypal.pyplcheckout.utils;

import androidx.lifecycle.C2843a0;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.home.view.customviews.productviews.ShippingCallbackBlockingBehaviour;
import kotlin.jvm.internal.C19383o;

public final class ShippingCallbackBlockingBehaviourObserver implements C2843a0<ShippingCallbackBlockingBehaviour> {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShippingCallbackBlockingBehaviour.Type.values().length];
            iArr[ShippingCallbackBlockingBehaviour.Type.NEW_SHIPPING_ADDRESS_SELECTED.ordinal()] = 1;
            iArr[ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_ADDRESS.ordinal()] = 2;
            iArr[ShippingCallbackBlockingBehaviour.Type.REFRESH_IS_PENDING.ordinal()] = 3;
            iArr[ShippingCallbackBlockingBehaviour.Type.REFRESH_IS_COMPLETED.ordinal()] = 4;
            iArr[ShippingCallbackBlockingBehaviour.Type.INVALID_SHIPPING_METHOD.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void onChanged(ShippingCallbackBlockingBehaviour shippingCallbackBlockingBehaviour) {
        C19383o.m32797g(shippingCallbackBlockingBehaviour, "homeScreenBlockingFlag");
        int i = WhenMappings.$EnumSwitchMapping$0[shippingCallbackBlockingBehaviour.getShippingBlockingBehaviour().ordinal()];
        if (i == 1) {
            PLog.transition$default(PEnums.TransitionName.SHIPPING_CALLBACK_BLOCKING_BEHAVIOR, PEnums.Outcome.UPDATED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "NEW_SHIPPING_ADDRESS_SELECTED", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.SHIPPING_CHANGES_NEW_SHIPPING_ADDRESS_SELECTED, (ResultData) null);
        } else if (i == 2) {
            PLog.transition$default(PEnums.TransitionName.SHIPPING_CALLBACK_BLOCKING_BEHAVIOR, PEnums.Outcome.FAILED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "INVALID_SHIPPING_ADDRESS", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_ADDRESS, (ResultData) null);
        } else if (i == 3) {
            PLog.transition$default(PEnums.TransitionName.SHIPPING_CALLBACK_BLOCKING_BEHAVIOR, PEnums.Outcome.ATTEMPTED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "REFRESH_IS_PENDING", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_PENDING, (ResultData) null);
        } else if (i == 4) {
            PLog.transition$default(PEnums.TransitionName.SHIPPING_CALLBACK_BLOCKING_BEHAVIOR, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "REFRESH_IS_COMPLETED", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.SHIPPING_CHANGES_REFRESH_IS_COMPLETED, (ResultData) null);
        } else if (i == 5) {
            PLog.transition$default(PEnums.TransitionName.SHIPPING_CALLBACK_BLOCKING_BEHAVIOR, PEnums.Outcome.FAILED, (PEnums.EventCode) null, (PEnums.StateName) null, (String) null, (PEnums.FallbackReason) null, (PEnums.FallbackCategory) null, (String) null, (String) null, (String) null, "INVALID_SHIPPING_METHOD", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 15356, (Object) null);
            Events.Companion.getInstance().fire(PayPalEventTypes.SHIPPING_CHANGES_INVALID_SHIPPING_METHOD, (ResultData) null);
        }
    }
}
