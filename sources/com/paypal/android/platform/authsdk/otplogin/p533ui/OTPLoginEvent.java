package com.paypal.android.platform.authsdk.otplogin.p533ui;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent */
public abstract class OTPLoginEvent {

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$AlternativeLogin */
    public static final class AlternativeLogin extends OTPLoginEvent {
        private final String eventName;
        private final String fieldName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AlternativeLogin(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(str2, "fieldName");
            this.eventName = str;
            this.fieldName = str2;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getFieldName() {
            return this.fieldName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$BackPress */
    public static final class BackPress extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BackPress(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Challenge */
    public static final class Challenge extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Challenge(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$ClosePress */
    public static final class ClosePress extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClosePress(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Failed */
    public static final class Failed extends OTPLoginEvent {
        private final String eventName;
        private final String msg;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failed(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
            this.msg = str2;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$GetNewCodeClicked */
    public static final class GetNewCodeClicked extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetNewCodeClicked(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Initiated */
    public static final class Initiated extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Initiated(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Load */
    public static final class Load extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Load(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$LogInClicked */
    public static final class LogInClicked extends OTPLoginEvent {
        public LogInClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$MultiplePhoneNumber */
    public static final class MultiplePhoneNumber extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiplePhoneNumber(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$NextClicked */
    public static final class NextClicked extends OTPLoginEvent {
        private final String eventName;
        private final String fieldName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NextClicked(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            C19383o.m32797g(str2, "fieldName");
            this.eventName = str;
            this.fieldName = str2;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getFieldName() {
            return this.fieldName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$PasswordInsteadClicked */
    public static final class PasswordInsteadClicked extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PasswordInsteadClicked(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Pending */
    public static final class Pending extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Pending(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$PhoneNumberSelection */
    public static final class PhoneNumberSelection extends OTPLoginEvent {
        private final String eventName;
        private final String msg;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PhoneNumberSelection(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
            this.msg = str2;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$SinglePhoneNumber */
    public static final class SinglePhoneNumber extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SinglePhoneNumber(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Success */
    public static final class Success extends OTPLoginEvent {
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.OTPLoginEvent$Unhandled */
    public static final class Unhandled extends OTPLoginEvent {
        private final String challengeType;
        private final String eventName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Unhandled(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(str, "eventName");
            this.eventName = str;
            this.challengeType = str2;
        }

        public final String getChallengeType() {
            return this.challengeType;
        }

        public final String getEventName() {
            return this.eventName;
        }
    }

    private OTPLoginEvent() {
    }

    public /* synthetic */ OTPLoginEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
