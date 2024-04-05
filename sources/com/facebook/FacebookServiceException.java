package com.facebook;

import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

public final class FacebookServiceException extends FacebookException {
    public static final C12192a Companion = new C12192a();
    private static final long serialVersionUID = 1;
    private final FacebookRequestError requestError;

    /* renamed from: com.facebook.FacebookServiceException$a */
    public static final class C12192a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        C19383o.m32797g(facebookRequestError, "requestError");
        this.requestError = facebookRequestError;
    }

    public final FacebookRequestError getRequestError() {
        return this.requestError;
    }

    public String toString() {
        StringBuilder k = C0073e.m211k("{FacebookServiceException: ", "httpResponseCode: ");
        k.append(this.requestError.getRequestStatusCode());
        k.append(", facebookErrorCode: ");
        k.append(this.requestError.getErrorCode());
        k.append(", facebookErrorType: ");
        k.append(this.requestError.getErrorType());
        k.append(", message: ");
        k.append(this.requestError.getErrorMessage());
        k.append("}");
        String sb = k.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }
}
