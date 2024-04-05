package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.util.Patterns;
import androidx.compose.foundation.layout.C0761x;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.C2866i0;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaUriData;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19597d;
import p568fn.C17782b;
import p716xo.C18829b;
import p716xo.C18835g;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel */
public final class SplitLoginViewModel extends C2866i0 {
    /* access modifiers changed from: private */
    public final C19499d<SplitLoginEvent> analyticsEventsChannel;
    private final C19597d<SplitLoginEvent> analyticsEventsFlow;
    /* access modifiers changed from: private */
    public final C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public final C19499d<ChallengeResult> challengeResultEventChannel;
    private final C19597d<ChallengeResult> challengeResultEventFlow;
    private final ObservableField<String> emailEditText = new ObservableField<>();
    /* access modifiers changed from: private */
    public final C19499d<Event> eventsChannel;
    private final C19597d<Event> eventsFlow;
    private final ObservableBoolean isEmailInErrorState = new ObservableBoolean(false);
    /* access modifiers changed from: private */
    public final SplitLoginRepositoryImpl repository;
    private final C18835g trackingDelegate;
    /* access modifiers changed from: private */
    public final C19499d<Pair<String, String>> uriChallengeEventChannel;
    private final C19597d<Pair<String, String>> uriChallengeEventFlow;
    /* access modifiers changed from: private */
    public final C19499d<SplitLoginViewState> viewStateChannel;
    private final C19597d<SplitLoginViewState> viewStateFlow;

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event */
    public static abstract class Event {

        /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event$CANCELLED */
        public static final class CANCELLED extends Event {
            private final Error error;

            public CANCELLED(Error error2) {
                super((DefaultConstructorMarker) null);
                this.error = error2;
            }

            public final Error getError() {
                return this.error;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event$FAILED */
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

        /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event$INPROGRESS */
        public static final class INPROGRESS extends Event {
            public static final INPROGRESS INSTANCE = new INPROGRESS();

            private INPROGRESS() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event$SUCCESS */
        public static final class SUCCESS extends Event {
            private final List<AuthOptionChallengeData> authOptionsChallenges;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SUCCESS(List<AuthOptionChallengeData> list) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(list, "authOptionsChallenges");
                this.authOptionsChallenges = list;
            }

            public final List<AuthOptionChallengeData> getAuthOptionsChallenges() {
                return this.authOptionsChallenges;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$Event$UNHANDLED */
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

    public SplitLoginViewModel(SplitLoginRepositoryImpl splitLoginRepositoryImpl, C18829b bVar) {
        C19383o.m32797g(bVar, "authHandlerProviders");
        this.repository = splitLoginRepositoryImpl;
        this.authHandlerProviders = bVar;
        this.trackingDelegate = bVar.getAuthProviders().getTrackingDelegate();
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
    }

    private final void handleCaptchaChallenge(String str, CaptchaUriData captchaUriData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$handleCaptchaChallenge$1(str, captchaUriData, this, (C19340c<? super SplitLoginViewModel$handleCaptchaChallenge$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final boolean isValidEmail(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    /* access modifiers changed from: private */
    public final void navigateToVerifyEmail() {
        onNextClicked();
    }

    public final void fragmentLoadedEvent() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$fragmentLoadedEvent$1(this, (C19340c<? super SplitLoginViewModel$fragmentLoadedEvent$1>) null), 3);
    }

    public final C19597d<SplitLoginEvent> getAnalyticsEventsFlow() {
        return this.analyticsEventsFlow;
    }

    public final C19597d<ChallengeResult> getChallengeResultEventFlow() {
        return this.challengeResultEventFlow;
    }

    public final ObservableField<String> getEmailEditText() {
        return this.emailEditText;
    }

    public final C19597d<Event> getEventsFlow() {
        return this.eventsFlow;
    }

    public final C19597d<Pair<String, String>> getUriChallengeEventFlow() {
        return this.uriChallengeEventFlow;
    }

    public final C19597d<SplitLoginViewState> getViewStateFlow() {
        return this.viewStateFlow;
    }

    public final ObservableBoolean isEmailInErrorState() {
        return this.isEmailInErrorState;
    }

    public final void onCloseButtonClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onCloseButtonClicked$1(this, (C19340c<? super SplitLoginViewModel$onCloseButtonClicked$1>) null), 3);
    }

    public final void onEmailTextChanged() {
        if (this.isEmailInErrorState.get()) {
            this.isEmailInErrorState.set(false);
        }
    }

    public final void onForgotUsernameClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onForgotUsernameClicked$1(this, (C19340c<? super SplitLoginViewModel$onForgotUsernameClicked$1>) null), 3);
    }

    public final void onHandleUriChallenge$auth_sdk_thirdPartyRelease(String str, String str2, String str3) {
        C19383o.m32797g(str, "requestId");
        C19383o.m32797g(str2, "challengeData");
        C19383o.m32797g(str3, "challengeType");
        if (C19457k.m33019W0(str3, "AuthAdsUriChallenge", true)) {
            handleCaptchaChallenge(str, CaptchaChallengeUtils.Companion.toCaptchaUriData$auth_sdk_thirdPartyRelease(str2));
        } else {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onHandleUriChallenge$1(this, str2, (C19340c<? super SplitLoginViewModel$onHandleUriChallenge$1>) null), 3);
        }
    }

    public final void onNextClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onNextClicked$1(this, (C19340c<? super SplitLoginViewModel$onNextClicked$1>) null), 3);
        String str = this.emailEditText.get();
        if (isValidEmail(str)) {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onNextClicked$2(this, str, (C19340c<? super SplitLoginViewModel$onNextClicked$2>) null), 3);
            return;
        }
        this.isEmailInErrorState.set(true);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new SplitLoginViewModel$onNextClicked$3(this, (C19340c<? super SplitLoginViewModel$onNextClicked$3>) null), 3);
    }
}
