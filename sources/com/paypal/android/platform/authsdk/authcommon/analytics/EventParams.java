package com.paypal.android.platform.authsdk.authcommon.analytics;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EventParams {
    /* access modifiers changed from: private */
    public static final String ACTION = ResponseConstants.ACTION;
    /* access modifiers changed from: private */
    public static final String ACTION_BACK_PRESS = "back_press";
    /* access modifiers changed from: private */
    public static final String ACTION_CLOSE = ConstantsKt.CLOSE;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String REASON = "reason";
    /* access modifiers changed from: private */
    public static final String REASON_CANCELLED = EventsNameKt.CANCELLED;
    /* access modifiers changed from: private */
    public static final String REASON_FAILED = "failed";
    /* access modifiers changed from: private */
    public static final String REASON_UNHANDLED = "unhandled";
    /* access modifiers changed from: private */
    public static final String REASON_UNSUPPORTED = "unsupported";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getACTION$auth_sdk_thirdPartyRelease() {
            return EventParams.ACTION;
        }

        public final String getACTION_BACK_PRESS$auth_sdk_thirdPartyRelease() {
            return EventParams.ACTION_BACK_PRESS;
        }

        public final String getACTION_CLOSE$auth_sdk_thirdPartyRelease() {
            return EventParams.ACTION_CLOSE;
        }

        public final String getREASON$auth_sdk_thirdPartyRelease() {
            return EventParams.REASON;
        }

        public final String getREASON_CANCELLED$auth_sdk_thirdPartyRelease() {
            return EventParams.REASON_CANCELLED;
        }

        public final String getREASON_FAILED$auth_sdk_thirdPartyRelease() {
            return EventParams.REASON_FAILED;
        }

        public final String getREASON_UNHANDLED$auth_sdk_thirdPartyRelease() {
            return EventParams.REASON_UNHANDLED;
        }

        public final String getREASON_UNSUPPORTED$auth_sdk_thirdPartyRelease() {
            return EventParams.REASON_UNSUPPORTED;
        }
    }
}
