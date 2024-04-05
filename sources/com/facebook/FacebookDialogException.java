package com.facebook;

import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

public final class FacebookDialogException extends FacebookException {
    public static final C12185a Companion = new C12185a();
    public static final long serialVersionUID = 1;
    private final int errorCode;
    private final String failingUrl;

    /* renamed from: com.facebook.FacebookDialogException$a */
    public static final class C12185a {
    }

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.errorCode = i;
        this.failingUrl = str2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getFailingUrl() {
        return this.failingUrl;
    }

    public String toString() {
        StringBuilder k = C0073e.m211k("{FacebookDialogException: ", "errorCode: ");
        k.append(this.errorCode);
        k.append(", message: ");
        k.append(getMessage());
        k.append(", url: ");
        k.append(this.failingUrl);
        k.append("}");
        String sb = k.toString();
        C19383o.m32796f(sb, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb;
    }
}
