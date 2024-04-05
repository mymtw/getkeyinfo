package com.paypal.pyplcheckout.threeds;

import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

public final class ThreeDsExceptionData {
    private final PEnums.EventCode code;
    private final String details;
    private final PEnums.ErrorType errorType;
    private final Exception exception;
    private final String infoMessage;
    private final String message;
    private final PEnums.TransitionName transitionName;

    public ThreeDsExceptionData(PEnums.ErrorType errorType2, PEnums.EventCode eventCode, PEnums.TransitionName transitionName2, Exception exc, String str, String str2, String str3) {
        C19383o.m32797g(errorType2, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(transitionName2, "transitionName");
        this.errorType = errorType2;
        this.code = eventCode;
        this.transitionName = transitionName2;
        this.exception = exc;
        this.message = str;
        this.details = str2;
        this.infoMessage = str3;
    }

    public static /* synthetic */ ThreeDsExceptionData copy$default(ThreeDsExceptionData threeDsExceptionData, PEnums.ErrorType errorType2, PEnums.EventCode eventCode, PEnums.TransitionName transitionName2, Exception exc, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            errorType2 = threeDsExceptionData.errorType;
        }
        if ((i & 2) != 0) {
            eventCode = threeDsExceptionData.code;
        }
        PEnums.EventCode eventCode2 = eventCode;
        if ((i & 4) != 0) {
            transitionName2 = threeDsExceptionData.transitionName;
        }
        PEnums.TransitionName transitionName3 = transitionName2;
        if ((i & 8) != 0) {
            exc = threeDsExceptionData.exception;
        }
        Exception exc2 = exc;
        if ((i & 16) != 0) {
            str = threeDsExceptionData.message;
        }
        String str4 = str;
        if ((i & 32) != 0) {
            str2 = threeDsExceptionData.details;
        }
        String str5 = str2;
        if ((i & 64) != 0) {
            str3 = threeDsExceptionData.infoMessage;
        }
        return threeDsExceptionData.copy(errorType2, eventCode2, transitionName3, exc2, str4, str5, str3);
    }

    public final PEnums.ErrorType component1() {
        return this.errorType;
    }

    public final PEnums.EventCode component2() {
        return this.code;
    }

    public final PEnums.TransitionName component3() {
        return this.transitionName;
    }

    public final Exception component4() {
        return this.exception;
    }

    public final String component5() {
        return this.message;
    }

    public final String component6() {
        return this.details;
    }

    public final String component7() {
        return this.infoMessage;
    }

    public final ThreeDsExceptionData copy(PEnums.ErrorType errorType2, PEnums.EventCode eventCode, PEnums.TransitionName transitionName2, Exception exc, String str, String str2, String str3) {
        C19383o.m32797g(errorType2, "errorType");
        C19383o.m32797g(eventCode, ResponseConstants.CODE);
        C19383o.m32797g(transitionName2, "transitionName");
        return new ThreeDsExceptionData(errorType2, eventCode, transitionName2, exc, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreeDsExceptionData)) {
            return false;
        }
        ThreeDsExceptionData threeDsExceptionData = (ThreeDsExceptionData) obj;
        return this.errorType == threeDsExceptionData.errorType && this.code == threeDsExceptionData.code && this.transitionName == threeDsExceptionData.transitionName && C19383o.m32792b(this.exception, threeDsExceptionData.exception) && C19383o.m32792b(this.message, threeDsExceptionData.message) && C19383o.m32792b(this.details, threeDsExceptionData.details) && C19383o.m32792b(this.infoMessage, threeDsExceptionData.infoMessage);
    }

    public final PEnums.EventCode getCode() {
        return this.code;
    }

    public final String getDetails() {
        return this.details;
    }

    public final PEnums.ErrorType getErrorType() {
        return this.errorType;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final String getInfoMessage() {
        return this.infoMessage;
    }

    public final String getMessage() {
        return this.message;
    }

    public final PEnums.TransitionName getTransitionName() {
        return this.transitionName;
    }

    public int hashCode() {
        int hashCode = (this.transitionName.hashCode() + ((this.code.hashCode() + (this.errorType.hashCode() * 31)) * 31)) * 31;
        Exception exc = this.exception;
        int i = 0;
        int hashCode2 = (hashCode + (exc == null ? 0 : exc.hashCode())) * 31;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.infoMessage;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        PEnums.ErrorType errorType2 = this.errorType;
        PEnums.EventCode eventCode = this.code;
        PEnums.TransitionName transitionName2 = this.transitionName;
        Exception exc = this.exception;
        String str = this.message;
        String str2 = this.details;
        String str3 = this.infoMessage;
        StringBuilder sb = new StringBuilder();
        sb.append("ThreeDsExceptionData(errorType=");
        sb.append(errorType2);
        sb.append(", code=");
        sb.append(eventCode);
        sb.append(", transitionName=");
        sb.append(transitionName2);
        sb.append(", exception=");
        sb.append(exc);
        sb.append(", message=");
        C0391c.m1061h(sb, str, ", details=", str2, ", infoMessage=");
        return C0023f.m110k(sb, str3, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDsExceptionData(PEnums.ErrorType errorType2, PEnums.EventCode eventCode, PEnums.TransitionName transitionName2, Exception exc, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType2, eventCode, transitionName2, (i & 8) != 0 ? null : exc, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }
}
