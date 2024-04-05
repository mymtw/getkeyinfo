package com.paypal.android.platform.authsdk.otplogin.tracking;

import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsViewModel$registerEvent$1", mo70541f = "OTPLoginAnalyticsViewModel.kt", mo70542l = {26}, mo70543m = "invokeSuspend")
public final class OTPLoginAnalyticsViewModel$registerEvent$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ OTPLoginAnalyticsViewModel this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsViewModel$registerEvent$1$1", mo70541f = "OTPLoginAnalyticsViewModel.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.tracking.OTPLoginAnalyticsViewModel$registerEvent$1$1 */
    public static final class C170751 extends SuspendLambda implements C19861p<OTPLoginEvent, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C170751 r0 = new C170751(oTPLoginAnalyticsViewModel, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(OTPLoginEvent oTPLoginEvent, C19340c<? super C19394m> cVar) {
            return ((C170751) create(oTPLoginEvent, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                OTPLoginEvent oTPLoginEvent = (OTPLoginEvent) this.L$0;
                if (oTPLoginEvent instanceof OTPLoginEvent.Load) {
                    OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel = oTPLoginAnalyticsViewModel;
                    oTPLoginAnalyticsViewModel.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel, ((OTPLoginEvent.Load) oTPLoginEvent).getEventName(), EventsNameKt.SHOWN, (String) null, 4, (Object) null));
                } else if (oTPLoginEvent instanceof OTPLoginEvent.Initiated) {
                    OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel2 = oTPLoginAnalyticsViewModel;
                    oTPLoginAnalyticsViewModel2.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel2, ((OTPLoginEvent.Initiated) oTPLoginEvent).getEventName(), EventsNameKt.TRIGGERED, (String) null, 4, (Object) null));
                } else {
                    boolean z = oTPLoginEvent instanceof OTPLoginEvent.BackPress;
                    String str = EventsNameKt.CLICKED;
                    if (z) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel3 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel3.postEvent(oTPLoginAnalyticsViewModel3.buildClickEvents(((OTPLoginEvent.BackPress) oTPLoginEvent).getEventName(), str, EventsNameKt.BACK));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.Success) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel4 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel4.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel4, ((OTPLoginEvent.Success) oTPLoginEvent).getEventName(), "success", (String) null, 4, (Object) null));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.Failed) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel5 = oTPLoginAnalyticsViewModel;
                        OTPLoginEvent.Failed failed = (OTPLoginEvent.Failed) oTPLoginEvent;
                        oTPLoginAnalyticsViewModel5.postEvent(oTPLoginAnalyticsViewModel5.buildErrorEvents(failed.getEventName(), EventsNameKt.FAILED, failed.getMsg()));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.NextClicked) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel6 = oTPLoginAnalyticsViewModel;
                        OTPLoginEvent.NextClicked nextClicked = (OTPLoginEvent.NextClicked) oTPLoginEvent;
                        oTPLoginAnalyticsViewModel6.postEvent(oTPLoginAnalyticsViewModel6.buildClickEvents(nextClicked.getEventName(), str, nextClicked.getFieldName()));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.Challenge) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel7 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel7.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel7, ((OTPLoginEvent.Challenge) oTPLoginEvent).getEventName(), "challenge", (String) null, 4, (Object) null));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.ClosePress) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel8 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel8.postEvent(oTPLoginAnalyticsViewModel8.buildClickEvents(((OTPLoginEvent.ClosePress) oTPLoginEvent).getEventName(), str, ConstantsKt.CLOSE));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.AlternativeLogin) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel9 = oTPLoginAnalyticsViewModel;
                        OTPLoginEvent.AlternativeLogin alternativeLogin = (OTPLoginEvent.AlternativeLogin) oTPLoginEvent;
                        oTPLoginAnalyticsViewModel9.postEvent(oTPLoginAnalyticsViewModel9.buildClickEvents(alternativeLogin.getEventName(), str, alternativeLogin.getFieldName()));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.LogInClicked) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel10 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel10.postEvent(oTPLoginAnalyticsViewModel10.buildClickEvents(OTPLoginAnalyticsManagerKt.EVENT_OTP_LOGIN_PAGE_LOGIN_BUTTON_CLICK, str, EventsNameKt.LOGIN));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.Pending) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel11 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel11.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel11, ((OTPLoginEvent.Pending) oTPLoginEvent).getEventName(), EventsNameKt.PENDING, (String) null, 4, (Object) null));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.Unhandled) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel12 = oTPLoginAnalyticsViewModel;
                        OTPLoginEvent.Unhandled unhandled = (OTPLoginEvent.Unhandled) oTPLoginEvent;
                        oTPLoginAnalyticsViewModel12.postEvent(oTPLoginAnalyticsViewModel12.buildImpressionEvents(unhandled.getEventName(), "challenge", unhandled.getChallengeType()));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.GetNewCodeClicked) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel13 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel13.postEvent(oTPLoginAnalyticsViewModel13.buildClickEvents(((OTPLoginEvent.GetNewCodeClicked) oTPLoginEvent).getEventName(), str, OTPLoginAnalyticsManagerKt.GET_NEW_CODE));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.PasswordInsteadClicked) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel14 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel14.postEvent(oTPLoginAnalyticsViewModel14.buildClickEvents(((OTPLoginEvent.PasswordInsteadClicked) oTPLoginEvent).getEventName(), str, "use_password_instead"));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.MultiplePhoneNumber) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel15 = oTPLoginAnalyticsViewModel;
                        oTPLoginAnalyticsViewModel15.postEvent(OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel15, ((OTPLoginEvent.MultiplePhoneNumber) oTPLoginEvent).getEventName(), OTPLoginAnalyticsManagerKt.MULTIPLE_PHONE_NUMBER, (String) null, 4, (Object) null));
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.SinglePhoneNumber) {
                        OTPLoginAnalyticsViewModel.buildImpressionEvents$default(oTPLoginAnalyticsViewModel, ((OTPLoginEvent.SinglePhoneNumber) oTPLoginEvent).getEventName(), OTPLoginAnalyticsManagerKt.SINGLE_PHONE_NUMBER, (String) null, 4, (Object) null);
                    } else if (oTPLoginEvent instanceof OTPLoginEvent.PhoneNumberSelection) {
                        OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel16 = oTPLoginAnalyticsViewModel;
                        OTPLoginEvent.PhoneNumberSelection phoneNumberSelection = (OTPLoginEvent.PhoneNumberSelection) oTPLoginEvent;
                        String eventName = phoneNumberSelection.getEventName();
                        String msg = phoneNumberSelection.getMsg();
                        if (msg != null) {
                            str = msg;
                        }
                        oTPLoginAnalyticsViewModel16.postEvent(oTPLoginAnalyticsViewModel16.buildClickEvents(eventName, str, OTPLoginAnalyticsManagerKt.NUMBER_DROP_DOWN));
                    }
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OTPLoginAnalyticsViewModel$registerEvent$1(OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel, C19340c<? super OTPLoginAnalyticsViewModel$registerEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = oTPLoginAnalyticsViewModel;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new OTPLoginAnalyticsViewModel$registerEvent$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((OTPLoginAnalyticsViewModel$registerEvent$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d access$getEvent$p = this.this$0.event;
            final OTPLoginAnalyticsViewModel oTPLoginAnalyticsViewModel = this.this$0;
            C170751 r1 = new C170751((C19340c<? super C170751>) null);
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
