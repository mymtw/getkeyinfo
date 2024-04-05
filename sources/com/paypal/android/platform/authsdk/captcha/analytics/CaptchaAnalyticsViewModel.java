package com.paypal.android.platform.authsdk.captcha.analytics;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.C2895z;
import com.etsy.android.p327ui.user.review.C11709h;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventParams;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.captcha.p532ui.CaptchaEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;

public final class CaptchaAnalyticsViewModel extends C2866i0 {
    private final C2895z<CaptchaEvent> event;
    private final C2887s lifecycleOwner;
    /* access modifiers changed from: private */
    public final CaptchaAnalyticsManager manager;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptchaAnalyticsViewModel(C2895z zVar, C2887s sVar, ICaptchaTracker iCaptchaTracker, CaptchaAnalyticsManager captchaAnalyticsManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, sVar, iCaptchaTracker, (i & 8) != 0 ? new CaptchaAnalyticsManager(iCaptchaTracker) : captchaAnalyticsManager);
    }

    private final Map<String, String> buildCancelledEventParams(boolean z, String str) {
        HashMap hashMap = new HashMap();
        if (z) {
            EventParams.Companion companion = EventParams.Companion;
            hashMap.put(companion.getACTION$auth_sdk_thirdPartyRelease(), companion.getACTION_CLOSE$auth_sdk_thirdPartyRelease());
        } else {
            EventParams.Companion companion2 = EventParams.Companion;
            hashMap.put(companion2.getACTION$auth_sdk_thirdPartyRelease(), companion2.getACTION_BACK_PRESS$auth_sdk_thirdPartyRelease());
        }
        EventParams.Companion companion3 = EventParams.Companion;
        hashMap.put(companion3.getREASON$auth_sdk_thirdPartyRelease(), formatFailureEvent(companion3.getREASON_CANCELLED$auth_sdk_thirdPartyRelease(), str));
        return hashMap;
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

    public static /* synthetic */ TrackingEvent buildImpressionEvents$default(CaptchaAnalyticsViewModel captchaAnalyticsViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return captchaAnalyticsViewModel.buildImpressionEvents(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0003, code lost:
        r3 = p010a9.C0048b.m163a(r2, com.etsy.android.lib.conversation.MessageDraft.IMAGE_DELIMITER, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String formatFailureEvent(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L_0x0003
            goto L_0x000d
        L_0x0003:
            java.lang.String r0 = ":"
            java.lang.String r3 = p010a9.C0048b.m163a(r2, r0, r3)
            if (r3 != 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r2 = r3
        L_0x000d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.captcha.analytics.CaptchaAnalyticsViewModel.formatFailureEvent(java.lang.String, java.lang.String):java.lang.String");
    }

    private final void handleCaptchaDismissEvent(boolean z, String str) {
        postEvent(buildClickEvents(CaptchaAnalyticsManagerKt.EVENT_CAPTCHA_CHALLENGE, EventsNameKt.CANCELLED, str));
    }

    private final void handleCaptchaFailureEvent(String str, String str2) {
        postEvent(buildErrorEvents(CaptchaAnalyticsManagerKt.EVENT_CAPTCHA_CHALLENGE, EventsNameKt.FAILED, str2));
    }

    private final void handleCaptchaLoadEvent() {
        postEvent(buildImpressionEvents$default(this, CaptchaAnalyticsManagerKt.EVENT_CAPTCHA_SCREEN_SHOWN, EventsNameKt.SHOWN, (String) null, 4, (Object) null));
    }

    private final void handleCaptchaSuccessEvent() {
        postEvent(buildImpressionEvents$default(this, CaptchaAnalyticsManagerKt.EVENT_CAPTCHA_CHALLENGE, "success", (String) null, 4, (Object) null));
    }

    private final void postEvent(TrackingEvent trackingEvent) {
        C19697g.m33468f(C19388s.m32866i0(this), C19760n0.f43720b, (CoroutineStart) null, new CaptchaAnalyticsViewModel$postEvent$1(this, trackingEvent, (C19340c<? super CaptchaAnalyticsViewModel$postEvent$1>) null), 2);
    }

    private final void registerEvent() {
        this.event.observe(this.lifecycleOwner, new C11709h(this, 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: registerEvent$lambda-0  reason: not valid java name */
    public static final void m35124registerEvent$lambda0(CaptchaAnalyticsViewModel captchaAnalyticsViewModel, CaptchaEvent captchaEvent) {
        C19383o.m32797g(captchaAnalyticsViewModel, "this$0");
        if (captchaEvent instanceof CaptchaEvent.Load) {
            captchaAnalyticsViewModel.handleCaptchaLoadEvent();
        } else if (captchaEvent instanceof CaptchaEvent.BackPress) {
            captchaAnalyticsViewModel.handleCaptchaDismissEvent(false, ConstantsKt.BACK_PRESS);
        } else if (captchaEvent instanceof CaptchaEvent.Close) {
            captchaAnalyticsViewModel.handleCaptchaDismissEvent(true, ConstantsKt.CLOSE);
        } else if (captchaEvent instanceof CaptchaEvent.Success) {
            captchaAnalyticsViewModel.handleCaptchaSuccessEvent();
        } else {
            boolean z = captchaEvent instanceof CaptchaEvent.Failed;
            String str = EventsNameKt.GENERIC_ERROR_MESSAGE;
            if (z) {
                String rEASON_FAILED$auth_sdk_thirdPartyRelease = EventParams.Companion.getREASON_FAILED$auth_sdk_thirdPartyRelease();
                String msg = ((CaptchaEvent.Failed) captchaEvent).getMsg();
                if (msg != null) {
                    str = msg;
                }
                captchaAnalyticsViewModel.handleCaptchaFailureEvent(rEASON_FAILED$auth_sdk_thirdPartyRelease, str);
            } else if (captchaEvent instanceof CaptchaEvent.Unsupported) {
                String rEASON_UNSUPPORTED$auth_sdk_thirdPartyRelease = EventParams.Companion.getREASON_UNSUPPORTED$auth_sdk_thirdPartyRelease();
                String msg2 = ((CaptchaEvent.Unsupported) captchaEvent).getMsg();
                if (msg2 != null) {
                    str = msg2;
                }
                captchaAnalyticsViewModel.handleCaptchaFailureEvent(rEASON_UNSUPPORTED$auth_sdk_thirdPartyRelease, str);
            } else if (captchaEvent instanceof CaptchaEvent.UnHandled) {
                String rEASON_UNHANDLED$auth_sdk_thirdPartyRelease = EventParams.Companion.getREASON_UNHANDLED$auth_sdk_thirdPartyRelease();
                String msg3 = ((CaptchaEvent.UnHandled) captchaEvent).getMsg();
                if (msg3 != null) {
                    str = msg3;
                }
                captchaAnalyticsViewModel.handleCaptchaFailureEvent(rEASON_UNHANDLED$auth_sdk_thirdPartyRelease, str);
            }
        }
    }

    public CaptchaAnalyticsViewModel(C2895z<CaptchaEvent> zVar, C2887s sVar, ICaptchaTracker iCaptchaTracker, CaptchaAnalyticsManager captchaAnalyticsManager) {
        C19383o.m32797g(zVar, "event");
        C19383o.m32797g(sVar, "lifecycleOwner");
        C19383o.m32797g(iCaptchaTracker, "tracker");
        C19383o.m32797g(captchaAnalyticsManager, "manager");
        this.event = zVar;
        this.lifecycleOwner = sVar;
        this.manager = captchaAnalyticsManager;
        registerEvent();
    }
}
