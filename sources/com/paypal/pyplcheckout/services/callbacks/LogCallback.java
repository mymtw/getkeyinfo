package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LogCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "LogCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogCallback get() {
            return new LogCallback();
        }
    }

    public LogCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
    }

    public static final LogCallback get() {
        return Companion.get();
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.e$default(str, "log not sent!", exc, 0, 8, (Object) null);
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
    }
}
