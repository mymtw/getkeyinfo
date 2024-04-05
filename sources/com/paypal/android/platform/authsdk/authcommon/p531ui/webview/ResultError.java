package com.paypal.android.platform.authsdk.authcommon.p531ui.webview;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError */
public abstract class ResultError {
    private final String reason;

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Cancelled */
    public static final class Cancelled extends ResultError {
        private final boolean endFlow;

        public Cancelled(String str, boolean z) {
            super(str, (DefaultConstructorMarker) null);
            this.endFlow = z;
        }

        public final boolean getEndFlow() {
            return this.endFlow;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Cancelled(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, z);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Failed */
    public static final class Failed extends ResultError {
        public Failed() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public Failed(String str) {
            super(str, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Failed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* renamed from: com.paypal.android.platform.authsdk.authcommon.ui.webview.ResultError$Unsupported */
    public static final class Unsupported extends ResultError {
        public Unsupported() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public Unsupported(String str) {
            super(str, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unsupported(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    private ResultError(String str) {
        this.reason = str;
    }

    public /* synthetic */ ResultError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getReason() {
        return this.reason;
    }
}
