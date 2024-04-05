package com.paypal.pyplcheckout.common.firebase.firebasemodels;

import androidx.compose.animation.C0388a;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

public final class GetPropsRequest implements FirebaseRequestModel {
    private String jsonMessage;
    private String messageId;
    private String requestId;

    public GetPropsRequest(String str, String str2, String str3) {
        C0048b.m167f(str, "jsonMessage", str2, "messageId", str3, "requestId");
        this.jsonMessage = str;
        this.messageId = str2;
        this.requestId = str3;
    }

    public static /* synthetic */ GetPropsRequest copy$default(GetPropsRequest getPropsRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPropsRequest.getJsonMessage();
        }
        if ((i & 2) != 0) {
            str2 = getPropsRequest.getMessageId();
        }
        if ((i & 4) != 0) {
            str3 = getPropsRequest.getRequestId();
        }
        return getPropsRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return getJsonMessage();
    }

    public final String component2() {
        return getMessageId();
    }

    public final String component3() {
        return getRequestId();
    }

    public final GetPropsRequest copy(String str, String str2, String str3) {
        C19383o.m32797g(str, "jsonMessage");
        C19383o.m32797g(str2, "messageId");
        C19383o.m32797g(str3, "requestId");
        return new GetPropsRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetPropsRequest)) {
            return false;
        }
        GetPropsRequest getPropsRequest = (GetPropsRequest) obj;
        return C19383o.m32792b(getJsonMessage(), getPropsRequest.getJsonMessage()) && C19383o.m32792b(getMessageId(), getPropsRequest.getMessageId()) && C19383o.m32792b(getRequestId(), getPropsRequest.getRequestId());
    }

    public String getJsonMessage() {
        return this.jsonMessage;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = getMessageId().hashCode();
        return getRequestId().hashCode() + ((hashCode + (getJsonMessage().hashCode() * 31)) * 31);
    }

    public void setJsonMessage(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.jsonMessage = str;
    }

    public void setMessageId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.messageId = str;
    }

    public void setRequestId(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.requestId = str;
    }

    public String toString() {
        String jsonMessage2 = getJsonMessage();
        String messageId2 = getMessageId();
        return C0023f.m110k(C0388a.m1050f("GetPropsRequest(jsonMessage=", jsonMessage2, ", messageId=", messageId2, ", requestId="), getRequestId(), ")");
    }
}
