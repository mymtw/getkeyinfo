package com.paypal.android.platform.authsdk.splitlogin.tracking;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginEvent;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19597d;

public final class SplitLoginAnalyticsViewModel extends C2866i0 {
    /* access modifiers changed from: private */
    public final C19597d<SplitLoginEvent> event;
    private final C2887s lifecycleOwner;
    /* access modifiers changed from: private */
    public final SplitLoginAnalyticsManager manager;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SplitLoginAnalyticsViewModel(C19597d dVar, C2887s sVar, ISplitLoginTracker iSplitLoginTracker, SplitLoginAnalyticsManager splitLoginAnalyticsManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, sVar, iSplitLoginTracker, (i & 8) != 0 ? new SplitLoginAnalyticsManager(iSplitLoginTracker) : splitLoginAnalyticsManager);
    }

    /* access modifiers changed from: private */
    public final TrackingEvent buildClickEvents(String str, String str2, String str3) {
        return new TrackingEvent.Click(str, str2, (String) null, str3, (String) null, (String) null, (String) null, (String) null, (String) null, 500, (DefaultConstructorMarker) null);
    }

    private final TrackingEvent buildErrorEvents(String str, String str2, String str3) {
        return new TrackingEvent.Error(str, str3 == null ? "error" : str3, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2040, (DefaultConstructorMarker) null);
    }

    private final TrackingEvent buildImpressionEvents(String str, String str2, String str3) {
        return new TrackingEvent.Impression(str, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null, 248, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TrackingEvent buildImpressionEvents$default(SplitLoginAnalyticsViewModel splitLoginAnalyticsViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return splitLoginAnalyticsViewModel.buildImpressionEvents(str, str2, str3);
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginChallengeEvent() {
        postEvent(buildImpressionEvents$default(this, SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_VERIFYCRED, "challenge", (String) null, 4, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginDismissEvent(String str) {
        postEvent(buildClickEvents(SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_VERIFYCRED, EventsNameKt.CANCELLED, str));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginFailureEvent(String str) {
        postEvent(buildErrorEvents(SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_VERIFYCRED, EventsNameKt.FAILED, str));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginInValidEmailEvent() {
        postEvent(buildImpressionEvents$default(this, SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_NEXT_BUTTON_CLICK, SplitLoginAnalyticsManagerKt.OUTCOME_INVALID_EMAIL, (String) null, 4, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginInitiatedEvent() {
        postEvent(buildImpressionEvents$default(this, SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_VERIFYCRED, EventsNameKt.TRIGGERED, (String) null, 4, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginNextClickedEvent() {
        postEvent(buildClickEvents(SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_NEXT_BUTTON_CLICK, EventsNameKt.CLICKED, SplitLoginAnalyticsManagerKt.NEXT_BUTTON));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginStartEvent() {
        postEvent(buildImpressionEvents$default(this, SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_SHOWN, EventsNameKt.SHOWN, (String) null, 4, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void handleSplitLoginSuccessEvent() {
        postEvent(buildImpressionEvents$default(this, SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_VERIFYCRED, "success", (String) null, 4, (Object) null));
    }

    /* access modifiers changed from: private */
    public final void postEvent(TrackingEvent trackingEvent) {
        C19697g.m33468f(C19388s.m32866i0(this), C19760n0.f43720b, (CoroutineStart) null, new SplitLoginAnalyticsViewModel$postEvent$1(this, trackingEvent, (C19340c<? super SplitLoginAnalyticsViewModel$postEvent$1>) null), 2);
    }

    private final void registerEvent() {
        C15588c1.m25329i0(this.lifecycleOwner).mo10834c(new SplitLoginAnalyticsViewModel$registerEvent$1(this, (C19340c<? super SplitLoginAnalyticsViewModel$registerEvent$1>) null));
    }

    public SplitLoginAnalyticsViewModel(C19597d<? extends SplitLoginEvent> dVar, C2887s sVar, ISplitLoginTracker iSplitLoginTracker, SplitLoginAnalyticsManager splitLoginAnalyticsManager) {
        C19383o.m32797g(dVar, "event");
        C19383o.m32797g(sVar, "lifecycleOwner");
        C19383o.m32797g(iSplitLoginTracker, "tracker");
        C19383o.m32797g(splitLoginAnalyticsManager, "manager");
        this.event = dVar;
        this.lifecycleOwner = sVar;
        this.manager = splitLoginAnalyticsManager;
        registerEvent();
    }
}
