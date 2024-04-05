package com.paypal.android.platform.authsdk.captcha.analytics;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.analytics.TrackingEvent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.captcha.analytics.CaptchaAnalyticsViewModel$postEvent$1", mo70541f = "CaptchaAnalyticsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class CaptchaAnalyticsViewModel$postEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ TrackingEvent $event;
    public int label;
    public final /* synthetic */ CaptchaAnalyticsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptchaAnalyticsViewModel$postEvent$1(CaptchaAnalyticsViewModel captchaAnalyticsViewModel, TrackingEvent trackingEvent, C19340c<? super CaptchaAnalyticsViewModel$postEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = captchaAnalyticsViewModel;
        this.$event = trackingEvent;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CaptchaAnalyticsViewModel$postEvent$1(this.this$0, this.$event, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CaptchaAnalyticsViewModel$postEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            this.this$0.manager.trackEvent$auth_sdk_thirdPartyRelease(this.$event);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
