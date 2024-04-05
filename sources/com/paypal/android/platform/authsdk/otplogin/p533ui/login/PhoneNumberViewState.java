package com.paypal.android.platform.authsdk.otplogin.p533ui.login;

import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState */
public abstract class PhoneNumberViewState {

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$AlternateLogin */
    public static final class AlternateLogin extends PhoneNumberViewState {
        public static final AlternateLogin INSTANCE = new AlternateLogin();

        private AlternateLogin() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$Back */
    public static final class Back extends PhoneNumberViewState {
        public static final Back INSTANCE = new Back();

        private Back() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$Close */
    public static final class Close extends PhoneNumberViewState {
        public static final Close INSTANCE = new Close();

        private Close() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$Error */
    public static final class Error extends PhoneNumberViewState {
        public static final Error INSTANCE = new Error();

        private Error() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$Loading */
    public static final class Loading extends PhoneNumberViewState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$MultiplePhoneNumbers */
    public static final class MultiplePhoneNumbers extends PhoneNumberViewState {
        private final List<String> phoneNumbers;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiplePhoneNumbers(List<String> list) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(list, "phoneNumbers");
            this.phoneNumbers = list;
        }

        public final List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.login.PhoneNumberViewState$SinglePhoneNumber */
    public static final class SinglePhoneNumber extends PhoneNumberViewState {
        private final String phoneNumber;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SinglePhoneNumber(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "phoneNumber");
            this.phoneNumber = str;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    private PhoneNumberViewState() {
    }

    public /* synthetic */ PhoneNumberViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
