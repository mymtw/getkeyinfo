package com.paypal.android.platform.authsdk.otplogin.p533ui.error;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.ErrorScreenEvent */
public abstract class ErrorScreenEvent {

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.ErrorScreenEvent$PasswordInsteadClicked */
    public static final class PasswordInsteadClicked extends ErrorScreenEvent {
        public PasswordInsteadClicked() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.otplogin.ui.error.ErrorScreenEvent$Shown */
    public static final class Shown extends ErrorScreenEvent {
        public Shown() {
            super((DefaultConstructorMarker) null);
        }
    }

    private ErrorScreenEvent() {
    }

    public /* synthetic */ ErrorScreenEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
