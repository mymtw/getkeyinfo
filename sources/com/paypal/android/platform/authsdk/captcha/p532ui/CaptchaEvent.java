package com.paypal.android.platform.authsdk.captcha.p532ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent */
public abstract class CaptchaEvent {

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$BackPress */
    public static final class BackPress extends CaptchaEvent {
        public BackPress() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Close */
    public static final class Close extends CaptchaEvent {
        public Close() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Failed */
    public static final class Failed extends CaptchaEvent {
        private final String msg;

        public Failed(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Load */
    public static final class Load extends CaptchaEvent {
        public Load() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Start */
    public static final class Start extends CaptchaEvent {
        public Start() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Success */
    public static final class Success extends CaptchaEvent {
        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$UnHandled */
    public static final class UnHandled extends CaptchaEvent {
        private final String msg;

        public UnHandled(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.captcha.ui.CaptchaEvent$Unsupported */
    public static final class Unsupported extends CaptchaEvent {
        private final String msg;

        public Unsupported(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    private CaptchaEvent() {
    }

    public /* synthetic */ CaptchaEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
