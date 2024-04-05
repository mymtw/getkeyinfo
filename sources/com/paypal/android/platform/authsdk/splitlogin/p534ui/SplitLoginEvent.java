package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent */
public abstract class SplitLoginEvent {

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$BackPress */
    public static final class BackPress extends SplitLoginEvent {
        public BackPress() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Challenge */
    public static final class Challenge extends SplitLoginEvent {
        public Challenge() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Failed */
    public static final class Failed extends SplitLoginEvent {
        private final String msg;

        public Failed(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$ForgotUserInfo */
    public static final class ForgotUserInfo extends SplitLoginEvent {
        public ForgotUserInfo() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$InValidEmail */
    public static final class InValidEmail extends SplitLoginEvent {
        public InValidEmail() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Initiated */
    public static final class Initiated extends SplitLoginEvent {
        public Initiated() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Load */
    public static final class Load extends SplitLoginEvent {
        public Load() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$NextClicked */
    public static final class NextClicked extends SplitLoginEvent {
        public NextClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Success */
    public static final class Success extends SplitLoginEvent {
        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    private SplitLoginEvent() {
    }

    public /* synthetic */ SplitLoginEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
