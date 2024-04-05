package com.paypal.android.platform.authsdk.stepup.p535ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent */
public abstract class StepUpEvent {

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$BackPress */
    public static final class BackPress extends StepUpEvent {
        public BackPress() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Close */
    public static final class Close extends StepUpEvent {
        public Close() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Failed */
    public static final class Failed extends StepUpEvent {
        private final String msg;

        public Failed(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Load */
    public static final class Load extends StepUpEvent {
        public Load() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Start */
    public static final class Start extends StepUpEvent {
        public Start() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Success */
    public static final class Success extends StepUpEvent {
        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$UnHandled */
    public static final class UnHandled extends StepUpEvent {
        private final String msg;

        public UnHandled(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.stepup.ui.StepUpEvent$Unsupported */
    public static final class Unsupported extends StepUpEvent {
        private final String msg;

        public Unsupported(String str) {
            super((DefaultConstructorMarker) null);
            this.msg = str;
        }

        public final String getMsg() {
            return this.msg;
        }
    }

    private StepUpEvent() {
    }

    public /* synthetic */ StepUpEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
