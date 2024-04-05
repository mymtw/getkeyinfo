package com.facebook;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

public final class FacebookGraphResponseException extends FacebookException {
    private final GraphResponse graphResponse;

    public FacebookGraphResponseException(GraphResponse graphResponse2, String str) {
        super(str);
        this.graphResponse = graphResponse2;
    }

    public final GraphResponse getGraphResponse() {
        return this.graphResponse;
    }

    public String toString() {
        GraphResponse graphResponse2 = this.graphResponse;
        FacebookRequestError facebookRequestError = graphResponse2 != null ? graphResponse2.f27247d : null;
        StringBuilder h = C0072d.m201h("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            h.append(message);
            h.append(" ");
        }
        if (facebookRequestError != null) {
            h.append("httpResponseCode: ");
            h.append(facebookRequestError.getRequestStatusCode());
            h.append(", facebookErrorCode: ");
            h.append(facebookRequestError.getErrorCode());
            h.append(", facebookErrorType: ");
            h.append(facebookRequestError.getErrorType());
            h.append(", message: ");
            h.append(facebookRequestError.getErrorMessage());
            h.append("}");
        }
        String sb = h.toString();
        C19383o.m32796f(sb, "errorStringBuilder.toString()");
        return sb;
    }
}
