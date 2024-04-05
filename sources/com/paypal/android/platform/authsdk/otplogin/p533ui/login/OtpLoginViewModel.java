package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import androidx.compose.foundation.layout.C0761x;
import androidx.databinding.ObservableField;
import com.paypal.android.platform.authsdk.authcommon.ChallengeResult;
import com.paypal.android.platform.authsdk.authcommon.p531ui.header.HeaderViewModel;
import com.paypal.android.platform.authsdk.captcha.domain.CaptchaUriData;
import com.paypal.android.platform.authsdk.captcha.utils.CaptchaChallengeUtils;
import com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl;
import com.paypal.android.platform.authsdk.otplogin.domain.OTPLoginData;
import com.paypal.android.platform.authsdk.otplogin.domain.OtpLoginRepository;
import com.paypal.android.platform.authsdk.otplogin.p533ui.CommonButtonLayoutHandler;
import com.paypal.android.platform.authsdk.otplogin.p533ui.OTPLoginEvent;
import com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData;
import com.paypal.android.platform.authsdk.splitlogin.domain.Phone;
import java.util.ArrayList;
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

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel */
public final class OtpLoginViewModel extends HeaderViewModel implements CommonButtonLayoutHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EVENT_NAME = "otp_login_screen_shown";
    /* access modifiers changed from: private */
    public final C19499d<OTPLoginEvent> analyticsEventsChannel;
    private final C19597d<OTPLoginEvent> analyticsEventsFlow;
    /* access modifiers changed from: private */
    public final AuthOptionChallengeData authChallengeData;
    private final C18829b authHandlerProviders;
    /* access modifiers changed from: private */
    public final C19499d<ChallengeResult> challengeResultEventChannel;
    private final C19597d<ChallengeResult> challengeResultEventFlow;
    /* access modifiers changed from: private */
    public final C19499d<Event> eventsChannel;
    private final C19597d<Event> eventsFlow;
    private List<Phone> phones;
    /* access modifiers changed from: private */
    public final OtpLoginRepository repository;
    private ObservableField<String> selectedPhoneNumber = new ObservableField<>();
    private final C18835g trackingDelegate;
    /* access modifiers changed from: private */
    public final C19499d<Pair<String, String>> uriChallengeEventChannel;
    private final C19597d<Pair<String, String>> uriChallengeEventFlow;
    /* access modifiers changed from: private */
    public final C19499d<PhoneNumberViewState> viewStateChannel;
    private final C19597d<PhoneNumberViewState> viewStateFlow;

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event */
    public static abstract class Event {

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event$CANCELLED */
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

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event$FAILED */
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

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event$INPROGRESS */
        public static final class INPROGRESS extends Event {
            public static final INPROGRESS INSTANCE = new INPROGRESS();

            private INPROGRESS() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event$SUCCESS */
        public static final class SUCCESS extends Event {
            private final String nonce;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public SUCCESS(String str) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, "nonce");
                this.nonce = str;
            }

            public final String getNonce() {
                return this.nonce;
            }
        }

        /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$Event$UNHANDLED */
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

    public OtpLoginViewModel(OtpLoginRepository otpLoginRepository, C18829b bVar) {
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
        if (otpLoginRepository != null) {
            this.authChallengeData = ((OtpLoginRepositoryImpl) otpLoginRepository).getData().getAuthOptionChallengeData();
            this.trackingDelegate = bVar.getAuthProviders().getTrackingDelegate();
            AbstractChannel l5 = C17782b.m29872l(0, (BufferOverflow) null, 7);
            this.analyticsEventsChannel = l5;
            this.analyticsEventsFlow = C0761x.m1662D0(l5);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.paypal.android.platform.authsdk.otplogin.data.OtpLoginRepositoryImpl");
    }

    /* access modifiers changed from: private */
    public final void callGenerateChallenge(OTPLoginData oTPLoginData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$callGenerateChallenge$1(this, oTPLoginData, (C19340c<? super OtpLoginViewModel$callGenerateChallenge$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final String getSelectedChallengeId() {
        ArrayList arrayList;
        Phone phone;
        List<Phone> list = this.phones;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (T next : list) {
                if (C19383o.m32792b(((Phone) next).getPhoneNumber(), getSelectedPhoneNumber().get())) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null || (phone = (Phone) arrayList.get(0)) == null) {
            return null;
        }
        return phone.getChallengeId();
    }

    private final void handleCaptchaChallenge(String str, CaptchaUriData captchaUriData) {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$handleCaptchaChallenge$1(str, captchaUriData, this, (C19340c<? super OtpLoginViewModel$handleCaptchaChallenge$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void navigateToGenerateChallenge() {
        primaryButtonClicked();
    }

    public final void fragmentLoadedEvent() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$fragmentLoadedEvent$1(this, (C19340c<? super OtpLoginViewModel$fragmentLoadedEvent$1>) null), 3);
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

    public final C19597d<Event> getEventsFlow() {
        return this.eventsFlow;
    }

    public final ObservableField<String> getSelectedPhoneNumber() {
        return this.selectedPhoneNumber;
    }

    public final C19597d<Pair<String, String>> getUriChallengeEventFlow() {
        return this.uriChallengeEventFlow;
    }

    public final C19597d<PhoneNumberViewState> getViewStateFlow() {
        return this.viewStateFlow;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = (r0 = r0.getChallengeData()).getPhones();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initOtpPhoneLayout() {
        /*
            r6 = this;
            com.paypal.android.platform.authsdk.splitlogin.domain.AuthOptionChallengeData r0 = r6.authChallengeData
            r1 = 0
            if (r0 != 0) goto L_0x0006
            goto L_0x0013
        L_0x0006:
            com.paypal.android.platform.authsdk.splitlogin.domain.ChallengeData r0 = r0.getChallengeData()
            if (r0 != 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.util.ArrayList r0 = r0.getPhones()
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            java.util.List r0 = kotlin.collections.C19327t.m32660p1(r0)
        L_0x0019:
            r6.phones = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<com.paypal.android.platform.authsdk.splitlogin.domain.Phone> r2 = r6.phones
            if (r2 != 0) goto L_0x0025
            goto L_0x0041
        L_0x0025:
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0041
            java.lang.Object r3 = r2.next()
            com.paypal.android.platform.authsdk.splitlogin.domain.Phone r3 = (com.paypal.android.platform.authsdk.splitlogin.domain.Phone) r3
            java.lang.String r3 = r3.getPhoneNumber()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.add(r3)
            goto L_0x0029
        L_0x0041:
            boolean r2 = r0.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            r4 = 3
            if (r2 == 0) goto L_0x0074
            java.util.List<com.paypal.android.platform.authsdk.splitlogin.domain.Phone> r2 = r6.phones
            r5 = 0
            if (r2 != 0) goto L_0x0050
            goto L_0x0057
        L_0x0050:
            int r2 = r2.size()
            if (r2 != r3) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r3 = r5
        L_0x0058:
            if (r3 == 0) goto L_0x0067
            kotlinx.coroutines.d0 r2 = kotlin.jvm.internal.C19388s.m32866i0(r6)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$2 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$2
            r3.<init>(r6, r0, r1)
            kotlinx.coroutines.C19697g.m33468f(r2, r1, r1, r3, r4)
            goto L_0x0080
        L_0x0067:
            kotlinx.coroutines.d0 r2 = kotlin.jvm.internal.C19388s.m32866i0(r6)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$3 r3 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$3
            r3.<init>(r6, r0, r1)
            kotlinx.coroutines.C19697g.m33468f(r2, r1, r1, r3, r4)
            goto L_0x0080
        L_0x0074:
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r6)
            com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$4 r2 = new com.paypal.android.platform.authsdk.otplogin.ui.login.OtpLoginViewModel$initOtpPhoneLayout$4
            r2.<init>(r6, r1)
            kotlinx.coroutines.C19697g.m33468f(r0, r1, r1, r2, r4)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.otplogin.p533ui.login.OtpLoginViewModel.initOtpPhoneLayout():void");
    }

    public void onBackpress() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$onBackpress$1(this, (C19340c<? super OtpLoginViewModel$onBackpress$1>) null), 3);
    }

    public void onClose() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$onClose$1(this, (C19340c<? super OtpLoginViewModel$onClose$1>) null), 3);
    }

    public final void onHandleUriChallenge$auth_sdk_thirdPartyRelease(String str, String str2, String str3) {
        C19383o.m32797g(str, "requestId");
        C19383o.m32797g(str2, "challengeData");
        C19383o.m32797g(str3, "challengeType");
        if (C19457k.m33019W0(str3, "AuthAdsUriChallenge", true)) {
            handleCaptchaChallenge(str, CaptchaChallengeUtils.Companion.toCaptchaUriData$auth_sdk_thirdPartyRelease(str2));
        } else {
            C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$onHandleUriChallenge$1(this, str2, (C19340c<? super OtpLoginViewModel$onHandleUriChallenge$1>) null), 3);
        }
    }

    public final void phoneNumberSelectionChanges() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$phoneNumberSelectionChanges$1(this, (C19340c<? super OtpLoginViewModel$phoneNumberSelectionChanges$1>) null), 3);
    }

    public void primaryButtonClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$primaryButtonClicked$1(this, (C19340c<? super OtpLoginViewModel$primaryButtonClicked$1>) null), 3);
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$primaryButtonClicked$2(this, (C19340c<? super OtpLoginViewModel$primaryButtonClicked$2>) null), 3);
    }

    public void secondaryButtonClicked() {
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new OtpLoginViewModel$secondaryButtonClicked$1(this, (C19340c<? super OtpLoginViewModel$secondaryButtonClicked$1>) null), 3);
    }

    public final void setSelectedPhoneNumber(ObservableField<String> observableField) {
        C19383o.m32797g(observableField, "<set-?>");
        this.selectedPhoneNumber = observableField;
    }
}
