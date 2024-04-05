package com.paypal.android.platform.authsdk.otplogin.tracking;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import com.google.android.play.core.assetpacks.C15588c1;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.ErrorScreenEvent;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19597d;

public final class ErrorScreenAnalyticsViewModel extends C2866i0 {
    /* access modifiers changed from: private */
    public final C19597d<ErrorScreenEvent> event;
    private final C2887s lifecycleOwner;
    /* access modifiers changed from: private */
    public final ErrorAnalyticsManager manager;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorScreenAnalyticsViewModel(C19597d dVar, C2887s sVar, IErrorTracker iErrorTracker, ErrorAnalyticsManager errorAnalyticsManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, sVar, iErrorTracker, (i & 8) != 0 ? new ErrorAnalyticsManager(iErrorTracker) : errorAnalyticsManager);
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

    public static /* synthetic */ TrackingEvent buildImpressionEvents$default(ErrorScreenAnalyticsViewModel errorScreenAnalyticsViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return errorScreenAnalyticsViewModel.buildImpressionEvents(str, str2, str3);
    }

    /* access modifiers changed from: private */
    public final void postEvent(TrackingEvent trackingEvent) {
        C19697g.m33468f(C19388s.m32866i0(this), C19760n0.f43720b, (CoroutineStart) null, new ErrorScreenAnalyticsViewModel$postEvent$1(this, trackingEvent, (C19340c<? super ErrorScreenAnalyticsViewModel$postEvent$1>) null), 2);
    }

    private final void registerEvent() {
        C15588c1.m25329i0(this.lifecycleOwner).mo10834c(new ErrorScreenAnalyticsViewModel$registerEvent$1(this, (C19340c<? super ErrorScreenAnalyticsViewModel$registerEvent$1>) null));
    }

    public ErrorScreenAnalyticsViewModel(C19597d<? extends ErrorScreenEvent> dVar, C2887s sVar, IErrorTracker iErrorTracker, ErrorAnalyticsManager errorAnalyticsManager) {
        C19383o.m32797g(dVar, "event");
        C19383o.m32797g(sVar, "lifecycleOwner");
        C19383o.m32797g(iErrorTracker, "tracker");
        C19383o.m32797g(errorAnalyticsManager, "manager");
        this.event = dVar;
        this.lifecycleOwner = sVar;
        this.manager = errorAnalyticsManager;
        registerEvent();
    }
}
