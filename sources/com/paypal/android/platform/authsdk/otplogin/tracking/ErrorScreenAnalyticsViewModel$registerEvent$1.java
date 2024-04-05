package com.paypal.android.platform.authsdk.otplogin.tracking;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.otplogin.p533ui.error.ErrorScreenEvent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.tracking.ErrorScreenAnalyticsViewModel$registerEvent$1", mo70541f = "ErrorScreenAnalyticsViewModel.kt", mo70542l = {27}, mo70543m = "invokeSuspend")
public final class ErrorScreenAnalyticsViewModel$registerEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ ErrorScreenAnalyticsViewModel this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.tracking.ErrorScreenAnalyticsViewModel$registerEvent$1$1", mo70541f = "ErrorScreenAnalyticsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.tracking.ErrorScreenAnalyticsViewModel$registerEvent$1$1 */
    public static final class C170741 extends SuspendLambda implements C19861p<ErrorScreenEvent, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170741 r0 = new C170741(errorScreenAnalyticsViewModel, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ErrorScreenEvent errorScreenEvent, C19340c<? super C19394m> cVar) {
            return ((C170741) create(errorScreenEvent, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                ErrorScreenEvent errorScreenEvent = (ErrorScreenEvent) this.L$0;
                if (errorScreenEvent instanceof ErrorScreenEvent.PasswordInsteadClicked) {
                    ErrorScreenAnalyticsViewModel errorScreenAnalyticsViewModel = errorScreenAnalyticsViewModel;
                    errorScreenAnalyticsViewModel.postEvent(errorScreenAnalyticsViewModel.buildClickEvents(ErrorAnalyticsManagerKt.EVENT_ERROR_SCREEN_PAGE_SHOWN, "use_password_instead", "use_password_instead"));
                } else if (errorScreenEvent instanceof ErrorScreenEvent.Shown) {
                    ErrorScreenAnalyticsViewModel errorScreenAnalyticsViewModel2 = errorScreenAnalyticsViewModel;
                    errorScreenAnalyticsViewModel2.postEvent(ErrorScreenAnalyticsViewModel.buildImpressionEvents$default(errorScreenAnalyticsViewModel2, ErrorAnalyticsManagerKt.EVENT_ERROR_SCREEN_PAGE_SHOWN, EventsNameKt.SHOWN, (String) null, 4, (Object) null));
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ErrorScreenAnalyticsViewModel$registerEvent$1(ErrorScreenAnalyticsViewModel errorScreenAnalyticsViewModel, C19340c<? super ErrorScreenAnalyticsViewModel$registerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = errorScreenAnalyticsViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ErrorScreenAnalyticsViewModel$registerEvent$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ErrorScreenAnalyticsViewModel$registerEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d access$getEvent$p = this.this$0.event;
            final ErrorScreenAnalyticsViewModel errorScreenAnalyticsViewModel = this.this$0;
            C170741 r1 = new C170741((C19340c<? super C170741>) null);
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
