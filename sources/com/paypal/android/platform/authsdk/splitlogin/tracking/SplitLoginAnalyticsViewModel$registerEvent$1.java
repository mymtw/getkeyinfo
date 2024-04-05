package com.paypal.android.platform.authsdk.splitlogin.tracking;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginEvent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsViewModel$registerEvent$1", mo70541f = "SplitLoginAnalyticsViewModel.kt", mo70542l = {26}, mo70543m = "invokeSuspend")
public final class SplitLoginAnalyticsViewModel$registerEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ SplitLoginAnalyticsViewModel this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsViewModel$registerEvent$1$1", mo70541f = "SplitLoginAnalyticsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsViewModel$registerEvent$1$1 */
    public static final class C171061 extends SuspendLambda implements C19861p<SplitLoginEvent, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C171061 r0 = new C171061(splitLoginAnalyticsViewModel, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(SplitLoginEvent splitLoginEvent, C19340c<? super C19394m> cVar) {
            return ((C171061) create(splitLoginEvent, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                SplitLoginEvent splitLoginEvent = (SplitLoginEvent) this.L$0;
                if (splitLoginEvent instanceof SplitLoginEvent.Load) {
                    splitLoginAnalyticsViewModel.handleSplitLoginStartEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.InValidEmail) {
                    splitLoginAnalyticsViewModel.handleSplitLoginInValidEmailEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.Initiated) {
                    splitLoginAnalyticsViewModel.handleSplitLoginInitiatedEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.BackPress) {
                    splitLoginAnalyticsViewModel.handleSplitLoginDismissEvent(ConstantsKt.BACK_PRESS);
                } else if (splitLoginEvent instanceof SplitLoginEvent.Success) {
                    splitLoginAnalyticsViewModel.handleSplitLoginSuccessEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.Failed) {
                    splitLoginAnalyticsViewModel.handleSplitLoginFailureEvent(((SplitLoginEvent.Failed) splitLoginEvent).getMsg());
                } else if (splitLoginEvent instanceof SplitLoginEvent.NextClicked) {
                    splitLoginAnalyticsViewModel.handleSplitLoginNextClickedEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.Challenge) {
                    splitLoginAnalyticsViewModel.handleSplitLoginChallengeEvent();
                } else if (splitLoginEvent instanceof SplitLoginEvent.ForgotUserInfo) {
                    SplitLoginAnalyticsViewModel splitLoginAnalyticsViewModel = splitLoginAnalyticsViewModel;
                    splitLoginAnalyticsViewModel.postEvent(splitLoginAnalyticsViewModel.buildClickEvents(SplitLoginAnalyticsManagerKt.EVENT_SPLIT_LOGIN_PAGE_FORGOT_LOGIN_BUTTON_CLICK, EventsNameKt.CLICKED, SplitLoginAnalyticsManagerKt.FORGOT_USERNAME_BUTTON));
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginAnalyticsViewModel$registerEvent$1(SplitLoginAnalyticsViewModel splitLoginAnalyticsViewModel, C19340c<? super SplitLoginAnalyticsViewModel$registerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginAnalyticsViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginAnalyticsViewModel$registerEvent$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginAnalyticsViewModel$registerEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d access$getEvent$p = this.this$0.event;
            final SplitLoginAnalyticsViewModel splitLoginAnalyticsViewModel = this.this$0;
            C171061 r1 = new C171061((C19340c<? super C171061>) null);
            this.label = 1;
            if (C0761x.m1667G(access$getEvent$p, r1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
