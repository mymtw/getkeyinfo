package com.paypal.android.platform.authsdk.stepup.analytics;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.conversation.list.ccm.C9580d;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventParams;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.stepup.p535ui.StepUpEvent;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;

public final class StepUpAnalyticsViewModel extends C2866i0 {
    private final C2895z<StepUpEvent> event;
    private final C2887s lifecycleOwner;
    /* access modifiers changed from: private */
    public final AnalyticsManager manager;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StepUpAnalyticsViewModel(C2895z zVar, C2887s sVar, IStepUpTracker iStepUpTracker, AnalyticsManager analyticsManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, sVar, iStepUpTracker, (i & 8) != 0 ? new AnalyticsManager(iStepUpTracker) : analyticsManager);
    }

    private final TrackingEvent buildClickEvents(String str, String str2, String str3) {
        return new TrackingEvent.Click(str, str2, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, 500, (DefaultConstructorMarker) null);
    }

    private final TrackingEvent buildErrorEvents(String str, String str2, String str3) {
        return new TrackingEvent.Error(str, str3 == null ? EventsNameKt.GENERIC_ERROR_MESSAGE : str3, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2040, (DefaultConstructorMarker) null);
    }

    private final TrackingEvent buildImpressionEvents(String str, String str2, String str3) {
        return new TrackingEvent.Impression(str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, 248, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TrackingEvent buildImpressionEvents$default(StepUpAnalyticsViewModel stepUpAnalyticsViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return stepUpAnalyticsViewModel.buildImpressionEvents(str, str2, str3);
    }

    private final void postEvent(TrackingEvent trackingEvent) {
        C19697g.m33468f(C19388s.m32866i0(this), C19760n0.f43720b, (CoroutineStart) null, new StepUpAnalyticsViewModel$postEvent$1(this, trackingEvent, (C19340c<? super StepUpAnalyticsViewModel$postEvent$1>) null), 2);
    }

    private final void registerEvent() {
        this.event.observe(this.lifecycleOwner, new C9580d(this, 2));
    }

    /* access modifiers changed from: private */
    /* renamed from: registerEvent$lambda-0  reason: not valid java name */
    public static final void m35143registerEvent$lambda0(StepUpAnalyticsViewModel stepUpAnalyticsViewModel, StepUpEvent stepUpEvent) {
        C19383o.m32797g(stepUpAnalyticsViewModel, "this$0");
        if (stepUpEvent instanceof StepUpEvent.Load) {
            stepUpAnalyticsViewModel.postEvent(buildImpressionEvents$default(stepUpAnalyticsViewModel, AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.SHOWN, (String) null, 4, (Object) null));
        } else if (stepUpEvent instanceof StepUpEvent.BackPress) {
            stepUpAnalyticsViewModel.postEvent(stepUpAnalyticsViewModel.buildClickEvents(AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.CANCELLED, EventParams.Companion.getACTION_BACK_PRESS$auth_sdk_thirdPartyRelease()));
        } else if (stepUpEvent instanceof StepUpEvent.Close) {
            stepUpAnalyticsViewModel.postEvent(stepUpAnalyticsViewModel.buildClickEvents(AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.CANCELLED, EventParams.Companion.getACTION_CLOSE$auth_sdk_thirdPartyRelease()));
        } else if (stepUpEvent instanceof StepUpEvent.Success) {
            stepUpAnalyticsViewModel.postEvent(buildImpressionEvents$default(stepUpAnalyticsViewModel, AnalyticsManagerKt.EVENT_STEP_UP, "success", (String) null, 4, (Object) null));
        } else if (stepUpEvent instanceof StepUpEvent.Failed) {
            stepUpAnalyticsViewModel.postEvent(stepUpAnalyticsViewModel.buildErrorEvents(AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.FAILED, ((StepUpEvent.Failed) stepUpEvent).getMsg()));
        } else if (stepUpEvent instanceof StepUpEvent.Unsupported) {
            stepUpAnalyticsViewModel.postEvent(stepUpAnalyticsViewModel.buildErrorEvents(AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.FAILED, EventParams.Companion.getREASON_UNSUPPORTED$auth_sdk_thirdPartyRelease()));
        } else if (stepUpEvent instanceof StepUpEvent.UnHandled) {
            stepUpAnalyticsViewModel.postEvent(stepUpAnalyticsViewModel.buildErrorEvents(AnalyticsManagerKt.EVENT_STEP_UP, EventsNameKt.FAILED, EventParams.Companion.getREASON_UNHANDLED$auth_sdk_thirdPartyRelease()));
        }
    }

    public StepUpAnalyticsViewModel(C2895z<StepUpEvent> zVar, C2887s sVar, IStepUpTracker iStepUpTracker, AnalyticsManager analyticsManager) {
        C19383o.m32797g(zVar, "event");
        C19383o.m32797g(sVar, "lifecycleOwner");
        C19383o.m32797g(iStepUpTracker, "tracker");
        C19383o.m32797g(analyticsManager, "manager");
        this.event = zVar;
        this.lifecycleOwner = sVar;
        this.manager = analyticsManager;
        registerEvent();
    }
}
