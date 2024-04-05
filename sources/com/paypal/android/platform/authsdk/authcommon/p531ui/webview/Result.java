package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.Result */
public abstract class Result {

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$Failure */
    public static final class Failure extends Result {
        private final ResultError resultError;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(ResultError resultError2) {
            super((DefaultConstructorMarker) null);
            C19383o.m32797g(resultError2, "resultError");
            this.resultError = resultError2;
        }

        public final ResultError getResultError() {
            return this.resultError;
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$Success */
    public static final class Success extends Result {
        public Success() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.Result$UnHandled */
    public static final class UnHandled extends Result {
        private final Object data;
        private final Error reason;

        public UnHandled() {
            this((Error) null, (Object) null, 3, (DefaultConstructorMarker) null);
        }

        public UnHandled(Error error, Object obj) {
            super((DefaultConstructorMarker) null);
            this.reason = error;
            this.data = obj;
        }

        public final Object getData() {
            return this.data;
        }

        public final Error getReason() {
            return this.reason;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UnHandled(Error error, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : error, (i & 2) != 0 ? null : obj);
        }
    }

    private Result() {
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
