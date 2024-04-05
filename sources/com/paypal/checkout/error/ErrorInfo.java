package com.paypal.checkout.error;

import com.paypal.checkout.error.CorrelationIds;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.InternalCorrelationIds;
import com.paypal.pyplcheckout.utils.VersionUtils;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class ErrorInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CorrelationIds correlationIds;
    private final Throwable error;
    private final String nativeSdkVersion;
    private final String orderId;
    private final String reason;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorInfo createErrorInfo(Throwable th, ErrorReason errorReason, DebugConfigManager debugConfigManager) {
            C19383o.m32797g(th, "throwable");
            C19383o.m32797g(errorReason, "errorReason");
            C19383o.m32797g(debugConfigManager, "config");
            String reason = errorReason.getReason();
            CorrelationIds.Companion companion = CorrelationIds.Companion;
            InternalCorrelationIds correlationIds = debugConfigManager.getCorrelationIds();
            C19383o.m32796f(correlationIds, "config.correlationIds");
            CorrelationIds from$pyplcheckout_externalThreedsRelease = companion.from$pyplcheckout_externalThreedsRelease(correlationIds);
            String checkoutToken = debugConfigManager.getCheckoutToken();
            C19383o.m32796f(checkoutToken, "config.checkoutToken");
            return new ErrorInfo(th, reason, from$pyplcheckout_externalThreedsRelease, checkoutToken.length() == 0 ? null : debugConfigManager.getCheckoutToken(), VersionUtils.INSTANCE.getSdkVersion());
        }
    }

    public ErrorInfo(Throwable th, String str, CorrelationIds correlationIds2, String str2, String str3) {
        C19383o.m32797g(th, "error");
        C19383o.m32797g(str, "reason");
        C19383o.m32797g(correlationIds2, "correlationIds");
        C19383o.m32797g(str3, "nativeSdkVersion");
        this.error = th;
        this.reason = str;
        this.correlationIds = correlationIds2;
        this.orderId = str2;
        this.nativeSdkVersion = str3;
    }

    public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, Throwable th, String str, CorrelationIds correlationIds2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            th = errorInfo.error;
        }
        if ((i & 2) != 0) {
            str = errorInfo.reason;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            correlationIds2 = errorInfo.correlationIds;
        }
        CorrelationIds correlationIds3 = correlationIds2;
        if ((i & 8) != 0) {
            str2 = errorInfo.orderId;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = errorInfo.nativeSdkVersion;
        }
        return errorInfo.copy(th, str4, correlationIds3, str5, str3);
    }

    public static final ErrorInfo createErrorInfo(Throwable th, ErrorReason errorReason, DebugConfigManager debugConfigManager) {
        return Companion.createErrorInfo(th, errorReason, debugConfigManager);
    }

    public final Throwable component1() {
        return this.error;
    }

    public final String component2() {
        return this.reason;
    }

    public final CorrelationIds component3() {
        return this.correlationIds;
    }

    public final String component4() {
        return this.orderId;
    }

    public final String component5() {
        return this.nativeSdkVersion;
    }

    public final ErrorInfo copy(Throwable th, String str, CorrelationIds correlationIds2, String str2, String str3) {
        C19383o.m32797g(th, "error");
        C19383o.m32797g(str, "reason");
        C19383o.m32797g(correlationIds2, "correlationIds");
        C19383o.m32797g(str3, "nativeSdkVersion");
        return new ErrorInfo(th, str, correlationIds2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorInfo)) {
            return false;
        }
        ErrorInfo errorInfo = (ErrorInfo) obj;
        return C19383o.m32792b(this.error, errorInfo.error) && C19383o.m32792b(this.reason, errorInfo.reason) && C19383o.m32792b(this.correlationIds, errorInfo.correlationIds) && C19383o.m32792b(this.orderId, errorInfo.orderId) && C19383o.m32792b(this.nativeSdkVersion, errorInfo.nativeSdkVersion);
    }

    public final CorrelationIds getCorrelationIds() {
        return this.correlationIds;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final String getNativeSdkVersion() {
        return this.nativeSdkVersion;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        int hashCode = (this.correlationIds.hashCode() + C0023f.m105e(this.reason, this.error.hashCode() * 31, 31)) * 31;
        String str = this.orderId;
        return this.nativeSdkVersion.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        Throwable th = this.error;
        String str = this.reason;
        CorrelationIds correlationIds2 = this.correlationIds;
        String str2 = this.orderId;
        String str3 = this.nativeSdkVersion;
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorInfo(error=");
        sb.append(th);
        sb.append(", reason=");
        sb.append(str);
        sb.append(", correlationIds=");
        sb.append(correlationIds2);
        sb.append(", orderId=");
        sb.append(str2);
        sb.append(", nativeSdkVersion=");
        return C0023f.m110k(sb, str3, ")");
    }
}
