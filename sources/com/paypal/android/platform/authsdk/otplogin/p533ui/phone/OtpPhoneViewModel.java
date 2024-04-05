package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import androidx.compose.foundation.layout.C0761x;
import androidx.databinding.ObservableField;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.p531ui.header.HeaderViewModel;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaUriData;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository;
import com.paypal.android.platform.authsdk.otplogin.p533ui.CommonButtonLayoutHandler;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneViewState;
import com.paypal.android.platform.authsdk.stepup.domain.StepUpChallengeData;
import com.paypal.android.platform.authsdk.stepup.utils.StepUpChallengeUtils;
import java.util.Map;
import kotlin.C19394m;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19597d;
import org.json.JSONObject;
import p568fn.C17782b;
import p716xo.C18829b;
import p716xo.C18835g;
import p744gq.C19060c;
import p753kq.C19861p;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel */
public final class OtpPhoneViewModel extends HeaderViewModel implements CommonButtonLayoutHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EVENT_NAME = "otp_phone_screen_shown";
    /* access modifiers changed from: private */
    public final C19499d<OTPLoginEvent> analyticsEventsChannel;
    private final C19597d<OTPLoginEvent> analyticsEventsFlow;
    private final C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public final C19499d<ChallengeResult> challengeResultEventChannel;
    private final C19597d<ChallengeResult> challengeResultEventFlow;
    private boolean completionState;
    /* access modifiers changed from: private */
    public final C19499d<Event> eventsChannel;
    private final C19597d<Event> eventsFlow;
    private final ObservableField<String> otpEntry1 = new ObservableField<>();
    private final ObservableField<String> otpEntry2 = new ObservableField<>();
    private final ObservableField<String> otpEntry3 = new ObservableField<>();
    private final ObservableField<String> otpEntry4 = new ObservableField<>();
    private final ObservableField<String> otpEntry5 = new ObservableField<>();
    private final ObservableField<String> otpEntry6 = new ObservableField<>();
    /* access modifiers changed from: private */
    public final OtpLoginRepository repository;
    private final C18835g trackingDelegate;
    /* access modifiers changed from: private */
    public final C19499d<Pair<String, String>> uriChallengeEventChannel;
    private final C19597d<Pair<String, String>> uriChallengeEventFlow;
    /* access modifiers changed from: private */
    public final C19499d<OtpPhoneViewState> viewStateChannel;
    private final C19597d<OtpPhoneViewState> viewStateFlow;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$1", mo70541f = "OtpPhoneViewModel.kt", mo70542l = {79}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$1 */
    public static final class C170931 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ OtpPhoneViewModel this$0;

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C170931(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C170931) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19499d access$getViewStateChannel$p = this.this$0.viewStateChannel;
                OtpPhoneViewState.Ready ready = OtpPhoneViewState.Ready.INSTANCE;
                this.label = 1;
                if (access$getViewStateChannel$p.mo72188E(ready, this) == coroutineSingletons) {
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

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event */
    public static abstract class Event {

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event$CANCELLED */
        public static final class CANCELLED extends Event {
            private final boolean endFlow;
            private final Error error;

            public CANCELLED(Error error2, boolean z) {
                super((DefaultConstructorMarker) null);
                this.error = error2;
                this.endFlow = z;
            }

            public final boolean getEndFlow() {
                return this.endFlow;
            }

            public final Error getError() {
                return this.error;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event$FAILED */
        public static final class FAILED extends Event {
            private final Exception exception;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FAILED(Exception exc) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(exc, "exception");
                this.exception = exc;
            }

            public final Exception getException() {
                return this.exception;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event$INPROGRESS */
        public static final class INPROGRESS extends Event {
            public static final INPROGRESS INSTANCE = new INPROGRESS();

            private INPROGRESS() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event$SUCCESS */
        public static final class SUCCESS extends Event {
            private final Object response;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SUCCESS(Object obj) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(obj, ResponseConstants.RESPONSE);
                this.response = obj;
            }

            public final Object getResponse() {
                return this.response;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewModel$Event$UNHANDLED */
        public static final class UNHANDLED extends Event {
            private final Error error;
            private final String rawJSONResponse;

            public UNHANDLED(Error error2, String str) {
                super((DefaultConstructorMarker) null);
                this.error = error2;
                this.rawJSONResponse = str;
            }

            public final Error getError() {
                return this.error;
            }

            public final String getRawJSONResponse() {
                return this.rawJSONResponse;
            }
        }

        private Event() {
        }

        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OtpPhoneViewModel(OtpLoginRepository otpLoginRepository, C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        this.repository = otpLoginRepository;
        this.authHandlerProviders = bVar;
        AbstractChannel l = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.viewStateChannel = l;
        this.viewStateFlow = C0761x.m1662D0(l);
        AbstractChannel l2 = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.eventsChannel = l2;
        this.eventsFlow = C0761x.m1662D0(l2);
        AbstractChannel l3 = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.challengeResultEventChannel = l3;
        this.challengeResultEventFlow = C0761x.m1662D0(l3);
        AbstractChannel l4 = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.uriChallengeEventChannel = l4;
        this.uriChallengeEventFlow = C0761x.m1662D0(l4);
        AbstractChannel l5 = C17782b.m29872l(0, (BufferOverflow) null, 7);
        this.analyticsEventsChannel = l5;
        this.analyticsEventsFlow = C0761x.m1662D0(l5);
        this.trackingDelegate = bVar.getAuthProviders().getTrackingDelegate();
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C170931(this, (C19340c<? super C170931>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void callGenerateChallenge(OTPLoginData oTPLoginData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$callGenerateChallenge$1(oTPLoginData, this, (C19340c<? super OtpPhoneViewModel$callGenerateChallenge$1>) null), 3);
    }

    private final void callOtpLoginTokenAPI(String str, Map<String, String> map) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$callOtpLoginTokenAPI$1(this, (C19340c<? super OtpPhoneViewModel$callOtpLoginTokenAPI$1>) null), 3);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$callOtpLoginTokenAPI$2(this, str, map, (C19340c<? super OtpPhoneViewModel$callOtpLoginTokenAPI$2>) null), 3);
    }

    private final String getOtp() {
        if (!otpIsValid()) {
            return null;
        }
        String str = this.otpEntry1.get();
        String str2 = this.otpEntry2.get();
        String str3 = this.otpEntry3.get();
        String str4 = this.otpEntry4.get();
        String str5 = this.otpEntry5.get();
        String str6 = this.otpEntry6.get();
        return str + str2 + str3 + str4 + str5 + str6;
    }

    private final void handleCaptchaChallenge(String str, CaptchaUriData captchaUriData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$handleCaptchaChallenge$1(str, captchaUriData, this, (C19340c<? super OtpPhoneViewModel$handleCaptchaChallenge$1>) null), 3);
    }

    private final void handleStepUpChallenge(String str, String str2, StepUpChallengeData stepUpChallengeData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$handleStepUpChallenge$1(str, stepUpChallengeData, this, str2, (C19340c<? super OtpPhoneViewModel$handleStepUpChallenge$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void navigateToOtp(Map<String, String> map) {
        validateOtpAndTriggerTokenApi(map);
    }

    public static /* synthetic */ void navigateToOtp$default(OtpPhoneViewModel otpPhoneViewModel, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        otpPhoneViewModel.navigateToOtp(map);
    }

    private final boolean otpIsValid() {
        String str = this.otpEntry1.get();
        if (!(str != null && str.length() == 1)) {
            return false;
        }
        String str2 = this.otpEntry2.get();
        if (!(str2 != null && str2.length() == 1)) {
            return false;
        }
        String str3 = this.otpEntry3.get();
        if (!(str3 != null && str3.length() == 1)) {
            return false;
        }
        String str4 = this.otpEntry4.get();
        if (!(str4 != null && str4.length() == 1)) {
            return false;
        }
        String str5 = this.otpEntry5.get();
        if (!(str5 != null && str5.length() == 1)) {
            return false;
        }
        String str6 = this.otpEntry6.get();
        return str6 != null && str6.length() == 1;
    }

    public final void fragmentLoadedEvent() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$fragmentLoadedEvent$1(this, (C19340c<? super OtpPhoneViewModel$fragmentLoadedEvent$1>) null), 3);
    }

    public final C19597d<OTPLoginEvent> getAnalyticsEventsFlow() {
        return this.analyticsEventsFlow;
    }

    public final C18829b getAuthHandlerProviders() {
        return this.authHandlerProviders;
    }

    public final C19597d<ChallengeResult> getChallengeResultEventFlow() {
        return this.challengeResultEventFlow;
    }

    public final void getCodeButtonPressed() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$getCodeButtonPressed$1(this, (C19340c<? super OtpPhoneViewModel$getCodeButtonPressed$1>) null), 3);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$getCodeButtonPressed$2(this, (C19340c<? super OtpPhoneViewModel$getCodeButtonPressed$2>) null), 3);
    }

    public final boolean getCompletionState() {
        return this.completionState;
    }

    public final C19597d<Event> getEventsFlow() {
        return this.eventsFlow;
    }

    public final ObservableField<String> getOtpEntry1() {
        return this.otpEntry1;
    }

    public final ObservableField<String> getOtpEntry2() {
        return this.otpEntry2;
    }

    public final ObservableField<String> getOtpEntry3() {
        return this.otpEntry3;
    }

    public final ObservableField<String> getOtpEntry4() {
        return this.otpEntry4;
    }

    public final ObservableField<String> getOtpEntry5() {
        return this.otpEntry5;
    }

    public final ObservableField<String> getOtpEntry6() {
        return this.otpEntry6;
    }

    public final C19597d<Pair<String, String>> getUriChallengeEventFlow() {
        return this.uriChallengeEventFlow;
    }

    public final C19597d<OtpPhoneViewState> getViewStateFlow() {
        return this.viewStateFlow;
    }

    public void onBackpress() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$onBackpress$1(this, (C19340c<? super OtpPhoneViewModel$onBackpress$1>) null), 3);
    }

    public void onClose() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$onClose$1(this, (C19340c<? super OtpPhoneViewModel$onClose$1>) null), 3);
    }

    public final void onHandleUriChallenge$auth_sdk_thirdPartyRelease(String str, String str2, String str3) {
        C19383o.m32797g(str, "requestId");
        C19383o.m32797g(str2, "challengeData");
        C19383o.m32797g(str3, "challengeType");
        if (C19457k.m33019W0(str3, "AuthAdsUriChallenge", true)) {
            handleCaptchaChallenge(str, CaptchaChallengeUtils.Companion.toCaptchaUriData$auth_sdk_thirdPartyRelease(str2));
        } else if (C19457k.m33019W0(str3, UriChallengeConstantKt.CHALLENGE_TYPE_STEP_UP, true)) {
            handleStepUpChallenge(str, OtpPhoneViewModelKt.extractNonce(str2), StepUpChallengeUtils.Companion.toStepUpChallengeData$auth_sdk_thirdPartyRelease(new JSONObject(str2).get("challenge").toString()));
        } else {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$onHandleUriChallenge$1(this, str2, (C19340c<? super OtpPhoneViewModel$onHandleUriChallenge$1>) null), 3);
        }
    }

    public void primaryButtonClicked() {
        validateOtpAndTriggerTokenApi((Map<String, String>) null);
    }

    public void secondaryButtonClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$secondaryButtonClicked$1(this, (C19340c<? super OtpPhoneViewModel$secondaryButtonClicked$1>) null), 3);
    }

    public final void setCompletionState(boolean z) {
        this.completionState = z;
    }

    public final void validateOtpAndTriggerTokenApi(Map<String, String> map) {
        String otp = getOtp();
        if (otp == null || C19457k.m33020X0(otp)) {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpPhoneViewModel$validateOtpAndTriggerTokenApi$1(this, (C19340c<? super OtpPhoneViewModel$validateOtpAndTriggerTokenApi$1>) null), 3);
        } else {
            callOtpLoginTokenAPI(otp, map);
        }
    }
}
