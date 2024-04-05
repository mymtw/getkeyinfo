package com.paypal.android.platform.authsdk.otplogin.p533ui.phone;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState */
public abstract class OtpPhoneViewState {

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$AlternateLogin */
    public static final class AlternateLogin extends OtpPhoneViewState {
        private final boolean showErrorScreen;

        public AlternateLogin(boolean z) {
            super((DefaultConstructorMarker) null);
            this.showErrorScreen = z;
        }

        public final boolean getShowErrorScreen() {
            return this.showErrorScreen;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$Back */
    public static final class Back extends OtpPhoneViewState {
        public static final Back INSTANCE = new Back();

        private Back() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$Close */
    public static final class Close extends OtpPhoneViewState {
        public static final Close INSTANCE = new Close();

        private Close() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$Error */
    public static final class Error extends OtpPhoneViewState {
        private final OtpError error;
        private final String message;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(OtpError otpError, String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(otpError, "error");
            this.error = otpError;
            this.message = str;
        }

        public final OtpError getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(OtpError otpError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(otpError, (i & 2) != 0 ? null : str);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$GetCode */
    public static final class GetCode extends OtpPhoneViewState {
        public static final GetCode INSTANCE = new GetCode();

        private GetCode() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$Loading */
    public static final class Loading extends OtpPhoneViewState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneViewState$Ready */
    public static final class Ready extends OtpPhoneViewState {
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super((DefaultConstructorMarker) null);
        }
    }

    private OtpPhoneViewState() {
    }

    public /* synthetic */ OtpPhoneViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
